<%--
  Created by IntelliJ IDEA.
  User: jf
  Date: 2017/08/8
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录页面</title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/themes/default/easyui.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
    <script type="text/javascript">
        function login() {
          var username = $("#username").textbox('getValue');
           var password = $("#password").textbox('getValue');

           if(username=="" || password==""){
           alert("用户名密码不能为空！");
           }else if(username.length<0||username.length>10){
           alert("用户名的长度必须介于1-10之间");
           }else if(password.length<0||password.length>10){
               alert("密码长度必须介于1-10之间");
              }else{
           $("#loginForm").submit();
           }
          //  $("#loginForm").submit();

        }
        function load() {
            var msg = "${msg}";
            if(msg.length>0){
                alert(msg);
            }
        }
    </script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>
  </head>
  <body onload="load()">
  <div class="easyui-window" title="用户登录窗口"
       style="width: 400px;height: 300px; top: 20%;left: 40%;padding: 60px 30px 60px 30px">

    <form  action="${pageContext.request.contextPath}/user/login.controller" method="post" id="loginForm">

      <div style="text-align: center">
        <p>用户名：<input class="easyui-textbox" id="username" data-options="required:true,validType:'length[1,10]'"
                       name="userName"></p>
        <p>密&nbsp;&nbsp;&nbsp;码：<input class="easyui-textbox" id="password"  data-options="required:true,validType:'length[1,10]'"
                                  type="password"   name="passWord"></p>




        <a href="#" class="easyui-linkbutton" icon="icon-ok" onclick="login();">登录</a>
        <%--<input type="submit" value="登录"/>--%>
      </div>
    </form>
  </div>

  </body>
</html>
