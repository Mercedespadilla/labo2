/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mercedes padilla
 */
public class Inventario {

    /**
     * @param args the command line arguments
     */
    private static Inventario menu;
    public static Inventario getInstance() {
        if (menu == null) {
            menu = new Inventario();
        }
        return menu;
    }      
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion;
      while(!salir){
            
           System.out.println("1. Agregar");
           System.out.println("2. Modificar");
           System.out.println("3. Cargar");
           System.out.println("4. Descargar");
           System.out.println("5. proveedores");
           System.out.println("6. salir");
            
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        productos.add();
                        break;
                    case 2:
                        productos.modificar();
                        break;
                    case 3:
                        productos.eliminar();
                        break;
                    case 4:
                        productos.cargar o descargar();
                        break;
                    case 5:
                         System.out.println("ana maria" + "bimbo"+ "pan" );
                         System.out.println("johana" + "lido"+ "cupecake" );
                         System.out.println("valeria" + "dospinos"+ "leche" );
                         System.out.println("yensi" + "boquitas diana"+ "golosinas" );
                         System.out.println("marixa" + "maricela"+ "panquesitos" );
                         System.out.println("neyda" + "caña"+ "azucar" );
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
       }
    }
    
}
