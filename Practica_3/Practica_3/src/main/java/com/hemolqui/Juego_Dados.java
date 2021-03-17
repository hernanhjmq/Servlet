
package com.hemolqui;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Juego_Dados", urlPatterns = {"/Juego_Dados"})
public class Juego_Dados extends HttpServlet {

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
                    out.println("<h1> JUGO DE LOS DADOS</h1>");
                    out.println("<form method='post' action=''>	");
                         out.println("DADO # 1:<br>	");
                        out.println("DADO # 2:  <br>	");
                        out.println("	<input type='submit' value='JUGAR'><br><br>	");
                    out.println("<a href = 'Main'>VOLVER INICIO</a>");    
                    out.println("</body>");
                    out.println("</html>");
                }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
                  int ale1,ale2,suma;
                  String mensaje;
                  ale1 = (int)(Math.random()*6)+1;
                  ale2 = (int)(Math.random()*6)+1;
                  suma = ale1+ale2;
                  if (suma == 7 || suma == 11)
                  {mensaje = "usted gano el juego ";}
                  else
                  {mensaje = "usted perdio el juego";};    
                  
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
                    out.println("<p> si usted saca una suma de 7 o 11 usted gana si es distinto pierde</p> <br>");
                    
                    out.println("<h1> EL DADO # 1 ES:  "+ ale1+"</h1>");
                    out.println("<h1> EL DADO # 2 ES:  "+ ale2+"</h1>");
                    out.println("<h1> LA SUMA  ES:  "+ suma+"</h1>");
                    out.println("<h1>"+mensaje+"</h1>");

                    out.println("<a href = 'Juego_Dados'>VOLVER al PROGRAMA</a>");
                    out.println("</body>");
                    out.println("</html>");
       
                }
    }

}
