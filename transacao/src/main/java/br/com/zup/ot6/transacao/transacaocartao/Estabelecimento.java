package br.com.zup.ot6.transacao.transacaocartao;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

@Embeddable
public class Estabelecimento {

	@NotBlank
	private String nome;
	@NotBlank
	private String cidade;
	@NotBlank
	private String endereco;
	
	@Deprecated
	public Estabelecimento() {
	}

	public Estabelecimento(EstabelecimentoRequest estabelecimentoRequest) {
		this.nome = estabelecimentoRequest.getNome();
		this.cidade = estabelecimentoRequest.getCidade();
		this.endereco = estabelecimentoRequest.getEndereco();
	}
	
}
