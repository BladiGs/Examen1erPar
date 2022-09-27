package Pagar;

import java.util.*;

/**
 * 
 */
public class Usuario {

    public Usuario() {
    }

    public String Nombre;

    public String Apellido;

    public int Id_Usuario;

    public String psw;

    public void Acceder_aplicacion() {
		Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
		String nomAux = scan.nextLine();
		
		System.out.println("Ingresa tu password (Solo caracteres): ");
		String pswAux = scan.nextLine();
		
		
		System.out.println("Accediste correctamente a la aplicacion");
		
		
    }

    public int Ingresar_datos() {
        Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa el id del beneficiario");
		int id_benef = scan.nextInt();
		//System.out.println("Cantidad ingresada");
		return id_benef;
    }
	public float Ingresar_dinero(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa la cantidad de dinero");
		float dinero = scan.nextFloat();
		
		return dinero;
		
	}
	
	public void Realizar_Pago(){
		
	}


    public void Realizar_Registro() {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int aleat = rand.nextInt(100);
		
        System.out.println("Ingresa tu nombre: ");
		setNombre(scan.nextLine());
		
		System.out.println("Ingresa tu apellido: ");
		setApellido(scan.nextLine());
		
		setId_Usuario(aleat);
		
		System.out.println("Ingresa tu password (Solo caracteres): ");
		setPsw(scan.nextLine());
		
		System.out.println("Registro Exitoso ");
		
		
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        // TODO implement here
        return Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getApellido() {
        // TODO implement here
        return Apellido;
    }

    public void setId_Usuario(int Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public int getId_Usuario() {
        // TODO implement here
        return Id_Usuario;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    /**
     * @return
     */
    public String getPsw() {
        // TODO implement here
        return psw;
    }

}