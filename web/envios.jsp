<%-- 
    Document   : envios
    Created on : 5/05/2023, 04:59:29 PM
    Author     : hp
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
        <link href="css/estilos.css" rel="stylesheet" type="text/css" />
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="style5.css">
    </head>
    <body>
        
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="Inicio.jsp">Inicio</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <ul class="navbar-nav>">
          <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Nuestras Redes<div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="https://www.facebook.com/alchemycoffeelab?mibextid=LQQJ4d">Facebook</a>
          <a class="dropdown-item" href="https://instagram.com/alchemycoffeelab?igshid=MzRlODBiNWFlZA==">Instagram</a>
          <a class="dropdown-item" href="https://maps.app.goo.gl/SLkaLXaRFJjx1woG6?g_st=ic">Ubicacion</a>
          </li>          
        </a>
        </ul>
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="controlador?accion=merch">Merch <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="controlador?accion=cursos">Cursos</a>
      </li>
      <li class="nav-item">
          <a class="nav-link" href="controlador?accion=carritocompras"><i class="fas fa-cart-plus">(<label style="color: darkorange">${contador}</label>)Carrito</a></i>
      </li>
    </ul>
    
    
  </div>
</nav>
    </body>
        
       
            <header>
                
                <div class="header-content container">

            <div class="content">
                <h1> Alchemy Coffee Lab </h1>
                <p>
                    Envio
                </p>

            </div>
            <img src="img/CAFELOGO.png" alt="">
        </div>
    
            
            
            
        </header>
    <body>
        <main>
            
            <div id="order-shipping" class="order-shipping">
                <h1><p style="color:rgb(17, 16, 16);">Datos de Envio:</p></h1>
            
               
                
                
                <div class="form-group">
                    <label for="addressLine1"><p style="color:rgb(17, 16, 16);">Calle y numero:</p></label>
                    <input type="text" id="calleynum_envio" name="calleynum_envio">
                
                
               
                    <label for="addressLine3"><p style="color:rgb(17, 16, 16);">Colonia:</p></label>
                    <input type="text"  id="colonia_envio" name="colonia_envio">
                
             
                    <label for="ciudad"><p style="color:rgb(17, 16, 16);">Ciudad:</p></label>
                    <input type="text"  id="ciudad_envio" name="ciudad_envio">
                
                    <label for="estado"><p style="color:rgb(17, 16, 16);">Codigo Postal:</p></label>
                    <input type="text"  id="cp_envio" name="cp_envio">
               
                    <label for="postalcode"><p style="color:rgb(17, 16, 16);">Estado:</p></label>
                    <input type="text"  id="estado_envio" name="estado_envio">
                
             
                </div>
                   <button type="submit" id="guardarenvio" name="guardarenvio"> guardarenvio </button>
                <%
                   if (request.getParameter("guardarenvio")!=null){
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
                
        </div>
           
        <br>
        <br>
        <br>
    
            
          <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        </main>
   
    </body>
</html>

