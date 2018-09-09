package dojo.solucao;
public class Solucao {
	public static void main(String[] args) {
		EspelhoAdapter adapter = new EspelhoAdapter();
		adapter.fornecerEnegia(new TomadaTresPinoRedondo());
		adapter.fornecerEnegia(new TomadaTresPinosUmRedondoDoisChatos());
	}
}
class EspelhoTresPinosRedondos{
	void fornecerEnegia(TomadaTresPinoRedondo tomadaTresPinoRendondo) {
		tomadaTresPinoRendondo.pluga();
	}
}

// Adapter
class EspelhoAdapter extends EspelhoTresPinosRedondos{
	void fornecerEnegia(TomadaTresPinosUmRedondoDoisChatos tomadaTresPinoRendondo) {
		tomadaTresPinoRendondo.ligar();
	}
}

// Tomadas
// 3 pinos redondos
class TomadaTresPinoRedondo{void pluga(){}}
// 2 pinos chatos 1 redondo
class TomadaTresPinosUmRedondoDoisChatos{void ligar(){}}