/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author mercedes padilla
 */
public class listproducto {
    private ArrayList<producto> productos;
    
    public listproducto() {
        productos = new ArrayList<>();
    }
     public void add() {
        producto Producto = new producto();
        
        productos.add(Producto);
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los nombres del producto");
        System.out.print(": ");
        Producto.setNombre(leer.nextLine());
        
        System.out.println("Ingrese la ubicacion del producto");
        System.out.print(": ");
        Producto.setUbicacion(leer.nextLine());
        
        System.out.println("Ingrese la cantidad del producto");
        System.out.print(": ");
        Producto.setCantidad(leer.next());
        
        
    }
    
    public void add(producto Producto) throws Exception{
        if(Producto != null) {
            if (!productos.contains(Producto)) {
                productos.add(Producto);
            }
            Exception e = new Exception("No se permiten datos duplicados");
            throw e;
        } else {
            throw new Exception("No se puede agregar un producto nulo");
        }
        
    }
    
    public void modificar() {
        producto Producto = new  producto();
        return producto;
        
    }
    public void eliminar() {
        
    }
     public void cargarydescargar() {
        
    }
}
