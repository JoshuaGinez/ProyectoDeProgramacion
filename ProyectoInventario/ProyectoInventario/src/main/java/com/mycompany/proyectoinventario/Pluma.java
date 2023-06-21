
package com.mycompany.proyectoinventario;

import java.util.Scanner;

public class Pluma extends EscrituraDibujo {

    private static final int precios[] = new int[]{5,7,9};
    
    public Pluma(){}
    public void MenuPlumas(){
        //Se utiliza 2 ciclos for para poder imprimir el menu de las plumas por tipo de punta y color
        int contador = 0;
        System.out.println("Plumas");
        for(int i=0; i<3; i++){
            
            for(int j=0;j<4; j++){
            
                contador++;
                System.out.println(contador + ". Bic punta: " + TipoPunta[i] + " " + Color[j]);
            
            }
        }
        System.out.println("13. Abortar accion");
        System.out.print("opcion: ");
    }
    public void ElegirProducto(){
    
        int opcion = 0, repetir = 0;
        
        Scanner scan = new Scanner(System.in);
        Inventario inventario = new Inventario();
        
        do{
        
            //System.out.print("\033[H\033[2J");
            MenuPlumas();
            opcion = scan.nextInt();
            ID = opcion;
            
            switch (opcion){
            
                case 1:
                        ID = 0;
                        AgregarProductos();
                        inventario.CantidadPlumas[0] += Cantidad;
                        inventario.VentaPlumas[0] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 2:
                        ID = 0;
                        AgregarProductos();
                        inventario.CantidadPlumas[1] += Cantidad;
                        inventario.VentaPlumas[1] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 3:
                        ID = 0;
                        AgregarProductos();
                        inventario.CantidadPlumas[2] += Cantidad;
                        inventario.VentaPlumas[2] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 4:
                        ID = 0;
                        AgregarProductos();
                        inventario.CantidadPlumas[3] += Cantidad;
                        inventario.VentaPlumas[3] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 5:
                        ID = 1;
                        AgregarProductos();
                        inventario.CantidadPlumas[4] += Cantidad;
                        inventario.VentaPlumas[4] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 6:
                        ID = 1;
                        AgregarProductos();
                        inventario.CantidadPlumas[5] += Cantidad;
                        inventario.VentaPlumas[5] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 7:
                        ID = 1;
                        AgregarProductos();
                        inventario.CantidadPlumas[6] += Cantidad;
                        inventario.VentaPlumas[6] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 8:
                        ID = 1;
                        AgregarProductos();
                        inventario.CantidadPlumas[7] += Cantidad;
                        inventario.VentaPlumas[7] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 9:
                        ID = 2;
                        AgregarProductos();
                        inventario.CantidadPlumas[8] += Cantidad;
                        inventario.VentaPlumas[8] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 10:
                        ID = 2;
                        AgregarProductos();
                        inventario.CantidadPlumas[9] += Cantidad;
                        inventario.VentaPlumas[9] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 11:
                        ID = 2;
                        AgregarProductos();
                        inventario.CantidadPlumas[10] += Cantidad;
                        inventario.VentaPlumas[10] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 12:
                        ID = 2;
                        AgregarProductos();
                        inventario.CantidadPlumas[11] += Cantidad;
                        inventario.VentaPlumas[11] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 13:
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
        Cantidad= scan.nextInt();
        VentaPedido = Cantidad * precios[ID];
        System.out.println("Cobre: $" + VentaPedido);
        scan.nextLine();
        
    }
    
}