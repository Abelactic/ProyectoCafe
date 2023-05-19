/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

// Test changes by Poringo
public class Clientes {
    int idclientes;
    String nombre_clientes, apellido_clientes, correo_clientes, password_clientes, numero_clientes;

    public Clientes() {
    }

    public Clientes(int idclientes, String nombre_clientes, String apellido_clientes, String correo_clientes, String password_clientes, String numero_clientes) {
        this.idclientes = idclientes;
        this.nombre_clientes = nombre_clientes;
        this.apellido_clientes = apellido_clientes;
        this.correo_clientes = correo_clientes;
        this.password_clientes = password_clientes;
        this.numero_clientes = numero_clientes;
    }

    public int getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(int idclientes) {
        this.idclientes = idclientes;
    }

    public String getNombre_clientes() {
        return nombre_clientes;
    }

    public void setNombre_clientes(String nombre_clientes) {
        this.nombre_clientes = nombre_clientes;
    }

    public String getApellido_clientes() {
        return apellido_clientes;
    }

    public void setApellido_clientes(String apellido_clientes) {
        this.apellido_clientes = apellido_clientes;
    }

    public String getCorreo_clientes() {
        return correo_clientes;
    }

    public void setCorreo_clientes(String correo_clientes) {
        this.correo_clientes = correo_clientes;
    }

    public String getPassword_clientes() {
        return password_clientes;
    }

    public void setPassword_clientes(String password_clientes) {
        this.password_clientes = password_clientes;
    }

    public String getNumero_clientes() {
        return numero_clientes;
    }

    public void setNumero_clientes(String numero_clientes) {
        this.numero_clientes = numero_clientes;
    }
    
    
           
}
