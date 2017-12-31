<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Home Page</title>

    <link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="./bootstrap/css/bootstrap.css">
    <script src="./js/JQuery.js"></script>
    <script src="./js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="./Css_DangNhap.css">
   
</head>

<body>
    <!-- BEGIN HEADER -->
    <header>
        <div class="header">
            <div class="container">
                <a class="site-logo" href=""><img src="./photo/logo-corp-red.png" alt="Triple"></a>

                <a href="javascript:void(0);" class="mobi-toggler" onclick="myFunction()"><i></i></a>

                <!-- BEGIN NAVIGATION -->
                <div class="header-navigation pull-right font-transform-inherit" id="myTopnav">
                    <ul>
                        <li class="dropdown">
                            <a href="" class="dropdown-toggle">Trang Chủ</a>
                        </li>

                        <li class="dropdown">
                            <a class="dropdown-toggle">Hỗ Trợ</a>
                        </li>

                        <li class="dropdown">
                            <a class="dropdown-toggle">Đăng Nhập</a>
                        </li>

                    </ul>
                </div>
                <!-- END NAVIGATION -->
            </div>
        </div>
        <!-- Header END -->
    </header>

    <div class="login">
        <div class="content">
            <!-- BEGIN LOGIN FORM -->
            <form class="login-form" action="LoginPhanQuyen" method="post">
                <h3 class="form-title">Đăng Nhập</h3>
                <div id="alert" class="alert alert-danger">
                    <span>Tên người dùng hoặc mật khẩu chưa đúng!!! </span>
                </div>
                <div class="form-group">
                    <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
                    <label class="control-label visible-ie8 visible-ie9">Tên người dùng</label>
                    <input class="form-control form-control-solid placeholder-no-fix" type="text" autocomplete="off" 
                    placeholder="Tên người dùng" name="username" id="username" />
                </div>
                <div class="form-group">
                    <label class="control-label visible-ie8 visible-ie9">Mật khẩu</label>
                    <input class="form-control form-control-solid placeholder-no-fix" type="password" autocomplete="off" 
                    placeholder="Mật khẩu" name="password" id="password" />
                </div>
                <div class="form-actions">
						<input type="submit" class="btn-success" value="Đăng nhập">						
                    <label class="rememberme check">
                                <input type="checkbox" name="remember" value="1"/>Ghi nhớ </label>
                    <a href="javascript:;" id="forget-password" class="forget-password">Quên mật khẩu ?</a>
                </div>
            </form>
            <!-- END LOGIN FORM -->
        </div>
    </div>
    <div class="page-prefooter">
        <div class="container">
            <div class="row">
                <div class="col-md-3 col-sm-6 col-xs-12 footer-block">
                    <h2>Về Chúng Tôi</h2>
                    <p>
                        tracnghiemonlinetriple.com là một website thi trắc nghiệm trực tuyến giúp cho vấn đề thi cử trở nên dễ dàng và đơn giản nhất. Được các trường đại học nổi tiếng tin dùng.
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
				 Email: <a href="">tracnghiemonlinetriple@gmail.com</a>
				</address>
                </div>
            </div>
        </div>
    </div>
    <!-- END PRE-FOOTER -->
    <!-- BEGIN FOOTER -->
    <div class="page-footer">
        <div class="container">
            2017 &copy; Triple. All Rights Reserved.
        </div>
    </div>

    <script src="./Js_TrangChu.js"></script>
</body>

</html>