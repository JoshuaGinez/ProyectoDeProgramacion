
package com.mycompany.proyectoinventario;

import java.util.Scanner;

public class ProyectoInventario {

	public static void main(String[] args){
	
		int opcion, repetir = 0;
		
		Usuario user = new Usuario();
		
		do{
		
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
		
		Usuario user = new Usuario();
		
		do{
                    
                        menuGerente();	
			
			opcion = scan.nextInt();
			
			switch (opcion){
			
				case 1:
					user.ElegirCategoria();//Elegir categoria para agrgar ventas
					break;
				case 2:
					user.ConsultarPrecios();//consulta de precios de los productos
					break;
				case 3:
					user.CambiarPrecios();
					break;
				case 4:
					user.AgregarUsuario();
					break;
				case 5:
					user.BorrarUsuario();
					break;
				case 6:
					user.ConsultarVentas();
					break;
				case 7:
					repetir = 1;//cerrar sesion
					break;
				case 8:
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
		
		Usuario user = new Usuario();
		
		do{
		
                        menuEmpleado();

			opcion = scan.nextInt();
			
			switch (opcion){
			
				case 1:
					user.ElegirCategoria();//Elegir categoria para agrgar ventas
					break;
				case 2:
					user.ConsultarPrecios();//consulta de precios de los productos
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
	
	public static void menuGerente(){
            
		System.out.println("Menu gerente");
		System.out.println("Ingresa una opcion para poder continuar.");
		System.out.println("1.Guardar pedido");
		System.out.println("2.Consultar precios");
		System.out.println("3.Cambiar precios");
		System.out.println("4.Agregar usuario");
		System.out.println("5.Borrar usuario");
		System.out.println("6.Consultar ventas");
		System.out.println("7.Cerrar sesion");
		System.out.println("8.Cerrar el programa");
		System.out.println("Opcion: ");
	}
	public static void menuEmpleado(){
            
		System.out.println("Menu empleado");
		System.out.println("Ingresa una opcion para poder continuar.");
		System.out.println("1.Guardar pedido");
		System.out.println("2.Consultar precios");
		System.out.println("3.Cerrar sesion");
		System.out.println("4.Cerrar el programa");
                System.out.println("Opcion: ");
                
	}
}
