<%-- 
    Document   : summary
    Created on : 09 Apr 2024, 8:35:33 PM
    Author     : Sifiso
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        String name = session.getAttribute("name").toString();
        int attemps =Integer.parseInt(session.getAttribute("attemps").toString());
        int iCorrect =Integer.parseInt(session.getAttribute("iCorrect").toString());
        ArrayList<String> quetionAsked = (ArrayList<String>)session.getAttribute("quetionAsked");
        ArrayList<String> studentAns = (ArrayList<String>)session.getAttribute("studentAns");
        ArrayList<String> outCome= (ArrayList<String>)session.getAttribute("outCome");
        %>
    <body>
        <h1>Hello <%=name%></h1>
        <p>this is you summary</p><!-- comment -->
        <br><p>your attemps are<%=attemps%><br>
              you got <%=iCorrect%> correct
              
        </p>
        <%for (int i = 0; i < 10; i++) {%>
        <%=quetionAsked.get(i)%><br><!-- comment -->
        <%=studentAns.get(i)%><br><!-- comment -->
        <%=outCome.get(i)%>
            <%}
            
            
            %>
      
        
        
    </body>
</html>
