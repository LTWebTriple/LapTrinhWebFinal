<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge,chrome=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Triple | Pages - Admin Sua Mon Thi</title>

<!-- .Css -->
<link href="./font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css" />
<link href="./simple-line-icons/simple-line-icons.min.css"
	rel="stylesheet" type="text/css" />
<link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="./uniform/css/uniform.default.css" rel="stylesheet"
	type="text/css" />
<link href="./bootstrap-switch/css/bootstrap-switch.min.css"
	rel="stylesheet" type="text/css" />

<link href="./bootstrap-fileinput/bootstrap-fileinput.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="./bootstrap/css/bootstrap.css">

<link href="./css/profile.css" rel="stylesheet" type="text/css" />
<link href="./css/components.css" id="style_components" rel="stylesheet"
	type="text/css" />
<link href="./css/layout.css" rel="stylesheet" type="text/css" />
<link href="./css/darkblue.css" rel="stylesheet" type="text/css" />
<link href="./Css_Admin_info.css" rel=" stylesheet" type="text/css" />

<!-- .Js -->
<script src="./js/JQuery.js"></script>
<script src="./js/jquery.min.js" type="text/javascript"></script>
<script src="./js/jquery-migrate.min.js" type="text/javascript"></script>
<script src="./jquery-ui/jquery-ui-1.10.3.custom.min.js"
	type="text/javascript"></script>
<script src="./bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="./bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js"
	type="text/javascript"></script>
<script src="./jquery-slimscroll/jquery.slimscroll.min.js"
	type="text/javascript"></script>
<script src="./js/jquery.blockui.min.js" type="text/javascript"></script>
<script src="./js/jquery.cokie.min.js" type="text/javascript "></script>
<script src="./uniform/jquery.uniform.min.js" type="text/javascript "></script>
<script src="./bootstrap-switch/js/bootstrap-switch.min.js"
	type="text/javascript"></script>
<script src="./bootstrap-fileinput/bootstrap-fileinput.js"
	type="text/javascript"></script>
<script src="./js/jquery.sparkline.min.js" type="text/javascript"></script>
<script src="./js/metronic.js" type="text/javascript"></script>
<script src="./js/layout.js" type="text/javascript"></script>
<script>
	jQuery(document).ready(function() {
		Metronic.init();
		Layout.init();
	});
