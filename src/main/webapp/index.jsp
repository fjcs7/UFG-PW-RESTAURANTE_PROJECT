
<%@ include file="/app/shared/header.html"%>
<%@ include file="rotas.html"%>
<%@ include file="app/shared/barra_de_menus.html"%>



<title>Restaurante</title>


</head>
<body>
	<div class="container">
		<div class="row">
			<!-- Caso o login seja inv�lido mostra o motivo. -->
			<div
				ng-class="{ 'alert': flash, 'alert-success': flash.type === 'success', 'alert-danger': flash.type === 'error' }"
				ng-if="flash" ng-bind="flash.message"></div>
			<div ng-view></div>
		</div>
	</div>
	</div>
	<!-- /#page-content-wrapper -->

	</div>

	<script>

			    

		 $(document).ready(function () {
			  var trigger = $('.hamburger'),
			      overlay = $('.overlay'),
			     isClosed = false;

			    trigger.click(function () {
			      hamburger_cross();      
			    });

			    function hamburger_cross() {

			      if (isClosed == true) {          
			        overlay.hide();
			        trigger.removeClass('is-open');
			        trigger.addClass('is-closed');
			        isClosed = false;
			      } else {   
			        overlay.show();
			        trigger.removeClass('is-closed');
			        trigger.addClass('is-open');
			        isClosed = true;
			      }
			  }
			  
			  $('[data-toggle="offcanvas"]').click(function () {
			        $('#wrapper').toggleClass('toggled');
			  });  
			});
		 
			 $("body").vegas({
				    delay: 20000,
				    timer: false,
				    shuffle: true,
				    transition: 'zoomOut',
				    firstTransitionDuration: 1000,
				    transitionDuration: 8000,
				    slides: [
				        { src: 'images/background/fundo3.jpg' },
				        { src: 'images/background/fundo4.jpg' },
				        { src: 'images/background/fundo8.jpg' },
				        { src: 'images/background/fundo10.jpg' }
				    ]
				});
			
			function fechaMenu(){
				$("#hamburguer").trigger('click');
			}
			</script>


</body>
</html>