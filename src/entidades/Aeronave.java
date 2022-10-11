package entidades;

import Interface.Comunicacao;
import Interface.Procedimento;

public abstract class Aeronave implements Comunicacao,Procedimento {
	
	
	
	private String modelo;
	private int potencia;
	private int capacidadePassageiros;
	private int velocidadeMaxima;
	private int autonomiaVoo;
	private int capacidadeTanqueCombustivel;
	private int quantidadeTripulaçao;
	private TorreControle torreControle;
	

	
	
	public Aeronave (TorreControle torreControle) {
		this.torreControle = torreControle;
	}
	
	public void  pedirAutorizacaoDecolagem() {
		if(torreControle.isAtiva()) {
		torreControle.pedirRequesicaoDecolagem(this);
		}else {
			System.out.println("Torre de Controle Inativa");
	}
	
	}
	public int getQuantidadeTripulaçao() {
		return quantidadeTripulaçao;
	}
	public void setQuantidadeTripulaçao(int quantidadeTripulaçao) {
		this.quantidadeTripulaçao = quantidadeTripulaçao;
	}
	public TorreControle getTorreControle() {
		return torreControle;
	}
	public void setTorreControle(TorreControle torreControle) {
		this.torreControle = torreControle;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getCapacidadePassageiros() {
		return capacidadePassageiros;
	}
	public void setCapacidadePassageiros(int capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(int velocidadeMaximna) {
		this.velocidadeMaxima = velocidadeMaximna;
	}
	public int getAutonomiaVoo() {
		return autonomiaVoo;
	}
	public void setAutonomiaVoo(int autonomiaVoo) {
		this.autonomiaVoo = autonomiaVoo;
	}
	public int getCapacidadeTanqueCombustivel() {
		return capacidadeTanqueCombustivel;
	}
	public void setCapacidadeTanqueCombustivel(int capacidadeTanqueCombustivel) {
		this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
	}
	
	

}