</script>
<script src="./addHeader.js" type="text/javascript"></script>
<script src="./Admin_suaMonThi.js" type="text/javascript"></script>
</head>
<body
	class="page-header-fixed page-quick-sidebar-over-content page-container-bg-solid">
	<header id="header"></header>
	<div class="clearfix"></div>
	<div class="page-container">
		<div class="page-sidebar-wrapper">
			<div class="page-sidebar navbar-collapse collapse">
				<ul class="page-sidebar-menu page-sidebar-menu-closed"
					data-keep-expanded="false" data-auto-scroll="true"
					data-slide-speed="200">
					<li class="sidebar-toggler-wrapper">
						<div class="sidebar-toggler"></div>
					</li>
					
					<li><a href="${pageContext.request.contextPath}/ChuyenTrangThongTinCaNhan"> <i class="icon-user"></i> <span
							class="title">Thông Tin Cá Nhân</span> <span class="selected"></span>
							<span class="arrow"></span>
					</a></li>
					<li class=""><a href="javascript:;"> <i
							class="icon-wallet"></i> <span class="title">Quản Lý Tài
								Khoản</span> <span class="arrow"></span>
					</a>
						<ul class="sub-menu">
							<li ><a href="${pageContext.request.contextPath}/ChuyenTrangThemTaiKhoan"> 
							<i class=""></i> Thêm TàiKhoản
							</a></li>
							<li class=""><a href="${pageContext.request.contextPath}/ChuyenTrangXemTaiKhoan"> <i class=""></i> Xem Tài Khoản
							</a></li>
						</ul></li>
					<li class="active"><a href="javascript:;"> <i class="icon-docs"></i> <span
							class="title">Quản Lý Môn Thi</span> <span class="arrow"></span>
					</a>
						<ul class="sub-menu">
							<li><a href="${pageContext.request.contextPath}/ChuyenTrangThemMonThi"> 
							<i class=""></i> Thêm Môn Thi
							</a></li>
							<li><a href="">
							 <i class="active"></i> Xem/Sửa Môn Thi
							</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
		<div class="page-content-wrapper">
			<div class="page-content">
				<div class="row margin-top-20">
					<div class="col-md-12">
						<div class="profile-sidebar">
							<div class="portlet light profile-sidebar-portlet">
								<div class="profile-userpic">
									<img id="imgg" name="imgg" src=""
										class="img-responsive">
								</div>
								<div class="profile-usertitle">
									<div id="Name" name="Name" class="profile-usertitle-name"></div>
									<div class="profile-usertitle-job">Administrator</div>
								</div>
								<div class="profile-usermenu">
									<ul class="nav">
									</ul>
								</div>
							</div>
							<div class="portlet light">
								<div class="row list-separated profile-stat">
									<div class="col-md-4 col-sm-4 col-xs-6">
										<div class="uppercase profile-stat-title">2</div>
										<div class="uppercase profile-stat-text">Quản Lý</div>
									</div>
									<div class="col-md-4 col-sm-4 col-xs-6">
										<div class="uppercase profile-stat-title">9</div>
										<div class="uppercase profile-stat-text">Môn Thi</div>
									</div>
									<div class="col-md-4 col-sm-4 col-xs-6">
										<div class="uppercase profile-stat-title">400</div>
										<div class="uppercase profile-stat-text">Học Viên</div>
									</div>
								</div>
							</div>
						</div>
						<div class="profile-content">
							<div class="row">
								<div class="col-md-12">
									<div class="portlet light">
										<div class="portlet-title tabbable-line">
											<div class="caption caption-md">
												<i class="icon-globe theme-font hide"></i> <span
													class="caption-subject font-blue-madison bold uppercase">
													</span>
											</div>
										<div class="portlet-body">
											<div class="tab-content">
												<div class="tab-pane active" id="tab_1_1">
													<form role="form" >
														<div id="LoaiCauHoi"></div>
														<div class="form-group">
															<label class="control-label">Môn thi</label> <input
																type="text" id="MonThi" name="MonThi" placeholder=""
																class="form-control">
														</div>
														<div class="margiv-top-10">
															<a href="" id="btnXacNhan" name="btnXacNhan"
																class="btn green-haze"> Xác Nhận </a> 
																<a href="${pageContext.request.contextPath}/ChuyenTrangXemSuaMonThi"
																id="btnHuy" name="btnHuy" class="btn default"> Hủy </a>
														</div>
													</form>
												</div>

											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="page-prefooter">
		<div class="container">
			<div class="row1">
				<div class="col-md-3 col-sm-6 col-xs-12 footer-block">
					<h2>Về Chúng Tôi</h2>
					<p>Triple.com là một website thi trắc nghiệm trực tuyến giúp
						cho vấn đề thi cử trở nên dễ dàng và đơn giản nhất. Được các
						trường đại học nổi tiếng tin dùng.</p>
				</div>
				<div class="col-md-3 col-sm-6 col-xs-12 footer-block">
					<h2>Theo Dõi Chúng Tôi</h2>
					<ul class="social-icons">
						<li><a href="" class="facebook"></a></li>
						<li><a href="" class="twitter"></a></li>
						<li><a href="" class="googleplus"></a></li>
						<li><a href="" class="youtube"></a></li>

					</ul>
				</div>
				<div class="col-md-3 col-sm-6 col-xs-12 footer-block">
					<h2>Liên Hệ</h2>
					<address class="margin-bottom-40">
						Điện Thoại: 0981026294 - 01672109425 - 0987527849<br> Email:
						<a href=" ">tracnghiemonlinetriple@gmail.com</a>
					</address>
				</div>
			</div>
		</div>
	</div>
	<div class="page-footer">
		<div class="container">2017 &copy; Triple. All Rights Reserved.
		</div>
	</div>
	<div class="scroll-to-top">
		<i class="icon-arrow-up"></i>
	</div>

</body>

</html>