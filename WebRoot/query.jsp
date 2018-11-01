<%@ page language="java" import="java.util.*,com.gjg.bean.*" 
pageEncoding="gbk"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html> <head>   <title>主页654654</title> 
    <%
        List<Info> infos=(List<Info>)request.getAttribute("infos");
     %>
  </head> <body><table align="center" border="10" width="80%" bordercolordark="blue"
  bordercolorlight="red">
       <caption><a href="add.jsp">添加</a></caption>
       <tr>
         <th>学生编号</th> <th>学生姓名</th> <th>出生日期</th>
         <th>学生性别</th> <th>手机号码</th> <th>学生备注</th> 
         <th>辅助功能</th>
       </tr>
            <%
            for(Info info:infos)
            {%>
              <tr>
                <td><%=info.getId() %></td>
                <td><%=info.getName() %></td>
                <td><%=info.getDate() %></td>
                <td><%=info.getGender() %></td>
                <td><%=info.getPhone() %></td>
                <td><%=info.getMark() %></td>
                <td>
                 <a href="common?m=remove&id=<%=info.getId() %>"
                 onclick="return confirm('您确定删除吗？')"
                 >删除</a>
                <a href="common?m=queryById&id=<%=info.getId() %>" 
                 >待修改</a>
                </td>
              </tr> 
            <%}%>
    </table></body></html>
