/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.web;

/**
 *
 * @author Sifiso
 */
public class Question {
     private String question;
     private char[] options;
     private String answer;

    public Question(String question, char[] options, String answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public char[] getOption() {
        return options;
    }

    public void setOption(char[] options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" + "question=" + question + ", option=" + options+ ", answer=" + answer + '}';
    }
    
}
