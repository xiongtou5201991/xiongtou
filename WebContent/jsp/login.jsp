<!DOCTYPE html>  
<html>  
<head>  
<meta charset="UTF-8">  
<title>Shiro login</title>  
</head>  
<body>  
<form action="/login" method="post" id="login_form">  
<div><label>用户名</label><input type="text" id="login_name" /></div>  
<div><label>密 码</label><input type="text" id="password" /></div>  
<div><input type="submit" value="登录" id="login_btn"/></div>  
</form>  
</body>  


<script src="xiongtou/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript">

function checkLogin(login_name,password){
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
$("#login_btn").click(funciton(){
	var login_name=$("#login_name").value();
	var password=$("#password").value();
	if(checkLogin(login_name,password)){
		$.post(
                "http://localhost:8080/xiongtou/Login/login",
                { username : login_name, password : password },
                function (data, status) {
                    if (data.result == true) {
                        window.location.href = data.url;
                    } else {
                       alert("输入的账号或者密码错误");
                    }
                },
                'json'
            );
	}
	else{
		return false;
	}
	
});

</script>
</html>