
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

@WebServlet(name = "Edad", urlPatterns = {"/Edad"})
public class Edad extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
   
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
                    out.println("<h1> DATOS DEL USUARIO</h1>");
                    out.println("<form method='post' action='Salida_edad'>	");
                        out.println("	Ingrese el nombre del usuario:<br>	");
                        out.println("	<input type='text' name='usuario' size='20'><br>	");
                        out.println("	Ingrese el año de nacimiento del usuario:<br>	");
                        out.println("	<input type='number' name='nacimiento' size='20'><br><br>	");
                        out.println("	<input type='submit' value='calcular'><br><br>	");
                    out.println("<a href = 'Main'>VOLVER INICIO</a>");    
                    out.println("</body>");
                    out.println("</html>");
                }
    }

}
