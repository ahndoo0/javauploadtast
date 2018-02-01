<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 초기 화면 </title>
<link rel="stylesheet" href="/resources/css/screen.css" type="text/css" />
</head>
<body>

<div id="wrap">
    <div id="header">
        <%@ include file="../inc/header.jsp" %>
    </div>
    <div id="header2">
        <%@ include file="../inc/header2.jsp" %>
    </div>

    <div id="main-menu">
        <%@ include file="../inc/main-menu.jsp" %>
    </div> 
    
    
    <div id="container">
    <div id="content" style="min-height: 800px;">
        <!-- 뉴스 리스트와 이미지 썸네일 리스트 -->
        <div id="main">
            <!-- 뉴스 리스트 만들기 -->
            <h2 class="today_tit helv bold">Today's Story</h2>
            <ul class="n_text_list">
                <li><a href="#">기사 1. aaaaaaa aaa aaa aa</a></li>
                <li><a href="#">기사 2. bbbbbbb bbb bbb bb</a></li>
                <li><a href="#">기사 3. ccccccc ccc ccc cc</a></li>
                <li><a href="#">기사 4. ddddddd ddd ddd dd</a></li>
            </ul>

            <!-- 이미지 썸네일 리스트 만들기 -->
            <ul class="n_img_list">
                <li>
                    <a href="#">
                        <img src="../../../images/thumb_main_01x2.png" alt="" />
                        <br>
                        <span>Instagram may be testing a flatter, black and white design</span>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <img src="../../../images/thumb_main_02x2.png" alt="" />
                        <br>
                        <span>Moustakas scratched for series opener in Cleveland with </span>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <img src="../../../images/thumb_main_03x2.png" alt="" />
                        <br>
                        <span>Office of Civil Rights and Sexual Misconduct</span>
                    </a>
                </li>
            </ul>
        </div>
        <!-- 공지사항 만들기 -->
        <div class="notice">
            <span>공지사항</span> 메인 페이지 만들기 실습 중
        </div>

        <!-- 배너 만들기 -->
        <div class="banner">
            <a href="#">
                <span class="text"> 모바일 디자인 참 쉽죵~~~~</span>
            </a>
        </div>
    </div>
    </div>
    
    <div id="extra">
        <%@ include file="../inc/extra.jsp" %>
    </div>

    <div id="footer">
        <%@ include file="../inc/footer.jsp" %>
    </div>    
   

</div>
</body>
</html>