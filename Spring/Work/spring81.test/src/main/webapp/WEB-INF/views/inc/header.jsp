<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

   
<h1 style="float: left; width: 150px;"><a href="../"></a></h1>
<div id="memberMenu" style="float: right; position: relative; top: 7px;">
	
    <c:choose>
		<c:when test="${empty user}">  <!--  user는 세션명이다. -->
			<input type="button" value="로그인" onclick="location.href='/user/login'" />
			<input type="button" value="회원가입" onclick="location.href='/user/register'" />
		</c:when>
		<c:otherwise>
			<input type="button" value="로그아웃" onclick="location.href='/user/logout'" />
			<input type="button" value="내정보수정" onclick="location.href='/user/usermodify'" />
		</c:otherwise>
	</c:choose>
</div>


    <ul id="nav" >
    <c:choose>
        <c:when test="${empty user}"> 
    <li><a style="color: black;" onclick="location.href='/user/login'">LOGIN</a></li>
    <li><a style="color: black;"onclick="location.href='/user/register'">JOIN US</a></li>
    </c:when>
    <c:otherwise>
    <li><a  style="color: black;"onclick="location.href='/user/logout'" >LOGOUT</a></li>
    <li><a  style="color: black;"onclick="location.href='/user/usermodify'">내정보수정</a></li>
    </c:otherwise>
    </c:choose>
    <li><a href="#" style="color: black;">CART</a></li>
    <li><a href="#" style="color: black;">ORDER</a></li>
    <li><a href="#" style="color: black;">MY PAGE</a></li>
    </ul>