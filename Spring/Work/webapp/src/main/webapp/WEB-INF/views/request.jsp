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
        $(document).ready(function (e) {
            $('.btn_send').click(function (e) {

                var list = $('.req_input, .req_long');

                for( var i=0; i< list.length; i= i+1){

                    if( $( list[i] ).val() === '' ) {
                        list[i].focus();

                        if( $(list[i]).next().length == 0 ) {
                            $(list[i]).after('<label>입력하세요</label>');
                        }

                        return false;
                    }
                }

                // submit 호출 : form 의 action 이 실행됨.
                $('#frm_request').submit();
            });

            $('.req_input, .req_long').keyup( function (e) {
                if( $(this).val() !== '') {
                    $(this).next().remove();
                }
            });
        })
    </script>
</head>
<body>

<section id="page1" data-role="page">
    <div w3-include-header="header"></div>

    <div class="content" data-role="content">
        <div class="s_main">
            <h2 class="sub_tit helv bold">REQUEST(폼 유효성 검사)</h2>
            <span class="m_tit bold">궁금하세요? 질문해주세요.</span>
            <form id="frm_request" action="" method="post" enctype="application/x-www-form-urlencoded">
                <table width="100%" border="0" cellspacing="0" cellpadding="0" class="req_box">
                    <colgroup>
                        <col width="60px" />
                        <col />
                    </colgroup>
                    <tr>
                        <th>작성자</th>
                        <td>
                            <input name="name" type="text" class="req_input">
                        </td>
                    </tr>
                    <tr>
                        <th>E-mail</th>
                        <td>
                            <input name="email" type="email" class="req_input">
                        </td>
                    </tr>
                    <tr>
                        <th>연락처</th>
                        <td>
                            <input name="phone" type="tel" class="req_input">
                        </td>
                    </tr>
                    <tr>
                        <th>주소</th>
                        <td>
                            <input name="addr" type="search" class="req_input">
                        </td>
                    </tr>
                    <tr>
                        <th>나이</th>
                        <td>
                            <input name="age" type="number" class="req_input">
                        </td>
                    </tr>
                    <tr>
                        <th>비밀번호</th>
                        <td>
                            <input name="pwd" type="password" class="req_input">
                        </td>
                    </tr>
                    <tr>
                        <th>제목</th>
                        <td>
                            <input name="title" type=""  class="req_input">
                        </td>
                    </tr>
                    <tr>
                        <th>내용</th>
                        <td>
                            <textarea name="content" cols="" rows="" class="req_long"></textarea>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" class="btn_center">
                            <input type="button" class="btn_send" value="SEND" />
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>

    <div w3-include-footer="footer"></div>
</section>

</body>
</html>