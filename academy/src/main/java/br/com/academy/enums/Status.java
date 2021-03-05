package br.com.academy.enums;

public enum Status {
	ATIVO ("ATIVO"),
	INATIVO("INATIVO"),
	TRANCADO("TRANCADO"),
	CANCELADO("CANCELADO");
	
	
	private String status;
	
	private Status(String status) {
		this.status= status;
	}

}
