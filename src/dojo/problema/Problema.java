package dojo.problema;


public class Problema {
	
	public static void main(String[] args) {
		EspelhoTresPinosRedondos espelhoTresPinosRedondos = new EspelhoTresPinosRedondos();
		// Possível fornecer Energia para uma tomada 3 pinos redondos
		espelhoTresPinosRedondos.fornecerEnegia(new TomadaTresPinoRedondo());
		// Não é possível fornecer Energia para uma tomada 2 pinos chatos e 1 redondo
		espelhoTresPinosRedondos.fornecerEnegia(new TomadaTresPinosUmRedondoDoisChatos());
	}
}

class EspelhoTresPinosRedondos{
	void fornecerEnegia(TomadaTresPinoRedondo tomadaTresPinoRendondo) {
		tomadaTresPinoRendondo.pluga();
	}
}

// Tomadas
// 3 pinos redondos
class TomadaTresPinoRedondo{void pluga(){}}
// 2 pinos chatos 1 redondo
class TomadaTresPinosUmRedondoDoisChatos{void ligar(){}}
