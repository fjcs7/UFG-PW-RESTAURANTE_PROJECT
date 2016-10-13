
<%@ include file="/app/shared/header.html"%>

<!-- /#wrapper -->
<script src="appt.js"></script>
<script src="app/app-services/authentication.service.js"></script>
<script src="app/app-services/flash.service.js"></script>
<script src="app/app-services/user.service.local-storage.js"></script>

<script src="app/login/login.controller.js"></script>
<script src="controllers/controllersGarcom.js"></script>
<script src="app/shared/menu.controller.js"></script>

<%@ include file="app/shared/barra_de_menus.html"%>



<title>Restaurante</title>


	</head>
	<body>
	<div class="container">
		<div class="row">
		<!-- Caso o login seja inválido mostra o motivo. -->
		<div ng-class="{ 'alert': flash, 'alert-success': flash.type === 'success', 'alert-danger': flash.type === 'error' }" ng-if="flash" ng-bind="flash.message"></div>
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
		 
			</script> 
	
	</body>
</html>