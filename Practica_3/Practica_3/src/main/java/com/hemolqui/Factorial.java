
package com.hemolqui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Factorial", urlPatterns = {"/Factorial"})
public class Factorial extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
                response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()) 
                {
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet Main</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1> CALCULAR EL FACTORIAL DE UN NUMERO</h1>");
                    out.println("<form method='post' action=''>	");
                        out.println("	Ingrese el numero a calcular :<br>	");
                        out.println("	<input type='number' name='numero_factoria' size='20'><br><br>	");
                        out.println("	<input type='submit' value='calcular'><br><br>	");
                    out.println("<a href = 'Main'>VOLVER INICIO</a>");    
                    out.println("</body>");
                    out.println("</html>");
     
                }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
              int numero_factoria, fac=1;
           
              numero_factoria = Integer.parseInt(request.getParameter("numero_factoria"));
              for (int i = 1; i<=numero_factoria; i++)
              {
                  fac=fac*i;
              }    

              response.setContentType("text/html;charset=UTF-8");
              try (PrintWriter out = response.getWriter()) 
                {
                    /* TODO output your page here. You may use following sample code. */
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet Main</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1> DATOS DEL FACTORIAL</h1>");
                    out.println("<h1>El factorial  es: "+ fac+"</h1>");
  
                    out.println("<a href = 'Factorial'>VOLVER al PROGRAMA</a>");
                    out.println("</body>");
                    out.println("</html>");
       
                }
    }


}
