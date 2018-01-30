<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>eNno Bootstrap Template</title>

    <!-- Bootstrap -->
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="/resources/css/animate.css">
    <link rel="stylesheet" href="/resources/css/font-awesome.min.css">
    <link rel="stylesheet" href="/resources/css/font-awesome.css">
    <link rel="stylesheet" href="/resources/css/jquery.bxslider.css">
    <link href="/resources/css/overwrite.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/resources/css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="/resources/css/demo.css" />
    <link rel="stylesheet" type="text/css" href="/resources/css/set1.css" />
    <link href="/resources/css/style.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse.collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html"><span>eNno</span></a>
            </div>
            <div class="navbar-collapse collapse">                          
                <div class="menu">
                    <ul class="nav nav-tabs" role="tablist">
                        <li role="presentation" class="active"><a href="pj_main10">Home</a></li>
                        <li role="presentation"><a href="pj_main20">Services</a></li>
                        <li role="presentation"><a href="pj_main30">Blog</a></li>
                        <li role="presentation"><a href="pj_main40">Portfolio</a></li>
                        <li role="presentation"><a href="pj_main50">Contact</a></li>                     
                    </ul>
                </div>
            </div>          
        </div>
    </nav>
    
    <div class="container">
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <div class="blogs">
                    <div class="text-center">
                        <h2>상품 소개</h2>
                        <p>지금까지 어렵게만 생각해왔던 IoT 시스템이 "VITCON IoT SYSTEM"을 사용하면 간단하게 해결됩니다. 
                                모듈로 조립해서 H/W를 구성하고, 서버는 VITCON에서 무료로 제공하며, S/W와 APP은 위젯기능으로 10분 만에 구성할 수 있습니다. <br>
                        </p>
                    </div>
                    <hr>
                </div>
            </div>
        </div>
    </div>
    
    <div class="sub_section2">
    <div class="section_con" >
        <ul class="allocation column4 tpl_list">
        <li>
               <div class="allocation_inner">
                        <h3>1. 하드웨어 구성</h3>
                        <p class="txt">하드웨어는 모드링크의 다양한 링크모듈 중 필요한 모듈만 조립해서 구성!</p>
                        <p class="img"><img src="/resources/img/imodlink_01.jpg"></img>
                        </p>
               </div>
        </li>
        <li>
               <div class="allocation_inner">
                        <h3>2. 프로그램 작성</h3>
                        <p class="txt">C언어와 래더언어를 지원하는 개발환경을 무료로 지원 - PROCHIP studio</p>
                        <p class="img"><img src="/resources/img/imodlink_02.jpg"></img>
                        </p>
               </div>
        </li>
        
        <li>
                <div class="allocation_inner">
                        <h3>3. IoT-LINK로 서버 접속</h3>
                        <p class="txt">WiFi/Ethernet/LoRa-LINK로 빛컨 서버에 접속하면 자동으로 정보 전달됨.</p>
                        <p class="img"><img src="/resources/img/imodlink_03.jpg"></img>
                        </p>
               </div>
        </li>
        <li>
                <div class="allocation_inner">
                        <h3>4. 관리자페이지 자동 생성</h3>
                        <p class="txt">정보를 바탕으로 PC/Mobile용 관리자페이지 자동 생성! 필요시 위젯 편집 가능!</p>
                        <p class="img"><img src="/resources/img/prochipstudio_01_2.jpg"></img>
                        </p>
               </div>
        </li>
        </ul>
    </div>
     </div>       
            
            
            
         
    
    
    
    <footer>
        <div class="inner-footer">
            <div class="container">
                <div class="row">
                    <div class="col-md-4 f-about">
                        <a href="index.html"><h1><span>e</span>Nno</h1></a>
                        <p>Lorem ipsum dolor sit amet consectetur adipiscing elit Cras suscipit arcu libero
                        vestibulum volutpat libero sollicitudin vitae Curabitur ac aliquam  consectetur adipiscing elit Cras suscipit arcu libero
                        </p>
                    </div>
                    <div class="col-md-4 l-posts">
                        <h3 class="widgetheading">Latest Posts</h3>
                        <ul>
                            <li><a href="#">This is awesome post title</a></li>
                            <li><a href="#">Awesome features are awesome</a></li>
                            <li><a href="#">Create your own awesome website</a></li>
                            <li><a href="#">Wow, this is fourth post title</a></li>
                        </ul>
                    </div>
                    <div class="col-md-4 f-contact">
                        <h3 class="widgetheading">Stay in touch</h3>
                        <a href="#"><p><i class="fa fa-envelope"></i> example@gmail.com</p></a>
                        <p><i class="fa fa-phone"></i>  +345 578 59 45 416</p>
                        <p><i class="fa fa-home"></i> Enno inc  |  PO Box 23456 
                            Little Lonsdale St, New York <br>
                            Victoria 8011 USA</p>
                    </div>
                </div>
            </div>
        </div>
            
        <div class="last-div">
            <div class="container">
                <div class="row">
                    <div class="copyright">
                        © 2014 eNno Multi-purpose theme | <a target="_blank" href="http://bootstraptaste.com">Bootstraptaste</a>
                    </div>  
                    <!-- 
                        All links in the footer should remain intact. 
                        Licenseing information is available at: http://bootstraptaste.com/license/
                        You can buy this theme without footer links online at: http://bootstraptaste.com/buy/?theme=eNno
                    -->         
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <ul class="social-network">
                        <li><a href="#" data-placement="top" title="Facebook"><i class="fa fa-facebook fa-1x"></i></a></li>
                        <li><a href="#" data-placement="top" title="Twitter"><i class="fa fa-twitter fa-1x"></i></a></li>
                        <li><a href="#" data-placement="top" title="Linkedin"><i class="fa fa-linkedin fa-1x"></i></a></li>
                        <li><a href="#" data-placement="top" title="Pinterest"><i class="fa fa-pinterest fa-1x"></i></a></li>
                        <li><a href="#" data-placement="top" title="Google plus"><i class="fa fa-google-plus fa-1x"></i></a></li>
                    </ul>
                </div>
            </div>
            <a href="" class="scrollup"><i class="fa fa-chevron-up"></i></a>    
        </div>          
    </footer>
    
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="/resources/js/jquery-2.1.1.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="/resources/js/bootstrap.min.js"></script>
    <script src="/resources/js/wow.min.js"></script>
    <script src="/resources/js/jquery.easing.1.3.js"></script>
    <script src="/resources/js/jquery.isotope.min.js"></script>
    <script src="/resources/js/jquery.bxslider.min.js"></script>
    <script type="text/javascript" src="/resources/js/fliplightbox.min.js"></script>
    <script src="/resources/js/functions.js"></script>
    <script type="text/javascript">$('.portfolio').flipLightBox()</script>
  </body>
</html>