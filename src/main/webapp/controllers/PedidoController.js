appt.controller('pedidoController', function($rootScope, $location, $http) {
	

		   $http.get('api/pedidos/listar_pedidos_loja_abertos').then(function(request) {$rootScope.pedidos = request.data;});
		  
		   
			
		   $rootScope.removerItem = function(index) {
			   $rootScope.itens.splice(index, 1);	 
		   }
		   
		   $rootScope.novoPedidoLoja = function(){
			    $http.get('api/pedidos/novo_pedido_loja').
			    then(function(request) {
			    	$rootScope.pedido = request;
			    	$rootScope.pedido.data.mesa = null;
			    });
		   }
			
		   $rootScope.calculaTroco = function() {
				 var valorRecebido = $("#valorRecebido").val();
				 $("#troco").val(valorRecebido - 130.00);
			 }
});

appt.controller('novoPedidoController', function($rootScope, $location, $http) {
	   $http.get('api/mesas/disponiveis').then(function(mesas) {$rootScope.mesas = mesas.data;});
	   
	   
	   $rootScope.carregarItens = function(){
		   $http.get('api/produtos/listar').then(function(produtos) {$rootScope.produtos = produtos.data;});
	   }
	   
	   
	   $http.get('api/itens/novoItem').then(function(modelo) {$rootScope.modeloItem = modelo.data;});
	 
	   
   
	   $rootScope.itensPedido = [];
	   
	   $rootScope.AdicionaLinha = function() {	
		    var itemAdicionar = $rootScope.modeloItem;
		    
		    itemAdicionar.quantidade = $rootScope.quantidadeItem;
		    itemAdicionar.produto    = $rootScope.produtoAdicionar;
		    
		    alert($rootScope.quantidadeItem);
		   
	   }
	   
});
 

