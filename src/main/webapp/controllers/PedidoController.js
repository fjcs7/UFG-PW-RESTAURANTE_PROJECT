appt.controller('pedidoController', function($rootScope, $location, $http) {
	

		   $http.get('api/pedidos/listar_pedidos_loja_abertos').then(function(request) {$rootScope.pedidos = request.data;});
		   
		   $rootScope.objetoAlterar = null;
		  
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
				 alert(1)
		   }
		   
		   $rootScope.excluirPedido = function(id) {
			   alert(id)
			   $http.post('api/pedidos/excluir_pedido_loja/'+id, $rootScope.pedido).then(function(value) {
				  
              $rootScope.pedido = value.data;
              console.log(value.data);
              
            });
			   alert(4)
			   }	
		   
		   $rootScope.formatarData = function(data, horario) {
			   
			alert(data);
			    var dataFormatada = data.substring(1, 2)+"/"+data.substring(3, 4)+"/"+data.substring(5,7)+ " "+horario.substring(1, 2)+":"+horario.substring(3, 4)+":"+horario.substring(5, 6);
			   alert(dataFormatada);
		   }
		   
		   $rootScope.alterarPedido = function(pedido, pedidoAlterar) {
			   pedidoAlterar = pedido;
			   alert(1)
			   $location.path('/alterar');
		   }
			   
});

appt.controller('novoPedidoController', function($rootScope, $location, $http) {
	
	   $http.get('api/pedidos/novo_pedido_loja').then(function(novoPedido) {$rootScope.pedido = novoPedido.data;}); 
	   
	   $http.get('api/mesas/disponiveis').then(function(mesas) {$rootScope.mesas = mesas.data;});   
	   
	   
	   $http.get('api/produtos/listar').then(function(produtos) {$rootScope.produtos = produtos.data;});
	
	   
	   $http.get('api/itens/novoItem').then(function(modelo) {$rootScope.modeloItem = modelo.data;}); 
	      
	   $rootScope.itensPedido = [];
	   
	   $rootScope.AdicionaLinha = function(item, modeloItem, itensPedido) {	
		   
		    var itemAdicionar = modeloItem;		    
		    itemAdicionar.quantidade = item.quantidade;
		    itemAdicionar.produto    = item.produto;
		    itensPedido.push(itemAdicionar);
		    alert(itemAdicionar.produto.valor)
	   }
	   
	   $rootScope.adicionarPedido = function(pedido, itensPedido, mesaSelecionada) {
		   pedido.itens = itensPedido;
		   pedido.mesa = mesaSelecionada;
		   
		   console.log(mesaSelecionada)
		   console.log(itensPedido[0].produto);
		   console.log(pedido);
		   
		   var resultado = $http.post('api/pedidos/salvar_pedido_loja', pedido);
	   }
	   
	   
	   
});
 

