$(document).ready(function(){
	$.ajax({
		type: 'POST',
		dataType: 'json',
		url: 'Admin_suaMonThi',
		success: function(result){
			$("#MonThi").val(result[0].SubjectName.trim());
		}
	});
	
	
	
	$("#btnXacNhan").click(function(e){
		e.preventDefault();
		$.ajax({
			type: 'POST',
			dataType: 'json',
			data: {
				SubjectName: $("#MonThi").val()
				},
			url: 'Admin_suaMonThiTool',
			success: function(result){
				alert('CHỈNH SỬA THÀNH CÔNG!!!');
			}
		});
    });
});