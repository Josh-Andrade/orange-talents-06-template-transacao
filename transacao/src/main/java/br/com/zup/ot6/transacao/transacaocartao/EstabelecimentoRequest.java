package br.com.zup.ot6.transacao.transacaocartao;

public class EstabelecimentoRequest {
	
	private String nome;
	private String cidade;
	private String endereco;
	
	@Deprecated
	public EstabelecimentoRequest() {
	}
	
	public EstabelecimentoRequest(String nome, String cidade, String endereco) {
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

	public Estabelecimento toEntity() {
		return new Estabelecimento(this);
	}
	
	
}
