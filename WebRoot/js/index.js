$(document).ready(function(){
    //点击提交按钮时，从服务端获取数据，然后在客户端显示
    $("#btn").click(function(){
        // 序列化表单的值
        var params=$("input").serialize();
        $.ajax({
            url: "jsonAction.do",
            // 数据发送方式
            type: "post",
            // 接受数据格式
            dataType : "json",
            // 要传递的数据
            data : params,
            // 回调函数，接受服务器端返回给客户端的值，即result值
            success : show   
        });
    });
});
 
function show(result){
    //测试result是否从服务器端返回给客户端
    //alert(result);
    //解析json对象
    var json = eval("("+result+")");
    var obj = "编号: "+json.id+"  用户名: "+json.username+"  密码: "+json.pwd;
    $("#result").html(obj);
}