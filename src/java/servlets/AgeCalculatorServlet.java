/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guryu
 */
public class AgeCalculatorServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
  
         return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age = request.getParameter("age_field");
       
        
        
        
        
        
      
       
        
        if(age == null || age.equals(""))
        {
//            request.setAttribute("finalAge", nextAge);
            request.setAttribute("finalAge", "You must give your current age");
         getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
        }
        
        else
        {
            try {
        int intage = Integer.parseInt(age) + 1;
        }
        catch (NumberFormatException ex)
        {
            request.setAttribute("finalAge", "You must enter a number");
         getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
         
        }
            int intage = Integer.parseInt(age) + 1;
              String nextAge = "Your age next birthday will be " + intage;
        
             request.setAttribute("finalAge", nextAge);
         getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
        }
        
        
        
        
        
        
    }
}
