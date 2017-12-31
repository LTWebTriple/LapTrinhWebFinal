$(document).ready(function() {
	$.get('header.html', function(res) {
		$('#header').html(res);
	});
	
	var tenAdmin;
	$.ajax({
		type: 'POST',
		dataType: 'json',
		url: 'ThongTinCaNhan',
		success: function(result){			
			tenAdmin = result[0].FullName.trim();				
			$("#Name").html(result[0].FullName.trim());	
			if(result[0].AvatarPath.trim() != "")
			{
				$('#Avatar').attr({
		    		'src': result[0].AvatarPath.trim()
		    		});
				$('#imgg').attr({
		    		'src': result[0].AvatarPath.trim()
		    		});
			}
		}
	});	
});
	