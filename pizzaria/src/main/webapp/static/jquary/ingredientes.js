/**
 * 
 */
$(document).ready(function(){

	aplicarListners();
	
	aplicarListnersSalvar();

	

	
});

var limparModal = function(){
	$('#id').val('0');
	$('#nome').val('');
	
	
}


var aplicarListnersSalvar = function(){
	$('#btn-salvar').on('click', function(){
		
		
		var url = 'ingredientes';
		var dadosIngrediente = $('#form-ingrediente').serialize();
		
		$.post(url, dadosIngrediente)
			.done(function(pagina){
	
				$('#secao-ingredientes').html(pagina);
				limparModal();
				aplicarListners();
				
			})
		
			.fail(function(){
				alert('Erro ao salvar!');
				
			})
		
	});
}

var aplicarListners = function(){
	
	$('#modal-ingrediente').on('hide.bs.modal', limparModal);
	
	//------------------------------------
	$('.btn-editar').on('click', function(){
				
		var id = $(this).parents('tr').data('id');
		var url = 'ingredientes/'+id;
		
		$.get(url)
		.done(function(ingrediente){//pega um objeto json
	    	
			$('#id').val(ingrediente.id);
			$('#nome').val(ingrediente.nome);
			$('#categoria').val(ingrediente.categoria);
			
			$('#modal-ingrediente').modal('show');
	    	
	    });
		
		
	});
	
	
	
	//------------------------------------
	$('.btn-deletar').on('click', function(){
		
		
		var id = $(this).parents('tr').data('id');
		
		var ingredientes = $('#quantidade-ingredientes').text();

	    $.ajax({
	    	        url: "ingredientes/"+id,
	    	        type: "DELETE",
	    	        //  type: 'DELETE',
	    	        success: function(result){
	    	            $('tr[data-id="'+id+'"]').remove();
	    	            $('#quantidade-ingredientes').text(ingredientes - 1);
	    	        }
	    	    })
		
		
	});
	
}