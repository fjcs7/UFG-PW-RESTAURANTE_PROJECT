(function () {
    'use strict';

    angular
        .module('appt')
        .controller('menuBar', menuBar);

    menuBar.$inject = ['$rootScope'];
    function menuBar($rootScope) {
    	var vm = this;

    	function exibir(){
    		var logado = $rootScope.globals.currentUser;
    		if (!logado){
    			return false;
    		} else {
    			return true;
    		}
    	}
    }
});
