$(function () {
    $("#submit").on('click', function () {
        var a=document.getElementById("uid").value;
        $.ajax({
            url: "/selectbyid",
            async: false,
            type: 'POST',
            dataType:"",
            data: {
                'uid':a.toString()
            },
            xhrFields: {
                withCredentials: true //允许跨域带Cookie
            },
            success: function (data) {
                 showData(data)
            },
            error: function (data) {
                alert(data.toString())
            }
        });
    })
});
 //展示数据
 function showData(result) {
     console.log("返回的data的类型：" + jQuery.type(result) + "\n\n");
     // for(var x in data){
     //         var trTemp = $("<tr id='tr" + result[x].id + "'></tr>");
     //         trTemp.append("<td>" + result[x].uid + "</td>");
     //         trTemp.append("<td>" + result[x].name + "</td>");
     //         trTemp.append("<td>" + result[x].did + "</td>");
     //         trTemp.append("<td>" + result[x].password + "</td>");
     //         trTemp.appendTo("#tab");
     // }
     var arr = [];
     for(var item in result){
         arr.push(result[item]);
     }
        for (var i = 0; i < result.length; i++) {
            var trTemp = $("<tr id='tr" + arr[i].id + "'></tr>");
            trTemp.append("<td>" + arr[i].uid + "</td>");
            trTemp.append("<td>" + arr[i].name + "</td>");
            trTemp.append("<td>" + arr[i].did + "</td>");
            trTemp.append("<td>" + arr[i].password + "</td>");
            trTemp.appendTo("#tab");
        }
     }