package com.marcossousa.domain.enums;

public enum EstadoPagamento {

	PENDENTE(1, "Pendente"), QUITADO(2, "Quitado"),CANCELADO(3,"Cancelado");

	private int code;
	private String descricao;

	private EstadoPagamento(int code, String descricao) {
		this.code = code;
		this.descricao = descricao;
	}

	public int getCod() {
		return code;
	}

	public String getDescricao() {
		return descricao;
	}

	public static EstadoPagamento toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (EstadoPagamento x : EstadoPagamento.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id Invalido: " + cod);
	}

}
