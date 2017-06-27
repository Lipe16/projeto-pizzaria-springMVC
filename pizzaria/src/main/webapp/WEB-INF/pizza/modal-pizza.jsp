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

<!-- Modal -->
<div class="modal fade" id="modal-pizza" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
    	<form id="form-pizza" >
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="myModalLabel">Informações da Pizza</h4>
		      </div>
		      <div class="modal-body">
		      		
		      		<input type="hidden" id="id" name="id" value="0"/>
		      
			        <label for="nome">Nome: </label>
					<input id="nome" name="nome" class="form-control">
					
					
					<label for="preco">Preco: </label>
					<input id="preco" name="preco" class="form-control">
					
					<label for="categoria">Categoria: </label>
					<select id="categoria" name="categoria" class="form-control">
						<c:forEach items="${categorias}" var="categoria">
							<option value="${categoria}">${categoria}</option>
						</c:forEach>
					</select>
					
					<label for="ingredientes">Ingredientes: </label>
					<select id="ingredientes" name="ingredientes" class="form-control" multiple="multiple">
						<c:forEach items="${ingredientes}" var="ingrediente">
							<option value="${ingrediente.id}">${ingrediente.nome}</option>
						</c:forEach>
					</select>
					
					
					
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
		        <button id="btn-salvar" type="button" class="btn btn-primary">Save</button>
		      </div>
     	</form>
    </div>
  </div>
</div>