appt.controller('pedidoController', function($rootScope, $location, $http) {
	
	
		   $rootScope.pedidos = [  {numero: 1, descricao: 'Arroz temperado', tempoEspera: '00:30:39', mesa: 13 },
					               {numero: 2, descricao: 'Feijoada', tempoEspera: '00:23:30', mesa: 34},
					               {numero: 3, descricao: 'Arroz branco e feijão tropeiro', tempoEspera: '00:18:40', mesa: 3},
					               {numero: 4, descricao: 'Suco de laranja', tempoEspera: '00:15:03', mesa: 4 },
					               {numero: 5, descricao: 'Vinho tinto', tempoEspera: '00:10:03', mesa: 10 }]

		   $rootScope.numItens = 1;
		   $rootScope.itens = [];
		   
		   //var novoPedido = $resource('api/pedidos/salvar_pedido_loja/:novoPedido');

		    $http.get('api/pedidos/novo_pedido_loja/teste').
		    then(function(request) {
		    	$rootScope.pedido = request;
		    });
//		    var pedido =  $http.get('api/pedidos/novo_pedido_loja/teste');
		    alert($rootScope.pedido);
//		    
		    $http.put('api/pedidos/salvar_pedido_loja/', $rootScope.pedido).then(function(value) {
		    	alert(value.data);
		    }, function(reason) {
		    	alert(reason.data);
		    }, function(value) {
		    	alert(value.data);
		    });

		   
		    			 
		   $rootScope.AdicionaLinha = function(item) {				
				
			   item.numero = $rootScope.numItens;
			   $rootScope.itens.push(angular.copy(item));
			   $rootScope.numItens++;   
			   
		   }
			
		   $rootScope.removerItem = function(index) {
			   $rootScope.itens.splice(index, 1);
				 
		  }
			
		   $rootScope.calculaTroco = function() {
				 
				 var valorRecebido = $("#valorRecebido").val();
				 $("#troco").val(valorRecebido - 130.00);
			 }
});
