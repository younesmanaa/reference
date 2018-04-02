<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/main.css"/>

<!--===============================================================================================-->
<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/static/images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/util.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/main.css">
<!--===============================================================================================-->

<title>Liste Employes</title>
</head>
<body>
	<div class="limiter">
		<div class="container-table100">
			<div class="wrap-table100">
				<div class="table100 ver1 m-b-110">
					<div class="table100-head">
						<table>
							<thead>
								<tr class="row100 head">
									<!--  <th class="cell100 column1">ID</th> -->
									<th class="cell100 column2">Nom</th>
									<th class="cell100 column3">Prénom</th>
									<th class="cell100 column4">Nationalité</th>
									<th class="cell100 column5">Poste</th>
									<th class="cell100 column5">Addresse</th>
									<th class="cell100 column5">Zone Activité</th>
									<th class="cell100 column5">Téléphone</th>
								</tr>
							</thead>
						</table>
					</div>
					<div class="table100-body js-pscroll">
						<table>
							<tbody>
								<c:forEach var="employe" items="${employes}">
									<tr>
										<!-- <p>
					<c:out value="${employe}"></c:out>
				</p>  -->
										<td><c:out value="${employe.nom}"></c:out></td>
										<td><c:out value="${employe.prenom}"></c:out></td>
										<td><c:out value="${employe.nationalite}"></c:out></td>
										<td><c:out value="${employe.poste}"></c:out></td>
										<td><c:out value="${employe.addresse}"></c:out></td>
										<td><c:out value="${employe.zoneActivite}"></c:out></td>
										<td><c:out value="${employe.telephone}"></c:out></td>
									</tr>
								</c:forEach>

							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>


	<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/static/vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/static/vendor/bootstrap/js/popper.js"></script>
	<script src="${pageContext.request.contextPath}/static/vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/static/vendor/select2/select2.min.js"></script>
	<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/static/vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
	<script>
		$('.js-pscroll').each(function() {
			var ps = new PerfectScrollbar(this);

			$(window).on('resize', function() {
				ps.update();
			})
		});
	</script>
	<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/static/js/main.js"></script>

</body>

</html>