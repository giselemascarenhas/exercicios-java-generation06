package br.com.generation.exercicio01;

public class TestaInterfaceAnimal {

	public static void main(String[] args) {

		Cachorro meuCachorro = new Cachorro();
		Cavalo meuCavalo = new Cavalo();
		Preguica minhaPreguica = new Preguica();
		
		System.out.println("====== Cachorro ======");
		meuCachorro.Nome();
		meuCachorro.Idade();
		meuCachorro.somAnimal();
		meuCachorro.Correr();
		meuCachorro.Subir();
		
		System.out.println("\n====== Cavalo ======");
		meuCavalo.Nome();
		meuCavalo.Idade();
		meuCavalo.somAnimal();
		meuCavalo.Correr();
		meuCavalo.Subir();

		System.out.println("\n====== Preguiça ======");
		minhaPreguica.Nome();
		minhaPreguica.Idade();
		minhaPreguica.somAnimal();
		minhaPreguica.Correr();
		minhaPreguica.Subir();
	}

}
