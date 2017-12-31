$(document).ready(function(){
	$.ajax({
		type: 'POST',
		dataType: 'json',
		url: 'ChinhSuaDeThi',
		success: function(result){
			$("#TenDeThi").val(result[0].TestName.trim());
			$("#ThoiGian").val(result[0].TimeTest.trim());
		}
	});
	
	
    $("#btnHuy").click(function(e){
        window.location.reload();
    });
	
	$("#btnXacNhan").click(function(e){
		e.preventDefault();
		$.ajax({
			type: 'POST',
			dataType: 'json',
			data: {
				TestName: $("#TenDeThi").val(),
				TimeTest: $("#ThoiGian").val()
				},
			url: 'ChinhSuaMaDe',
			success: function(result){
				alert('CHỈNH SỬA THÀNH CÔNG!!!');
			}
		});
    });
});