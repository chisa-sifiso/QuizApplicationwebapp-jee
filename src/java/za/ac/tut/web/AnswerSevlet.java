/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sifiso
 */
public class AnswerSevlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    HttpSession session = request.getSession();
    String userAns = request.getParameter("userAns");
    ProcessQuestion pq = new ProcessQuestion();
    
    pq.getCorrectAns(pq.genNum(), session, userAns);
    
    int attemps = (Integer)session.getAttribute("attemps");
    if(attemps<=5){
        request.getRequestDispatcher("question.jsp").forward(request, response);
    }
    
    else{
        request.getRequestDispatcher("summary.jsp").forward(request, response);
    }
        
    }


}
