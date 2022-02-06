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
public class ArithmeticCalculatorServlet extends HttpServlet {

   

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
  
         return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String option = request.getParameter("but");
         String num1 = request.getParameter("num1");
         String num2 = request.getParameter("num2");
         
         
         
         
        
          if(num1 == null || num1.equals("") || num2 == null || num2.equals("")  )
        {

             request.setAttribute("finalout", "invalid");
              request.setAttribute("finalnum1", num1);
                request.setAttribute("finalnum2", num2);
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
         
        }
        
        else
        {
            
             try {
        int intnum1 = Integer.parseInt(num1);
        int intnum2 = Integer.parseInt(num2);
     
        }
        catch (NumberFormatException ex)
        {
            request.setAttribute("finalout", "invalid");
              request.setAttribute("finalnum1", num1);
                request.setAttribute("finalnum2", num2);
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
         
        }
             
            
          
         
         if(option.equals("+"))
         {
             int intnum1 = Integer.parseInt(num1);
         int intnum2 = Integer.parseInt(num2);
             int finaloutput = (intnum1 + intnum2);
              request.setAttribute("finalout", finaloutput);
                request.setAttribute("finalnum1", intnum1);
                request.setAttribute("finalnum2", intnum2);
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
         }
         
         if(option.equals("*"))
         {
             int intnum1 = Integer.parseInt(num1);
         int intnum2 = Integer.parseInt(num2);
             int finaloutput = (intnum1 * intnum2);
              request.setAttribute("finalout", finaloutput);
                request.setAttribute("finalnum1", intnum1);
                request.setAttribute("finalnum2", intnum2);
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
         }
         
         if(option.equals("-"))
         {
             int intnum1 = Integer.parseInt(num1);
         int intnum2 = Integer.parseInt(num2);
             int finaloutput = (intnum1 - intnum2);
              request.setAttribute("finalout", finaloutput);
                request.setAttribute("finalnum1", intnum1);
                request.setAttribute("finalnum2", intnum2);
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
         }
         
         if(option.equals("%"))
         {
             int intnum1 = Integer.parseInt(num1);
         int intnum2 = Integer.parseInt(num2);
             int finaloutput = (intnum1 % intnum2);
              request.setAttribute("finalout", finaloutput);
                request.setAttribute("finalnum1", intnum1);
                request.setAttribute("finalnum2", intnum2);
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
         }
         
       
       
    }
    }

  
}
