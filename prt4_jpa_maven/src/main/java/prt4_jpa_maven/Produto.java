package prt4_jpa_maven;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	
	@Column
	String descricao;
	@Column
	String setor;
	
	//
	
	public Produto(Integer id, String descricao, String setor) {
		this.id = id;
		this.descricao = descricao;
		this.setor = setor;
	}
	
	// get set 
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	//
	
	@Override
	public String toString() {
		return "Produto [id: " + id + 
				", Descrição: " + descricao + 
				", Setor: " + setor + "]";
	}
}
