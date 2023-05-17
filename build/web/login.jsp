<%-- 
    Document   : login
    Created on : 15/05/2023, 02:31:25 PM
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
                            
                            <h3>¿Ya tienes una cuenta?</h3>
                            <p>Inicia sesión para entrar a la página</p>
                            <button id="btn__iniciar-sesion">Iniciar sesión</button>
                        </div>

                        <div class="caja__trasera-register">
                            <h3>¿Aun no tienes cuenta?</h3>
                            <p>Registrate para que puedas iniciar sesión</p>
                            <p>y disfrutar de nuestros articulos.</p>
                            <button id="btn__registrarse">Registrarse</button>
                        </div>
                    </div>
                    <!---Para iniciar sesion-->
                    <div class="contenedor__login-register">
                        <form action="controladorclientes" class="formulario__login">
                            <h2>Iniciar Sesión</h2>
                            <input type="text" name="correo_clienteslogin" placeholder="Correo Electronico">
                            <input type="password" name="password_clienteslogin" placeholder="Contraseña">
                            <button name="accion" value="login">Entrar</button>
                            <br>
                            <h2>Registrarse</h2>
                            <input type="text" id="nombre_clientes" name="nombre_clientes"  placeholder="Nombre">
                            <input type="text" id="apellido_clientes" name="apellido_clientes" placeholder="Apellido">
                            <input type="text" id="correo_clientes" name="correo_clientes"placeholder="Correo">
                            <input type="text" id="numero_clientes" name="numero_clientes" placeholder="Numero">
                            <input type="password" id="password_clientes" name="password_clientes" placeholder="Contraseña">
                            <button type="submit" name="enviar">Registrarse</button>
                        </form>
                        <!---Para Registrarse-->
                      
                    </div>
                    
                </div>
                <%
                    if(request.getParameter("enviar")!=null){
                        String nombre_clientes=request.getParameter("nombre_clientes");
                        String apellido_clientes=request.getParameter("apellido_clientes");
                        String correo_clientes=request.getParameter("correo_clientes");
                        String numero_clientes=request.getParameter("numero_clientes");
                        String password_clientes=request.getParameter("password_clientes");
                        
                        try{
                            Connection con=null;
                            Statement st=null;
                            
                            Class.forName("com.mysql.jdbc.Driver");
                            con=DriverManager.getConnection("jdbc:mysql://localhost/proyectopoo?user=root&password=1234");
                            st=con.createStatement();
                            st.executeUpdate("INSERT INTO clientes (nombre_clientes,apellido_clientes,correo_clientes,password_clientes,numero_clientes) VALUES('"+nombre_clientes+"','"+apellido_clientes+"','"+correo_clientes+"','"+password_clientes+"','"+numero_clientes+"');");
                            request.getRequestDispatcher("index.jsp").forward(request, response);
                        }catch (Exception e){
                            out.print(e);
                        }
                        
                        
                    
                    }
                %>
                

            </main>
            

        </body>


</html>
