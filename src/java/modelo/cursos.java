
package modelo;

import java.io.InputStream;


public class cursos {
    int idcurso;
    String nombrecurso;
    String descripcioncurso;
    double costocurso;
    int cupocurso;
    String fechacurso;
    InputStream fotocurso;

    public cursos() {
    }

    public cursos(int idcurso, String nombrecurso, String descripcioncurso, double costocurso, int cupocurso, String fechacurso, InputStream fotocurso) {
        this.idcurso = idcurso;
        this.nombrecurso = nombrecurso;
        this.descripcioncurso = descripcioncurso;
        this.costocurso = costocurso;
        this.cupocurso = cupocurso;
        this.fechacurso = fechacurso;
        this.fotocurso = fotocurso;
    }
    

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    /**
     *
     * @return
     */
    public String getNombrecurso() {
        return nombrecurso;
    }

    public void setNombrecurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }

    public String getDescripcioncurso() {
        return descripcioncurso;
    }

    public void setDescripcioncurso(String descripcioncurso) {
        this.descripcioncurso = descripcioncurso;
    }

    public double getCostocurso() {
        return costocurso;
    }

    public void setCostocurso(double costocurso) {
        this.costocurso = costocurso;
    }

    public int getCupocurso() {
        return cupocurso;
    }

    public void setCupocurso(int cupocurso) {
        this.cupocurso = cupocurso;
    }

    public String getFechacurso() {
        return fechacurso;
    }

    public void setFechacurso(String fechacurso) {
        this.fechacurso = fechacurso;
    }

    public InputStream getFotocurso() {
        return fotocurso;
    }

    public void setFotocurso(InputStream fotocurso) {
        this.fotocurso = fotocurso;
    }
    
    
    
    
}
