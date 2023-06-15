
package com.mycompany.proyectoinventario;

import java.util.Scanner;

public class Usuario {
    private String User;
	private String Password;
	
	Usuario(){
	
		User = "";
		Password = "";
	
	}
	
	public int IniciarSesion(){
	
		int repetir = 0;
		String UserValidar = "", PasswordValidar = "";
		
		Scanner scan = new Scanner(System.in);
		
		do{
		
			User = scan.nextLine();
			Password = scan.nextLine();
			
			for(int i=0; i<10; i++){//le doy de limite 10 usuarios
			
				//UserValidar=/*base*/;
				//PasswordValidar=/*base*/;
			
				if(User == UserValidar && Password == PasswordValidar){
			
					repetir=3;
					return 1;
			
				}else if(User == UserValidar && Password == PasswordValidar){
			
					repetir=3;
					return 2;
			
				}
			
			}
			
			if(repetir < 2){
			
				//mensaje: user y password incorrectos
			
			}
			repetir++;
		
		}while(repetir < 3);
		
		//mensaje: has excedido el numero de intentos permitidos se cerrara el programa
		return 0;

	}
	public void ConsultarPrecios(){}
	public void CambiarPrecios(){}
	public void AgregarUsuario(){}
	public void BorrarUsuario(){}
	public void ConsultarVentas(){}

}
