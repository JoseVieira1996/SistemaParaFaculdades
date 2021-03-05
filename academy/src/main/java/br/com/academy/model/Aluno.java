package br.com.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.academy.enums.Curso;
import br.com.academy.enums.Status;
	
@Entity
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="nome")
	@Size(min = 2, max = 30, message = "o nome deve ter no minimo 2 letras e no máximo 20")
	private String nome;

	@Column(name="curso")
	@Enumerated(EnumType.STRING)
	@NotNull(message= "O campo não pode ser nulo")
	private Curso curso;
	
	@Column(name="status")
	@Enumerated(EnumType.STRING)
	@NotNull(message = "O campo status não pode ser nulo")
	private Status status;
	
	@Column(name="matricula")
	@NotNull(message = "Clique no botão gerar")
	private String matricula;
	
	@Column (name="turno")
	@Size(min=5)
	private String turno;


	
	////////////////////////////
	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

}
