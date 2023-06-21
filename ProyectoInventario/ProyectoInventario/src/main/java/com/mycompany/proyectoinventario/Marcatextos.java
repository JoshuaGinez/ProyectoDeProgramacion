
package com.mycompany.proyectoinventario;

import java.util.Scanner;

public class Marcatextos extends EscrituraDibujo {

    private static final int precios[] = new int[]{50,45,60};//paquete de cuatro marcatextos de diferente color
    
    public Marcatextos(){}
    public void MenuMarcatextos(){

        System.out.println("Marcatextos");
        System.out.println("1. Papermate");
        System.out.println("2. Bic");
        System.out.println("3. Pelikan");
        System.out.println("4. Abortar accion");
        System.out.print("opcion: ");

    }
    public void ElegirProducto(){
    
        int opcion = 0, repetir = 0;
        
        Scanner scan = new Scanner(System.in);
        Inventario inventario = new Inventario();
        
        do{
        
            //System.out.print("\033[H\033[2J");
            MenuMarcatextos();
            opcion = scan.nextInt();
            ID = opcion;
            
            switch (opcion){
            
                case 1:
                        AgregarProductos();
                        inventario.CantidadMarcatextos[0] += Cantidad;
                        inventario.VentaMarcatextos[0] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 2:
                        AgregarProductos();
                        inventario.CantidadMarcatextos[1] += Cantidad;
                        inventario.VentaMarcatextos[1] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 3:
                        AgregarProductos();
                        inventario.CantidadMarcatextos[2] += Cantidad;
                        inventario.VentaMarcatextos[2] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 4:
                        repetir = 1;//Se ira recorriendo conforme se agreguen mas productos
                        break;
                default:
                        System.out.println("La opcion digitada no existe");
                        scan.nextLine();
                        break;
            
            }
        
        }while(repetir == 0);
        
    }
    public void AgregarProductos(){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Cual es la cantidad vendida: ");
        Cantidad = scan.nextInt();
        VentaPedido = Cantidad * precios[ID-1];
        System.out.println("Cobre: $" + VentaPedido);
        scan.nextLine();
        
    }

}