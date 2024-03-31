package programa;

import produto.Produto;

public class TestProduct {

	public static void main(String[] args) {
		Produto liquidificador = new Produto();
		liquidificador.setNome("Liquidificador Mondial");
		liquidificador.setCategoria("Eletrodomésticos");
		liquidificador.setPreço(89.99);
	}

}
