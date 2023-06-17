
package com.mycompany.proyectoinventario;

import java.util.Scanner;

public class Usuario {
    
    private int ID;
    private String Nombre;
    private String Apellido;
    private String User;
    private String Password;
    public float VentaFinal;
	
	Usuario(){
	
		ID = 0;
                Nombre = "";
                Apellido = "";
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
        public void ElegirCategoria(){
        
            int opcion = 0, repetir = 0;
            VentaFinal = 0;
            
            Scanner scan = new Scanner(System.in);
            EscrituraDibujo Escolares = new EscrituraDibujo();
                
            do{
                
                System.out.println(""+VentaFinal);
                //menu
                opcion = scan.nextInt();
                
                switch (opcion){
                
                    case 1:
                            Escolares.ElegirProducto();
                            break;
                    case 2:
                            repetir = 1;//se correra mientras se agreguen mas catehorias
                            break;
                    default:
                            break;
                    
                }
            
            }while(repetir == 0);    
        
        }
	public void ConsultarPrecios(){}
	public void CambiarPrecios(){}
	public void AgregarUsuario(){
        
            Scanner scan = new Scanner(System.in);
            
            Nombre = scan.nextLine();
            Apellido = scan.nextLine();
            User = scan.nextLine();
            Password = scan.nextLine();
            
        }
	public void BorrarUsuario(){}
	public void ConsultarVentas(){}

}
