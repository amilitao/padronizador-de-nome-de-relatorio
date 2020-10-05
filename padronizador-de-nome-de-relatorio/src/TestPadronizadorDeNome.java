import java.io.File;

public class TestPadronizadorDeNome {

	public static void main(String[] args) {
		
		PadronizadorDeNomeDeArquivo padronizador = new PadronizadorDeNomeDeArquivo();			
		File base = new File("c:\\home\\usuario\\projetos\\relatoriosdiarios\\recebidos\\");		

		for(File arquivo : base.listFiles()) {
			File novoArquivo = new File(base + File.separator + padronizador.executa(arquivo.getName()));
			arquivo.renameTo(novoArquivo);			
		}		
		
	}

}
