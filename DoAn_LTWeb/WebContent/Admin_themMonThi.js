$(document).ready(function(){
    $("#btnThem").click(function(e){
       $.ajax({
        	type: 'POST',
        	data: { Subject: $("#TenMonThi").val()
        		},
        	url: 'Admin_themMonThi',
        	success: function(result){
        		alert('THÊM MÔN THI THÀNH CÔNG!!!');
        		$("#TenMonThi").val("");
        	}
        });
    });
    
    $("#btnHuy").click(function(e){
        window.location.reload();
    });
});