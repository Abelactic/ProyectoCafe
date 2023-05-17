
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Producto;
import modelo.ProductoDAO;
import modelo.carrito;
import modelo.cursos;
import modelo.cursosdao;
import modelo.inscripcion;


public class controlador extends HttpServlet {
    
    cursosdao cdao=new cursosdao();
    cursos c=new cursos();
    List<cursos> cursoslista=new ArrayList<>();
    
    List<inscripcion> listainscripcion=new ArrayList<>();
 
    double totalcursos;
    int cantidadcursos=1;
    
    ProductoDAO pdao=new ProductoDAO();
    Producto p=new Producto();
    List<Producto> productos=new ArrayList<>();
    
    List<carrito> listacarrito=new ArrayList<>();
    int item;
    double totalpagar=0.0;
    int cantidad=1;
    double costoenvio=120;
    double subtotalpagar=0.0;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion=request.getParameter("accion");
        
        productos=pdao.listar();
        cursoslista=cdao.listarcursos();
        
        
        
    
        
        
        
        switch(accion) {
            case "inscripcioncurso":
                int idcr=Integer.parseInt(request.getParameter("idcurso"));
                c=cdao.listaridcursos(idcr);
              
                inscripcion inscr=new inscripcion();
                
                inscr.setIdinscripcion(c.getIdcurso());
                inscr.setNombreinscripcion(c.getNombrecurso());
                inscr.setDescripcioninscripcion(c.getDescripcioncurso());
                inscr.setPrecioinscripcion(c.getCostocurso());
                inscr.setFechainscripcion(c.getFechacurso());
                listainscripcion.add(inscr);
                request.setAttribute("inscripcion", listainscripcion);
                request.getRequestDispatcher("inscripcion.jsp").forward(request,response);
              
        
                
                break;
                
        
            
            
            
            
            case "AgregarCarrito":
                int pos=0;
                cantidad=1;
                int idp=Integer.parseInt(request.getParameter("id"));
                p=pdao.listarId(idp);
                if(listacarrito.size()>0){
                    for(int i=0; i<listacarrito.size(); i++){
                        if(idp==listacarrito.get(i).getIdproduct()){
                            pos=i;
                        
                        }
                    
                    }
                    if(idp==listacarrito.get(pos).getIdproduct()){
                        cantidad=listacarrito.get(pos).getCantidad()+cantidad;
                        double subtotal=listacarrito.get(pos).getPrecioCompra()*cantidad;
                        listacarrito.get(pos).setCantidad(cantidad);
                        listacarrito.get(pos).setSubtotal(subtotal);
                    }else {
                        item=item+1;
                carrito car=new carrito();
                car.setItem(item);
                car.setIdproduct(p.getId());
                car.setNombre(p.getNombres());
                car.setDescripcion(p.getDescripcion());
                car.setPrecioCompra(p.getPrecio());
                car.setCantidad(cantidad);
                car.setSubtotal(cantidad*p.getPrecio());
                listacarrito.add(car);
                    
                    }
                
                }
                else{
                item=item+1;
                carrito car=new carrito();
                car.setItem(item);
                car.setIdproduct(p.getId());
                car.setNombre(p.getNombres());
                car.setDescripcion(p.getDescripcion());
                car.setPrecioCompra(p.getPrecio());
                car.setCantidad(cantidad);
                car.setSubtotal(cantidad*p.getPrecio());
                listacarrito.add(car);
                }
                
                request.setAttribute("contador", listacarrito.size());
                request.getRequestDispatcher("controlador?accion=home").forward(request, response);
                
                
                break;
                case "Delete":
                int idprod=Integer.parseInt(request.getParameter("idp"));
                for (int i=0; i<listacarrito.size(); i++){
                    if (listacarrito.get(i).getItem()==idprod){
                    
                        listacarrito.remove(i);
            }
                }
                request.getRequestDispatcher("controlador?accion=carritocompras").forward(request, response);
                break;
                
                
                case "irenvio":
                   
                   request.getRequestDispatcher("envios.jsp").forward(request,response);
                    
                    break;
                    
                    case "cursos":
                   request.setAttribute("cursoslista", cursoslista);
                   request.getRequestDispatcher("cursos.jsp").forward(request,response);
                   
                    
                    break;
                    
                  
                        
                        
                    
                
            case "carritocompras":
                subtotalpagar=0.0;
                request.setAttribute("carrito",listacarrito);
                for (int i=0; i < listacarrito.size(); i++){
                subtotalpagar=subtotalpagar+listacarrito.get(i).getSubtotal();
                }
                totalpagar=subtotalpagar+costoenvio;
                request.setAttribute("subtotalpagar", subtotalpagar);
                request.setAttribute("costoenvio",costoenvio);
                request.setAttribute("totalpagar", totalpagar);
                request.getRequestDispatcher("carritocompras.jsp").forward(request, response);
                
                break;
                
                
            default:
                request.setAttribute("productos", productos);
                request.getRequestDispatcher("index.jsp").forward(request, response);
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
