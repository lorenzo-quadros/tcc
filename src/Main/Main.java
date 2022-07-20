package Main;

import javax.swing.JFrame;

import User.CadastroCli;

//import Database.DatabaseCon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CadastroCli cadastro = new CadastroCli();
		cadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cadastro.setSize(600,600);
		cadastro.setResizable(false);
		cadastro.setVisible(true);
		
		
	}

}
