<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <center>
    <%
     request.setCharacterEncoding("UTF-8");
     String name = request.getParameter("name");
     String pwd = request.getParameter("pwd");
     if(name != null && pwd != null && name.equals("wang") && pwd.equals("123"))
     {
      session.setAttribute("sessionname",name);
      out.println(name+",欢迎您的进入！");
     }
     else
     {
      response.sendRedirect("register.html");
     }
     %>
     <a href="classes/registerresult.jsp"><h1>单击开始购物</h1></a>
    </center>
  </body>
</html>
