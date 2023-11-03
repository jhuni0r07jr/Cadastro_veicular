package AtividadePoo;

public class carro {

	private String cor;
	private String placa;
	private String velocidadeMaxima;

	public carro(String cor, String placa, String velocidadeMaxima){
		this.cor = cor;
		this.placa = placa;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(String velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public String toString() {
		return "Cor: " + cor + "\nPlaca: " + placa + "\nVelocidade Maxima: " + velocidadeMaxima + "\n==============================\n";
	}
}