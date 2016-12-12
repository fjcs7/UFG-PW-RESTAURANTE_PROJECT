
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

