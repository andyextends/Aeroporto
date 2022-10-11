package entidades;

public class Drone extends Aeronave {

	String empuxo;

	public Drone(TorreControle torreControle) {
		super(torreControle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void autorizarPouso(String local) {
		// TODO Auto-generated method stub

	}

	@Override
	public void autorizarDecolagem(String local) {
		empuxo = local;
		System.out.println("Deslocamento de massa da helice por empuxo  levantar voo no " + empuxo);

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
		return TipoAeronave.Drone;
	}

}