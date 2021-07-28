package br.com.zup.ot6.transacao.transacaocartao;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

@Embeddable
public class Cartao {
	
	@NotBlank
	private String numeroCartao;
	@NotBlank
	private String email;
	
	@Deprecated
	public Cartao() {
	}

	public Cartao(CartaoRequest cartaoRequest) {
		this.numeroCartao = cartaoRequest.getId();
		this.email = cartaoRequest.getEmail();
	}

}
