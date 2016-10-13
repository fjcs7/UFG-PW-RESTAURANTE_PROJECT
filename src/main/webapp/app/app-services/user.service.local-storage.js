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
        	var usuarios = [{nomeDeExibicao:'João Françolim', username:'garçom', password:'1234', perfil:'garcom'},
                            {nomeDeExibicao:'Antônio Cunha', username:'garcom', password:'1234', perfil:'garcom'},
                            {nomeDeExibicao:'Jhoana Da Silva', username:'telefonista', password:'1234', perfil:'telefonista'},
                            {nomeDeExibicao:'Só Um Estagiário', username:'teste', password:'teste', perfil:'telefonista'}]

        	return usuarios;
        }

    }
})();