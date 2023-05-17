/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Clientes;
import modelo.ClientesDAO;



public class controladorclientes extends HttpServlet {

    ClientesDAO cldao=new ClientesDAO();
    Clientes cl= new Clientes();
    int r;
    
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            String accion=request.getParameter("accion");
           if(accion.equals("login")){
               String correo=request.getParameter("correo_clienteslogin");
               String password=request.getParameter("password_clienteslogin");
               cl.setCorreo_clientes(correo);
               cl.setPassword_clientes(password);
               r= cldao.validar(cl);
               if(r==1){
                   request.getRequestDispatcher("index.jsp").forward(request, response);
                   
               } else{
                   request.getRequestDispatcher("login.jsp").forward(request, response);
               }
           
           
           }
            
    }


    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
