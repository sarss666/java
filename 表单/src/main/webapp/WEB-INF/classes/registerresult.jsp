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
          request.setCharacterEncoding("GB2312");//���ύ������ʾ���ģ����������������
          String user=request.getParameter("zhanghao");
          String password=request.getParameter("mima"); 
          String sex=request.getParameter("sex");    
          String home=request.getParameter("home"); 
          String[] fav=request.getParameterValues("fav"); 
          String info=request.getParameter("info");               
        %>
        <table align="center">
            <tr>
              <td>�˺�Ϊ��</td>
              <td><%= user %></td>
            </tr>
            <tr>
              <td>����Ϊ��</td>
              <td><%= password %></td>
            </tr>
            <tr>
              <td>�Ա�Ϊ��</td>
              <td><%= sex %></td>
            </tr>
           <tr>
              <td>����Ϊ��</td>
              <td><%= home %></td>            
            </tr>
            <tr>
              <td>����Ϊ��</td>
              <td>
              <%
                 for(int i=0;i<fav.length;i++){
                 out.println(fav[i]+" ");
              }%>             
              </td>           
            </tr>

            <tr>
              <td>������ϢΪ��</td>
              <td><%= info %></td>            
            </tr>
        </table>
  </body>
</html>
