package me.thiagoafonso.janelas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import me.thiagoafonso.exercicios.controller.ExerciciosController;

public class ReceberLinha extends JFrame{	
	
	JButton btnok = new JButton("OK");
	JTextField txtlinhadig = new JTextField();
	JLabel lmensagem = new JLabel();
	String linha;
	boolean ok;
	boolean v = true;

	public static void main(String[] args){
		ReceberLinha RL = new ReceberLinha("Título Padrao", "Mensagem Padrao", null, 0);
	}
	
	public ReceberLinha(String titulo, String mensagem,ExerciciosController retorno, int numeroDoExercicio){
		super();
		ok = false;
		if(retorno != null){
			
		Container paine = this.getContentPane();
		paine.setLayout(null);
				
		paine.add(lmensagem);
		lmensagem.setBounds(30, 10, 150, 80);
		lmensagem.setText(mensagem);
		
		paine.add(txtlinhadig);
		txtlinhadig.setBounds(30, 150, 200, 30);
		
		btnok.setBounds(100, 200, 90, 30);
		paine.add(btnok);
		btnok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				linha = txtlinhadig.getText();
				retorno.retornoLinha(linha, numeroDoExercicio);
				ReceberLinha.this.dispose();
				ok = true;
				
			}
		});
		
		
		
		this.setSize(300, 300);
		this.setTitle(titulo);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
		this.setContentPane(paine);
		
		}
	}
	

	
	public boolean botaoPressionado(){
		
		return ok;
	}
	public String getLinha(){
		
		return linha;
	}
	
	public boolean estaVazia(){
		
		return v;
	}
}
