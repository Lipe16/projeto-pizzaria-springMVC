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


<table
	class="table table-hover table-condensed table-striped table-bordered">
	<thead>
		<tr>
			<td style="width: 10%">#</td>
			<td style="width: 50%"><spring:message code="views.pizzas.tabela.nome" /></td>
			<td style="width: 20%"><spring:message code="views.pizzas.tabela.categoria" /></td>
			<td style="width: 20%"><spring:message code="views.pizzas.tabela.editar" /></td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${ingredientes}" var="ingrediente">
			<tr data-id="${ingrediente.id}">
				<td>${ingrediente.id}</td>
				<td>${ingrediente.nome}</td>
				<td>${ingrediente.categoria}</td>
				<td colspan="2">
					<button type="button" class="btn btn-warning btn-editar"><spring:message code="views.pizzas.tabela.editar" /></button>
					<button type="button" class="btn-deletar btn btn-danger "><spring:message code="views.pizzas.tabela.remover" /></button> 
				</td>

			</tr>
		</c:forEach>
	</tbody>
	<tfoot>
		<tr>
			<td colspan="5"><spring:message code="views.pizzas.tabela.ingredientes_cadastradas" />: <span id="quantidade-ingredientes">${ingredientes.size()}</span></td>
		</tr>
				<tr>
			<td colspan="5">
				<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#modal-ingrediente">
				 	<spring:message code="views.pizzas.tabela.adicionar" />
				</button>
		</td>
		</tr>
	</tfoot>
</table>