
package com.mycompany.proyectoinventario;

import java.util.Scanner;

public class JuegoGeometrico extends ArticuloGeometria{
    
    private static final int precios[] = new int[]{30,50,80};
    
    public JuegoGeometrico(){}
    public void MenuJuegoGeometrico(){

        System.out.println("Juego Geometrico");
        System.out.println("1. Generico");
        System.out.println("2. Mendoza");
        System.out.println("3. Map");
        System.out.println("4. Abortar accion");
        System.out.print("opcion: ");

    }
    public void ElegirProducto(){
    
        int opcion = 0, repetir = 0;
        
        Scanner scan = new Scanner(System.in);
        Inventario inventario = new Inventario();
        
        do{
        
            //System.out.print("\033[H\033[2J");
            MenuJuegoGeometrico();
            opcion = scan.nextInt();
            ID = opcion;
            
            switch (opcion){
            
                case 1:
                        AgregarProductos();
                        inventario.CantidadJuegoGeometrico[0] += Cantidad;
                        inventario.VentaJuegoGeometrico[0] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 2:
                        AgregarProductos();
                        inventario.CantidadJuegoGeometrico[1] += Cantidad;
                        inventario.VentaJuegoGeometrico[1] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 3:
                        AgregarProductos();
                        inventario.CantidadJuegoGeometrico[2] += Cantidad;
                        inventario.VentaJuegoGeometrico[2] += VentaPedido;
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
