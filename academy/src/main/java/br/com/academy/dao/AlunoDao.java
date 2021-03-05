package br.com.academy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.academy.model.Aluno;

public interface AlunoDao extends JpaRepository<Aluno, Integer> {

	@Query("select j from Aluno j where j.status= 'ATIVO'")
	public List <Aluno> findByStatusAtivos();
	
	public List <Aluno> findByNomeContainingIgnoreCase (String nome);
	
}
