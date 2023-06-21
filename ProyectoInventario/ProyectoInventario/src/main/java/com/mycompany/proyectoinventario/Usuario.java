
package com.mycompany.proyectoinventario;

import java.util.Scanner;

public class Usuario {
    
    private static final String Users[] = new String[]{"Gerente.java","Empleado.java"};
    private static final String Pass[] = new String[]{"12345","67890"};

    private String User;
    private String Password;
	
	Usuario(){
	
		User = "";
		Password = "";
	
	}
	
	public int IniciarSesion(){
	
		int repetir = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do{
		
			System.out.print("\033[H\033[2J");
                        System.out.print("Usuario: ");
			User = scan.nextLine();
			System.out.print("Password: ");
			Password = scan.nextLine();
			
			if((User.equals(Users[0])) && (Password.equals(Pass[0]))){
			
				repetir = 3;
				return 1;
			
			}else if((Password.equals(Pass[1])) && (User.equals(Users[1]))){
			
			repetir=3;
			return 2;
			
			}
									
			if(repetir < 2){
			
                            System.out.print("El usuario o la contrasena son incorrectos");
                            scan.nextLine();
                            System.out.print("\033[H\033[2J");
			
			}
			repetir++;
		
		}while(repetir < 3);
		
		System.out.print("Has excedido el numero de intentos permitidos se cerrara el programa");
                scan.nextLine();
		return 0;

	}
        	
}