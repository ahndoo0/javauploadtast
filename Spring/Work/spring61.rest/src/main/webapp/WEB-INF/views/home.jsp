<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
    <script type="text/javascript" src="/resources/jquery-3.2.1.js"></script>
    <script type="text/javascript">
     $("#joinOk").click( function(e){
    	   $.ajax({
            	 url : '/rest/getboardone',
            	 data: { 'cd' : 'free' }, // { 'data1':'test1', 'data2':'test2' }
            	 type: 'get', // get, post
            	 timeout: 30000, // 30 초
            	 dataType: 'json', // text, html, xml, json, jsonp, script
            	 beforeSend : function() {
            	 // 통신이 시작되기 전에 이 함수를 타게 된다.
    	    $('#message1').html('<img src="/resources/loading.gif">');
    	     }
            	 }).done( function(data, textStatus, xhr ){
            	 // 통신이 성공적으로 이루어졌을 때 이 함수를 타게 된다.
            	 if(!data){
            	 alert("존재하지 않는 boardcd 입니다");
            	 }
            	 else {
            	 alert("존재하는 boardcd 입니다");
            	 }
            	 }).fail( function(xhr, textStatus, error ) {
    	 // 통신이 실패했을 때 이 함수를 타게 된다.
            	 var msg ='';
            	 msg += "code:" + xhr.status + "\n";
            	 msg += "message:" + xhr.responseText + "\n";
            	 msg += "status:" + textStatus + "\n";
            	 msg += "error : "+ error + "\n";
        
            	 console.log(msg);
            	 }).always( function(data, textStatus, xhr ) {
            	 // 통신이 실패했어도 성공했어도 이 함수를 타게 된다.
            	 $('#message1').html('');
            	 });
            	});

    </script>
</head>
<body>
    <h1>Hello world!</h1>
    <P>  The time on the server is ${serverTime}. </P>
    <hr>
    
    <h1>ajax 통신</h1>
    <button id ="joinOk">selectuserlist 호출</button>
    <div id="message1"></div>
    <hr>
    
    <h1>User</h1>
    <p>  <a href="/rest/curtime" target="_blank">/rest/curtime</a>  </p>
    <p>  <a href="/rest/selectuserlist" target="_blank">/rest/selectuserlist</a>  </p>
    <p> <a href="./rest/login?userid=test1id&passwd=test1pw" target="_blank"> /rest/login?userid=test1id&passwd=test1pw  </a></p>
    <p> <a href="./rest/login?userid=userid&passwd=password" target="_blank"> /rest/login?userid=userid&passwd=password  </a></p>
    <p> <a href="./rest/checkuserid?userid=userid" target="_blank"> ./rest/checkuserid?userid=userid  </a></p>
    <p> <a href="./rest/checkuserid?userid=fadfad" target="_blank"> ./rest/checkuserid?userid=fadfad  </a></p>
    <p> <a href="./rest/updatepasswd?userid=userid&currentPasswd=password&newPasswd=newpw" target="_blank"> ./rest/updatepasswd?userid=userid&currentPasswd=password&newPasswd=newpw  </a></p>
    
    <p> @RequesBody 실습 </p>
    
    <p> <a href="./rest/insertone?id=3i&pw=3p&name=3n&email=3e" target="_blank"> /rest/insertone </a></p>
    <p> <a href="./rest/insertuser?userid=111&email=111" target="_blank"> ./rest/insertuser?userid=111&email=111 </a></p>
    <hr>

    <h1>Board</h1>
        <p> <a href="/rest/getboardone?cd=free"   target="_blank">    /rest/getboardone?cd=free     </a> </p>
        <p> <a href="/rest/getboardone"           target="_blank">   "/rest"/getboardone"           </a> </p>
        <p> <a href="/rest/getboardname"          target="_blank">   "/rest/getboardname"           </a> </p>
        <p> <a href="/rest/getboardtotalrecord"   target="_blank">   "/rest/getboardtotalrecord"    </a> </p>
        <p> <a href="/rest/getboardpaging"        target="_blank">   "/rest/getboardpaging"         </a> </p>
        <p> <a href="/rest/getboardlist"          target="_blank">   "/rest/getboardlist"           </a> </p>
        <p> <a href="/rest/insertboard"           target="_blank">   "/rest/insertboard"            </a> </p>
        <p> <a href="/rest/updateboard"           target="_blank">   "/rest/updateboard"            </a> </p>
        <p> <a href="/rest/deleteboard"           target="_blank">   "/rest/deleteboard"            </a> </p>
        <p> <a href="/rest/insertboardlist"       target="_blank">   "/rest/insertboardlist"        </a> </p>
        <p> <a href="/rest/getarticletotalrecord" target="_blank">   "/rest/getarticletotalrecord"  </a> </p>
        <p> <a href="/rest/getarticlelist"        target="_blank">   "/rest/getarticlelist"         </a> </p>
        <p> <a href="/rest/getarticle"            target="_blank">   "/rest/getarticle"             </a> </p>
        <p> <a href="/rest/insertarticle"         target="_blank">   "/rest/insertarticle"          </a> </p>
        <p> <a href="/rest/updatearticle"         target="_blank">   "/rest/updatearticle"          </a> </p>
        <p> <a href="/rest/deletearticle"         target="_blank">   "/rest/deletearticle"          </a> </p>
        <p> <a href="/rest/increasehit"           target="_blank">   "/rest/increasehit"            </a> </p>
        <p> <a href="/rest/getnextarticle"        target="_blank">   "/rest/getnextarticle"         </a> </p>
        <p> <a href="/rest/getprevarticle"        target="_blank">   "/rest/getprevarticle"         </a> </p>
        <p> <a href="/rest/getattachfile"         target="_blank">   "/rest/getattachfile"          </a> </p>
        <p> <a href="/rest/getattachfilelist"     target="_blank">   "/rest/getattachfilelist"      </a> </p>
        <p> <a href="/rest/insertattachfile"      target="_blank">   "/rest/insertattachfile"       </a> </p>
        <p> <a href="/rest/deleteattachfile"      target="_blank">   "/rest/deleteattachfile"       </a> </p>
        <p> <a href="/rest/getcomment"            target="_blank">   "/rest/getcomment"             </a> </p>
        <p> <a href="/rest/getcommentlist"        target="_blank">   "/rest/getcommentlist"         </a> </p>
        <p> <a href="/rest/insertcomment"         target="_blank">   "/rest/insertcomment"          </a> </p>
        <p> <a href="/rest/updatecomment"         target="_blank">   "/rest/updatecomment"          </a> </p>
        <p> <a href="/rest/deletecomment"         target="_blank">   "/rest/deletecomment"          </a> </p>
    
    <img src="data:image/png;base64,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" >
</body>
</html>
