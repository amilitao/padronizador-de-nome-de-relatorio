public class PadronizadorDeNomeDeArquivo {

	public String executa(String nomeArquivo) {

		String nomeRelatorio = extraiNomeRelatorio(nomeArquivo);
		String numero = extraiNumeroFilial(nomeArquivo);
		String extensao = extraiExtensao(nomeArquivo);

		return alteraNomeDeArquivo(nomeArquivo, nomeRelatorio, numero, extensao);
	}

	private String alteraNomeDeArquivo(String nomeOriginal, String nome, String numero, String extensao) {
		return nome + ".f" + numero + extensao;
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
