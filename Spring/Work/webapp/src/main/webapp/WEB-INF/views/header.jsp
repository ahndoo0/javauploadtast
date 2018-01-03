<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<header data-role="header">
    <!-- 웹 로그와 검색 창영역 -->
    <div id="wrap_head">
        <!-- 웹 로그 영역 -->
        <h1 class="main_logo bold helv"><a href="home.jsp" id="logo">Mobile Project</a></h1>

        <!-- 검색 창영역 -->
        <a href="#" id="btn1"><span class="search_icon"></span></a>
        <div id="content">
            <form id="search" action="#" method="get">
                <fieldset>
                    <legend>사이트 검색 입력</legend>
                    <div class="bg_search">
                        <div class="wrapBox">
                            <span class="search_left"></span>
                            <input type="text" name="input_search" class="type_text" placeholder="검색어 입력" maxlength="255"  />
                        </div>
                        <input type="submit" id="Btn" class="type_btn" title="검색" />
                    </div>
                </fieldset>
            </form>
        </div>
    </div>

    <!-- 내비게이션 영역 -->
    <nav>
        <ul class="main_menu bold verd">
            <li><a href="company1.jsp" title="company" class="tab_m">COMPANY</a></li>
            <li><a href="project.jsp" title="project" class="tab_m">PROJECT</a></li>
            <li><a href="recruit.jsp" title="recruit" class="tab_m">RECRUIT</a></li>
            <li><a href="request.jsp" title="request" class="tab_m">REQUEST</a></li>
            <li><a href="notice1.jsp" title="notice ">NOTICE </a></li>
        </ul>
        <ul class="sub_menu verd">
            <li><a href="company1.jsp" category="company">ABOUT US</a></li>
            <li><a href="company2.jsp" category="company">OUR STORY</a></li>
            <li><a href="company3.jsp" category="company">LOCATION</a></li>
        </ul>
    </nav>
</header>