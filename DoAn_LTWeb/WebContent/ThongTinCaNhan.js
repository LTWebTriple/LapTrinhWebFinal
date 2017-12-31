$(document).ready(function(){
	var tenAdmin;
	$.ajax({
		type: 'POST',
		contentType:"application/json; charset=utf-8",
		dataType: 'json',
		url: 'ThongTinCaNhan',
		success: function(result){			
			tenAdmin = result[0].FullName.trim();				
			$("#Local,#Name").html(result[0].FullName.trim());		
			$("#ten").val(result[0].FullName.trim());
			$("#sodienthoai").val(result[0].Tel.trim());
			$("#cmnd").val(result[0].CMND.trim());
			$("#ngaysinh").val(result[0].Birth.trim());		
			if(result[0].AvatarPath.trim() != "")
			{
				$('#imgg').attr({
		    		'src': result[0].AvatarPath.trim()
		    		});
				$('#Avatar').attr({
		    		'src': result[0].AvatarPath.trim()
		    		});
			}
		}
	});
	
    $("#btn-Luu").click(function(e){
        e.preventDefault();
        checkInput();
        if($("#ten").val() != "" && $("#ngaysinh").val() != ""
        && $("#sodienthoai").val() != "" && $("#cmnd").val() != "")
        {
        	$.ajax({
        		type: 'POST',
        		data: { ten: $("#ten").val(),
        			ngaysinh: $("#ngaysinh").val(),
        			sodienthoai: $("#sodienthoai").val(),
        			cmnd: $("#cmnd").val()
        				},
        		url: 'CapNhatThongTinCaNhan',
        		success: function(result){
        			alert('CẬP NHẬT THÔNG TIN CÁ NHÂN THÀNH CÔNG!!!');
        			$("#Local,#Name").html($("#ten").val().trim());
        		}
        	});
        }
    });
    
    function checkInput(){
    	var ten = $("#ten").val();
		var ngaysinh = $("#ngaysinh").val();
		var sodienthoai = $("#sodienthoai").val();
		var cmnd = $("#cmnd").val();

        if(ten == ""){
            $("#ten").css("border","1px solid red");
        }

        if(ngaysinh == ""){
            $("#ngaysinh").css("border","1px solid red");
        }

        if(sodienthoai == ""){
            $("#sodienthoai").css("border","1px solid red");
        }

        if(cmnd == ""){
            $("#cmnd").css("border","1px solid red");
        }
    }
	
    $("#btn-HuyLuu").click(function(e){
        window.location.reload();
    });
    
    $("#btn-DoiMatKhau").click(function(e){
        e.preventDefault();
        checkInputDoiMatKhau();

        if($("#matKhauHienTai").val() != "" && $("#matKhauMoi").val() != "" 
        && $("#matKhauMoi1").val() != "" && ($("#matKhauMoi").val() == $("#matKhauMoi1").val()))
        {
        	$.ajax({
        		type: 'POST',
        		data: { OldPass: $("#matKhauHienTai").val(),
        				NewPass: $("#matKhauMoi").val(),
        				},
        		url: 'DoiMatKhau',
        		success: function(result){
        			if(result != 0){
        				$("#matKhauHienTai").val("");
        		        $("#matKhauMoi").val("");
        		        $("#matKhauMoi1").val("");
        				alert('ĐỔI MẬT KHẨU THÀNH CÔNG!!!');
        			}
        			else
        				alert('CÓ LỖI TRONG QUÁ TRÌNH ĐỔI MẬT KHẨU. VUI LÒNG THỬ LẠI!!!');
        		}
        	});
        }
    });

    $("#btn-HuyDoiMatKhau").click(function(e){
        e.preventDefault();
        $("#matKhauHienTai").val("");
        $("#matKhauMoi").val("");
        $("#matKhauMoi1").val("");
    });
    
    function checkInputDoiMatKhau(){
        var matKhauHienTai = $("#matKhauHienTai").val();
        var matKhauMoi = $("#matKhauMoi").val();
        var matKhauMoi1 = $("#matKhauMoi1").val();

        if(matKhauHienTai == ""){
            $("#matKhauHienTai").css("border","1px solid red");
        }

        if(matKhauMoi == ""){
            $("#matKhauMoi").css("border","1px solid red");
        }

        if(matKhauMoi1 == ""){
            $("#matKhauMoi1").css("border","1px solid red");
        }

        if(matKhauMoi != matKhauMoi1){
            $("#matKhauMoi").css("border","1px solid red");
            $("#matKhauMoi1").css("border","1px solid red");
        }
    }
    
    $("#btn-LuuAnh").click(function(e){
        e.preventDefault();
        	$.ajax({
        		type: 'POST',
        		data: { FileHinh : $("#ChooseFile").val()
        				},
        		url: 'DoiAvatar',
        		success: function(result){
        			alert('CẬP NHẬT AVATAR THÀNH CÔNG !!!');
        		}
        	});
    });
    
    $("#btn-HuyLuuAv").click(function(e){
        window.location.reload();
    });
    
    $("#ChooseFile").change(function(){
    	$('#img').attr({
    		'src': $("#ChooseFile").val()
    		});
    	$('#imgg').attr({
    		'src': $("#ChooseFile").val()
    		});
    	$('#Avatar').attr({
    		'src': $("#ChooseFile").val()
    		});
    })
});
