<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Liste Etudiant</title>
</head>
<body>
 <h1 >
 Liste des Etudiants
 </h1>
 <table >
 <tr>
 <th>ID</th><th>Nom Etudiant</th><th>Moy</th><th>Date
Création</th><th>Suppression<th>Edition</th>
 </tr>
 <c:forEach items="${produits}" var="p">
 <tr>
 <td>${p.idEtudiant }</td>
 <td>${p.nomEtudiant }</td>
 <td>${p.prixEtudiant }</td>
 <td><fmt:formatDate pattern="dd/MM/yyyy"
value="${p.datenais}" /></td>
 <td><a onclick="return confirm('Etes-vous sûr ?')"
href="supprimerProduit?id=${p.idEtudiant }">Supprimer</a></td>
 <td><a href="modifierProduit?id=${p.idEtudiant }">Edit</a></td>
 </tr>
 </c:forEach>
 </table>
</body>
</html>
