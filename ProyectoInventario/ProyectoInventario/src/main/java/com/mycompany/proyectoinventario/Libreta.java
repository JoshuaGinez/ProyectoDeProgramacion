
package com.mycompany.proyectoinventario;

import java.util.Scanner;

public class Libreta extends PapelesCarpetas{
    
    private static final int precios[] = new int[]{25,30,25};
    
    private String[] TipoHoja = new String[3];
    
    public Libreta (){
    
        TipoHoja[0] ="Ralla";
        TipoHoja[1] ="Cuadro Grande";
        TipoHoja[2] ="Cuadro Chico";
    
    }
    public void MenuLibreta(){

        int contador = 0;
        System.out.println("Libretas");
        for(int i=0; i<3; i++){
        
            for(int j=0; j<3; j++){
            
                contador++;
                System.out.println(contador + ". Norma corte:" + Dimension[i] + " de " + TipoHoja[j]);
            
            }
        
        }
        System.out.println("10. Abortar accion");
        System.out.print("opcion: ");

    }
    public void ElegirProducto(){
    
        int opcion = 0, repetir = 0;
        
        Scanner scan = new Scanner(System.in);
        Inventario inventario = new Inventario();
        
        do{
        
            //System.out.print("\033[H\033[2J");
            MenuLibreta();
            opcion = scan.nextInt();
            ID = opcion;
            
            switch (opcion){
            
                case 1:
                        ID = 0;
                        AgregarProductos();
                        inventario.CantidadLibreta[0] += Cantidad;
                        inventario.VentaLibreta[0] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 2:
                        ID = 0;
                        AgregarProductos();
                        inventario.CantidadLibreta[1] += Cantidad;
                        inventario.VentaLibreta[1] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 3:
                        ID = 0;
                        AgregarProductos();
                        inventario.CantidadLibreta[2] += Cantidad;
                        inventario.VentaLibreta[2] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 4:
                        ID = 1;
                        AgregarProductos();
                        inventario.CantidadLibreta[3] += Cantidad;
                        inventario.VentaLibreta[3] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 5:
                        ID = 1;
                        AgregarProductos();
                        inventario.CantidadLibreta[4] += Cantidad;
                        inventario.VentaLibreta[4] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 6:
                        ID = 1;
                        AgregarProductos();
                        inventario.CantidadLibreta[5] += Cantidad;
                        inventario.VentaLibreta[5] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 7:
                        ID = 2;
                        AgregarProductos();
                        inventario.CantidadLibreta[6] += Cantidad;
                        inventario.VentaLibreta[6] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 8:
                        ID = 2;
                        AgregarProductos();
                        inventario.CantidadLibreta[7] += Cantidad;
                        inventario.VentaLibreta[7] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 9:
                        ID = 2;
                        AgregarProductos();
                        inventario.CantidadLibreta[8] += Cantidad;
                        inventario.VentaLibreta[8] += VentaPedido;
                        inventario.PedidoFinal += VentaPedido;
                        break;
                case 10:
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
