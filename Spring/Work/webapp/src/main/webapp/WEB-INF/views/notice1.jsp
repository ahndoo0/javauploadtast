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

   <script src="../../resources/js/jquery-3.1.1.js"></script>
    <script src="../../resources/js/main.js"></script>
    <script>

    </script>


</head>
<body>

<section id="page1" data-role="page">
    <div w3-include-header="header"></div>

    <div data-role="content">
        <div class="s_main">
            <h2 class="sub_tit helv bold">NOTICE</h2>
            <span class="m_tit bold">모바일웹 공지사항입니다.</span>
            <div id="pr_de">
                <h3><strong>모바일</strong></h3>
                <span class="detail_date verd">2012.09.25</span>
            </div>
            <div class="post_cont">
                <p>누구나 쉽게 기초부터 다가갈 수 있도록 도와드립니다. 웹표준 코딩에 대한 두려움은 갖지 않도록 도와드립니다. 모바일 웹에 특화되어서 배우며 함께 만들어 가면서 같이 공부해봅시다.</p>
                <p>아이폰, 안드로이드폰 등의 스마트폰에서의 필수인 모바일 웹 및 하이브리드 제작을 위한 HTML 마크업도 함께 배우시면 실무에 도움이 될 것입니다.</p>
            </div>
            <div class="page_btn helv">
                <p class="numb">
                    <a href="#">&lt;</a>
                    <a href="#">LIST</a>
                    <a href="#">&gt;</a>
                </p>
            </div>
        </div>
    </div>

    <div w3-include-footer="footer"></div>
</section>

</body>
</html>
