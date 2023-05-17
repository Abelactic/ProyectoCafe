/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import config.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClientesDAO  implements Validar{
    Connection con;
    conexion cn=new conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    

    @Override
    public int validar(Clientes client) {
     String sql="SELECT * FROM clientes WHERE correo_clientes=? AND password_clientes=?";
     try{
         con=cn.getConnection();
         ps=con.prepareStatement(sql);
         ps.setString(1, client.getCorreo_clientes());
         ps.setString(2, client.getPassword_clientes());
         
         rs=ps.executeQuery();
         while(rs.next()){
             r=r+1;
             client.setCorreo_clientes(rs.getString("correo_clientes"));
             client.setPassword_clientes(rs.getString("password_clientes"));
         
         }if(r==1){
             return 1;
         } else{
         return 0;
         }
         
     
     
     }
     catch (Exception e){}
     return 0;
    }
    
}
