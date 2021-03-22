<%--
  Created by IntelliJ IDEA.
  User: Hasee
  Date: 2021/3/21
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
        //页面加载，绑定单击事件
        $(function () {
            $("#btn").click(function () {
                alert("hello btn");
                //发送ajax请求
                $.ajax({
                    //编写json格式，设置属性和值
                    url: "user/testAjax",
                    contentType: "application/json;charset=UTF-8",
                    data: '{"username":"hehe","password":"123","age":"30"}',
                    dataType: "json",
                    type: "post",
                    success: function (data) {
                        //data服务器端响应的json的数据，进行解析
                        alert(data);
                        alert(data.username);
                        alert(data.password);
                        alert(data.age);
                    }
                });
            });
        });
    </script>
</head>

<body>

<p><a href="user/testString">testString</a></p>
<p><a href="user/testVoid">testVoid</a></p>
<p><a href="user/testForwardOrRedirect">testForwardOrRedirect</a><br/></p>
<p>
    <button id="btn">发送ajax的请求</button>
</p>
<p><a href="user/testModelAndView">testModelAndView</a></p>


</body>

</html>
