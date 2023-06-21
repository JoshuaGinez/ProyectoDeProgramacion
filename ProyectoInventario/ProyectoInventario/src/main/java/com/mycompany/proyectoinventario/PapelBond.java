
package com.mycompany.proyectoinventario;

import java.util.Scanner;

public class PapelBond extends PapelesCarpetas{
    
    private static final int precios[] = new int[]{300,500,100};
    
    private String[] color = new String[2];
    
    public PapelBond (){
    
        color[0] ="Varios colores";
        color[1] ="Blanco";
    
    }    
    public void MenuPapelBond(){
    
        System.out.println("Hojas");
        System.out.println("1. " + Dimension[3] + " color " + color[1] + " 500 hojas");
        System.out.println("2. " + Dimension[4] + " color " + color[1] + " 500 hojas");
        System.out.println("3. " + Dimension[3] + " color " + color[0] + " 100 hojas");
        System.out.println("4. Abortar accion");
        System.out.print("opcion: ");
    
    }
    public void ElegirProducto(){
    
        int opcion = 0, repetir = 0;
        
        Scanner scan = new Scanner(System.in);
        Inventario inventario = new Inventario();
        
        do{
        
            //System.out.print("\033[H\033[2J");
            MenuPapelBond();
            opcion = scan.nextInt();
            ID = opcion;
            
            switch (opcion){
            
                case 1:
                        AgregarProductos();
                        inventario.CantidadPapelBond[0] += Cantidad;
                        inventario.VentaPapelBond[0] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 2:
                        AgregarProductos();
                        inventario.CantidadPapelBond[1] += Cantidad;
                        inventario.VentaPapelBond[1] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 3:
                        AgregarProductos();
                        inventario.CantidadPapelBond[2] += Cantidad;
                        inventario.VentaPapelBond[2] += VentaPedido;
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
