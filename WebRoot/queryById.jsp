<%@ page language="java" import="java.util.*" 
pageEncoding="gbk"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>��ӽ���646</title> 
  </head> 
  <body>
       <form action="common" method="post" >
          <!-- ���Ӿ�̬�����ر���:�������� -->
          <input type="hidden" name="m" value="modify"/>
          <table align="center" border="1">
            <tr>
               <th>ѧ�����:</th>
               <td><input  name="id" readonly="readonly"  value="${info.id }"/></td>
            </tr>
                       <tr>
               <th>ѧ������:</th>
               <td><input  name="name"  value="${info.name }"/></td>
            </tr>
             <tr>
               <th>���֤��:</th>
               <td><input  name="idcard"  value="${info.idcard }"/></td>
            </tr>
             <tr align="center"> 
                <th>�ֻ�����</th>
               <td><input  name="phone"  value="${info.phone }"/></td>
            </tr>
                       <tr>
               <th>��ע:</th>
               <td><input  name="mark"  value="${info.mark }"/></td>
            </tr>
             <tr  align="center"> 
               <td colspan="2"><input type="submit" value="�޸�"/></td>
            </tr>
          </table>
       </form>
  </body>
</html>
