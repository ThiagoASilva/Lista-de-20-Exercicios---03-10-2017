package me.thiagoafonso.exercicios;

import java.awt.Container;
import javax.swing.JFrame;

public class Exercicio10 extends JFrame{

	public static void main(String[] args){
		Exercicio10 Ex10 = new Exercicio10();
	}
	
	public Exercicio10(){
		super("Exerc�cio 10");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}