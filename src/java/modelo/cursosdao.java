
package modelo;

import config.conexion;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;


public class cursosdao {
    Connection con;
    conexion cn=new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public cursos listaridcursos(int idcurso){
        String sql="SELECT * FROM cursos WHERE idcursos="+idcurso;
        cursos c=new cursos();
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                   c.setIdcurso(rs.getInt(1));
                   c.setNombrecurso(rs.getString(2));
                   c.setDescripcioncurso(rs.getString(3));
                   c.setCostocurso(rs.getDouble(4));
                   c.setFechacurso(rs.getString(5));
                   c.setCupocurso(rs.getInt(6));
                   c.setFotocurso(rs.getBinaryStream(7));
            
            }
        } catch(Exception e){}
        return c;
    
    }
    

    public List listarcursos(){
            List<cursos>cursoslista=new ArrayList();
        String sql="SELECT * FROM cursos";
        try{
            con=cn.getConnection();
            ps=con.prepareCall(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                   cursos cr=new cursos();
                   cr.setIdcurso(rs.getInt(1));
                   cr.setNombrecurso(rs.getString(2));
                   cr.setDescripcioncurso(rs.getString(3));
                   cr.setCostocurso(rs.getDouble(4));
                   cr.setFechacurso(rs.getString(5));
                   cr.setCupocurso(rs.getInt(6));
                   cr.setFotocurso(rs.getBinaryStream(7));
                   cursoslista.add(cr);
                
            }
        } catch (Exception e){
        }
        return cursoslista;
    }
    
    
    
    public void listarImgCursos(int idcurso,HttpServletResponse response) {
        String sql="SELECT * FROM cursos WHERE idcursos="+idcurso;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedInputStream bufferedInputStream=null;
        BufferedOutputStream bufferedOutputStream=null;
        try {
            outputStream=response.getOutputStream();
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if (rs.next()){
                inputStream=rs.getBinaryStream("foto_curso");
            }
            
            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream= new BufferedOutputStream(outputStream);
            int i=0;
            while ((i=bufferedInputStream.read())!=-1){
                bufferedOutputStream.write(i);
            }
            
        }catch (Exception e) {
        }
        
       
    }
    
    
}

