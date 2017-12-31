$(document).ready(function(){
	$.ajax({
		type : 'POST',				
		url:'Admin_xemTaiKhoan',
		success:function(result){	
			$("#table").html(result);		
		}   
	});	
});