package br.com.zup.ot6.transacao.consultartrasacoes;

public class EstabelecimentoResponse {

	private String nome;
	private String cidade;
	private String endereco;

	@Deprecated
	public EstabelecimentoResponse() {
	}

	public EstabelecimentoResponse(String nome, String cidade, String endereco) {
		this.nome = nome;
		this.cidade = cidade;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEndereco() {
		return endereco;
	}

}
