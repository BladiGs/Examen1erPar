package Pagar;

import java.util.*;

/**
 * 
 */
public class Beneficiario extends Administrador {

    /**
     * Default constructor
     */
    public Beneficiario() {
    }


    public String Nombre;

    public String Apellido;

    public int Id_Beneficiario ;

    public int Id_Usuario;

  
    public void Recibir_Pago(float pago) {
		System.out.println("--Pago Recibido--" + "\nLa cantidad recibida es: " + pago);
        // TODO implement here
    }

    /**
     * @param Nombre
     */
    public void setNombre(String Nombre) {
        // TODO implement here
		this.Nombre = Nombre;
    }

    /**
     * @return
     */
    public String getNombre() {
        // TODO implement here
        return Nombre;
    }

    /**
     * @param Apelldio
     */
    public void setApellido(String Apellido) {
        // TODO implement here
		this.Apellido = Apellido;
    }

    /**
     * @return
     */
    public String getApellido() {
        // TODO implement here
        return Apellido;
    }

    /**
     * @param Id_Beneficiario
     */
    public void setId_Beneficiario(int Id_Beneficiario) {
        // TODO implement here
		this.Id_Beneficiario = Id_Beneficiario;
    }

    /**
     * @return
     */
    public int getId_Beneficiario() {
        // TODO implement here
        return Id_Beneficiario;
    }

    /**
     * @param Id_Usuario
     */
    public void setId_Usuario(int Id_Usuario) {
        // TODO implement here
		this.Id_Usuario = Id_Usuario;
    }

    /**
     * @return
     */
    public int getId_Usuario() {
        // TODO implement here
        return Id_Usuario;
    }

}