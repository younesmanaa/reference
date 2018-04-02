<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>


<sf:form action="${pageContext.request.contextPath}/docreate" method="post" modelAttribute="employe">
<table class="formtable">
	<tr> <td class="label"> Nom:  </td> <td> <sf:input  path="nom" name="nom" type="text"/><br/> <sf:errors path="nom" cssClass="error"></sf:errors> </td></tr>
	<tr> <td class="label"> Prenom: </td> <td> <sf:input path="prenom" name="prenom" type="text"/><br/> <sf:errors path="prenom" cssClass="error"> </sf:errors> </td></tr>
	<tr> <td class="label"> Nationalité: </td> <td> <sf:input path="nationalite" name="nationalite" type="text"/><br/> <sf:errors path="nationalite" cssClass="error"> </sf:errors> </td></tr>
	<tr> <td class="label"> Poste: </td> <td> <sf:input path="poste" name="poste" type="text"/><br/> <sf:errors path="poste" cssClass="error"> </sf:errors> </td></tr>
	<tr> <td class="label"> Addresse: </td> <td> <sf:input path="addresse" name="addresse" type="text"/> <br/> <sf:errors path="addresse" cssClass="error"> </sf:errors> </td></tr>
	<tr> <td class="label"> Zone Activité: </td> <td> <sf:input path="zoneActivite" name="zoneActivite" type="text"/><br/> <sf:errors path="zoneActivite" cssClass="error"> </sf:errors> </td></tr>
	<tr> <td class="label"> Téléphone: </td> <td> <sf:input path="telephone" name="telephone" type="text"/><br/> <sf:errors path="telephone" cssClass="error"> </sf:errors> </td></tr>
	<tr> <td class="label"> </td> <td> <input name="Add Employe" type="submit"> </td></tr>
</table>
</sf:form>

</body>
</html>