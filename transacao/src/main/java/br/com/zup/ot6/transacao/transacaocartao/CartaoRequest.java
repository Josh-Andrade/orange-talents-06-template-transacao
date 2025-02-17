package br.com.zup.ot6.transacao.transacaocartao;

public class CartaoRequest {

	private String id;
	private String email;

	@Deprecated
	public CartaoRequest() {
	}
	
	public CartaoRequest(String id, String email) {
		this.id = id;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public Cartao toEntity() {
		return new Cartao(this);
	}

}
