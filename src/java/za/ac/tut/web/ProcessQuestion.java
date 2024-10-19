/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.web;

import java.util.ArrayList;
import java.util.Random;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sifiso
 */
public class ProcessQuestion {
  private int num;
    public ProcessQuestion() {
        
    }

    

    public int genNum() {
        Random random = new Random();
         this.num=random.nextInt(7) ;
      
        return num;
        
    }
    
    public  String genQuestion(int num,HttpSession session){
       ArrayList<Question> quetions=(ArrayList<Question>) session.getAttribute("quetions");
        ArrayList<String> quetionAsked=(ArrayList<String>) session.getAttribute("quetionAsked");
        quetionAsked.add(quetions.get(num).getQuestion());
        session.setAttribute("quetionAsked", quetionAsked);
      return   quetions.get(num).getQuestion();
    }
    
    public  void getCorrectAns(int num,HttpSession session,String userAns){
       ArrayList<Question> quetions=(ArrayList<Question>) session.getAttribute("quetions");
        int attemps=(Integer) session.getAttribute("attemps");
        attemps++;
        session.setAttribute("attemps",attemps);
        ArrayList<String> studentAns=(ArrayList<String>) session.getAttribute("studentAns");
        studentAns.add(userAns);
        session.setAttribute("studentAns",studentAns);
        String useroutCome="Incorrect";
        
       if(quetions.get(num).getAnswer().equals(userAns)){
           int iCorrect=(Integer) session.getAttribute("iCorrect");
           iCorrect++;
           session.setAttribute("iCorrect",iCorrect);
           useroutCome="Incorrect"; 
       } 
       ArrayList<String> outCome=(ArrayList<String>) session.getAttribute("outCome");
        outCome.add(useroutCome);
        session.setAttribute("outCome",outCome);
         quetions.remove(num);
         session.setAttribute("quetions",quetions);
    }
    
}
