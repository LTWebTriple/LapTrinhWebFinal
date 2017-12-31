$(document).ready(function(){
	$.ajax({
		type: 'POST',
		dataType: 'json',
		url: 'LoadRoles',
		success: function(result){
			var option = '';
			result.forEach(function(result) {
				var div = '<option value="'+ result["RoleId"] +'">'+ result["RoleName"] +'</option>';
				option = option + div;
			});
			
			var full = '<div class="form-group"> <label class="control-label">Quyền</label> <select class="form-control" name="Sl0" id="Sl0">' 
						+ option + 
						'</select></div>';
			$("#Quyen").append(full);
		}
	});
	
	$.ajax({
		type: 'POST',
		dataType: 'json',
		url: 'LoadSubject',
		success: function(result){
			var Rong = "Không có";
			var option = '<option value="0">'+ Rong +'</option>';
			result.forEach(function(result) {
				var div = '<option value="'+ result["SubId"] +'">'+ result["SubName"] +'</option>';
				option = option + div;
			});
			
			var full = '<div class="form-group"> <label class="control-label">Môn Thi</label> <select class="form-control" name="Sl1" id="Sl1">' 
						+ option + 
						'</select></div>';
			$("#MonThi").append(full);
		}
	});
	
	$("#btnHuy").click(function(e){
        window.location.reload();
    });
	
	$("#btnThem").click(function(e){
		e.preventDefault();
		$.ajax({
			type: 'POST',
			dataType: 'json',
			data: {
				UserName: $("#TenTaiKhoan").val(),
				FullName: $("#HoVaTen").val(),
				Pass: $("#MatKhau").val(),
				Birth: $("#NgaySinh").val(),
				CMND: $("#CMND").val(),
				Tel: $("#SDT").val(),
				RoleId: $("#Sl0").val(),
				SubjectId: $("#Sl1").val(),
				},
			url: 'Admin_themTaiKhoan',
			success: function(result){
				if(result == 1){
					alert('VUI LÒNG NHẬP ĐẦY ĐỦ THÔNG TIN!!!');
				} else {
					alert('THÊM TÀI KHOẢN THÀNH CÔNG!!!');
					$("#TenTaiKhoan").val("");
					$("#HoVaTen").val("");
					$("#MatKhau").val("");
					$("#NgaySinh").val("");
					$("#CMND").val("");
					$("#SDT").val("");
					$("#Sl0").val("");
					$("#Sl1").val("");
				}
			}
		});
	});
});