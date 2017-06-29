<!-- 
BIBLIOTECAS
C - JSTL (PRA AJUDAR A IMPLEMENTAR CÓDIGO JAVA  EM FORMA HTML)
FMT - JSTL DE FORMATAÇÃO
SPRING - SPRING
FORM - FORMULARIOS SPRING
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${titulo}</title>
		<!-- variavel criada com jstl-->
		<c:set var="path" value="${pageContext.request.contextPath}" scope="request"/>
		
		<style type="text/css">
			@IMPORT url("${path}/static/bootstrap/css/bootstrap.min.css");
			@IMPORT url("${path}/static/bootstrap/css/bootstrap-theme.min.css");
		</style>
		<script type="text/javascript" src="${path}/static/jquary/jquery-3.2.1.min.js"></script>
		<script type="text/javascript" src="${path}/static/jquary/ingredientes.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<c:if test="${not empty mensagemErro}">
	<div class="container">
		<div class="alert alert-danger">${mensagemErro}</div>
	</div>
</c:if>
<c:if test="${not empty mensagemInfo}">
	<div class="container">
		<div class="alert alert-info">${mensagemInfo}</div>
	</div>
</c:if>
	
	<jsp:include page="../menu.jsp" />
	<section id="secao-ingredientes" class="container">
		<jsp:include page="tabela-ingrediente.jsp" />
	</section>
	
 
 	<jsp:include page="modal-ingrediente.jsp" />
</body>
</html>