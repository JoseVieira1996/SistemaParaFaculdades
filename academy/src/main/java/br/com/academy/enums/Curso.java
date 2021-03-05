package br.com.academy.enums;

public enum Curso {
	
	ADMINISTRACAO("ADMINISTRAÇÃO"),
	INFORMATICA("INFORMÁTICA"),
	CONTABILIDADE("CONTABILIDADE"),
	PROGRAMACAO("PROGRAMAÇÃO"),
	ENFERMAGEM("ENFERMAGEM");
	
	private String curso;
	
	private Curso(String curso) {
		this.curso =  curso;
	}

}
