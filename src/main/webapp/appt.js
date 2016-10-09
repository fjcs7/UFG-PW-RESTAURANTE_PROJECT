var appt = angular.module('appt',['ngRoute']);
 
appt.config(function($routeProvider, $locationProvider)
{
   
   $routeProvider
 
   .when('/', {
      templateUrl : 'views/pedidosGarcom.html',
      controller  : 'listarPedidos',
   })
   
   .when('/cadastrar', {
      templateUrl : 'views/cadastrarPedido.html',
      controller  : 'alterarPedidos',
   }) 
   
   .when('/alterar', {
      templateUrl : 'views/alterarPedido.html',
      controller  : 'alterarPedidos',
   }) 
   
   .when('/pagamentos', {
      templateUrl : 'views/pagamentos.html',
      controller  : 'pagamentos',
   }) 
   
   .when('/receber', {
      templateUrl : 'views/recebimento.html',
      controller  : 'receber',
   }) 
   
   .when('/entregas', {
      templateUrl : 'views/entregas.html',
      controller  : 'entregas',
   }) 
   
   .when('/encaminharEntregas', {
      templateUrl : 'views/encaminharEntregas.html',
      controller  : 'encaminharEntregas',
   }) 
   
   .when('/encaminharEntregasConfirmacao', {
      templateUrl : 'views/encaminharEntregasConfirmacao.html',
      controller  : 'encaminharEntregasConfirmacao',
   }) 

   .when('/pedidosTelefonista', {
      templateUrl : 'views/pedidosTelefonista.html',
      controller  : 'telefonista',
   }) 
   
   .when('/cadastrarPedidosTelefonista', {
      templateUrl : 'views/cadastrarPedidosTelefonista.html',
      controller  : 'telefonista',
   }) 
   
   
   .when('/alterarPedidosTelefonista', {
      templateUrl : 'views/alterarPedidosTelefonista.html',
      controller  : 'telefonista',
   }) 
   // para a rota '/', carregaremos o template home.html e o controller 'HomeCtrl'
   .when('/cadastrodeCardapio', {
      templateUrl : 'views/cadastrodeCardapio-jer.html',
      controller  : 'cadastrodeCardapio',
   }) 
   
   // para a rota '/', carregaremos o template home.html e o controller 'HomeCtrl'
   .when('/pedidosPreparar', {
      templateUrl : 'views/pedidosPreparar-jer.html',
      controller  : 'pedidosPreparar',
   })
   
   // para a rota '/', carregaremos o template home.html e o controller 'HomeCtrl'
   .when('/estacionamento', {
      templateUrl : 'views/estacionamento.html',
      controller  : 'estacionamento',
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
})
