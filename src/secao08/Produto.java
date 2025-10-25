package secao08;

/*
 * CLASSE PRODUTO: Modelo de dados para produtos com atributos de nome, preço e desconto.
 */
public class Produto {

	// Atributos (Características)
	String nome;
	float preco;
	float desconto;
	
	// Construtor Vazio (Padrão)
	// Chamado em: new Produto()
	public Produto() {
		// Este construtor pode ser usado para inicialização manual dos atributos
	}
	
	// Construtor Parametrizado
	// Utiliza 'this' para atribuir valores aos atributos da classe com o mesmo nome do parâmetro
	public Produto(String nome, float preco, float desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	/*
	 * MÉTODO: Ação para aumentar o preço do produto
	 * O 'this.preco' garante que o atributo da classe está sendo modificado.
	 */
	public void aumentarPreco(float valor) {
		// Aumenta o preço usando o valor passado como parâmetro
		this.preco = this.preco + valor;
	}
	
	/*
	 * MÉTODO: Calcula o preço final com desconto
	 */
	public float precoComDesconto() {
		// Retorna o preço atualizado após aplicar o desconto
		return this.preco * (1.0f - this.desconto / 100.0f);
	}
}