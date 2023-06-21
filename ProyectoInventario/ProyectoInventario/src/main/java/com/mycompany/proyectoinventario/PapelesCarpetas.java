
package com.mycompany.proyectoinventario;

import java.util.Scanner;

public class PapelesCarpetas extends Productos{
    
    protected String[] Dimension = new String[5];
    
    public PapelesCarpetas(){
    
        Dimension[0] = "Francesa";
        Dimension[1] = "Profesional";
        Dimension[2] = "Italiano";
        Dimension[3] = "Carta";
        Dimension[4] = "Oficio";
    
    }
    public void Menu(){
    
        System.out.println("1. Libreta");
        System.out.println("2. Carpeta");
        System.out.println("3. Papel Bond");
        System.out.println("4. Abortar accion");
        System.out.print("opcion: ");
    
    }
    public void ElegirProducto(){
    
        int opcion = 0, repetir = 0;
        
        Scanner scan = new Scanner(System.in);
        Libreta libreta = new Libreta();
        Carpeta carpeta = new Carpeta();
        PapelBond papelBond = new PapelBond();
        
        do{
        
            Menu();
            opcion = scan.nextInt();
            
            switch (opcion){
            
                case 1:
                        libreta.ElegirProducto();
                        break;
                case 2:
                        carpeta.ElegirProducto();
                        break;
                case 3:
                        papelBond.ElegirProducto();
                        break;
                case 4:
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
