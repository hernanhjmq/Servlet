
package com.hemolqui;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Main", urlPatterns = {"/Main"})
public class Main extends HttpServlet 
{

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
                    out.println("<h1> DATOS DEL MENU PRINCIPAL </h1>");  
                    out.println("<ol>" +
                    "  <li><a href = 'Edad'> Ejercicio_1</a> </li>\n " +
                    "  <li><a href = 'Factorial'> Ejercicio_2</a> </li>\n    " +
                    "  <li><a href = 'Edad_1_servblet' > Ejercicio # 3</a> </li>\n   " +
                    "  <li><a href = 'Dolares_Bolivianos' > Ejercicio # 4</a> </li>\n     " +
                    "  <li><a href = 'Operacion_Aritmetica'> Ejercicio # 5</a> </li>\n   " +
                    "  <li><a href ='Juego_Dados'> Ejercicio # 6</a> </li>\n   " +
                    "  <li><a href = 'Caracol'  > Ejercicio # 7</a> </li>\n   " +
                    "</ol>                  ");    
                        
                    out.println("</body>");
                    out.println("</html>");

                }
    }



}
