$(document).ready(function() {
    $(".alert").hide();

    function checkAccount() {
        var username = $("#username").val();
        var password = $("#password").val();
        if ((username != "Kato") || (password != "1234")) {
            $(".alert").show();
        }

        $("#username").text("");
        $("#password").text("");
    }

    $(".btn-success").submit(function(e) {
        e.preventDefault();
        checkAccount();
    });
});