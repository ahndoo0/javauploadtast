<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
  
        <form action="/spring/login" 
                method="post"
                enctype="application/x-www-form-urlencoded">

        <label for="id">
        ID: <input type="text" name="id"value="${id} " />
        </label>
        <br> 
        <label for="pw">
        pw: <input type="text" name="pw" required="required" />
        </label>
        <br>
         <input type="submit"  value="전송" required="required"/>
    </form>
    
  
</body>
</html>
