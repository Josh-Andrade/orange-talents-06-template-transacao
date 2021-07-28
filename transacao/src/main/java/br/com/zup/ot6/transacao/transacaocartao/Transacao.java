package br.com.zup.ot6.transacao.transacaocartao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import com.sun.istack.NotNull;

@Entity
public class Transacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String idTransacao;
	@Positive
	@NotNull
	private BigDecimal valor;
	@NotNull
	@Embedded
	private Estabelecimento estabelecimento;
	@NotNull
	@Embedded
	private Cartao cartao;
	@NotNull
	private LocalDateTime efetivadaEm;
	
	@Deprecated
	public Transacao() {
	}
	
	public Transacao(TransacaoRequest transacaoRequest) {
		this.idTransacao = transacaoRequest.getId();
		this.valor = transacaoRequest.getValor();
		this.estabelecimento = transacaoRequest.getEstabelecimento().toEntity();
		this.cartao = transacaoRequest.getCartao().toEntity();
		this.efetivadaEm = transacaoRequest.getEfetivadaEm();
	}
}
