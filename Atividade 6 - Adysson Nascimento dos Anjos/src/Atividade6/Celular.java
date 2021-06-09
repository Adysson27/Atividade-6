package Atividade6;

public class Celular implements Processador, Aparelho, Bateria {
	
	private boolean carregado;
	private int porcentagem;
	private String marca; 
	
	public Celular(String marca) {
		this.setCarregado(false);
		this.setMarca(marca);
		this.setPorcentagem(0);
	}
	
	@Override
	public int getMAH() {
		return 4000;
	}

	@Override
	public void carregar() {
		System.out.println("Celular carregado!");
		this.setCarregado(true);
		this.setPorcentagem(85);
	}

	@Override
	public int porcentagem() {
		return this.getPorcentagem();
	}

	@Override
	public String getTipoTela() {
		return "Led";
	}

	@Override
	public String getTipoAparelho() {
		return "Celular - s20";
	}

	@Override
	public String getModeloProcessador() {
		return "Exynos 990";
	}

	@Override
	public String getPotencia() {
		return "2,7 GHz";
	}

	public boolean getCarregado() {
		return carregado;
	}

	public void setCarregado(boolean carregado) {
		this.carregado = carregado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}



	public int getPorcentagem() {
		return porcentagem;
	}



	public void setPorcentagem(int porcentagem) {
		this.porcentagem = porcentagem;
	}


	@Override
	public String toString() {
		return "Celular: carregado = " + carregado + ", Porcentagem = " + porcentagem + ", Marca = " + marca
				+ "";
	}

}
