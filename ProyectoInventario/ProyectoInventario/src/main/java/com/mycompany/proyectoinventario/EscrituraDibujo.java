
package com.mycompany.proyectoinventario;

import java.util.Scanner;

public class EscrituraDibujo extends Productos {
    
    protected String[] Color = new String[4]; //Se crea un array de los colores 
    protected String[] TipoPunta = new String[3]; //Se crea un array de los tipo de punta
    
    public EscrituraDibujo(){
        //Se inicializan los colores y se les da un lugar en el arreglo
        Color[0] = "Rojo";
        Color[1] = "Negro";
        Color[2] = "Verde";
        Color[3] = "Azul";
        //Se inicializan las puntas y se les da un lugar en el arreglo
        TipoPunta[0] = "Fina";
        TipoPunta[1] = "Media";
        TipoPunta[2] = "Gruesa";
    
    }
    public void Menu(){

        System.out.println("1. Lapices");
        System.out.println("2. Plumas");
        System.out.println("3. Gomas");
        System.out.println("4. Sacapuntas");
        System.out.println("5. Colores");
        System.out.println("6. Marcatextos");
        System.out.println("7. Plumones");
        System.out.println("8. Abortar accion");//ir recorriendo conforme se van agregando opciones
        System.out.print("opcion: ");

    }
    public void ElegirProducto(){
    
        int opcion = 0, repetir = 0;
        
        Scanner scan = new Scanner(System.in);
        Lapiz lapiz = new Lapiz();
        Pluma pluma = new Pluma();
        Goma goma = new Goma();
        Sacapuntas sacapuntas = new Sacapuntas();
        Colores colores = new Colores();
        Marcatextos marcatextos = new Marcatextos();
        Plumones plumones = new Plumones();
        
        do{
        
            Menu();
            opcion = scan.nextInt();
            
            switch (opcion){
            
                case 1:
                        lapiz.ElegirProducto();
                        break;
                case 2:
                        pluma.ElegirProducto();
                        break;
                case 3:
                        goma.ElegirProducto();
                        break;
                case 4:
                        sacapuntas.ElegirProducto();
                        break;
                case 5:
                        colores.ElegirProducto();
                        break;
                case 6:
                        marcatextos.ElegirProducto();
                        break;
                case 7:
                        plumones.ElegirProducto();
                        break;
                case 8:
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