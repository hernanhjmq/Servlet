
package com.hemolqui;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Caracol", urlPatterns = {"/Caracol"})
public class Caracol extends HttpServlet
{


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
                    out.println("<h1> GENERAR LA MATRIZ CARACOL</h1>");
                    out.println("<form method='post' action=''>	");
                        out.println("	INTRODUSCA EL TAMAÑO DE LA MATRIZ PARA EL CARACOL :<br>	");
                        out.println("	<input type='number' name='tam_matriz' size='20'><br><br>	");
                        out.println("	<input type='submit' value='GENERAR'><br><br>	");
                    out.println("<a href = 'Main'>VOLVER INICIO</a>");    
                    out.println("</body>");
                    out.println("</html>");
     
                }
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
          int tamaño;
          
              tamaño = Integer.parseInt(request.getParameter("tam_matriz"));
         int matrix[][] = new int [tamaño][tamaño];
         mostrarMatriz(tamaño,tamaño, matrix);    
        
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
                      out.print("<table class='default' border ='1'> ");
                        for(int i=0; i<tamaño;i++)
                        {
                           out.println(" <tr>");
                                for(int j=0; j<tamaño;j++)
                                {    
                                out.println(" <td> "+matrix[i][j]);
                                out.println(" </td>");
                            
                                }
                                
                           out.println(" </tr>");
                        }  
                       out.print("</table>");
                    out.println("<h1> DATOS "+tamaño+"</h1>");
                    out.println("<a href = 'Caracol'>VOLVER al PROGRAMA</a>");
                    out.println("</body>");
                    out.println("</html>");
       
                }
    }
    

    private static void mostrarMatriz( int columnas, int filas ,int[][] matrizc)
    {
            boolean derecha = true, izquierda = false, abajo = false;
 
            int x = 0, y = -1;

                  for( int k = 1; k <= columnas * filas; k++ ) {
                    if( izquierda ) {
                      y --;
                      if( y == -1 ) {
                        y = 0; x --;
                        izquierda = false;
                      } else if( matrizc[ x ][ y ] != 0 ) {
                        y ++; x --;
                        izquierda = false;
                      }
                    } else if( derecha ) {
                      y ++;
                      if( y == columnas ) {
                        y = columnas - 1; x ++;
                        derecha = false;
                        abajo = true;
                      } else if( matrizc[ x ][ y ] != 0 ) {
                        y --; x ++;
                        derecha = false;
                        abajo = true;
                      }
                    } else if( abajo ) {
                      x ++;
                      if( x == filas ) {
                        x = filas - 1; y --;
                        abajo = false;
                        izquierda = true;
                      } else if( matrizc[ x ][ y ] != 0 ) {
                        y --; x --;
                        abajo = false;
                        izquierda = true;
                      }
                    } else {
                      x --;
                      if( x == -1 || matrizc[ x ][ y ] != 0 ) {
                        x ++; y ++;
                        derecha = true;
                      }
                    }

                    matrizc[ x ][ y ] = k;
                  }
            }

}
