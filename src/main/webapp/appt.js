var appt = angular.module('appt',['ngRoute']);
 
appt.config(function($routeProvider, $locationProvider)
{
   
   $routeProvider
 
   .when('/', {
      templateUrl : 'app/pedido/pedido.listar.garcom.html',
      controller  : 'pedidoController',
   })
   
   .when('/cadastrar', {
      templateUrl : 'app/pedido/pedido.cadastrar.garcom.html',
      controller  : 'pedidoController',
   }) 
   
   .when('/alterar', {
      templateUrl : 'app/pedido/pedido.alterar.garcom.html',
      controller  : 'pedidoController',
   }) 
   
   .when('/pagamentos', {
      templateUrl : 'app/pagamento/pagamento.listar.caixa.html',
      controller  : 'pagamentos',
   }) 
   
   .when('/receber', {
      templateUrl : 'app/pagamento/pagamento.receber.caixa.html',
      controller  : 'receber',
   }) 
   
   .when('/entregas', {
      templateUrl : 'app/entrega/entrega.listar.caixa.html',
      controller  : 'entregas',
   }) 
   
   .when('/encaminharEntregas', {
      templateUrl : 'app/entrega/entrega.encaminhar.caixa.html',
      controller  : 'encaminharEntregas',
   }) 
   
   .when('/encaminharEntregasConfirmacao', {
      templateUrl : 'app/entrega/entrega.encaminhar-confirmacao.caixa.html',
      controller  : 'encaminharEntregasConfirmacao',
   }) 

   .when('/pedidosTelefonista', {
      templateUrl : 'app/pedido/pedido.listar.telefonista.html',
      controller  : 'telefonista',
   }) 
   
   .when('/cadastrarPedidosTelefonista', {
      templateUrl : 'app/pedido/pedido.cadastrar.telefonista.html',
      controller  : 'telefonista',
   }) 
   
   
   .when('/alterarPedidosTelefonista', {
      templateUrl : 'app/pedido/pedido.alterar.telefonista.html',
      controller  : 'telefonista',
   }) 
   
   .when('/pedidosPreparar', {
      templateUrl : 'app/pedido/pedido.preparar.cozinha.html',
      controller  : 'pedidosPreparar',
   })
   
   .when('/cadastrarFuncionario', {
      templateUrl : 'app/funcionario/funcionario.cadastrar.gestao.html',
      controller  : 'cadastrarFuncionario',
   })

   .when('/listarFuncionario', {
      templateUrl : 'app/funcionario/funcionario.listar.gestao.html',
      controller  : 'listarFuncionario',
   })

   .when('/alterarFuncionario', {
       templateUrl : 'app/funcionario/funcionario.alterar.gestao.html',
       controller  : 'alterarFuncionario',
   })

   .when('/relatorioDevolucoes', {
      templateUrl : 'app/relatorio/relatorio.devolucoes.gestao.html',
      controller  : 'relatorioDevolucoes',

   })
   
   .when('/relatorioEficiencia', {
       templateUrl : 'app/relatorio/relatorio.eficiencia.gestao.html',
       controller  : 'relatorioEficiencia',

   })
   
   .when('/cadastrodeCardapio', {
       templateUrl : 'app/cardapio/cardapio.listar-cadastrar.cozinha.html',
       controller  : 'cadastrodeCardapio',

   })
   
   .otherwise ({ redirectTo: '/' });
})