package View;

import javax.swing.JOptionPane;

import Controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		ConverteController C = new ConverteController();
		int Valor = 0;
		while(Valor<1 || Valor >1000) {
			Valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 1 a 1000"));
		}
		System.out.println(C.decToBin(Valor));
	}

}
