
package com.hemolqui;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author miky_pro
 */
@WebServlet(name = "Dolares_Bolivianos", urlPatterns = {"/Dolares_Bolivianos"})
public class Dolares_Bolivianos extends HttpServlet {

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
                    out.println("<h1> CONVERTIR DE DOLARES A BOLIVIANOS</h1>");
                    out.println("<form method='post' action=''>	");
                        out.println("	INGRESE EL DOLAR A CAMBIAR:<br>	");
                        out.println("	<input type='number' name='dolar' size='20'><br><br>	");
                        out.println("	<input type='submit' value='calcular'><br><br>	");
                    out.println("<a href = 'Main'>VOLVER INICIO</a>");    
                    out.println("</body>");
                    out.println("</html>");
     
                }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        int dolar, boliviano;
           
              dolar = Integer.parseInt(request.getParameter("dolar"));
              boliviano = dolar * 7;

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
                    out.println("<h1> DATOS DE LA CONVERSION SI UN DOLAR EQUIVALE A 7BS</h1>");
                    out.println("<h1>El DOLAR EQUIVALE A : "+ boliviano+" bs</h1>");
                    out.println("<a href = 'Dolares_Bolivianos'>VOLVER al PROGRAMA</a>");
                    out.println("</body>");
                    out.println("</html>");
       
                }
       
    }


}
