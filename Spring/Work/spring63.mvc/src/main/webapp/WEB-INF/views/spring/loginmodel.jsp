<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
  
        <form action="/spring/loginmodel" 
                method="post"
                enctype="application/x-www-form-urlencoded">

        <label for="id">
        ID: <input type="text" name="id" />
        </label>
        <br> 
        <label for="pw">
        pw: <input type="text" name="pw" />
        </label>
        <br>
         <input type="submit"  value="전송" />
    </form>
    
  
</body>
</html>
