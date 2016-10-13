(function () {
    'use strict';

    angular
        .module('appt')
        .controller('LoginController', LoginController);

    LoginController.$inject = ['$location', 'AuthenticationService', 'FlashService'];
    function LoginController($location, AuthenticationService, FlashService) {
        var vm = this;

        vm.login = login;
        vm.logado = false;

        (function initController() {
            // reset login status
            AuthenticationService.ClearCredentials();
        })();

        function login() {
            vm.dataLoading = true;
            vm.logado = true;
            AuthenticationService.Login(vm.username, vm.password, function (response) {
                if (response.success) {
                    AuthenticationService.SetCredentials(vm.username, vm.password, response.nomeDeExibicao, response.perfil);
                    $location.path('/menuBar');
                    if(response.perfil==='garcom'){
                    	$location.path('/pedidosGarcom');
                    } else if (response.perfil==='telefonista'){
                    	$location.path('/pedidosTelefonista');
                    }
                } else {
                    FlashService.Error(response.message);
                    vm.dataLoading = false;
                }
            });
            
        };
    }

})();
