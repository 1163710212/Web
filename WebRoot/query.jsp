<%@ page language="java" import="java.util.*,com.gjg.bean.*" 
pageEncoding="gbk"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html> <head>   <title>��ҳ654654</title> 
    <%
        List<Info> infos=(List<Info>)request.getAttribute("infos");
     %>
  </head> <body><table align="center" border="10" width="80%" bordercolordark="blue"
  bordercolorlight="red">
       <caption><a href="add.jsp">���</a></caption>
       <tr>
         <th>ѧ�����</th> <th>ѧ������</th> <th>��������</th>
         <th>ѧ���Ա�</th> <th>�ֻ�����</th> <th>ѧ����ע</th> 
         <th>��������</th>
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
                 onclick="return confirm('��ȷ��ɾ����')"
                 >ɾ��</a>
                <a href="common?m=queryById&id=<%=info.getId() %>" 
                 >���޸�</a>
                </td>
              </tr> 
            <%}%>
    </table></body></html>
