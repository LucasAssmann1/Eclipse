package AtvBrinquedo;

public class TestaBrinquedo {
	public static void main(String[] args) {
		Brinquedo brinqEnd = new Brinquedo();
		
		brinqEnd.setNome("boneco do Naruto");
		brinqEnd.setFaixaEtaria("0 a 2");
		brinqEnd.setPreço(70f);
		
		brinqEnd.mostrar();
	}
}
