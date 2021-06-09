package Atividade6;

public class Main {
	
	public static void main(String[] args) {

		Celular celular = new Celular ("Samsung");
	
		System.out.println("Aparelho: " + celular.getTipoAparelho());
		System.out.print("Status do aparelho: ");
		celular.carregar();
		System.out.println(celular.toString());
		System.out.println("Capacidade da bateria(mAh): " + celular.getMAH());
		System.out.print("Processador: ");
		System.out.println(celular.getModeloProcessador());
		System.out.println("Potencia do processador: " + celular.getPotencia());
		System.out.println("Tela: " + celular.getTipoTela());
	
}

}
