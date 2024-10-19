/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sifiso
 */
public class ProcessServelet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    HttpSession session =request.getSession();
    ArrayList<Question> quetions=(ArrayList<Question>) session.getAttribute("quetions");
    
    ProcessQuestion pq = new ProcessQuestion();
    int num =pq.genNum();
    request.setAttribute("question", pq.genQuestion(num, session));
    request.setAttribute("characters", quetions.get(num).getOption());
    
    request.getRequestDispatcher("question.jsp").forward(request, response);
        
    }




}
