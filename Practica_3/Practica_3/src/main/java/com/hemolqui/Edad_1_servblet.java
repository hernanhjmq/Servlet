
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

@WebServlet(name = "Edad_1_servblet", urlPatterns = {"/Edad_1_servblet"})
public class Edad_1_servblet extends HttpServlet {

    
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
                    out.println("<form method='post' action=''>	");
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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           String usu;
              int nacimiento, edad, año_actual;
              usu = request.getParameter("usuario");
              nacimiento = Integer.parseInt(request.getParameter("nacimiento"));
              Calendar fecha = new GregorianCalendar();
             año_actual= fecha.get(Calendar.YEAR);
             edad = año_actual-nacimiento;
              

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
                    out.println("<h1> el usuario es: "+ usu+"</h1>");
                    out.println("<h1> el us    uario nacio el año: "+nacimiento+"</h1>");
                    out.println("<h1> su edad es: "+ edad+"</h1>");
  
                    out.println("<a href = 'Edad_1_servblet'>VOLVER al PROGRAMA</a>");
                    out.println("</body>");
                    out.println("</html>");
       
                }
    }


}
