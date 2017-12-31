<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="UTF-8">
      <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge,chrome=1">
    <title>Triple | Pages - Admin Account</title>
	 <link rel="stylesheet" href="./css/bootstrap.min.css">
	
	<link href="./css/profile.css" rel="stylesheet" type="text/css" />
    <link href="./css/components.css" id="style_components" rel="stylesheet" type="text/css" />
    <link href="./css/layout.css" rel="stylesheet" type="text/css" />
    <link href="./css/darkblue.css" rel="stylesheet" type="text/css" />
 	<link href="./Css_Admin_new_info.css" rel=" stylesheet" type="text/css" />
   <!--  <link rel="stylesheet" href="./css/ThongTinCaNhan.css"> -->
    <link rel="stylesheet" href="./css/LamBaiThi.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js" type="text/javascript"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="./js/jquery.bootpag.js"></script>
    <!-- <script src="./js/AdminQuanLy.js"></script> -->
    <script type="text/javascript" src="./js/LamBaiThi.js"></script>
    <script src="./addHeader.js" type="text/javascript"></script>
    <!-- <script type="text/javascript" src="./js/DongHo.js"></script> -->
    <!-- .Css -->
   <!--  <link href="./font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
    <link href="./simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css" />
    <link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="./uniform/css/uniform.default.css" rel="stylesheet" type="text/css" />
    <link href="./bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css" />

    <link href="./bootstrap-fileinput/bootstrap-fileinput.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="./bootstrap/css/bootstrap.css">

    <link href="./css/profile.css" rel="stylesheet" type="text/css" />
    <link href="./css/components.css" id="style_components" rel="stylesheet" type="text/css" />
    <link href="./css/layout.css" rel="stylesheet" type="text/css" />
    <link href="./css/darkblue.css" rel="stylesheet" type="text/css" />
   
    <link href="./css/LamBaiThi.css" rel=" stylesheet" type="text/css" />
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


    .Js
    <script src="./js/JQuery.js"></script>
    <script src="./js/jquery.min.js" type="text/javascript"></script>
    <script src="./js/jquery-migrate.min.js" type="text/javascript"></script>
    <script src="./jquery-ui/jquery-ui-1.10.3.custom.min.js " type="text/javascript"></script>
    <script src="./bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="./bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
    <script src="./jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
    <script src="./js/jquery.blockui.min.js" type="text/javascript"></script>
    <script src="./js/jquery.cokie.min.js" type="text/javascript "></script>
    <script src="./uniform/jquery.uniform.min.js" type="text/javascript "></script>
    <script src="./bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
    <script src="./bootstrap-fileinput/bootstrap-fileinput.js" type="text/javascript"></script>
    <script src="./js/jquery.sparkline.min.js" type="text/javascript"></script>
    <script src="./js/metronic.js" type="text/javascript"></script>
    <script src="./js/layout.js" type="text/javascript"></script>
    <script src="./js/Doing_Exam.js" type="text/javascript"></script>
   <script type="text/javascript" src="./js/jquery.bootpag.js"></script>
    <script src="./js/LamBaiThi.js"></script>
    <script src="./js/DongHo.js"></script>
    <script>
        jQuery(document).ready(function() {
            Metronic.init();
            Layout.init();
        });
    </script> -->
