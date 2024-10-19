<%-- 
    Document   : question
    Created on : 09 Apr 2024, 7:42:43 PM
    Author     : Sifiso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        String question = request.getParameter("question");
        char[] character = (char[])request.getAttribute("characters");
        %>
    <body>
         
       
        <form action="AnswerSevlet.do" method="POST">
            <table border="1">
            
                    <tr>
                        <td><b><%=question%></b></td>
                        <td> <ol>
                                        <%for (int i = 0; i < character.length; i++) {%>  
                                        <li> <%=character[i]%><li>
                                        <%}%>
                              </ol>
                        </td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Enter" /></td>
                        <td><input type="text" name="userAns" value="" /></td>
                    </tr>
                </tbody>
            </table>

        </form>
                              
        
        <!-- comment -->
        
    
    </body>
</html>
