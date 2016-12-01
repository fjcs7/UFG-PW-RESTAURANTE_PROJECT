(function () {
    'use strict';

    angular
        .module('appt')
        .factory('UserService', UserService);

    UserService.$inject = ['$timeout', '$filter', '$q'];
    function UserService($timeout, $filter, $q) {

        var service = {};

        service.GetByUsername = GetByUsername;

        return service;
 
        function GetByUsername(username) {
            var deferred = $q.defer();
            var filtered = $filter('filter')(getUsers(), { username: username });
            var user = filtered.length ? filtered[0] : null;
            deferred.resolve(user);
            return deferred.promise;
        }

        // private functions

        function getUsers() {
        	var usuarios = [{nomeDeExibicao:'João Françolim', username:'joao', password:'1234', perfil:'garcom'},
                            {nomeDeExibicao:'Antônio Cunha', username:'antonio', password:'1234', perfil:'garcom'},
                            {nomeDeExibicao:'Marcos Antônio', username:'marcos', password:'1234', perfil:'telefonista'},
                            {nomeDeExibicao:'Larissa Silva', username:'larissa', password:'1234', perfil:'gerente'},
                            {nomeDeExibicao:'Kleber Júnior', username:'kleber', password:'1234', perfil:'caixa'},
                            {nomeDeExibicao:'Raquel Viana', username:'raquel', password:'1234', perfil:'cozinha'}]

        	return usuarios;
        }

    }
})();