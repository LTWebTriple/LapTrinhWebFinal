<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Home Page</title>

    <link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="./bootstrap/css/bootstrap.css">
    <script src="./js/JQuery.js"></script>
    <script src="./js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="./Css_Trangchu.css">
</head>

<body>
    <!-- BEGIN HEADER -->
    <div class="header">
        <div class="container">
            <a class="site-logo" href="${pageContext.request.contextPath}/CTTrangChu"><img src="./photo/logo-corp-red.png" alt="Triple"></a>

            <a href="javascript:void(0);" class="mobi-toggler" onclick="myFunction()"><i></i></a>

            <!-- BEGIN NAVIGATION -->
            <div class="header-navigation pull-right font-transform-inherit" id="myTopnav">
                <ul>
                    <li class="dropdown">
                        <a href="${pageContext.request.contextPath}/CTTrangChu" class="dropdown-toggle">Trang Chủ</a>
                    </li>
                    <li class="dropdown">
                        <a href="${pageContext.request.contextPath}/CTDangNhap" class="dropdown-toggle">Đăng Nhập</a>
                    </li>
                </ul>
            </div>
            <!-- END NAVIGATION -->
        </div>
    </div>
    <!-- Header END -->
    <div class="mid">
        <div id="centermid" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol id="indic" class="carousel-indicators">
                <li data-target="#centermid" data-slide-to="0" class="active"></li>
                <li data-target="#centermid" data-slide-to="1"></li>
                <li data-target="#centermid" data-slide-to="2"></li>
            </ol>

            <!-- Wrapper for slides -->
            <div class="carousel-inner" style="height: 330px;">
                <div class="item active">
                    <img src="./photo/14895500109751_5.jpg" style="width:100%;height:100%;">
                </div>

                <div class="item">
                    <img src="./photo/14895500139344_3.jpg" style="width:100%;height:100%;">
                </div>

                <div class="item">
                    <img src="./photo/14895500119766_4.jpg" style="width:100%;height:100%;">
                </div>
            </div>
        </div>
        <div class="about">
            <div class="containerr">
                <div class="dv-child-one-style">
                    <div class="dv-child-left">
                        <h3>Tin tức</h3>
                        <div class="cont-tintuc">
                            <!--  -->
                            <div class="one-news">
                                <div class="news-img">
                                    <a href=""><img src="./photo/news2.jpg" alt=""></a>
                                </div>
                                <div class="news-view">
                                    <div class="tieude_tintuc"><a href="">Thi giữa kỳ môn CSDL</a></div>
                                    <div class="news-day">ngày: 25/09/2017 </div>
                                    <div class="dv-mota-tintuc">Thông báo: Tất cả sinh viên môn CSDL thi giữa kỳ vào lúc 19h30 ngày 28/09/2017 trên ...</div>
                                </div>
                                <div class="clear"> </div>
                            </div>
                            <div class="one-news">
                                <div class="news-img">
                                    <a href=""><img src="./photo/news1.jpg" alt=""></a>
                                </div>
                                <div class="news-view">
                                    <div class="tieude_tintuc"><a href="">Thi cuối kỳ môn Nhập môn lập trình</a></div>
                                    <div class="news-day">ngày: 20/09/2017 </div>
                                    <div class="dv-mota-tintuc">Thông báo: Tất cả sinh viên môn Nhập môn lập trình thi cuối kỳ vào lúc 12h30 ngày 24/09/2017 trên ...</div>
                                </div>
                                <div class="clear"> </div>
                            </div>
                            <div class="one-news">
                                <div class="news-img">
                                    <a href=""><img src="./photo/news2.jpg" alt=""></a>
                                </div>
                                <div class="news-view">
                                    <div class="tieude_tintuc"><a href="">Thi cuối kỳ môn Lập trình windows</a></div>
                                    <div class="news-day">ngày: 14/09/2017 </div>
                                    <div class="dv-mota-tintuc">Thông báo: Tất cả sinh viên môn Lập trình windows thi cuối kỳ vào lúc 17h30 ngày 19/09/2017 trên ...</div>
                                </div>
                                <div class="clear"> </div>
                            </div>
                            <div class="one-news">
                                <div class="news-img">
                                    <a href=""><img src="./photo/news1.jpg" alt=""></a>
                                </div>
                                <div class="news-view">
                                    <div class="tieude_tintuc"><a href="">Kết quả môn DBMS</a></div>
                                    <div class="news-day">ngày: 27/08/2017 </div>
                                    <div class="dv-mota-tintuc">Thông báo: Đã có kết quả thi môn DBMS. Sinh viên có thể xem ...</div>
                                </div>
                                <div class="clear"> </div>
                            </div>
                            <div class="page_break page_break_cus1"></div>
                            <!--  -->
                            <div class="clear"></div>
                        </div>
                    </div>
                    <div class="dv-child-right">
                        <div class="product">
                            <div class="dv_content_leftsp">
                                <h3>CÁC MÔN THI SẮP MỚI</h3>
                                <marquee behavior="scroll" direction="up" height="400">
                                    <div class="marqueew" style="height: 1300px;">
                                        <div class="js-marquee-wrapper" style="margin-top: 0px;">
                                            <div class="js-marquee" style="margin-right: 0px; float: none; margin-bottom: 0px;">
                                                <div class="dv-spleft">
                                                    <a href=""><img src="./photo/14725452.jpg" alt="" class="img-responsive"></a>
                                                    <h4><a href="">Hội thi tìm hiểu Pháp luật nước CHXHCN Việt Nam năm 2017</a></h4>
                                                    <div class="dv-nd">Hội thi tìm hiểu pháp luật nước CHXHCN Việt Nam được diễn ra vào ngày 20/11/2017 và sever sẽ được mở vào lúc 19h30. Các thí sinh tham gia nhớ khung giờ để có thể làm bài của mình.</div>
                                                    <div class="clearfix"> </div>
                                                </div>
                                                <div class="dv-spleft">
                                                    <a href=""><img src="./photo/HTLST.jpg" alt="" class="img-responsive"></a>
                                                    <h4><a href="">Hội thi tìm hiểu lịch sử Trường</a></h4>
                                                    <div class="dv-nd">Hội thi tìm hiểu lịch sử Trường được diễn ra vào ngày 29/11/2017 và sever sẽ được mở vào lúc 11h30. Các thí sinh tham gia nhớ khung giờ để có thể làm bài của mình.</div>
                                                    <div class="clearfix"> </div>
                                                </div>
                                                <div class="dv-spleft">
                                                    <a href=""><img src="./photo/news2.jpg" alt="" class="img-responsive"></a>
                                                    <h4><a href="">Thi cuối kỳ môn CSDL</a></h4>
                                                    <div class="dv-nd">Tất cả sinh viên môn CSDL ôn tập để chuẩn bị cho bài thi cuối kỳ</div>
                                                    <div class="clearfix"> </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                            </div>
                            </marquee>

                        </div>
                        <div class="dv_content_leftsp">
                            <h3>TIN TỨC HOT</h3>
                            <div id="newsRight">
                                <a href="" title="">
                                    <img src="./photo/news2.jpg" width="230" alt="">
                                    <h4>Thi giữa kỳ môn CSDL</h4>
                                    <div class="clear"></div>
                                </a>
                                <a href="" title="">
                                    <img src="./photo/news1.jpg" width="230" alt="">
                                    <h4>Thi cuối kỳ môn Nhập môn lập trình</h4>
                                    <div class="clear"></div>
                                </a>
                                <a href="" title="">
                                    <img src="./photo/news2.jpg" width="230" alt="">
                                    <h4>Thi cuối kỳ môn Lập trình windows</h4>
                                    <div class="clear"></div>
                                </a>
                                <a href="" title="">
                                    <img src="./photo/news1.jpg" width="230" alt="">
                                    <h4>Kết quả môn DBMS</h4>
                                    <div class="clear"></div>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="clear"></div>
            </div>
        </div>
    </div>
    </div>

    <!-- BEGIN PRE-FOOTER -->
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