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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
<title>Login</title>
		<!-- variavel criada com jstl-->
		<c:set var="path" value="${pageContext.request.contextPath}" scope="request"/>
		
		<style type="text/css">
			@IMPORT url("${path}/static/bootstrap/css/bootstrap.min.css");
			@IMPORT url("${path}/static/bootstrap/css/bootstrap-theme.min.css");
			#login{
				width: 400px;
				margin:0 auto;
				margint-top: 100px;
			}
		</style>
		<script type="text/javascript" src="${path}/static/jquary/jquery-3.2.1.min.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>

	<section id="login" class="panel panel-primary">
			<c:if test="${not empty param['semacesso']}">
				<div>
					<div class="alert alert-warning">Usuario e/ou senha errada!</div>
				</div>
			</c:if>
			<c:if test="${not empty param['sair']}">
				<div >
					<div class="alert alert-info">deslogado!</div>
				</div>
			</c:if>
			
		<form action="${path}/autenticar" method="post">
			<div class="panel panel-heading">
				Pizzaria - login
			</div>
			<div class="panel panel-body">
				<label for="usuario">Usuario: </label>
				<input id="usuario" name="usuario" class="form-control" required/>
				
				<label for="senha">Senha: </label>
				<input type="password" id="senha" name="senha" class="form-control" required/>
			</div>
			<div class="panel panel-footer">
				<button id="btn-login" class="btn btn-primary">Entrar</button>
			</div>
			
			<!-- token para o spring implementar mais segurança em formularios
			se não for criado a operação resulta em erros -->
			<input type="hidden" id="_csrf" name="_csrf" value="${_csrf.token}">
		</form>
	</section>

</body>
</html>