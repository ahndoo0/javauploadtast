package com.spring13.upload.Controller;

import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.spring13.upload.inf.IServiceUpload;
import com.spring13.upload.inf.IServiceUploadImage;
import com.spring13.upload.model.ModelUploadFile;
import com.spring13.upload.model.ModelUploadImage;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UploadController {
    
    private static final Logger logger = LoggerFactory
            .getLogger(UploadController.class);
    
    @Autowired
    private IServiceUpload      svcupload;
    
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/upload/fileupload", method = RequestMethod.GET)
    public String uploadfile(Model model) {
        logger.info("uploadfile");
        
        return "upload/fileupload";
    }
    
    @RequestMapping(value = "/upload/fileuploadone", method = RequestMethod.POST)
    public String uploadfileone(Model model,
                                                                    @RequestParam(value = "file") MultipartFile clinetfile,
                                                                    @RequestParam(value = "upDir") String upDir     )
                                                                                                                            throws IllegalStateException, IOException {
        logger.info("fileuploadone");
        //클라이언트의 파일을 서버로 복사
        //Table insert 작업
        // step2. 클라이언트의 첨부 파일을 서버로 올리기 위한 코드
        if (!clinetfile.getOriginalFilename().isEmpty()) {
            
            // 서버의 업로드 폴더 존재 여부 체크. 없으면 폴더 생성.
            java.io.File uploadDir = new java.io.File(upDir);
            if (!uploadDir.exists())
                uploadDir.mkdir();
            
            // 클라이언트의 첨부 파일을 서버로 복사
            String fileName = clinetfile.getOriginalFilename();
            String tempName = LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
            String filepath = upDir + tempName;
            java.io.File serverfile = new java.io.File(filepath);
            clinetfile.transferTo(serverfile); // 파일 카피하는 메서드
            
            // DB insert 처리를 위한 코드
            ModelUploadFile attachfile = new ModelUploadFile();
            attachfile.setFileNameOrig(fileName);
            attachfile.setFileNameTemp(tempName);
            attachfile.setFileSize( serverfile.length());
            attachfile.setContentType(clinetfile.getContentType()); // 파일 확장자
            
            // DB insert
            svcupload.insertUploadFile(attachfile);
        }
        //결과 출력
        List<ModelUploadFile> result = svcupload.getUploadFile(null);
        model.addAttribute("files", result);

        return "upload/fileuploadlist";
    }
    
    @RequestMapping(value = "/upload/fileuploadmulti", method = RequestMethod.POST)
    public String uploadfilemulti(Model model,
                                                                @ModelAttribute RepositoryFiles uploadForm,
                                                                @RequestParam(value = "upDir") String upDir)
                                                                                throws IllegalStateException, IOException {
        logger.info("uploadfilemulti");
     
            // 클라이언트의 파일을 서버로 복사 && table insert 작업 
            // step2. 로컬 첨부 파일을 서버로 올리기 위한 코드
            if (uploadForm != null && uploadForm.getFiles().size() > 0) {
            
            // 업로드 폴더 존재 여부 체크. 없으면 폴더 생성.
            java.io.File uploadDir = new java.io.File(upDir);
            if (!uploadDir.exists()) uploadDir.mkdir();
            // DB 에 insert 할 데이터를 닫는 list
            List<ModelUploadFile> listfile = new ArrayList<>();
            
            List<MultipartFile> files = uploadForm.getFiles();
            if (files != null && files.size() > 0) {
                
                int index = 0;
                for (MultipartFile file : files) {
                    
                    // 클라이언트의 첨부 파일을 서버로 복사
                    String fileName = file.getOriginalFilename();
                    String tempName = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")) + String.format("%04d", ++index);
                    String filepath = upDir + "/" + fileName;
                    java.io.File serverfile = new java.io.File(filepath);
                    file.transferTo(serverfile);
                    
                    // DB insert 처리를 위한 코드
                    ModelUploadFile attachfile = new ModelUploadFile();
                    attachfile.setFileNameOrig(serverfile.getName());
                    attachfile.setFileNameTemp(tempName);
                    attachfile.setFileSize( serverfile.length());
                    attachfile.setContentType(file.getContentType()); // 확장자
                    
                    //
                    listfile.add(attachfile);
                }
            }
            
            // DB insert
            svcupload.insertUploadFileList(listfile);
            
        }
            
            List<ModelUploadFile> result =  svcupload.getUploadFile(null);
            model.addAttribute("files", result);
            
        return "upload/fileuploadlist";
    }
    @RequestMapping(value = "/upload/fileuploadlist", method = RequestMethod.GET)
    public String fileuploadlist(Model model) {
        logger.info("fileuploadlist");
        
        List<ModelUploadFile> result =  svcupload.getUploadFile(null);
        model.addAttribute("files", result);
        
    return "upload/fileuploadlist";
    }
    
    @RequestMapping(value = "/download", method = RequestMethod.POST)
    public String download(Model model, @RequestParam String filenametemp,
            @RequestParam String filenameorig) {
        logger.info("download");
        model.addAttribute("filenameorig", filenameorig);
        model.addAttribute("filenametemp", filenametemp);
        return "upload/download";
    }
  
    
}
