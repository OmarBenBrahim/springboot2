<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Modifier un Etudiant</title>
</head>
<body>
<form action="updateEtudiant" method="post">
<pre>
id : <input type="text" name="idEtudiant" value="${etudiant.idEtudiant}">
nom :<input type="text" name="nomEtudiant" value="${etudiant.nomEtudiant}">
moyenne :<input type="text" name="moyEtudiant" value="${etudiant.moyEtudiant}">
Date date naissance :
 <fmt:formatDate pattern="yyyy-MM-dd" value="${etudiant.datenais}"
var="formatDate" />
 <input type="date" name="date" value="${formatDate}"></input>
<input type="submit" value="Modifier">
</pre>
</form>
<br/>
<br/>
<a href="ListeProduits">Liste Etudiant</a>
</body>
</html>
