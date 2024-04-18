package projeto.classes;

import java.io.FileNotFoundException;

import cont.Ler;
import cont.Login;
import projeto.exceptions.ContaException;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException, ContaException {
		
		Ler.leitor();
        Login menu = new Login();
        menu.login();

	}

}
