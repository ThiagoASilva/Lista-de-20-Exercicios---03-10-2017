package me.thiagoafonso.janelas;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Enviar extends JFrame{
	
	JLabel lmensagem = new JLabel();
	public static void main(String args[]){
		Enviar E = new Enviar();
	}
	
	public Enviar(){
		
	}
	
	public void mensagem(String titulo, String mensagem){
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		paine.add(lmensagem);
		lmensagem.setText("<html>" + mensagem + "</html>");
		lmensagem.setBounds(30, 30, 300, 300);
		
		this.setTitle(titulo);
		this.setSize(400, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
