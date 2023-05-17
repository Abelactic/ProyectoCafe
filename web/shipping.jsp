<%-- 
    Document   : shipping
    Created on : 15/05/2023, 04:48:42 PM
    Author     : hp
--%>

<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>
            <meta charset="UTF-8">
            <meta name="viewsport" content="width-device-width, initial-scale=1.0">
            <title>Log/in Registro</title>
            <link rel="stylesheet" href="style3.css">
        </head>

        <body>

            <main>

                <div class="contenedor__todo">

                    <img src="img/CAFELOGO.png" width="100px">
                    <div class="caja__trasera">
                       
                        <div class="caja__trasera-login">
                              <form action="" class="formulario__login">
                            
                            <h2>Datos de envio</h2>
                            <input type="text" id="callenum_envio" name="callenum_envio"  placeholder="Calle y numero">
                            <input type="text" id="colonia_envio" name="colonia_envio" placeholder="Colonia">
                            <input type="text" id="ciudad_envio" name="ciudad_envio"placeholder="Ciudad">
                            <input type="text" id="cp_envio" name="cp_envio" placeholder="Codigo Postal">
                            <input type="text" id="estado_envio" name="estado_envio" placeholder="Estado">
                            <button type="submit" name="Guardar">Guardar direccion</button>
                        </form>
                            
                            
                        </div>

                      
                    
                    </div>
                    
                </div>
                <%
                    if(request.getParameter("Guardar")!=null){
                        String callenum_envio=request.getParameter("callenum_envio");
                        String colonia_envio=request.getParameter("colonia_envio");
                        String ciudad_envio=request.getParameter("ciudad_envio");
                        String cp_envio=request.getParameter("cp_envio");
                        String estado_envio=request.getParameter("estado_envio");
                        
                        try{
                            Connection con=null;
                            Statement st=null;
                            
                            Class.forName("com.mysql.jdbc.Driver");
                            con=DriverManager.getConnection("jdbc:mysql://localhost/proyectopoo?user=root&password=1234");
                            st=con.createStatement();
                            st.executeUpdate("INSERT INTO envio (callenum_envio,colonia_envio,ciudad_envio,cp_envio,estado_envio) VALUES('"+callenum_envio+"','"+colonia_envio+"','"+ciudad_envio+"','"+cp_envio+"','"+estado_envio+"');");
                            request.getRequestDispatcher("pago.jsp").forward(request, response);
                        }catch (Exception e){
                            out.print(e);
                        }
                        
                        
                    
                    }
                %>
                

            </main>
            

        </body>


</html>