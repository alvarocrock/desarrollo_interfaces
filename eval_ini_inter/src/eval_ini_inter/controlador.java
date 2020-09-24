package eval_ini_inter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class controlador {

	//problemas tecnicos con git y no se acceder a una bbdd pero si la tengo creada
	//accedere aun fichero para cargar los usuarios
	
	//estado
	usuarios lista;
	
	
	final static String user= "usuario";
	final static String passwrd = "passwd";
	final static String FICHERO = "usuarios.txt";
	
	//comportamientos
	
	
	
	
	//constructor
	public controlador() {
		lista= new usuarios();
		
	}
	
	
	
	//resto comportamientos
	
	public boolean compro_passwd(String contrasena) {
	
		if (contrasena.equals(passwrd)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	public boolean compro_user(String usuario) {
		
		if (usuario.equals(user)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void cargar_users() {
		String siguientelinea="";
		File miFichero = new File(FICHERO);
		Scanner in = null;
		usuario miuser=null;
		try {
			in = new Scanner(miFichero);
			siguientelinea = in.nextLine();
			while (in.hasNext()) {
				miuser= new usuario(siguientelinea);
				
				
			}
		
			in.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
