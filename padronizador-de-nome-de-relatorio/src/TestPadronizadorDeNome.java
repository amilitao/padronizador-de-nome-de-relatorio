import java.io.File;

public class TestPadronizadorDeNome {

	public static void main(String[] args) {

		
		PadronizadorDeNome padronizador = new PadronizadorDeNome();
		
		File arquivos = new File("c:\\home\\");
		
		padronizador.executa(arquivos.list());
		
	}

}
