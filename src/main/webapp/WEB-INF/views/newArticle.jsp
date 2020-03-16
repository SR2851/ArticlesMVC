<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css"%></style>
<link rel="icon" type="image/png" href="http://localhost:8080/Pilotes/AF.PNG" />
<title>Air Fly</title>
</head>
<body style="background-color: light-grey;">
<nav class="navbar navbar-dark" style="background-color:black; border-bottom-style: solid; border-color:blue;">
  <a class="navbar-brand" href="/Pilotes/Accueil">
    <img src="http://localhost:8080/Pilotes/AF.PNG" width="50" height="100%" margin-top="5px" alt="">
    <img src="http://localhost:8080/Pilotes/fly2.png" width="80" height="30" margin-top="5px">
  </a>
</nav>
<div class="container-fuild">
<div class="row">
<div class="col-lg-3" style="padding-top:6px;">
<div style="background-color:black; border-radius:50px; text-align:center; color:white; margin-left:14px;"><h4>Menu</h4></div>
<div style="border-bottom-style:solid;border-bottom-color:blue;margin-left:14px;">
<h5><a href="/ArticlesMVC/newArticle" style="color:black; padding-left:10px;">Enregistrement Article </a></h5>
<h5><a href="/ArticlesMVC/listeArticle" style="color:black; padding-left:10px;">Liste des articles </a></h5>

</div>
</div>
<div class="col-lg-6" style="background-color: black; border-bottom-right-radius: 25px; border-bottom-left-radius: 25px; border-style:solid;border-bottom-color:blue; border-left-color:blue; border-right-color:blue; ">
<h1 style="text-align:center; color:white;">Ajouter un nouvel article:</h1>
<form action="">


</form>
</div>
<div class="col-lg-3">
</div>
</div>
</div>
<nav class="navbar navbar-dark" style="background-color:black; border-bottom-style: solid; border-color:blue;">
  <a class="navbar-brand" href="/Pilotes/Accueil">
    <img src="http://localhost:8080/Pilotes/AF.PNG" width="50" height="100%" margin-top="5px" alt="">
    <img src="http://localhost:8080/Pilotes/fly2.png" width="80" height="30" margin-top="5px">
  </a>
  <h6 ><a href="" style="color:white;">Contacts</a></h6>
  <h6 ><a href="" style="color:white;">Mentions légales</a></h6>
  <h6 ><a href="" style="color:white;">Recrutement</a></h6>
  <h6 ><a href="" style="color:white; margin-right:20px;">Adresse</a></h6>
</nav>
</body>
</html>