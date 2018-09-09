package dojo.solucao;

public class Solucao2 {
	public static void main(String[] args) {
		// Executar ações na TV 1
		Acao acaoTv1 = new Controle1();
		Tv tv1 = new Tv1(acaoTv1);
		
		// Controle 1
		tv1.trocarCanal();
		
		// Controle 2
		acaoTv1 = new Controle2();
		tv1.executarAcao(acaoTv1);
		tv1.trocarCanal();
		
		// Controle 3
		acaoTv1 = new Controle3();
		tv1.executarAcao(acaoTv1);
		tv1.trocarCanal();
		
		// Executar ações na TV2
		Acao acaoTv2 = new Controle1();
		Tv2 tv2 = new Tv2(acaoTv2);

		// Controle 1
		tv2.trocarCanal();
		
		// Controle 2		
		acaoTv2 = new Controle2();
		tv2.executarAcao(acaoTv2);
		tv2.trocarCanal();
		
		// Controle 3
		acaoTv2 = new Controle3();
		tv2.executarAcao(acaoTv2);
		tv2.trocarCanal();
	}
}

interface Acao { void onOff(); }
interface Tv { 
	void trocarCanal(); 
	void executarAcao(Acao acao); 
}

// Aparelhos de TV´s
class Tv1 implements Tv {
	public Tv1(Acao acao) { this.acao = acao;}
	private Acao acao;
	public void trocarCanal() {}
	public void executarAcao(Acao acao) { this.acao = acao;}
}
class Tv2 implements Tv {
	public Tv2(Acao acao) { this.acao = acao;}
	private Acao acao;
	public void trocarCanal() {}
	public void executarAcao(Acao acao) { this.acao = acao;}
}
class Tv3 implements Tv {
private Acao acao;
public Tv3(Acao acao) { this.acao = acao;}
	public void trocarCanal() {}
	public void executarAcao(Acao acao) { this.acao = acao;}
}

// Controles Remotos
class Controle1 implements Acao { public void onOff() {} }
class Controle2 implements Acao { public void onOff() {} }
class Controle3 implements Acao { public void onOff() {} }