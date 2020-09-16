package com.devsuperior.dspesquisa.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity //Com essa anotacion vou dizer que os objetos do tipo genero vão ser mapeados pelo jpa, quando salvar um objeto do tipo Genre vou salvar um novo dados no banco.
@Table(name = "tb_genre")
public class Genre implements Serializable{
	//Serializable : No java por padrão para que o objeto seja convertido em bytes e trafegar pela rede.
	//SerialVersionUID: Numero de serie indica que é a primeira versão da classe ID.
	private static final long serialVersionUID = 1L;
	
	@Id //Essa notação faz com o que o atributo Id seja incremental.
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	
	//Associação para uma lista do tipo games, e o nome dessa lista será Game.
	@OneToMany(mappedBy = "genre")
	private List<Game> games = new ArrayList<>();
	
	
	public Genre() {
	}

	public Genre(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	// Get Set é expor para outras classes os atributos da classe
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	
	public List<Game> getGames() {
		return games;
	}
	
	/*HashCodee Equals: Hash para comparar um se os objetos são iguais ou diferentes e o Equals épara esclarecer a certeza de 
	 * igualdade ou difença entre eles*/
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genre other = (Genre) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	//Serializeble
	

}
