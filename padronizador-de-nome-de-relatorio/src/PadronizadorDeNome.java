import java.io.File;

public class PadronizadorDeNome {

	public void executa(String[] arquivos) {

		for (String arquivo : arquivos) {

			String nome = verificaNomeRelatorio(arquivo);
			String numero = verificaNumeroFilial(arquivo);
			String extensao = verificaExtensao(arquivo);

			alteraNomeDeArquivo(arquivo, nome, numero, extensao);
		}

	}

	private void alteraNomeDeArquivo(String nomeOriginal, String nome, String numero, String extensao) {

		String novoNomeArquivo = "c:\\home\\" + nome + ".f" + numero + extensao;

		File file = new File("c:\\home\\" + nomeOriginal);

		file.renameTo(new File(novoNomeArquivo));

	}

	private String verificaExtensao(String arquivo) {
		return arquivo.substring(arquivo.length() - 4, arquivo.length());
	}

	private String verificaNumeroFilial(String arquivo) {

		if (arquivo.contains("f")) {
			return arquivo.substring(arquivo.indexOf("f") + 1, arquivo.indexOf("f") + 4);
		} else {
			return arquivo.substring(arquivo.indexOf(".") + 1, arquivo.indexOf(".") + 4);
		}

	}

	private String verificaNomeRelatorio(String arquivo) {
		return arquivo.substring(0, arquivo.indexOf("."));
	}

}
