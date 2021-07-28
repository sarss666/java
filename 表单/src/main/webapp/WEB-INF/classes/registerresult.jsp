<!--registerresult.jsp-->
<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">

    <title>My JSP 'registerresult.jsp' starting page</title>

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
    <% 
          request.setCharacterEncoding("GB2312");//表单提交可以显示中文，不会出现中文乱码
          String user=request.getParameter("zhanghao");
          String password=request.getParameter("mima"); 
          String sex=request.getParameter("sex");    
          String home=request.getParameter("home"); 
          String[] fav=request.getParameterValues("fav"); 
          String info=request.getParameter("info");               
        %>
        <table align="center">
            <tr>
              <td>账号为：</td>
              <td><%= user %></td>
            </tr>
            <tr>
              <td>密码为：</td>
              <td><%= password %></td>
            </tr>
            <tr>
              <td>性别为：</td>
              <td><%= sex %></td>
            </tr>
           <tr>
              <td>家乡为：</td>
              <td><%= home %></td>            
            </tr>
            <tr>
              <td>爱好为：</td>
              <td>
              <%
                 for(int i=0;i<fav.length;i++){
                 out.println(fav[i]+" ");
              }%>             
              </td>           
            </tr>

            <tr>
              <td>个人信息为：</td>
              <td><%= info %></td>            
            </tr>
        </table>
  </body>
</html>
