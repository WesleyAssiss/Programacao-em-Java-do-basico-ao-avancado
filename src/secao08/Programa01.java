package secao08;

public class Programa01 {	
	public static void main(String[] args) {
		int numero = 4;
		
		//Declaraçaõ de um objeto
		Produto p0;
		
		
		//Delcarando e instanciação/iniciação do objeto
		Produto p1 = new  Produto();
		p1.nome ="Notebook";
		p1.preco = 2.365f;
		p1.desconto = 15.0f;
		
		
		
		
		
		System.out.println("===== Produtos =====");
		System.out.println(p1.nome);
		System.out.println("R$: " + p1.preco);
		System.out.println(p1.desconto + "%");
		
		
		Pessoa pessoal = new Pessoa();
		pessoal.nome = "Wesley Assis";
		pessoal.email = "wesley@live.com.br";
		pessoal.anoNascimento = 2010;
		
		System.out.println("===== Pessoas =====");
		System.out.println("Nome: " + pessoal.nome);
		System.out.println("E-mail: " + pessoal.email);
		System.out.println("Ano de nascimento: " + pessoal.anoNascimento);
		
	}

}
