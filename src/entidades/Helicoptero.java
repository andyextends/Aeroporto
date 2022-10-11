package entidades;

public class Helicoptero  extends Aeronave{
	
	private int quantidadePasHelices;
	private int potenciaPropulsaoVertical;
	private String propulsaoVertical;
	
	
	
	
	public Helicoptero(TorreControle torreControle) {
		super(torreControle);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Helicoptero(TorreControle torreControle, int quantidadePasHelices, int potenciaPropulsaoVertical,String propulsaoVertical) {
		super(torreControle);
		this.quantidadePasHelices = quantidadePasHelices;
		this.potenciaPropulsaoVertical = potenciaPropulsaoVertical;
		this.propulsaoVertical= propulsaoVertical;
	}


	@Override
	public void autorizarPouso(String local) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void autorizarDecolagem(String local) {
		propulsaoVertical = local;
		System.out.println("Levantando voo na vertical no  " + propulsaoVertical);
		
	}
	@Override
	public void enviarMensagem(String mensagem) {
		if(mensagem != null) {
			System.out.println(" Podemos pousar Torre ?");
		}
		
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
		return TipoAeronave.Helicoptero;
	}
	public int getQuantidadePasHelices() {
		return quantidadePasHelices;
	}
	public void setQuantidadePasHelices(int quantidadePasHelices) {
		this.quantidadePasHelices = quantidadePasHelices;
	}
	public int getPotenciaPropulsaoVertical() {
		return potenciaPropulsaoVertical;
	}
	public void setPotenciaPropulsaoVertical(int potenciaPropulsaoVertical) {
		this.potenciaPropulsaoVertical = potenciaPropulsaoVertical;
	}
	
	
	
}

