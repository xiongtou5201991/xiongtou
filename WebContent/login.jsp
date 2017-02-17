<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Shiro login</title>  
</head>  
<body>  
<form action="http://localhost:8080/xiongtou/Login/login" method="post" id="login_form">  
<div><label>用户名</label><input type="text" id="login_name" name="username"/></div>  
<div><label>密 码</label><input type="text" id="password" name="password"/></div>  
<div><input type="submit" value="登录" id="login_btn" /></div>  
</form>  

<script type="text/javascript" src="/xiongtou/js/jquery-1.9.1.js"></script>
<script type="text/javascript">

/* var Btn=document.getElementById("login_btn");
Btn.attachEvent("onclick", Foo);
function Foo()
{
    alert("测试");
} */

/* function checkLogin(login_name,password){
	if(login_name.length==0){
		alert("账号不能为空");
		return false;
	}
	if(password.length==0){
		alert("密码不能为空");
		return false;
	}
	return true;
}
var login_form=$("#login_form");
var login_btn=$("#login_btn");
$('#login_btn').click(function(){
	alert('hello');
	var login_name=$("#login_name").val();
	var password=$("#password").val();
	if(checkLogin(login_name,password)){
		//$("#login_form").submit();
		return true; */
	/* 	$.post(
                "http://localhost:8080/xiongtou/Login/login",
                { 'username' : login_name, 'password' : password },
                function (data, status) {
                    if (data.result == true) {
                        window.location.href = data.url;
                    } else {
                       alert("输入的账号或者密码错误");
                    }
                },
                'json'
            );
		return false; */
	}
/* 	else{
		return false;
	} 
}); */
</script>
</body>  
</html>