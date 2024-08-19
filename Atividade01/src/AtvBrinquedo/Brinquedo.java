package AtvBrinquedo;

public class Brinquedo {
	private String nome, faixaEtaria;
	private float preco;

	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getFaixaEtaria() {
		return faixaEtaria;
	}
	
	public void setFaixaEtaria(String faixaEtaria) {
		if (faixaEtaria.equals("0 a 2") || faixaEtaria.equals("3 a 5") || faixaEtaria.equals("6 a 10") || faixaEtaria.equals("Acima de 10")) {
			this.faixaEtaria = faixaEtaria;
		} else {
			this.faixaEtaria = "Faixa etária inválida";
		}
	}
	
	
	public float getPreço() {
		return preco;
	}
	
	public void setPreço(float preco) {
		this.preco = preco;
	}
	
	
	public void mostrar() {
		System.out.println("Nome do brinquedo: " + getNome() + "\nFaixa Etária: " + getFaixaEtaria() + " \npreço: R$" + getPreço());

	}
	
}
 