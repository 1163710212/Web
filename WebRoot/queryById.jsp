<%@ page language="java" import="java.util.*" 
pageEncoding="gbk"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>添加界面646</title> 
  </head> 
  <body>
       <form action="common" method="post" >
          <!-- 增加静态的隐藏表单域:传参数用 -->
          <input type="hidden" name="m" value="modify"/>
          <table align="center" border="1">
            <tr>
               <th>学生编号:</th>
               <td><input  name="id" readonly="readonly"  value="${info.id }"/></td>
            </tr>
                       <tr>
               <th>学生姓名:</th>
               <td><input  name="name"  value="${info.name }"/></td>
            </tr>
             <tr>
               <th>身份证号:</th>
               <td><input  name="idcard"  value="${info.idcard }"/></td>
            </tr>
             <tr align="center"> 
                <th>手机号码</th>
               <td><input  name="phone"  value="${info.phone }"/></td>
            </tr>
                       <tr>
               <th>备注:</th>
               <td><input  name="mark"  value="${info.mark }"/></td>
            </tr>
             <tr  align="center"> 
               <td colspan="2"><input type="submit" value="修改"/></td>
            </tr>
          </table>
       </form>
  </body>
</html>
