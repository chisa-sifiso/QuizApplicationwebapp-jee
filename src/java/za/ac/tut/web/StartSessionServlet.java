/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sifiso
 */
public class StartSessionServlet extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession(true);
        String name = request.getParameter("name");
        initialseSession(session,name);
        
       request.getRequestDispatcher("welcome.html").forward(request, response);
        
    }

    private void initialseSession(HttpSession session,String name) {
        char[] charArray = {'A', 'B', 'C', 'D'};
       Question q1=new Question("1+1=",charArray,"C");
       Question q2=new Question("1*1=",charArray, "A");
       Question q3=new Question("1/1=", charArray, "A");
       Question q4=new Question("1-1=", charArray, "D");
       Question q5=new Question("1%1=", charArray, "D");
       Question q6=new Question("(1+1)*2=",charArray, "C");
       Question q7=new Question("(1+1)/2=",charArray, "A");
       
       ArrayList<Question> quetions = new ArrayList<>();
       quetions.add(q1);quetions.add(q2);quetions.add(q3);quetions.add(q4);quetions.add(q5);quetions.add(q6);quetions.add(q7);
       int attemps=0;int iCorrect=0,percentObtained=0;
       ArrayList<String> quetionAsked = new ArrayList<>();
       ArrayList<String> studentAns = new ArrayList<>();
       ArrayList<String> outCome = new ArrayList<>();
       
       
       session.setAttribute("quetions",  quetions);
       session.setAttribute("name", name);
       session.setAttribute("attemps", attemps);
       session.setAttribute("iCorrect", iCorrect);
       session.setAttribute("percentObtained", percentObtained);
       session.setAttribute("quetionAsked", quetionAsked);
       session.setAttribute("studentAns", studentAns );
       session.setAttribute("outCome", outCome);
    }

}
