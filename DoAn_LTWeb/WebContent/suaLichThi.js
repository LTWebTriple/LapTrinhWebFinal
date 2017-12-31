$(document).ready(function(){
	$.ajax({
		type: 'POST',
		dataType: 'json',
		url: 'ChinhSuaLichThi',
		success: function(result){
			$("#TimeStart").val(result[0].TimeStart.trim());
			$("#TimeStop").val(result[0].TimeClose.trim());
		}
	});
	
	$("#btnHuy").click(function(e){
        window.location.reload();
    });
	
	$("#btnSuaLich").click(function(e){
		e.preventDefault();
		$.ajax({
			type: 'POST',
			dataType: 'json',
			data: {
				TimeBatDau: $("#TimeStart").val(),
				TimeClose: $("#TimeStop").val()
				},
			url: 'ChinhSuaLichThiTool',
			success: function(result){
				alert('CHỈNH SỬA THÀNH CÔNG!!!');
			}
		});
    });
});