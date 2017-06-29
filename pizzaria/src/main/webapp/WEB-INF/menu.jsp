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

<div class="container">
<nav class="navbar navbar-default">

  <div >
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Pizzaria</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	      <ul class="nav navbar-nav">
	     	    <li><a href="ingredientes.jsp">Ingredientes</a></li>
	            <li><a href="pizzas.jsp">Pizzas</a></li>
	      </ul>
	    <form method="post" action="${path}/sair" class="navbar-form navbar-left" >
	    		 <div class="form-group">
	        		<button type="submit" class="btn btn-default">Sair</button>
	        		<input type="hidden" name="_csrf" value="${_csrf.token}">
	        	</div>
	      </form>

    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->

</nav>
 </div>
</body>
</html>

