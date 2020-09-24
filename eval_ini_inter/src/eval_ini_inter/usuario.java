package eval_ini_inter;

public class usuario {
	
	//ESTAdo
	
	private String usuario;
	private String passwd;
	
	
	
	//comportamientos
	
	
	
	
	//contructor
	
	public usuario(String serializado) {
		
		String[] ListaPartes= serializado.split(";");
		usuario=ListaPartes[0];
		passwd= ListaPartes[1];
		
	}
	
	
	
	//resto comportamientos
	
	//getters
	public String getuser() {
		return usuario;
	}
	
	public String getpasswd() {
		return passwd;
	}

}
