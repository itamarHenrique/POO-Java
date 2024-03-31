package produto;

public class Produto {
	
	private String nome;
	private String categoria;
	private double preço;
	
	public Produto() {
		
	}
	
	public Produto(String nome, String categoria, double preço) {
		this.nome = nome;
		this.categoria = categoria;
		this.preço = preço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	

}
