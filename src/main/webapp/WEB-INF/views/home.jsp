<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css"%></style>
<title>Notre Site</title>
</head>
<body style="background-color: light-grey;">
<nav class="navbar sticky-top navbar-dark" style="background-color:black; border-bottom-style: solid; border-color:blue;">
  <a class="navbar-brand" href="/articles/home">
    Notre site
  </a>
</nav>
<div class="container-fuild">
<div class="row">
<div class="col-lg-3" style="padding-top:6px;">
<div style="background-color:black; border-radius:50px; text-align:center; color:white; margin-left:14px;"><h4>Menu</h4></div>
<div style="border-bottom-style:solid;border-bottom-color:blue;margin-left:14px;">
<h5><a href="/articles/listeArticle" style="color:black; padding-left:10px;">Liste des articles </a></h5>

</div>
</div>
<div class="col-lg-6" style="background-color: black; border-bottom-right-radius: 25px; border-bottom-left-radius: 25px; border-style:solid;border-bottom-color:blue; border-left-color:blue; border-right-color:blue; ">
<h1 style="text-align:center; color:white;">Bienvenue sur notre site!</h1>
</div>
<div class="col-lg-3">
</div>
</div>
</div>
</body>
</html>
