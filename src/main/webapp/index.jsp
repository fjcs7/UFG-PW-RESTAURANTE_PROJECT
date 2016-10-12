
<%@ include file="/views/header.html"%>
<%@ include file="/views/barra_de_menus.html"%>

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
		var numItens = 1;
    
		function carroClientes() {
			var carroCliente = $("input:radio[name=carroCliente]:checked").val();
			
			if(carroCliente == 1)
				$("#dadosCarro").removeClass("oculto");
			else 
				$("#dadosCarro").addClass("oculto");
							
		}
		 
		function AdicionaLinha() {
			
			
				var quantidadeItem = $("#quantidadeItem").val();
				var item           = $("#item").val();

			    var newRow = $("<tr id='linha"+numItens+"'>");
			    var cols = "";
			    
			    cols += '<td><center>'+numItens+'</center></td>';
			    cols += '<td><center>'+item+'</center></td>';
			    cols += '<td>';
			    cols += '	<center>';
			    cols += '		<span class=""><i class="fa fa-plus-square" aria-hidden="true"></i></span>';
			    cols += '		<span> '+quantidadeItem+'  </span>';
			    cols += '		<span class=""><i class="fa fa-minus-square" aria-hidden="true"></i></span>';
			    cols += '	</center>';
			    cols += '</td>';
			    cols += '<td>';
			    cols += '	<center>'
			    cols += '		<a type="button" class="btn btn-danger btn-xs" onclick="removerItem(\''+numItens+'\');"><i class="fa fa-trash-o" aria-hidden="true"></i> Remover</a>';
			    cols += '	</center>';
			    cols += '</td>';
			    
			    $("#divItensPedido").removeClass('oculto');

			    newRow.append(cols);
			    $("#itensPedido").append(newRow);
			    
			    numItens++;
			    
			    $("#quantidadeItem").val('');
				$("#item").val('');
				
				

	     }
		
		 function removerItem(numItem) {
			 alert(numItem);
			 $("#linha"+numItem).remove();
			 
		 }
		 
		 function controlaFormaPgto() {
			 
			var formaPgto = $("#selectFormaPgto").val();
			
			if (formaPgto == 1) {
				
				$("#divCheque").addClass("oculto");
				$("#divCartao").addClass("oculto");
				
				$("#divDinheiro").removeClass("oculto");
				$("#formaPgtoCupom").text("Pagamento em Dinheiro");
				
			} else if (formaPgto == 2) {
				$("#divCheque").addClass("oculto");
				$("#divDinheiro").addClass("oculto");
				
				$("#divCartao").removeClass("oculto");
				$("#formaPgtoCupom").text("Pagamento no Cart�o");
				
			} else {
				$("#divCartao").addClass("oculto");
				$("#divDinheiro").addClass("oculto");
				
				$("#divCheque").removeClass("oculto");
				$("#formaPgtoCupom").text("Pagamento em Cheque");
				
			}
		 }
		
		 function calculaTroco() {
			 
			 var valorRecebido = $("#valorRecebido").val();
			 $("#troco").val(valorRecebido - 130.00);
		 }
		 

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