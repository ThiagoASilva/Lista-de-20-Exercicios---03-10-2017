package me.thiagoafonso.exercicios.controller;

import me.thiagoafonso.exercicios.Exercicio1;
import me.thiagoafonso.janelas.Enviar;
import me.thiagoafonso.janelas.ReceberLinha;

public class ExerciciosController {

	Exercicio1 view = new Exercicio1(this);
	static Enviar E = new Enviar();
	String linha;
	static int exercicioEmAndamento;
	
	public static void main(String args[]){
		exercicioEmAndamento = Integer.parseInt(args[0]);
	}
	
	public void iniciar(){
			String teste;
			ReceberLinha RL = new ReceberLinha("Título teste", "Mensagem teste", this, exercicioEmAndamento);		
			teste = RL.getLinha();
					
	}
	
	
	public void retornoLinha(String linha, int numeroDoExercicio){
		this.linha = linha;
		System.out.println("[Exercicio1Controler] Linha de retorno digitada: " + this.linha);
		E.mensagem("Exercício 1", linha);	
	}
}
