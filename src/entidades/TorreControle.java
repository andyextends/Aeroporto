package entidades;

import Interface.Comunicacao;

public class TorreControle  {
	
	private String aeroporto;
	private boolean ativa;
	
	
	
	public TorreControle(String aeroporto, boolean ativa) {
	
		this.aeroporto = aeroporto;
		this.ativa = ativa;
	}



	public void pedirRequesicaoDecolagem(Comunicacao objetoComunicacao) {
		String tipoLocalRetorno = "";
	
		switch (objetoComunicacao.getTipoAeronave()) {
		case Aviao:
			tipoLocalRetorno = "Pista";
			break;
		case Dirigivel:
			tipoLocalRetorno = "Plataforma";
			break;
		case Drone :
			tipoLocalRetorno = "Campo";
			break;
		case Helicoptero :
			tipoLocalRetorno = "Heliponto";
			break;
			
		}	
			objetoComunicacao.autorizarDecolagem(tipoLocalRetorno +" 40");
			
	
	
	}



	public String getAeroporto() {
		return aeroporto;
	}



	public void setAeroporto(String aeroporto) {
		this.aeroporto = aeroporto;
	}



	public boolean isAtiva() {
		return ativa;
	}



	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
}
