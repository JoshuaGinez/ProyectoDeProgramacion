
package com.mycompany.proyectoinventario;

import java.util.Scanner;

public class ArticuloGeometria extends Productos{
    
    public ArticuloGeometria(){}
    public void Menu(){
    
        System.out.println("1. Regla");
        System.out.println("2. Compas");
        System.out.println("3. Escuadras");
        System.out.println("4. Juego Geometrico");
        System.out.println("5. Abortar accion");
        System.out.print("opcion: ");
    
    }
    public void ElegirProducto(){
    
        int opcion = 0, repetir = 0;
        
        Scanner scan = new Scanner(System.in);
        Regla regla = new Regla();
        Compas compas = new Compas();
        Escuadras escuadras = new Escuadras();
        JuegoGeometrico juegoGeometrico = new JuegoGeometrico();
        
        do{
        
            Menu();
            opcion = scan.nextInt();
            
            switch (opcion){
            
                case 1:
                       regla.ElegirProducto();
                        break;
                case 2:
                        compas.ElegirProducto();
                        break;
                case 3:
                        escuadras.ElegirProducto();
                        break;
                case 4:
                        juegoGeometrico.ElegirProducto();
                        break;
                case 5:
                       repetir = 1;//se recorre un lugar cuando se agrega un nuevo producto
                       break;
                default:
                        System.out.println("La opcion digitada no existe");
                        scan.nextLine();
                        break;
            
            }
        
        }while(repetir == 0);
    
    }
    
}
