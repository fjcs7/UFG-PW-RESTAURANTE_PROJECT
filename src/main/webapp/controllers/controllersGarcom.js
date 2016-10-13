appt.controller('pedidoController', function($rootScope, $location) {
		 
		   $rootScope.pedidos = [  {numero: 1, descricao: 'Arroz temperado', tempoEspera: '00:30:39', mesa: 13 },
					               {numero: 2, descricao: 'Feijoada', tempoEspera: '00:23:30', mesa: 34},
					               {numero: 3, descricao: 'Arroz branco e feijão tropeiro', tempoEspera: '00:18:40', mesa: 3},
					               {numero: 4, descricao: 'Suco de laranja', tempoEspera: '00:15:03', mesa: 4 },
					               {numero: 5, descricao: 'Vinho tinto', tempoEspera: '00:10:03', mesa: 10 }]

		   $rootScope.numItens = 1;
		   $rootScope.itens = [];
		   
		    			 
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

appt.controller('pagamentos', function($rootScope, $location) {
});

appt.controller('receber', function($rootScope, $location) {
});

appt.controller('entregas', function($rootScope, $location) {
});

appt.controller('encaminharEntregas', function($rootScope, $location) {
});

appt.controller('encaminharEntregasConfirmacao', function($rootScope, $location) {
});

appt.controller('telefonista', function($rootScope, $location) {
});
appt.controller('controllersGerenciais', function($rootScope, $location) {
});



appt.controller('cadastrodeCardapio', function($rootScope, $location) {
});

appt.controller('pedidosPreparar', function($rootScope, $location) {
});

appt.controller('estacionamento', function($rootScope, $location) {
});
appt.controller('relatorioDevolucoes', function($rootScope, $location) {
    $rootScope.activetab = $location.path();
    angular.module('dateInputExample', [])
        .controller('DateController', ['$scope', function($scope) {
            $scope.example = {
                value: new Date(2016, 9, 25)
            };
        }]);
});

appt.controller('relatorioEficiencia', function($rootScope, $location) {
    $rootScope.activetab = $location.path();
    angular.module('dateInputExample', [])
        .controller('DateController', ['$scope', function($scope) {
            $scope.example = {
                value: new Date(2016, 9, 25)
            };
        }]);
});

appt.controller('cadastrarFuncionario', function($rootScope, $location) {
    $rootScope.activetab = $location.path();
});

appt.controller('listarFuncionario', function($rootScope, $location) {
    $rootScope.activetab = $location.path();
});

appt.controller('alterarFuncionario', function($rootScope, $location) {
    $rootScope.activetab = $location.path();
});

