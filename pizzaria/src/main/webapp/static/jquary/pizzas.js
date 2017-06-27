/**
 * 
 */
$(document).ready(function(){

	aplicarListners();
	

	
});


var aplicarListners = function(){
	
	//--------------------------------------
	$('#btn-salvar').on('click', function(){
		
		
		var url = 'pizzas';
		var dadosPizza = $('#form-pizza').serialize();
		
		$.post(url, dadosPizza)
			.done(function(pagina){

				$('#secao-pizzas').html(pagina);
				aplicarListners();
			})
			.fail(function(){
				alert('Erro ao salvar!');
				
			})
			.always(function(){
				$('#modal-pizza').modal('hide');
			});
	});
	
	

	
}

