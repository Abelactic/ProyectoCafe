
package modelo;


public class inscripcion {
    int iteminscripcion;
    int idinscripcion;
    String nombreinscripcion;
    String descripcioninscripcion;
    String fechainscripcion;
    double precioinscripcion;

    public inscripcion() {
    }

    public inscripcion(int iteminscripcion, int idinscripcion, String nombreinscripcion, String descripcioninscripcion, String fechainscripcion, double precioinscripcion) {
        this.iteminscripcion = iteminscripcion;
        this.idinscripcion = idinscripcion;
        this.nombreinscripcion = nombreinscripcion;
        this.descripcioninscripcion = descripcioninscripcion;
        this.fechainscripcion = fechainscripcion;
        this.precioinscripcion = precioinscripcion;
    }

    public int getIteminscripcion() {
        return iteminscripcion;
    }

    public void setIteminscripcion(int iteminscripcion) {
        this.iteminscripcion = iteminscripcion;
    }

    public int getIdinscripcion() {
        return idinscripcion;
    }

    public void setIdinscripcion(int idinscripcion) {
        this.idinscripcion = idinscripcion;
    }

    public String getNombreinscripcion() {
        return nombreinscripcion;
    }

    public void setNombreinscripcion(String nombreinscripcion) {
        this.nombreinscripcion = nombreinscripcion;
    }

    public String getDescripcioninscripcion() {
        return descripcioninscripcion;
    }

    public void setDescripcioninscripcion(String descripcioninscripcion) {
        this.descripcioninscripcion = descripcioninscripcion;
    }

    public String getFechainscripcion() {
        return fechainscripcion;
    }

    public void setFechainscripcion(String fechainscripcion) {
        this.fechainscripcion = fechainscripcion;
    }

    public double getPrecioinscripcion() {
        return precioinscripcion;
    }

    public void setPrecioinscripcion(double precioinscripcion) {
        this.precioinscripcion = precioinscripcion;
    }
     
    
    
}