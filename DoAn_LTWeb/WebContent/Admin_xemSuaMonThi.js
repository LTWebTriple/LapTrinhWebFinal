$(document).ready(function(){
	$.ajax({
		type : 'POST',				
		url:'Admin_xemSuaMonThi',
		success:function(result){	
			$("#table").html(result);		
		}   
	});	
});