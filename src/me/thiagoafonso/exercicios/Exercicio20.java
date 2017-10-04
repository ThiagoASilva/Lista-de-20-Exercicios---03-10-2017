package me.thiagoafonso.exercicios;

import java.awt.Container;
import javax.swing.JFrame;

public class Exercicio20 extends JFrame{

	public static void main(String[] args){
		Exercicio20 Ex20 = new Exercicio20();
	}
	
	public Exercicio20(){
		super("Exercício 20");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}