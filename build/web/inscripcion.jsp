
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
        <link href="css/estilos.css" rel="stylesheet" type="text/css" />
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="style.css">
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
                    Inscripcion
                </p>

            </div>
            <img src="img/CAFELOGO.png" alt="">
        </div>
            </header>
    <br><br>
                 <div class="container mt-4">
            <h3>Detalles del Curso</h3>
            <br>
            <div class="row">
                <div class="col-sm-8">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                        <th>ITEM</th>
                        <th>CURSO</th>
                        
                        <th>PRECIO</th>
                        <th>FECHA</th>
                        
                            </tr>
                        </thead>
                        <tbody var="inscr" items="${inscripcion}">
                        
                            <tr>
                                <td>aaaaaaaaaaaaa</td>
                                 <td>${inscr.getNombreinscripcion()}</td>
                                 <td></td>
                                 <td><td>
                                
                            </tr>
                            
                           
                        
                        </tbody>
                        
               
                
                    </table>
               
                        
                </div>
                                  <div class="col-sm-4">
                                
                            <div class="card">
                                <div class="card-header">
                                    <h3>Pago</h3>
                                </div>
                                <div class="card-body">
                                    <label> Total a Pagar</label>
                                    <input type="text" readonly="" class="form-control">
                                 </div>
                                <div class="card-footer">
                                    <a href="btn btn-danger btn-block">Ir a pagar</a>
                                    
                                </div>
                                
                            </div>
                            </div>
            </div>
                 </div>
    
            
            
            
        </header>
        <br>
        <br>
        <br>
     <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    
</html>