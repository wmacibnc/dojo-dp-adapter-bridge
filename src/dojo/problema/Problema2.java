package dojo.problema;
// Controles Remotos
class Controle1 implements Acao { public void onOff() {new Tv1().onOff();} }
class Controle2 implements Acao { public void onOff() {new Tv2().onfOff();} }
public class Problema2 {
	public static void main(String[] args) {
		// Somente o controle 1 pode executar ações na TV 1
		new Controle1().onOff();
		// Somente o controle 2 pode executar ações na TV 2
		new Controle2().onOff();		
	}
}
interface Acao { void onOff(); }
interface Tv { 
	void trocarCanal(); 
	void executarAcao(Acao acao); 
}
// Aparelhos de TV´s
class Tv1{
	public void trocarCanal() {}
	public void onOff() {}
}
class Tv2{
	public void trocarCanal() {}
	public void onfOff() {}
}