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

            $('dl.rec_list > dd').hide();

            $('dl.rec_list > dt').click(function (e) {

                var $list = $(this).nextAll();
                for(var i=0; i<$list.length; i=i+1){
                    if( $list[i].tagName.toUpperCase() === "DD"){
                        $($list[i]).show();
                    }
                    else if( $list[i].tagName.toUpperCase() === "DT"){
                        break;
                    }
                }
            });

        });

    </script>
</head>
<body>

<section id="page1" data-role="page">
    <div w3-include-header="header"></div>

    <div class="content" data-role="content">
        <div class="s_main">
            <h2 class="sub_tit helv bold">RECRUIT(아코디언효과)</h2>
            <div class="m_cont">
                <dl class="rec_list">
                    <dt>PASSION</dt>
                    <dd>자기가 하는 모든 일을 적극적으로 열심히 수행하는 사람</dd>
                    <dd>일에 대해 몰입할 수 있는 사람</dd>
                    <dd>인터넷 관련 분야에 관심이 많고 이 분야를 발전시키는 일에 재미와 보람을 느끼는 사람</dd>

                    <dt>CREATIVITY</dt>
                    <dd>새로운 아이디어를 창출해 낼 수 있는 능력을 갖춘 사람</dd>
                    <dd>기존 서비스의 틀에 얽매이지 않고 사고할 수 있는 사람</dd>
                    <dd>서비스, User interface, 디자인, 기술 등이 창의적인 사람</dd>

                    <dt>INNOVATION</dt>
                    <dd>어떤 일이든지 새로운 분야와 새로운 방식을 찾아서 더 좋은 방향으로 해결하려고 하는 사람</dd>
                    <dd>급변하는 인터넷 산업에 빠르고 능동적으로 대처할 수 있는 사람</dd>
                </dl>
            </div>
        </div>
    </div>

    <div w3-include-footer="footer"></div>
</section>

</body>
</html>
