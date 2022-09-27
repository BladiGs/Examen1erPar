package Pagar;

import java.util.*;

public class Principal{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Usuario usr = new Usuario();
		Beneficiario benef = new Beneficiario();
		Administrador admin = new Administrador();
		
		System.out.println("Cuentas con registro: (s/n)");
		char reg = scan.next().charAt(0);
		
		if(reg == 'n'){
			System.out.println("\n-----Registro-----\n");
			usr.Realizar_Registro();
			System.out.println("\n-----Acceso-----\n");
			usr.Acceder_aplicacion();
		}
		else{
			System.out.println("\n-----Acceso-----\n");
			usr.Acceder_aplicacion();
		}
		System.out.println("\n-----Operacion-----\n");
		int id_benef = usr.Ingresar_datos(); //Usuario
		
		benef.setId_Beneficiario(1401);
		
		admin.Corroborar_datos(id_benef, benef.getId_Beneficiario()); //Administrador
		
		float dinero = usr.Ingresar_dinero();
		
		admin.Corroborar_dinero(dinero);
		
		admin.Autorizar_Pago();
		
		admin.Almacenar_Comprobante();
		
		System.out.println("\n-----Finalizacion-----\n");
		
		benef.Recibir_Pago(dinero); //Beneficiario
		
		
		
	
	}


}