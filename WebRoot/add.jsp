<%@ page language="java" import="java.util.*" 
pageEncoding="gbk"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>添加界面</title> 
  </head> 
  <body>
       <form action="common" method="post" >
          <!-- 增加静态的隐藏表单域:传参数用 -->
          <input type="hidden" name="m" value="add"/>
          <table align="center" border="1">
            <tr>
               <th>学生编号:</th>
               <td><input  name="id"/></td>
            </tr>
                       <tr>
               <th>学生姓名:</th>
               <td><input  name="name"/></td>
            </tr>
             <tr>
               <th>身份证号:</th>
               <td><input  name="idcard" /></td>
            </tr>
             <tr align="center"> 
                <th>手机号码</th>
               <td><input  name="phone" /></td>
            </tr>
                       <tr>
               <th>备注:</th>
               <td><input  name="mark"/></td>
            </tr>
             <tr  align="center"> 
               <td colspan="2"><input type="submit" value="添加"/></td>
            </tr>
          </table>
       </form>
  </body>
</html>
