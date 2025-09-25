class InformaRegras{

	@Deprecated
	public void mostrarRegrasParaAposentadoria(){
		System.out.println("Regras para aposentadoria");
	}

	public void mostrarNovasRegrasParaAposentadoria(){
		System.out.println("NOVAS Regras para aposentadoria");
	}

	public void chamarMetodoObsoletoNaMesmaClasse(){
		mostrarRegrasParaAposentadoria();
	}

}


public class Previdencia {

	// Remover os warnings do terminal - recomendável resolver o problema	
	// @SuppressWarnings("deprecation")
	public static void main(String[] args) {
		InformaRegras regras = new InformaRegras();

		// Uso do método obsoleto(Deprecated)
		//regras.mostrarRegrasParaAposentadoria();

		// Uso do novo método
		//regras.mostrarNovasRegrasParaAposentadoria();

		regras.chamarMetodoObsoletoNaMesmaClasse();

 	}
}