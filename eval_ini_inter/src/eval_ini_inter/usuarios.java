package eval_ini_inter;

import java.util.ArrayList;

public class usuarios {
	
	//estado
	ArrayList <usuario> lista_user;
	
	
	//comportamiento
	
	//constructor
	
	public usuarios() {
		lista_user=new ArrayList();
	}

	
	
	//resto comportamientos
	
	public void add(usuario usuario) {
		lista_user.add(usuario);
	}
	
	
	public boolean buc_user(String usuario) {
		Boolean encontrado=false;
		int cont=0;
		while (encontrado==false) {
			if (cont<lista_user.size()-1) {
					if (lista_user.get(cont).getuser().equals(usuario)) {
						encontrado=true;
					} else {cont++;
					}
				} else {
				encontrado=false;
				break;
				}	
			}
		return encontrado;
	}
	
	public boolean buc_passwd(String passwd) {
		Boolean encontrado=false;
		int cont=0;
		while (encontrado==false) {
			if (cont<lista_user.size()-1) {
					if (lista_user.get(cont).getpasswd().equals(passwd)) {
						encontrado=true;
					} else {cont++;
					}
				} else {
				encontrado=false;
				break;
				}	
			}
		return encontrado;
	}
}
