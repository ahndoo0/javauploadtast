package com.spring81.bbs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring81.bbs.common.PagingHelper;
import com.spring81.bbs.common.WebConstants;
import com.spring81.bbs.inf.IServiceBoard;
import com.spring81.bbs.model.ModelArticle;
import com.spring81.bbs.model.ModelAttachFile;
import com.spring81.bbs.model.ModelBoard;
import com.spring81.bbs.model.ModelComments;

@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	IServiceBoard srvboard;
	
	// /board/boardlist
	// /board/boardlist?searchWord=
	// /board/boardlist?searchWord=&curPage=2
	@RequestMapping(value = "/board/boardlist", method = RequestMethod.GET)
	public String boardlist(Model model
	        , @RequestParam (defaultValue = "") String searchWord
	        , @RequestParam (defaultValue = "1") Integer curPage ) {
		logger.info("/board/boardlist");
		
		
		//전체 레코드 수 가져오기.
		int totalRecord = srvboard.getBoardTotalRecord(searchWord);
		
		// 페이징을 위한 코드 추가. 
		PagingHelper paging = new PagingHelper(totalRecord, curPage, 5, 5);
		int start = paging.getStartRecord();
		int end = paging.getEndRecord();
		
		List<ModelBoard> result = srvboard.getBoardPaging("", searchWord, start, end );
		
		// list
		model.addAttribute("list",result);
		
		//페이징을 위한 url 변수 추가
		model.addAttribute("curPage", curPage);
		model.addAttribute("searchWord", searchWord);
		
		//페이징을 처리하기 위한 변수 추가
		model.addAttribute("no"       , paging.getListNo()   );
		model.addAttribute("prevLink" , paging.getPrevLink() );
		model.addAttribute("pageLinks", paging.getPageLinks());
		model.addAttribute("nextLink" , paging.getNextLink() );
		
		return "board/boardlist";
	}
	
	@RequestMapping(value = "/board/boardview", method = RequestMethod.GET)
    public String boardview(Model model
            , @RequestParam (defaultValue = "free") String boardcd ) {
        logger.info("/board/boardview");
        
        ModelBoard result = srvboard.getBoardOne(boardcd);
        String boardNm = srvboard.getBoardName(boardcd); 
        
        //boardNm, board
        model.addAttribute("boardNm",result.getBoardnm() );
        model.addAttribute("board",result);
        
        return "board/boardview";
    }
	
	@RequestMapping(value = "/board/boardview/{boardcd}", method = RequestMethod.GET)
    public String boardviewPath(Model model
            , @PathVariable(value="boardcd") String boardcd ) {
        logger.info("/board/boardview");
        
        ModelBoard result = srvboard.getBoardOne(boardcd);
        
        //boardNm, board
        model.addAttribute("boardNm",result.getBoardnm() );
        model.addAttribute("board",result);
        
        return "board/boardview";
    }
	
	@RequestMapping(value = "/board/boardmodify", method = RequestMethod.GET)
    public String boardmodify(Model model
            , @RequestParam (defaultValue = "free") String boardcd
            , HttpServletRequest request) {
        logger.info("/board/boardmodify");
        
        ModelBoard result = srvboard.getBoardOne(boardcd);
        
        String actionurl = request.getRequestURL().toString();
        
        //boardNm, board
        model.addAttribute("boardNm"  ,result.getBoardnm() );
        model.addAttribute("board"    ,result              );
        model.addAttribute("actionurl",actionurl           );
        
        return "board/boardmodify";
    }
	
	@RequestMapping(value = "/board/boardmodify/{boardcd}", method = RequestMethod.GET)
    public String boardmodifyPath(Model model
            , @PathVariable(value="boardcd") String boardcd
            , HttpServletRequest request) {
        logger.info("/board/boardmodify/{boardcd}");
        
        ModelBoard result = srvboard.getBoardOne(boardcd);
        
        String actionurl = request.getRequestURL().toString();
        
        //boardNm, board
        model.addAttribute("boardNm"  ,result.getBoardnm() );
        model.addAttribute("board"    ,result              );
        model.addAttribute("actionurl",actionurl           );
        
        return "board/boardmodify";
    }

	@RequestMapping(value = "/board/boardmodify", method = RequestMethod.POST)
    public String boardmodifyPath(Model model
                                , @ModelAttribute ModelBoard setValue
                                , RedirectAttributes rttr) {
        logger.info("/board/boardmodify");
        ModelBoard whereValue = new ModelBoard();
        whereValue.setBoardcd(setValue.getBoardcd());
        
       int result = srvboard.updateBoard(setValue, whereValue);
       
       if( result >0){
        return "redirect:/board/boardlist";
       }
       else{
           // RedirectAttributes  를 이용하여 오류 메세지 전달.
           rttr.addFlashAttribute("msg",WebConstants.MSG_FAIL_UPDATE_TABLE);
           rttr.addFlashAttribute("boardcd", setValue.getBoardcd() );
           return "redirect:/board/boardmodify";
       }
	}
	
	@RequestMapping(value = "/board/boardwrite", method = RequestMethod.GET)
    public String boardwrite(Model model) {
        logger.info("/board/boardwrite");
     
        return "board/boardwrite";
    }
	
	@RequestMapping(value = "/board/boardwrite", method = RequestMethod.POST )
    public String boardwritepost( Model model
                    , @ModelAttribute ModelBoard board
                    , RedirectAttributes rttr ) {
        logger.info("/board/boardwrite");
        
        int result = srvboard.insertBoard(board);
        if (result >0) {
            return "redirect:/board/boardview/" + board.getBoardcd();
        }
        else{
            rttr.addFlashAttribute("msg", WebConstants.MSG_FAIT_INSERT_TABLE);
            rttr.addFlashAttribute("board", board );
            return "redirect:/board/boardwrite"; 
        }     
    }
	
	// /board/boarddelete
    @RequestMapping(value = "/board/boarddelete", method = RequestMethod.POST)
    public String boarddelete( Model model
            , @RequestParam(value="boardcd") String boardcd
            , RedirectAttributes rttr) {
        logger.info("/board/boarddelete");
        
        ModelBoard board = new ModelBoard();
        board.setBoardcd( boardcd );
        
        int result = srvboard.deleteBoard(board);
        
        if( result > 0 ) { 
            return "redirect:/board/boardlist";
        }
        else {
            rttr.addFlashAttribute("msg"  , WebConstants.MSG_FAIL_DELETE_TABLE);
            rttr.addFlashAttribute("board", board);
            
            return "redirect:/board/boardwrite";            
        }
    }
	 
	 @RequestMapping(value = "/board/articlelist", method = RequestMethod.GET)
	 public String articlelist(Model model
                 , @RequestParam(defaultValue="free" ) String boardcd) {
	             logger.info("/board/articlelist");
	             
	             return "redirect:/board/articlelist/" + boardcd;
	 }
	 
	 @RequestMapping(value = "/board/articlelist/{boardcd}", method = RequestMethod.GET)
	    public String articlelist(Model model
	                    , @PathVariable String boardcd
	                    , @RequestParam(defaultValue="1" ) Integer curPage
	                    , @RequestParam(defaultValue=""  ) String  searchWord
	                    , HttpServletRequest request) {
	        logger.info("/board/articlelist");
	     
	        
	        
	        model.addAttribute("boardnm"    , srvboard.getBoardName(boardcd));
	        model.addAttribute("boardcd"    , boardcd   );
	        model.addAttribute("curPage"    , curPage   );
	        model.addAttribute("searchWord" , searchWord);
	        model.addAttribute("url"        , request.getRequestURL().toString() );
	        
	        int totalRecord = srvboard.getArticleTotalRecord(boardcd, searchWord);
            PagingHelper paging = new PagingHelper(totalRecord, curPage); 
            int start = paging.getStartRecord();
            int end = paging.getEndRecord();
            
	        //페이징 처리
	        List<ModelArticle> result = srvboard.getArticleList(boardcd, searchWord, start, end);
            model.addAttribute("articleList", result    );        
	        model.addAttribute("no"       , paging.getListNo()   );
	        model.addAttribute("prevLink" , paging.getPrevLink());
	        model.addAttribute("pageLinks", paging.getPageLinks());
	        model.addAttribute("nextLink" , paging.getNextLink() );
            
	        return "board/articlelist";
	    }
	 
	 @RequestMapping(value = "/board/articleview/{boardcd}/{articleno}", method = RequestMethod.GET)
     public String articleview(Model model
                 , @PathVariable String boardcd
                 , @PathVariable Integer articleno
                 , @RequestParam(defaultValue="1") Integer curPage
                 , @RequestParam(defaultValue="") String searchWord ) {
                 logger.info("/board/articleview");
                           
                 //boardcd
                 //articleno
                 //curPage
                 //searchWord
                 model.addAttribute("boardcd   ", boardcd   );
                 model.addAttribute("articleno ", articleno );
                 model.addAttribute("curPage   ", curPage   );
                 model.addAttribute("searchWord", searchWord);
                 
                 //boardNm
                 model.addAttribute("boardNm", srvboard.getBoardName(boardcd) );
                 
                 //thisArticle
                 ModelArticle thisArticle = srvboard.transArticle(articleno);
                 model.addAttribute("thisArticle",thisArticle);

                 //attachFileList : 첨부파일을 출력하는 경우.
                 List<ModelAttachFile> attachFileList = srvboard.getAttachFileList(articleno);
                 model.addAttribute("attachFileList", attachFileList);
                 
                 //commentList : 댓글 목록을 출력하는 경우.
                 List<ModelComments> commentList = srvboard.getCommentList(articleno);
                 model.addAttribute("commentList", commentList);
                 
                 //nextArticle
                 ModelArticle nextArticle = srvboard.getNextArticle(articleno, boardcd, searchWord);
                 model.addAttribute("nextArticle", nextArticle);
                 
                 //prevArticle
                 ModelArticle prevArticle = srvboard.getPrevArticle(articleno, boardcd, searchWord);
                 model.addAttribute("prevArticle", prevArticle);
                 
                 //articleList
                 //no
                 //prevPage
                 //pageLinks
                 //nextLink
                 //actionurl
                 
                 
                 return "/board/articleview" ;
     }

}
