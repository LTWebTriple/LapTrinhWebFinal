$(document).ready(function() {
    $("#NutBam").click(function() {

        if ($(".Main").css("margin-left") == "40px") {
            $(".Main").css("margin-left", "280px")
            $(".mySidenav").css("margin-left", "0px")
        } else {
            $(".Main").css("margin-left", "40px")
            $(".mySidenav").css("margin-left", "-230px")
        }
    });
    $(".mySidenav ").hover(function() {
        if ($(".Main").css("margin-left") == "40px") {
            $(".mySidenav").css("margin-left", "0px")
            $(".Main").css("margin-left", "280px")
        } else {
            $(".Main").css("margin-left", "40px")
            $(".mySidenav").css("margin-left", "-230px")
        }
    });

    function myFunction() {
        var x = document.getElementById("myTopnav");
        if (x.className === "header-navigation pull-right font-transform-inherit") {
            x.className += " responsive";
        } else {
            x.className = "header-navigation pull-right font-transform-inherit";
        }
    }
});