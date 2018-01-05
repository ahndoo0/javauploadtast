<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="view-port" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no, target-densitydpi=medium-dpi" />
    <title>Mobile Project</title>
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../../resources/images/app_icon.png" />
    <link rel="apple-touch-icon-precomposed" href="../../resources/images/app_icon.png" />

    <link rel="stylesheet" href="../../resources/css/common.css">

    <script src="../../resources/js/jquery-3.2.1.js"></script>
    
    <script src="../../resources/js/main.js"></script>
    <script>

    </script>
</head>
<body>

<section id="page1" data-role="page">
<jsp:include page="header.jsp"></jsp:include>

    <div class="content" data-role="content">
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
                        <img src="../../resources/images/thumb_main_01x2.png" alt="" />
                        <br>
                        <span>Instagram may be testing a flatter, black and white design</span>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <img src="../../resources/images/thumb_main_02x2.png" alt="" />
                        <br>
                        <span>Moustakas scratched for series opener in Cleveland with </span>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <img src="../../resources/images/thumb_main_03x2.png" alt="" />
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

   <jsp:include page="footer.jsp"></jsp:include>
</section>

</body>
</html>