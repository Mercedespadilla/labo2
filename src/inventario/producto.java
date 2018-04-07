/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author mercedes padilla
 */
public class producto {
    
   private String nombre, ubicacion , cantidad;
       
    public  producto() {}
    
    public producto(String nombre, String ubicacion){
        this.nombre =  nombre;
        this.ubicacion =  ubicacion;
    }
    public producto(String nombre, String ubicacion, String cantidad) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.cantidad = cantidad;
    }
    public String getNombre(){
        return nombre;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public String getCantidad() {
        return cantidad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return "producto{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", cantidad=" + cantidad + '}';
    }
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.cantidad);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final producto other = (producto) obj;
        if (!Objects.equals(this.cantidad, other.cantidad)) {
            return false;
        }
        return true;
    }
    public static void main(String ... args) {
       
        producto pro1 = new producto("jamon", "segundo congelador", "12");
        producto pro2 = new producto("leche", "estante5","10");
        
        System.out.println(pro1.toString());
        System.out.println(pro2.toString());
        Inventario menu = Inventario.getInstance();
        listproducto lista = new listproducto();
         try {
            lista.add(new producto("leche", "refrigerador5", "30"));
            producto e = new producto();
            e.setCantidad("30");
            lista.add(e);
        } catch (Exception ex) {
            Logger.getLogger(producto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

