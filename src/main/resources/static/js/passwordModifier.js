$("#passwordResetButton").click(function () {
    $("#oldPassword").val("");
    $("#newPassword").val("");
    $("#confirmPassword").val("");
})
$("#passwordSubmitButton").click(function () {
    let oldPassword = $("#oldPassword").val();
    let password = $("#newPassword").val();
    let confirmPassword = $("#confirmPassword").val();
    if (password.length < 5 || password.length > 50) {
        $("#passwordLabel").html("<span style='color: red'> Password length should be 5-10</span>");
        return;
    } else {
        $("#passwordLabel").html("<span style='color: green'>Correct password length</span>")

    }

    if (confirmPassword !== password) {
        $("#confirmPasswordLabel").html("<span style='color: red'>Not matched, try again!</span>")
        return;
    } else {
        $("#confirmPasswordLabel").html("<span style='color: green'>matched, congratulations!</span>")
    }
    let userInfo = $("#infoID").text().toString().split(" ");
    let username = userInfo[2];
    let type = userInfo[0].toUpperCase();
    alert("username: " + username + " type: " + type);
    $.post("/passwordModifier", {
        "username": username,
        "oldPassword": oldPassword,
        "password": password,
        "type": type
    }, function (data, status, jqXHR) {
        if (data) {
            if (data.toString() === "true") {
                $("#passwordResult").html("<span style='color: green'>Password modification succeeded! <a href='/login'>login</a></span>");
                $("#oldPasswordLabel").html("<span style='color: green'>Correct password!</span>")
            } else if (data.toString() === "false") {
                $("#oldPasswordLabel").html("<span style='color: red'>Wrong password! Try again.</span>")
                $("#passwordResult").html("<span style='color: red'>failed!</span>");
            } else if (data.toString() === "505") {
                $("#passwordResult").html("<span style='color: red'>Inner bug raised</span>");

            }

        }
    })
    // alert("username: " + username + " password: " + password + " " + $("input:radio:checked").val());
})