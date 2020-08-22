import java.io.File;

public class PadronizadorDeNome {

	private final String diretorioBase = "c:\\home\\usuario\\projetos\\relatoriosdiarios\\recebidos\\";

	public void executa() {

		File diretorio = new File(diretorioBase);

		for (String arquivo : diretorio.list()) {

			String nome = extraiNomeRelatorio(arquivo);
			String numero = extraiNumeroFilial(arquivo);
			String extensao = extraiExtensao(arquivo);

			alteraNomeDeArquivo(arquivo, nome, numero, extensao);
		}

	}

	private void alteraNomeDeArquivo(String nomeOriginal, String nome, String numero, String extensao) {

		String novoNomeArquivo = diretorioBase + nome + ".f" + numero + extensao;

		File file = new File(diretorioBase + nomeOriginal);

		file.renameTo(new File(novoNomeArquivo));

	}

	private String extraiExtensao(String arquivo) {

		String ext = arquivo.substring(arquivo.length() - 3, arquivo.length());

		if (ext.matches("[a-z]*")) {
			return "." + ext;
		} else {
			return "";
		}

	}

	private String extraiNumeroFilial(String arquivo) {

		if (arquivo.contains("f")) {
			return arquivo.substring(arquivo.indexOf("f") + 1, arquivo.indexOf("f") + 4);
		} else {
			return arquivo.substring(arquivo.indexOf(".") + 1, arquivo.indexOf(".") + 4);
		}

	}

	private String extraiNomeRelatorio(String arquivo) {
		return arquivo.substring(0, arquivo.indexOf("."));
	}

}
