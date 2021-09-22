$(function () {
    $("#submit").on('click', function () {
        var a=document.getElementById("username").value;
        var b=document.getElementById("password").value;
        $.ajax({
            url: "/login",
            type: 'POST',
            async: true,
            dataType:"text",
            data: {
                    'username': a.toString(),
                    'password': b.toString(),
            },
            xhrFields: {
                withCredentials: true //允许跨域带Cookie
            },
            success: function (data) {
                if(data=="success"){
                    alert(data)
                    window.location.href = "./hello.html"
                }else{
                    alert("error");
                }
            },
            error: function (data) {
                alert("error");
            }
        });
    })
});
function dd() {

}