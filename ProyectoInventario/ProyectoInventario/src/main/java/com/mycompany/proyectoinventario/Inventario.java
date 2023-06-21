
package com.mycompany.proyectoinventario;

import java.util.Scanner;

public class Inventario{

    public static float PedidoFinal = 0;
    
    //Articulos Escritura/dibujo
    private static final int PreciosLapices[] = new int[]{3,2,4};
    public static int CantidadLapices[] = new int[]{0,0,0};
    public static float VentaLapices[] = new float[]{0,0,0};
    
    private static final int preciosPlumas[] = new int[]{5,7,9};
    public static int CantidadPlumas[] = new int[]{0,0,0,0,0,0,0,0,0,0,0,0};
    public static int VentaPlumas[] = new int[]{0,0,0,0,0,0,0,0,0,0,0,0};
    
    private static final int PreciosGomas[] = new int[]{5,2,1};
    public static int CantidadGomas[] = new int[]{0,0,0};
    public static float VentaGomas[] = new float[]{0,0,0};
    
    private static final int PreciosSacapuntas[] = new int[]{5,2,1};
    public static int CantidadSacapuntas[] = new int[]{0,0,0};
    public static float VentaSacapuntas[] = new float[]{0,0,0};
    
    private static final int PreciosColores[] = new int[]{100,120,50};
    public static int CantidadColores[] = new int[]{0,0,0};
    public static float VentaColores[] = new float[]{0,0,0};
    
    private static final int PreciosMarcatextos[] = new int[]{50,45,60};
    public static int CantidadMarcatextos[] = new int[]{0,0,0};
    public static float VentaMarcatextos[] = new float[]{0,0,0};
    
    private static final int PreciosPlumones[] = new int[]{50,60,70};
    public static int CantidadPlumones[] = new int[]{0,0,0};
    public static float VentaPlumones[] = new float[]{0,0,0};
    
    //Artuculos de Geometria
    private static final int PreciosRegla[] = new int[]{3,5,15};
    public static int CantidadRegla[] = new int[]{0,0,0};
    public static float VentaRegla[] = new float[]{0,0,0};
    
    private static final int PreciosCompas[] = new int[]{20,30,50};
    public static int CantidadCompas[] = new int[]{0,0,0};
    public static float VentaCompas[] = new float[]{0,0,0};
    
    private static final int PreciosEscuadras[] = new int[]{10,15,20};
    public static int CantidadEscuadras[] = new int[]{0,0,0};
    public static float VentaEscuadras[] = new float[]{0,0,0};
    
    private static final int PreciosJuegoGeometrico[] = new int[]{30,50,80};
    public static int CantidadJuegoGeometrico[] = new int[]{0,0,0};
    public static float VentaJuegoGeometrico[] = new float[]{0,0,0};
    
    //Papeles Carpetas
    private static final int PreciosLibreta[] = new int[]{25,30,25};
    public static int CantidadLibreta[] = new int[]{0,0,0,0,0,0,0,0,0};
    public static float VentaLibreta[] = new float[]{0,0,0,0,0,0,0,0,0};
    
    private static final int PreciosCarpeta[] = new int[]{70,70,100};
    public static int CantidadCarpeta[] = new int[]{0,0,0};
    public static float VentaCarpeta[] = new float[]{0,0,0};
    
