package entidades;

public class Dirigivel extends Aeronave{

	String bolsao;
	int inflado;

	public Dirigivel(TorreControle torreControle) {
		super(torreControle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void autorizarPouso(String local) {
		// TODO Auto-generated method stub

	}

	@Override
	public void autorizarDecolagem(String local) {
		bolsao = local;
		System.out.println("Inflando Baloes com helio na  " + bolsao);

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

	@Override
	public TipoAeronave getTipoAeronave() {
		// TODO Auto-generated method stub
		return TipoAeronave.Dirigivel;
	}

	public String getBolsao() {
		return bolsao;
	}

	public void setBolsao(String bolsao) {
		this.bolsao = bolsao;
	}

	public int getInflado() {
		return inflado;
	}

	public void setInflado(int inflado) {
		this.inflado = inflado;
	}

}
