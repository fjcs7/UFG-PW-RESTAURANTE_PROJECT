appt.controller('listarPedidos', function($rootScope, $location) {
		   $rootScope.activetab = $location.path();
});

appt.controller('cadastrarPedidos', function($rootScope, $location) {
	   $rootScope.activetab = $location.path();
});



appt.controller('alterarPedidos', function($rootScope, $location) {
	   $rootScope.activetab = $location.path();
});

appt.controller('pagamentos', function($rootScope, $location) {
	   $rootScope.activetab = $location.path();
});


appt.controller('receber', function($rootScope, $location) {
	   $rootScope.activetab = $location.path();
});

appt.controller('entregas', function($rootScope, $location) {
	   $rootScope.activetab = $location.path();
});

appt.controller('encaminharEntregas', function($rootScope, $location) {
	   $rootScope.activetab = $location.path();
});

appt.controller('encaminharEntregasConfirmacao', function($rootScope, $location) {
	   $rootScope.activetab = $location.path();
});



appt.controller('controllersGerenciais', function($rootScope, $location) {
    $rootScope.activetab = $location.path();
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
