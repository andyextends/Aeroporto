package entidades;

public class Aviao extends Aeronave {
	private TipoAviao tipoAviao;
	private Porte porte;
	private boolean pilotoAutomatico;
	private int quantidadeTurbinas;
	private String pistaDecolagem;

	public Aviao(TorreControle torreControle) {
		super(torreControle);
		// TODO Auto-generated constructor stub
	}
	
	
   
	public Aviao(TorreControle torreControle, TipoAviao tipoAviao, Porte porte, boolean pilotoAutomatico,
			int quantidadeTurbinas, String pistaDecolagem) {
		super(torreControle);
		this.tipoAviao = tipoAviao;
		this.porte = porte;
		this.pilotoAutomatico = pilotoAutomatico;
		this.quantidadeTurbinas = quantidadeTurbinas;
		this.pistaDecolagem = pistaDecolagem;
	}



	@Override
	public TipoAeronave getTipoAeronave() {
		// TODO Auto-generated method stub
		return TipoAeronave.Aviao;
	}

	@Override
	public void autorizarPouso(String local) {
		// TODO Auto-generated method stub

	}

	@Override
	public void autorizarDecolagem(String local) {
		pistaDecolagem = local;
		System.out.println("Realizar Taxiamento até a " + pistaDecolagem);

	}

	@Override
	public void enviarMensagem(String mensagem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pousar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void decolar() {
		// TODO Auto-generated method stub

	}

	public TipoAviao getTipoAviao() {
		return tipoAviao;
	}

	public void setTipoAviao(TipoAviao tipoAviao) {
		this.tipoAviao = tipoAviao;
	}

	public Porte getPorte() {
		return porte;
	}

	public void setPorte(Porte porte) {
		this.porte = porte;
	}

	public boolean isPilotoAutomatico() {
		return pilotoAutomatico;
	}

	public void setPilotoAutomatico(boolean pilotoAutomatico) {
		this.pilotoAutomatico = pilotoAutomatico;
	}

	public int getQuantidadeTurbinas() {
		return quantidadeTurbinas;
	}

	public void setQuantidadeTurbinas(int quantidadeTurbinas) {
		this.quantidadeTurbinas = quantidadeTurbinas;
	}

}
