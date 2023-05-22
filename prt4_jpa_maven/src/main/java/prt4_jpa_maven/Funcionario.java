package prt4_jpa_maven;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Funcionario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	
	@Column
	String nome;
	@Column
	String funcao;
	
	//
	
	public Funcionario(Integer id, String nome, String funcao) {
		this.id = id;
		this.nome = nome;
		this.funcao = funcao;
	}
	
	// get set 
	
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
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	//
	
	/*
	 * @Override
	public String toString() {
		return "Cliente [Cpf: " + cpf + 
				", Nome: " + nome + 
				", Endereço: " + endereco + 
				", Genero" + genero + 
				", Dt_Nasc: " + dt_nasc + "]";
	}
	 */
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
