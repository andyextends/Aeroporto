package controleAereo;

import entidades.Aviao;
import entidades.Dirigivel;
import entidades.Drone;
import entidades.Helicoptero;
import entidades.Porte;
import entidades.TorreControle;

public class ControleAereo {

	public static void main(String[] args) {
		TorreControle torreControleGuarulhos = new TorreControle("Aeroporto de Guarulhos", true);	
		Aviao jatoGol = new Aviao(torreControleGuarulhos);
		jatoGol.pedirAutorizacaoDecolagem();
		jatoGol.setAutonomiaVoo(7);
		jatoGol.setCapacidadePassageiros(180);
		jatoGol.setCapacidadeTanqueCombustivel(2000);
		jatoGol.setModelo("737 Max");
		jatoGol.setPilotoAutomatico(true);
		jatoGol.setPorte(Porte.Grande);
		jatoGol.setPotencia(3000);
		jatoGol.setQuantidadeTripulaçao(15);
		jatoGol.setQuantidadeTurbinas(2);
		jatoGol.setVelocidadeMaxima(900);
		System.out.println("---------------------------Aviao---------------------------------------");
		TorreControle torreControleCumbica = new TorreControle("Aeroporto de Cumbica ", true);
		Helicoptero aguia = new Helicoptero(torreControleCumbica);
		aguia.pedirAutorizacaoDecolagem();
		aguia.setAutonomiaVoo(500);
		aguia.setCapacidadePassageiros(8);
		aguia.setCapacidadeTanqueCombustivel(540);
		aguia.setModelo(" BK 117");
		aguia.setPotencia(738);
		aguia.setQuantidadeTripulaçao(2);
		aguia.setVelocidadeMaxima(210);
		aguia.setQuantidadePasHelices(5);
		aguia.setPotenciaPropulsaoVertical(540);
		//aguia.setPilotoAutomatico(true);
		//aguia.setPorte(Porte.Grande);
		//aguia.setQuantidadeTurbinas(2);
		System.out.println("---------------------------helicoprtero---------------------------------------");
		TorreControle torreControleViraCopos = new TorreControle("Aeroporto Vira Copos ", true);
		Dirigivel zepelin = new Dirigivel (torreControleViraCopos  );
		
		zepelin.pedirAutorizacaoDecolagem();
		zepelin.setAutonomiaVoo(7);
		zepelin.setCapacidadePassageiros(72);
		zepelin.setCapacidadeTanqueCombustivel(65);
		zepelin.setModelo("Hindenburg");
	    zepelin.setPotencia(3560);
		zepelin.setQuantidadeTripulaçao(60);
		zepelin.setVelocidadeMaxima(38);
		zepelin.setInflado(42);
		zepelin.setBolsao("gas helio");
		System.out.println("----------------------------Dirigivel--------------------------------------------");
		TorreControle torreControlePampulha = new TorreControle("Aeroporto Pampulha ", true);
		Drone vant = new Drone (torreControleViraCopos );
		vant.pedirAutorizacaoDecolagem();
		vant.setAutonomiaVoo(6000);
		vant.setCapacidadePassageiros(0);
		vant.setCapacidadeTanqueCombustivel(1000);
		vant.setModelo(" MQ1 Predador");
	    vant.setPotencia(60);
		vant.setQuantidadeTripulaçao(0);
		vant.setVelocidadeMaxima(1000);
		System.out.println("-----------------------------------Drone------------------------------------------");
	}

}
