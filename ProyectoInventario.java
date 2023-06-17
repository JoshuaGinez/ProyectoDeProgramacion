
package com.mycompany.proyectoinventario;

import java.util.Scanner;

public class ProyectoInventario {

    public static int repetir = 0;

	public static void main(String[] args){
	
		int opcion;
		repetir = 0;
		
		Usuario user = new Usuario();
		
		do{
		
			opcion = user.IniciarSesion();
			
			switch (opcion){
			
				case 0:
						System.exit(0);//cerrar el programa
						break;
				case 1:
						Gerente();
						break;
				case 2:
						Empleado();
						break;
			
			}
	
		}while(repetir == 0);
	
	}
	public static void Gerente(){
	
		int opcion;
		
		Scanner scan = new Scanner(System.in);
		
		Usuario user = new Usuario();
		
		do{
		
			opcion = scan.nextInt();
			
			switch (opcion){
			
				case 1:
						//GuardarPedido
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
			
			}
		
		}while(repetir == 0);
	
	}
	public static void Empleado(){
	
		int opcion;
		
		Scanner scan = new Scanner(System.in);
		
		Usuario user = new Usuario();
		
		do{
		
			opcion = scan.nextInt();
			
			switch (opcion){
			
				case 1:
						//GuardarPedido
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
			
			}
		
		}while(repetir == 0);
	
	}

}
