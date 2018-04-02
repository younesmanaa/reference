<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<td>Nom</td>
			<td>Prenom</td>
			<td>Nationalité</td>
			<td>Poste</td>
			<td>Addresse</td>
			<td>Zone Activité</td>
			<td>Telephone</td>
		</tr>
		<c:forEach var="employe" items="${employes}">
			<tr>
				<!-- <p>
					<c:out value="${employe}"></c:out>
				</p>  -->
				<td> <c:out value="${employe.nom}"></c:out> </td>
				<td> <c:out value="${employe.prenom}"></c:out> </td>
				<td> <c:out value="${employe.nationalite}"></c:out> </td>
				<td> <c:out value="${employe.poste}"></c:out> </td>
				<td> <c:out value="${employe.addresse}"></c:out> </td>
				<td> <c:out value="${employe.zoneActivite}"></c:out> </td>
				<td> <c:out value="${employe.telephone}"></c:out> </td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>