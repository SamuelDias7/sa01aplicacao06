package br.com.senaitagua.sa1.app6;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciando objetos
		CalculoBO objeto = new CalculoBO();
		
		String preco = JOptionPane.showInputDialog("Preço:");
		String valorunitario = JOptionPane.showInputDialog("valor unitário:");
		
		double v1, v2;
		
		v1 = Double.parseDouble(preco);
		v2 = Double.parseDouble(valorunitario);
		
		JOptionPane.showMessageDialog(null, objeto.calcularTotal(v1, v2));

	}

}