</head>
<body class="page-header-fixed page-quick-sidebar-over-content page-container-bg-solid">
    		<header id="header"></header>
    <div class="clearfix">
    </div>
    <div class="page-container">
        <div class="page-sidebar-wrapper">
            <div class="page-sidebar navbar-collapse collapse">
               <ul class="page-sidebar-menu page-sidebar-menu-closed"
					data-keep-expanded="false" data-auto-scroll="true"
					data-slide-speed="200">
					<li class="sidebar-toggler-wrapper">
						<div class="sidebar-toggler"></div>
					</li>
					
					<li ><a href="${pageContext.request.contextPath}/CTStudent_Info"> <i
							class="icon-user"></i> <span class="title">Thông Tin Cá
								Nhân</span> <span class="selected"></span> <span class="arrow"></span>
					</a></li>
					<li class="active"><a href="${pageContext.request.contextPath}/CTStudent_Schedule"> <i class="icon-calendar"></i>
							<span class="title">Lịch Thi</span> <span class="arrow"></span>
					</a></li>
					<li><a href="${pageContext.request.contextPath}/CTStudent_Result"> <i class="icon-docs"></i> <span
							class="title">Kết Quả Thi</span> <span class="arrow"></span>
					</a></li>
				</ul>
            </div>
        </div>
        <div class="page-content-wrapper">
            <div class="page-content">
                <div class="row margin-top-20">
                    <div class="col-md-12">
                        <div class="profile-sidebar">
                            <!-- <div class="portlet light profile-sidebar-portlet">
                                <div class="profile-userpic">
                                    <img src="./photo/user2-160x160.jpg" class="img-responsive">
                                </div>
                                <div class="profile-usertitle">
                                    <div class="profile-usertitle-name">
                                        Bùi Xuân Trí
                                    </div>
                                    <div class="profile-usertitle-job">
                                        Student
                                    </div>
                                </div>
                                <div class="profile-usermenu">
                                    <ul class="nav">
                                    </ul>
                                </div>
                            </div> -->
                            <div class="Clock portlet light">
                                <div class="row list-separated profile-stat">
                                    <h4 style="color: red;text-align: center;">Thời gian làm bài:</h4>
                                    <div style="text-align: center;" class="DongHo" id="DongHo">
	                					<span style="font-size: 30px;" id="hours"></span>
						                <span style="font-size: 30px;">:</span>
						                <span style="font-size: 30px;" id="min"></span>
						                <span style="font-size: 30px;">:</span>
						                <span style="font-size: 30px;" id="sec"></span>
          							  </div>
                                     <div class="input-group-btn" style="text-align: center">
                    <button id="btn-nop-bai" class="btn btn-default" type="button" style="background-color: #3A9C95; color:white; width:150px; ">
                            Nộp bài <i class="glyphicon glyphicon-list-alt"></i>
                    </button>
                   </div>
                                </div>
                            </div>
                        </div>
                        <div class="profile-content">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="portlet light">
                                        <div class="portlet-body">
											  <div class="content">
									            <div class="top-bar">
									                <a href="#menu" class="side-menu-link burger"> 
									                      <span class='burger_inside' id='bgrOne'></span>
									                      <span class='burger_inside' id='bgrTwo'></span>
									                      <span class='burger_inside' id='bgrThree'></span>
									                    </a>
									            </div>
									            <section class="content-inner">
									            	<div id="page-selection_top" style="text-align: center;"></div>
									                <div id="content" style="height: 650px; width: 100%;"></div>
									  				<div id="page-selection_bot" style="text-align: center;"></div>
									  				<a href="${pageContext.request.contextPath}/Student_ToXemDiem" class="btn green-haze" id="Xem" style="display: none;">Xem Kết Quả</a>
									            </section>
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
                    <p>
                        Triple.com là một website thi trắc nghiệm trực tuyến giúp cho vấn đề thi cử trở nên dễ dàng và đơn giản nhất. Được các trường đại học nổi tiếng tin dùng.
                    </p>
                </div>
                <div class="col-md-3 col-sm-6 col-xs-12 footer-block">
                    <h2>Theo Dõi Chúng Tôi</h2>
                    <ul class="social-icons">
                        <li>
                            <a href="" class="facebook"></a>
                        </li>
                        <li>
                            <a href="" class="twitter"></a>
                        </li>
                        <li>
                            <a href="" class="googleplus"></a>
                        </li>
                        <li>
                            <a href="" class="youtube"></a>
                        </li>

                    </ul>
                </div>
                <div class="col-md-3 col-sm-6 col-xs-12 footer-block">
                    <h2>Liên Hệ</h2>
                    <address class="margin-bottom-40">
                Điện Thoại: 0981026294 - 01672109425 - 0987527849<br>
                 Email: <a href=" ">tracnghiemonlinetriple@gmail.com</a>
                </address>
                </div>
            </div>
        </div>
    </div>
    <div class="page-footer">
        <div class="container">
            2017 &copy; Triple. All Rights Reserved.
        </div>
    </div>
    <div class="scroll-to-top">
        <i class="icon-arrow-up"></i>
    </div>

</body>
</html>