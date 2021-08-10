package br.com.generation.exercicio02;

public class ImprimeAnimal {

	public static void main(String[] args) {
		
		TestaAnimal ta = new TestaAnimal();
				
		System.out.println("====== Som dos Animais ======\n");
		System.out.println("====== Cachorro ======");
		ta.somAnimal(new Cachorro());
		
		System.out.println("\n====== Cavalo ======");
		ta.somAnimal(new Cavalo());

		System.out.println("\n====== Preguiça ======");
		ta.somAnimal(new Preguica());

	}
}
