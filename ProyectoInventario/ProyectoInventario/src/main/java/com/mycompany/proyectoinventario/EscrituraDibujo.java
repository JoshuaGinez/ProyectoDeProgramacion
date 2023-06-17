
package com.mycompany.proyectoinventario;

import java.util.Scanner;

public class EscrituraDibujo extends Inventario {
    
    private String Color;
    private String TipoPunta;
    
    public EscrituraDibujo(){
    
        Color = "";
        TipoPunta = "";
    
    }
    public void ElegirProducto(){
    
        int opcion = 0, repetir = 0;
        
        Scanner scan = new Scanner(System.in);
        
        do{
        
            System.out.println("1. Lapices");
            System.out.println("2. Abortar accion");//ir recorriendo conforme se van agregando opciones
            System.out.println("opcion: ");
            opcion = scan.nextInt();
            
            switch (opcion){
            
                case 1:
                        Lapices();
                        break;
                case 2:
                        repetir = 1;
                        break;
            
            }
        
        }while(repetir == 0);
    
    }
    public void MenuLapices(){}
    public void Lapices(){
    
        int opcion = 0, repetir =0 ;
        
        Scanner scan = new Scanner(System.in);
        Usuario venta = new Usuario();
        
        do{
        
            System.out.println(""+venta.VentaFinal);
            MenuLapices();
            opcion = scan.nextInt();
            
            switch (opcion){
            
                case 1:
                        ID = 1;
                        Marca = "Papermate";
                        Color = "Gris";
                        TipoPunta = "n. 2";
                        //Precio = "base de datos";
                        System.out.println("");
                        Cantidad = scan.nextInt();//sumar esta cantidad en la base de datos
                        VentaPedido = Precio*Cantidad;//sumar esta cantidad en la base de datos
                        System.out.println(""+VentaPedido);
                        venta.VentaFinal+=VentaPedido;
                        break;
                case 2:
                        repetir = 1;//Se ira recorriendo conforme se agreguen mas productos
                        break;
                default:
                        break;
            
            }
        
        }while(repetir == 0);
        
        
    }
    
}