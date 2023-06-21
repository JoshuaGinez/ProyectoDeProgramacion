
package com.mycompany.proyectoinventario;

import java.util.Scanner;

public class ProyectoInventario {

	public static void main(String[] args){
	
		int opcion, repetir = 0;
		
		Usuario user = new Usuario();
		
		do{
		
			Inicio(); //Mensaje que muestra el incio del programa
			opcion = user.IniciarSesion();
			
			switch (opcion){
			
				case 0:
					repetir = 1;
					break;
				case 1:
					Gerente();
					break;
				case 2:
					Empleado();
					break;
			
			}
	
		}while(repetir == 0);
                
                System.exit(0);//cerrar el programa
	
	}
	public static void Gerente(){
	
		int opcion, repetir = 0;
		
		Scanner scan = new Scanner(System.in);
		
		Inventario inventario = new Inventario();
		
		do{
                    
                        //System.out.print("\033[H\033[2J");
                        menuGerente();	
			opcion = scan.nextInt();
			
			switch (opcion){
			
				case 1:
					inventario.ElegirCategoria();//Elegir categoria para agrgar ventas
					break;
				case 2:
					inventario.ConsultarPrecios();//consulta de precios de los productos
					break;
				case 3:
					inventario.ConsultarVentas();//consulta de la ventas realizadas
					break;
				case 4:
					repetir = 1;//cerrar sesion
					break;
				case 5:
					System.exit(0);//cerrar el programa
					break;
                                default:
                                        break;
			
			}
		
		}while(repetir == 0);
	
	}
	public static void Empleado(){
	
		int opcion, repetir = 0;
		
		Scanner scan = new Scanner(System.in);
		
		Inventario inventario = new Inventario();
		
		do{
		
                        //System.out.print("\033[H\033[2J");
                        menuEmpleado();
			opcion = scan.nextInt();
			
			switch (opcion){
			
				case 1:
					inventario.ElegirCategoria();//Elegir categoria para agrgar ventas
					break;
				case 2:
					inventario.ConsultarPrecios();//consulta de precios de los productos
					break;
				case 3:
					repetir = 1;//cerrar sesion
					break;
				case 4:
					System.exit(0);//cerrar el programa
					break;
                                default:
                                        break;
			
			}
		
		}while(repetir == 0);
	
	}

	public static void Inicio(){
		System.out.println("**Bienvenido al Sistema Informatico de Ventas**");
		System.out.println("**Presione cualquier tecla para poder continuar**");
	}
	
	public static void menuGerente(){
            
		System.out.println("Menu gerente");
		System.out.println("Ingresa una opcion para poder continuar\n");
		System.out.println("1. Guardar pedido");
		System.out.println("2. Consultar precios");
		System.out.println("3. Consultar ventas");
		System.out.println("4. Cerrar sesion");
		System.out.println("5. Cerrar el programa");
		System.out.print("Opcion: ");
	}
	public static void menuEmpleado(){
            
		System.out.println("Menu empleado");
		System.out.println("Ingresa una opcion para poder continuar.");
		System.out.println("1.Guardar pedido");
		System.out.println("2.Consultar precios");
		System.out.println("3.Cerrar sesion");
		System.out.println("4.Cerrar el programa");
                System.out.print("Opcion: ");
                
	}
}
