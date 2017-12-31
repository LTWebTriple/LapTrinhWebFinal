<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<!-- BEGIN HEAD -->

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Triple | Pages - Admin Account</title>

    <!-- .Css -->
    <link href="./font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
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
    <link href="./Css_Admin_new_info.css" rel=" stylesheet" type="text/css" />


    <!-- .Js -->
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
    <script>
        jQuery(document).ready(function() {
            Metronic.init();
            Layout.init();
        });
    </script>
</head>

<body class="page-header-fixed page-quick-sidebar-over-content page-container-bg-solid">
    <div class="page-header navbar navbar-fixed-top">
        <div class="page-header-inner">
            <div class="page-logo">
                <a href="">
                    <img src="./photo/logo.png" class="logo-default">
                </a>
                <div class="menu-toggler sidebar-toggler">

                </div>
            </div>
            <a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse">
            </a>
            <div class="top-menu">
                <ul class="nav navbar-nav pull-right">
                    <li class="dropdown dropdown-user">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                            <img alt="" class="img-circle" src="./photo/Long.jpg">
                            <span class="username username-hide-on-mobile">
                            Hoàng Long </span>
                            <i class="fa fa-angle-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-menu-default">
                            <li>
                                <a href="">
                                    <i class="icon-user"></i> Thông Tin Cá Nhân </a>
                            </li>
                            <li>
                                <a href="">
                                    <i class="icon-key"></i> Đăng Xuất </a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <div class="clearfix">
    </div>
    <div class="page-container">
        <div class="page-sidebar-wrapper">
            <div class="page-sidebar navbar-collapse collapse">
                <ul class="page-sidebar-menu page-sidebar-menu-closed" data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200">
                    <li class="sidebar-toggler-wrapper">
                        <div class="sidebar-toggler">
                        </div>
                    </li>
                    <li class="start">
                        <a href="javascript:;">
                            <i class="icon-home"></i>
                            <span class="title">Trang Chủ</span>
                            <span class="arrow"></span>
                        </a>
                    </li>
                    <li class="active">
                        <a href="javascript:;">
                            <i class="icon-user"></i>
                            <span class="title">Thông Tin Cá Nhân</span>
                            <span class="selected"></span>
                            <span class="arrow"></span>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:;">
                            <i class="icon-wallet"></i>
                            <span class="title">Quản Lý Tài Khoản</span>
                            <span class="arrow"></span>
                        </a>
                        <ul class="sub-menu">
                            <li>
                                <a href="">
                                    <i class=""></i> Thêm Tài Khoản</a>
                            </li>
                            <li>
                                <a href="">
                                    <i class=""></i> Xóa Tài Khoản</a>
                            </li>
                            <li>
                                <a href="">
                                    <i class=""></i> Chỉnh Sửa Tài Khoản</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="javascript:;">
                            <i class="icon-docs"></i>
                            <span class="title">Quản Lý Lớp Học</span>
                            <span class="arrow"></span>
                        </a>
                        <ul class="sub-menu">
                            <li>
                                <a href="">
                                    <i class=""></i> Thêm Lớp Học</a>
                            </li>
                            <li>
                                <a href="">
                                    <i class=""></i> Xóa Lớp Học</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="javascript:;">
                            <i class="icon-pencil"></i>
                            <span class="title">Chỉnh Sửa Tin Tức</span>
                            <span class="arrow"></span>
                        </a>
                    </li>

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
                                    <img src="./photo/Long.jpg" class="img-responsive">
                                </div>
                                <div class="profile-usertitle">
                                    <div class="profile-usertitle-name">
                                        Nguyen Hoang Long
                                    </div>
                                    <div class="profile-usertitle-job">
                                        Administrator
                                    </div>
                                </div>
                                <div class="profile-usermenu">
                                    <ul class="nav">
                                    </ul>
                                </div>
                            </div>
                            <div class="portlet light">
                                <div class="row list-separated profile-stat">
                                    <div class="col-md-4 col-sm-4 col-xs-6">
                                        <div class="uppercase profile-stat-title">
                                            2
                                        </div>
                                        <div class="uppercase profile-stat-text">
                                            Quản Lý
                                        </div>
                                    </div>
                                    <div class="col-md-4 col-sm-4 col-xs-6">
                                        <div class="uppercase profile-stat-title">
                                            9
                                        </div>
                                        <div class="uppercase profile-stat-text">
                                            Môn Thi
                                        </div>
                                    </div>
                                    <div class="col-md-4 col-sm-4 col-xs-6">
                                        <div class="uppercase profile-stat-title">
                                            400
                                        </div>
                                        <div class="uppercase profile-stat-text">
                                            Học Viên
                                        </div>
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
                                                <i class="icon-globe theme-font hide"></i>
                                                <span class="caption-subject font-blue-madison bold uppercase">Thông Tin Tài Khoản</span>
                                            </div>
                                            <ul class="nav nav-tabs">
                                                <li class="active">
                                                    <a href="#tab_1_1" data-toggle="tab">Thông Tin Cá Nhân</a>
                                                </li>
                                                <li>
                                                    <a href="#tab_1_2" data-toggle="tab">Thay Ảnh Đại Diện</a>
                                                </li>
                                                <li>
                                                    <a href="#tab_1_3" data-toggle="tab">Đổi Mật Khẩu</a>
                                                </li>
                                            </ul>
                                        </div>
                                        <div class="portlet-body">
                                            <div class="tab-content">

                                                <div class="tab-pane active" id="tab_1_1">
                                                    <form role="form" action="#">
                                                        <div class="form-group">
                                                            <label class="control-label">Họ Và Tên</label>
                                                            <input type="text" placeholder="James" class="form-control">
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label">Ngày Sinh</label>
                                                            <input type="text" placeholder="03/06/1997" class="form-control">
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label">Số Điện Thoại</label>
                                                            <input type="text" placeholder="+84 981026294" class="form-control">
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label">Số CMND</label>
                                                            <input type="text" placeholder="025447664" class="form-control">
                                                        </div>
                                                        <div class="margiv-top-10">
                                                        </div>
                                                    </form>
                                                </div>

                                                <div class="tab-pane" id="tab_1_2">
                                                    <form action="#" role="form">
                                                        <div class="form-group">
                                                            <div class="fileinput fileinput-new" data-provides="fileinput">
                                                                <div class="fileinput-new thumbnail" style="width: 200px; height: 150px;">
                                                                    <img src="http://www.placehold.it/200x150/EFEFEF/AAAAAA&amp;text=no+image">
                                                                </div>
                                                                <div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px;">
                                                                </div>
                                                                <div>
                                                                    <span class="btn default btn-file">
                                                                            <span class="fileinput-new">
                                                                            Chọn Ảnh </span>
                                                                    <span class="fileinput-exists">
                                                                            Thay Đổi </span>
                                                                    <input type="file" name="...">
                                                                    </span>
                                                                    <a href="#" class="btn default fileinput-exists" data-dismiss="fileinput">
                                                                            Xóa Ảnh </a>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="margin-top-10">
                                                            <a href="#" class="btn green-haze">
                                                                    Thay Đổi </a>
                                                        </div>
                                                    </form>
                                                </div>

                                                <div class="tab-pane" id="tab_1_3">
                                                    <form action="#">
                                                        <div class="form-group">
                                                            <label class="control-label">Mật Khẩu Hiện Tại</label>
                                                            <input type="password" class="form-control">
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label">Mật Khẩu Mới</label>
                                                            <input type="password" class="form-control">
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label">Nhập Lại Mật Khẩu Mới</label>
                                                            <input type="password" class="form-control">
                                                        </div>
                                                        <div class="margin-top-10">
                                                            <a href="#" class="btn green-haze">
                                                                    Lưu </a>
                                                            <a href="#" class="btn default">
                                                                    Hủy </a>
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