    private static final int PreciosPapelBond[] = new int[]{300,500,100};
    public static int CantidadPapelBond[] = new int[]{0,0,0};
    public static float VentaPapelBond[] = new float[]{0,0,0};

        
    Inventario(){}
    public void ElegirCategoria(){
        
            int opcion = 0, repetir = 0;
            
            Scanner scan = new Scanner(System.in);
            EscrituraDibujo Escolares = new EscrituraDibujo();
            ArticuloGeometria Geometria = new ArticuloGeometria();
            PapelesCarpetas Papeles = new PapelesCarpetas();
                
            do{
                
                //System.out.print("\033[H\033[2J");
                MenuCategorias();
                opcion = scan.nextInt();
                
                switch (opcion){
                
                    case 1:
                            Escolares.ElegirProducto();
                            break;
                    case 2:
                            Geometria.ElegirProducto();
                            break;
                    case 3:
                            Papeles.ElegirProducto();
                            break;
                    case 4:
                            //System.out.print("\033[H\033[2J");
                            System.out.println("\nCantidad final de la compra $" + PedidoFinal);
                            PedidoFinal = 0;
                            repetir = 1;
                            //System.out.print("\033[H\033[2J");
                            break;
                    case 5:
                            PedidoFinal = 0;
                            repetir = 1;//se recorrera mientras se agreguen mas categorias
                            break;
                    default:
                            System.out.println("La opcion digitada no existe");
                            scan.nextLine();
                            break;
                    
                }
            
            }while(repetir == 0);    
        
        }
    public void MenuCategorias(){
    
        System.out.println("\nCompras $" + PedidoFinal + "\n");
        System.out.println("Categorias");
        System.out.println("1. Escritura/Dibujo");
        System.out.println("2. Articulos/Geometria");
        System.out.println("3. Papeles/Carpetas");
        System.out.println("4. Fin de todas las compras");
        System.out.println("5. Abortar Accion");
        System.out.print("opcion: ");
    
    }
    public void MenuProductos1(){
    
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
    public void Categoria1(){
    
        int opcion = 0, repetir = 0;
        
        Scanner scan = new Scanner(System.in);
        
        do{
        
            MenuProductos1();
            opcion = scan.nextInt();
            
            switch (opcion){
            
                case 1:
                        System.out.println("Lapices Papermate " + CantidadLapices[0] + "  $" + VentaLapices[0]);
                        System.out.println("Lapices Bic " + CantidadLapices[1] + "  $ "+ VentaLapices[1]);
                        System.out.println("Lapices Metrico " + CantidadLapices[2] + "  $" + VentaLapices[2]);
                        scan.nextLine();
                        break;
                case 2:
                        System.out.println("Plumas Bic punta Fina color Rojo "+  + CantidadPlumas[0] + "  $" + VentaPlumas[0]);
                        System.out.println("Plumas Bic punta Fina color Negro "+  + CantidadPlumas[1] + "  $" + VentaPlumas[1]);
                        System.out.println("Plumas Bic punta Fina color Verde "+  + CantidadPlumas[2] + "  $" + VentaPlumas[2]);
                        System.out.println("Plumas Bic punta Fina color Azul "+  + CantidadPlumas[3] + "  $" + VentaPlumas[3]);
                        System.out.println("Plumas Bic punta Media color Rojo "+  + CantidadPlumas[4] + "  $" + VentaPlumas[4]);
                        System.out.println("Plumas Bic punta Media color Negro "+  + CantidadPlumas[5] + "  $" + VentaPlumas[5]);
                        System.out.println("Plumas Bic punta Media color Verde "+  + CantidadPlumas[6] + "  $" + VentaPlumas[6]);
                        System.out.println("Plumas Bic punta Media color Azul "+  + CantidadPlumas[7] + "  $" + VentaPlumas[7]);
                        System.out.println("Plumas Bic punta Gruesa color Rojo "+  + CantidadPlumas[8] + "  $" + VentaPlumas[8]);
                        System.out.println("Plumas Bic punta Gruesa color Negro "+  + CantidadPlumas[9] + "  $" + VentaPlumas[9]);
                        System.out.println("Plumas Bic punta Gruesa color Verde "+  + CantidadPlumas[10] + "  $" + VentaPlumas[10]);
                        System.out.println("Plumas Bic punta Gruesa color Azul "+  + CantidadPlumas[11] + "  $" + VentaPlumas[11]);
                        scan.nextLine();
                        break;
                case 3:
                        System.out.println("Gomas Factis " + CantidadGomas[0] + " $" + VentaGomas[0]);
                        System.out.println("Gomas Kores " + CantidadGomas[1] + " $" + VentaGomas[1]);
                        System.out.println("Gomas Rasor " + CantidadGomas[2] + " $" + VentaGomas[2]);
                        break;
                case 4:
                        System.out.println("Sacapuntas  " + CantidadSacapuntas[0] + " $" + VentaSacapuntas[0]);
                        System.out.println("Sacapuntas  " + CantidadSacapuntas[1] + " $" + VentaSacapuntas[1]);
                        System.out.println("Sacapuntas  " + CantidadSacapuntas[2] + " $" + VentaSacapuntas[2]);
                        break;
                case 5:
                        System.out.println("Colores Norma  " + CantidadColores[0] + " $" + VentaColores[0]);
                        System.out.println("Colores Vividel  " + CantidadColores[1] + " $" + VentaColores[1]);
                        System.out.println("Colores Mapita  " + CantidadColores[2] + " $" + VentaColores[2]);
                        break;
                case 6:
                        System.out.println("Marcatextos " + CantidadMarcatextos[0] + " $" + VentaMarcatextos[0]);
                        System.out.println("Marcatextos Bic" + CantidadMarcatextos[1] + " $" + VentaMarcatextos[1]);
                        System.out.println("Marcatextos " + CantidadMarcatextos[2] + " $" + VentaMarcatextos[2]);
                        break;
                case 7:
                        System.out.println("Plumones Crayola " + CantidadPlumones[0] + " $" + VentaPlumones[0]);
                        System.out.println("Plumones Bic " + CantidadPlumones[1] + " $" + VentaPlumones[1]);
                        System.out.println("Plumones " + CantidadPlumones[2] + " $" + VentaPlumones[2]);
                        break;
                case 8:
                        repetir = 1;
                        break;
                default:
                        System.out.println("La opcion digitada no existe");
                        scan.nextLine();
                        break;
            
            }
        
        }while(repetir == 0);
    
    }
    public void MenuProductos2(){
    
        System.out.println("1. Regla");
        System.out.println("2. Compas");
        System.out.println("3. Escuadras");
        System.out.println("4. Juego Geometrico");
        System.out.println("5. Abortar accion");
        System.out.print("opcion: ");
    
    }
    public void Categoria2(){
    
        int opcion = 0, repetir = 0;
        
        Scanner scan = new Scanner(System.in);
        
        do{
        
            MenuProductos2();
            opcion = scan.nextInt();
            
            switch (opcion){
            
                case 1:
                        System.out.println("Reglas " + CantidadRegla[0] + " $" + VentaRegla[0]);
                        System.out.println("Reglas " + CantidadRegla[1] + " $" + VentaRegla[1]);
                        System.out.println("Reglas " + CantidadRegla[2] + " $" + VentaRegla[2]);
                        break;
                case 2:
                        System.out.println("Compas " + CantidadCompas[0] + " $" + VentaCompas[0]);
                        System.out.println("Compas " + CantidadCompas[1] + " $" + VentaCompas[1]);
                        System.out.println("Compas " + CantidadCompas[2] + " $" + VentaCompas[2]);
                        break;
                case 3:
                        System.out.println("Escuadras " + CantidadEscuadras[0] + " $" + VentaEscuadras[0]);
                        System.out.println("Escuadras " + CantidadEscuadras[1] + " $" + VentaEscuadras[1]);
                        System.out.println("Escuadras " + CantidadEscuadras[2] + " $" + VentaEscuadras[2]);
                        break;
                case 4:
                        System.out.println("Escuadras " + CantidadJuegoGeometrico[0] + " $" + VentaJuegoGeometrico[0]);
                        System.out.println("Escuadras " + CantidadJuegoGeometrico[1] + " $" + VentaJuegoGeometrico[1]);
                        System.out.println("Escuadras " + CantidadJuegoGeometrico[2] + " $" + VentaJuegoGeometrico[2]);
                        break;
                case 5:
                        repetir = 1;
                        break;
                default:
                        System.out.println("La opcion digitada no existe");
                        scan.nextLine();
                        break;
                
            }
        
        }while(repetir == 0);
    
    }
    public void MenuProductos3(){
    
        System.out.println("1. Libreta");
        System.out.println("2. Carpeta");
        System.out.println("3. Papel Bond");
        System.out.println("4. Abortar accion");
        System.out.print("opcion: ");
    
    }
    public void Categoria3(){
    
        int opcion = 0, repetir = 0;
        
        Scanner scan = new Scanner(System.in);
        
        do{
        
            MenuProductos3();
            opcion = scan.nextInt();
            
            switch (opcion){
            
                case 1:
                        System.out.println("Libretas Norma corte Frances de Ralla "+  + CantidadLibreta[0] + "  $" + VentaLibreta[0]);
                        System.out.println("Libretas Norma corte Frances de Cuadro Grande "+  + CantidadLibreta[1] + "  $" + VentaLibreta[1]);
                        System.out.println("Libretas Norma corte Frances de Cuadro Chico "+  + CantidadLibreta[2] + "  $" + VentaLibreta[2]);
                        System.out.println("Libretas Norma corte Profesional de Ralla "+  + CantidadLibreta[3] + "  $" + VentaLibreta[3]);
                        System.out.println("Libretas Norma corte Profesional de Cuadro Grande "+  + CantidadLibreta[4] + "  $" + VentaLibreta[4]);
                        System.out.println("Libretas Norma corte Profesional de Cuadro Chico "+  + CantidadLibreta[5] + "  $" + VentaLibreta[5]);
                        System.out.println("Libretas Norma corte Italiano de Ralla "+  + CantidadLibreta[6] + "  $" + VentaLibreta[6]);
                        System.out.println("Libretas Norma corte Italiano de Cuadro Grande "+  + CantidadLibreta[7] + "  $" + VentaLibreta[7]);
                        System.out.println("Libretas Norma corte Italiano de Cuadro Chico "+  + CantidadLibreta[8] + "  $" + VentaLibreta[8]);
                        break;
                case 2:
                        System.out.println("Carpetas Carta color negro " + CantidadCarpeta[0] + " $" + VentaCarpeta[0]);
                        System.out.println("Carpetas Carta color blanco " + CantidadCarpeta[1] + " $" + VentaCarpeta[1]);
                        System.out.println("Carpetas Carta color verde " + CantidadCarpeta[2] + " $" + VentaCarpeta[2]);
                        break;
                case 3:
                        System.out.println("hojas Carta color blanco " + CantidadPapelBond[0] + " $" + VentaPapelBond[0]);
                        System.out.println("hojas Oficio color blanco " + CantidadPapelBond[1] + " $" + VentaPapelBond[1]);
                        System.out.println("hojas Carta varios colores " + CantidadPapelBond[2] + " $" + VentaPapelBond[2]);
                        break;
                case 4:
                        repetir = 1;
                        break;
                default:
                        System.out.println("La opcion digitada no existe");
                        scan.nextLine();
                        break;
            
            }
            
        }while(repetir == 0);
    
    }
     public void MenuCategorias2(){
    
        System.out.println("\nCategorias");
        System.out.println("1. Escritura/Dibujo");
        System.out.println("2. Articulos/Geometria");
        System.out.println("3. Papeles/Carpetas");
        System.out.println("4. Abortar Accion");
        System.out.print("opcion: ");
    
    }
    public void ConsultarVentas(){
    
        int opcion = 0, repetir = 0;
        
        Scanner scan = new Scanner(System.in);
        
        do{
            
            MenuCategorias2();
            opcion = scan.nextInt();
            
            switch (opcion){
            
                case 1:
                        Categoria1();
                        break;
                case 2:
                        Categoria2();
                        break;
                case 3:
                        Categoria3();
                        break;
                case 4:
                        repetir = 1;
                        break;
                default:
                        System.out.println("La opcion digitada no existe");
                        scan.nextLine();
                        break;
            
            }
            
        }while(repetir == 0);
        
    }
    
    public void ConsultarPrecios(){
    
        int opcion = 0, repetir = 0;
        
        Scanner scan = new Scanner(System.in);
        
        do{
            
            MenuCategorias2();
            opcion = scan.nextInt();
            
            switch (opcion) {
                case 1:
                        System.out.println("\nLapices");
                        System.out.println("1. Papermate $" + PreciosLapices[0]);
                        System.out.println("2. Bic $ " + PreciosLapices[1]);
                        System.out.println("3. Metrico $" + PreciosLapices[2]);
                        System.out.println("\nPlumas");
                        System.out.println("1. Bic P/Fino $" + preciosPlumas[0]);
                        System.out.println("1. Bic P/Mediano $" + preciosPlumas[1]);
                        System.out.println("1. Bic P/Grueso $" + preciosPlumas[2]);
                        System.out.println("\nGomas");
                        System.out.println("1. Factis $" + PreciosGomas[0]);
                        System.out.println("2. Kores $" + PreciosGomas[1]);
                        System.out.println("3. Rasor $" + PreciosGomas[2]);
                        System.out.println("\nSacapuntas");
                        System.out.println("1. Map $" + PreciosSacapuntas[0]);
                        System.out.println("2. Generico $" + PreciosSacapuntas[1]);
                        System.out.println("3. Bic $" + PreciosSacapuntas[2]);
                        System.out.println("\nColores");
                        System.out.println("1. Norma $" + PreciosColores[0]);
                        System.out.println("2. Vividel $" + PreciosColores[1]);
                        System.out.println("3. Mapita $"+ PreciosColores[2]);
                        System.out.println("\nMarcatextos");
                        System.out.println("1. Papermate $" + PreciosMarcatextos[0]);
                        System.out.println("2. Bic $" + PreciosMarcatextos[1]);
                        System.out.println("3. Pelikan $" + PreciosMarcatextos[2]);
                        System.out.println("\nPlumones");
                        System.out.println("1. Crayola $" + PreciosPlumones[0]);
                        System.out.println("2. Bic $" + PreciosPlumones[1]);
                        System.out.println("3. Pelikan $" + PreciosPlumones[2]);
                        break;
                case 2:
                        System.out.println("\nReglas");
                        System.out.println("1. Barrilito $" + PreciosRegla[0]);
                        System.out.println("2. Mendoza $" + PreciosRegla[1]);
                        System.out.println("3. Map $" + PreciosRegla[2]);
                        System.out.println("\nCompas");
                        System.out.println("1. Genrico $" + PreciosCompas[0]);
                        System.out.println("2. Mendoza $" + PreciosCompas[1]);
                        System.out.println("3. Map $" + PreciosCompas[2]);
                        System.out.println("\nEscuadras");
                        System.out.println("1. Generico $" + PreciosEscuadras[0]);
                        System.out.println("2. Mendoza $" + PreciosEscuadras[1]);
                        System.out.println("3. Map $" + PreciosEscuadras[2]);
                        System.out.println("\nJuego Geometrico");
                        System.out.println("1. Generico $" + PreciosJuegoGeometrico[0]);
                        System.out.println("2. Mendoza $" + PreciosJuegoGeometrico[1]);
                        System.out.println("3. Map $" + PreciosJuegoGeometrico[2]);
                        break;
                case 3:
                        System.out.println("\nLibretas");
                        System.out.println("1. Norma T/Fracesa $" + PreciosLibreta[0]);
                        System.out.println("2. Norma T/Profesional $" + PreciosLibreta[1]);
                        System.out.println("3. Norma T/Italiano $" + PreciosLibreta[2]);
                        System.out.println("\nCarpetas");
                        System.out.println("1. Carpeta T/Carta C/Negro $" + PreciosCarpeta[0]);
                        System.out.println("2. Carpeta T/Carta C/Blanco $" + PreciosCarpeta[1]);
                        System.out.println("3. Carpeta T/Carta Grande C/Verde $" + PreciosCarpeta[2]);
                        System.out.println("Hojas");
                        System.out.println("1. Carta C/Blanco de 500 hojas $" + PreciosPapelBond[0]);
                        System.out.println("1. Oficio C/Blanco de 500 hojas $" + PreciosPapelBond[1]);
                        System.out.println("1. Carta C/varios de 100 hojas $" + PreciosPapelBond[2]);
                        break;
                case 4:
                        repetir = 1;
                        break;
                default:
                        System.out.println("La opcion digitada no existe");
                        scan.nextLine();
                        break;
            }
         
        }while(repetir == 0);
    
    }

}