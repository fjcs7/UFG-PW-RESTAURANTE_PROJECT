
<%@ include file="/app/shared/header.html"%>
<%@ include file="/app/shared/barra_de_menus.html"%>

<title>Restaurante</title>


	</head>
	<body>
	<div class="container">
		<div class="row">
		<div ng-view></div>
		</div>  
	</div>
	</div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->
	<script src="appt.js"></script>
    <script src="controllers/controllersGarcom.js"></script>
    
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