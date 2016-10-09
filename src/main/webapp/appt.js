var appt = angular.module('appt',['ngRoute']);
 
appt.config(function($routeProvider, $locationProvider)
{
   
   $routeProvider
 
   // para a rota '/', carregaremos o template home.html e o controller 'HomeCtrl'
   .when('/', {
      templateUrl : 'views/pedidosGarcom.html',
      controller  : 'listarPedidos',
   })
   
   // para a rota '/', carregaremos o template home.html e o controller 'HomeCtrl'
   .when('/cadastrar', {
      templateUrl : 'views/cadastrarPedido.html',
      controller  : 'cadastrarPedidos',
   }) 
   
   // para a rota '/', carregaremos o template home.html e o controller 'HomeCtrl'
   .when('/alterar', {
      templateUrl : 'views/alterarPedido.html',
      controller  : 'alterarPedidos',
   }) 
   
    // para a rota '/', carregaremos o template home.html e o controller 'HomeCtrl'
   .when('/pagamentos', {
      templateUrl : 'views/pagamentos.html',
      controller  : 'pagamentos',
   }) 
   
   // para a rota '/', carregaremos o template home.html e o controller 'HomeCtrl'
   .when('/receber', {
      templateUrl : 'views/recebimento.html',
      controller  : 'receber',
   }) 
   
   // para a rota '/', carregaremos o template home.html e o controller 'HomeCtrl'
   .when('/entregas', {
      templateUrl : 'views/entregas.html',
      controller  : 'entregas',
   }) 
   
   // para a rota '/', carregaremos o template home.html e o controller 'HomeCtrl'
   .when('/encaminharEntregas', {
      templateUrl : 'views/encaminharEntregas.html',
      controller  : 'encaminharEntregas',
   }) 
   
   // para a rota '/', carregaremos o template home.html e o controller 'HomeCtrl'
   .when('/encaminharEntregasConfirmacao', {
      templateUrl : 'views/encaminharEntregasConfirmacao.html',
      controller  : 'encaminharEntregasConfirmacao',
   })
   // para a rota '/', carregaremos o template home.html e o controller 'HomeCtrl'
       .when('/cadastrarFuncionario', {
          templateUrl : 'views/cadastrarFuncionario.html',
          controller  : 'cadastrarFuncionario',
       })

       // para a rota '/', carregaremos o template home.html e o controller 'HomeCtrl'
       .when('/listarFuncionario', {
          templateUrl : 'views/listarFuncionario.html',
          controller  : 'listarFuncionario',
       })

       // para a rota '/', carregaremos o template home.html e o controller 'HomeCtrl'
       .when('/alterarFuncionario', {
           templateUrl : 'views/alterarFuncionario.html',
           controller  : 'alterarFuncionario',
       })

       // para a rota '/', carregaremos o template home.html e o controller 'HomeCtrl'
       .when('/relatorioDevolucoes', {
          templateUrl : 'views/relatorioDevolucoes.html',
          controller  : 'relatorioDevolucoes',

       })
       // para a rota '/', carregaremos o template home.html e o controller 'HomeCtrl'
       .when('/relatorioEficiencia', {
           templateUrl : 'views/relatorioEficiencia.html',
           controller  : 'relatorioEficiencia',

       })

       // caso não seja nenhum desses, redirecione para a rota '/'
   .otherwise ({ redirectTo: '/' });
});
