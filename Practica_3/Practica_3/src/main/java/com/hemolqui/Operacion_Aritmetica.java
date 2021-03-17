
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

@WebServlet(name = "Operacion_Aritmetica", urlPatterns = {"/Operacion_Aritmetica"})
public class Operacion_Aritmetica extends HttpServlet {


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
                    out.println("<form method='post' action=''>	");
                        out.println("	Ingrese el primer numero :<br>	");
                        out.println("	<input type='number' name='numero1' size='20'><br><br>	");
                        out.println("	Ingrese el segundo numero:<br>	");
                        out.println("	<input type='number' name='numero2' size='20'><br><br>");
                        
                         out.println("	Ingrese la operacion  :<br>	");
                         
                         out.print("<select name ='operacion' value ='1' >");
                        out.println("<option value ='1'>SUMAR</option>");
                        out.println("<option value ='2'>RESTAR</option>");
                        out.println("<option value ='3'>MULTIPLICAR</option>");
                        out.println("<option value ='4'>DIVIDIR</option>");
                        out.print("</select>");
                     

                        
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
       double numero1, numero2,resul=0;
       int valor;
              numero1 = Integer.parseInt(request.getParameter("numero1"));
              numero2 = Integer.parseInt(request.getParameter("numero2"));
              valor  = Integer.parseInt(request.getParameter("operacion"));
       
       switch(valor)
       {
           case 1: resul = numero1+numero2;break;
           case 2: resul = numero1-numero2;break;
           case 3: resul = numero1*numero2;break;
           case 4: resul = numero1/numero2;break;
           
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
                    out.println("<h1> DATOS DE LAS OPERACIONES ARITMETICAS</h1>");
                    out.println("<h1> EL RESULTADO DE LA OPERACIONES ES: "+resul+"</h1>");
                    out.println("<a href = 'Operacion_Aritmetica'>VOLVER al PROGRAMA</a>");
                    out.println("</body>");
                    out.println("</html>");
       
                }
    }


}
