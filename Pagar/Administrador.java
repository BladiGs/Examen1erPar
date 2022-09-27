package Pagar;

import java.util.*;

/**
 * 
 */
public class Administrador extends Usuario {

    /**
     * Default constructor
     */
    public Administrador() {
    }

    public String Nombre;
    public String Apellido;
    public int Id_Admin;
    public int Id_Usuario;
	public ArrayList<String> registros = new ArrayList<String>();
	public ArrayList<String> Comprobantes = new ArrayList<String>();

    public void Almacenar_Registro(int Id_Usuario) {
		setId_Usuario(Id_Usuario);
        System.out.println("Se ha almacenado el registro con el usuario: " + getId_Usuario());
    }


    public void Corroborar_datos(int id_corrob, int Id_Beneficiario) {
		
        if(id_corrob == Id_Beneficiario){
			System.out.println("Los datos ingresados con correctos");
		}
		else{
			System.out.println("Los datos ingresados son incorrectos:");
		}
    }

 
    public void Corroborar_dinero(float dinero) {
        System.out.println("El dinero ingresado es correcto: " + dinero);
    }

    public void Autorizar_Pago() {
		
		System.out.println("--Pago autorizado--");
        // TODO implement here
    }

    public void Almacenar_Comprobante() {
		System.out.println("--Comprobante Almacenado--");
        // TODO implement here
    }

  
    public void setNombre(String Nombre) {
		this.Nombre = Nombre;
        // TODO implement here
    }

   
    public String getNombre() {
        // TODO implement here
        return Nombre;
    }

    
    public void setApellido(String Apellido) {
        // TODO implement here
		this.Apellido = Apellido;
    }

   
    public String getApellido() {
        // TODO implement here
        return Apellido;
    }

   
    public void setId_Admin(int Id_Admin) {
        // TODO implement here
		this.Id_Admin = Id_Admin;
    }

   
    public int getId_Admin() {
        // TODO implement here
        return Id_Admin;
    }

   
    public void setId_Usuario(int Id_Usuario) {
        // TODO implement here
		this.Id_Usuario = Id_Usuario;
    }

   
    public int getId_Usuario() {
        // TODO implement here
        return Id_Usuario;
    }

}