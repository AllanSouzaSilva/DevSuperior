package com.devsuperior.dspesquisa.entities;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.devsuperior.dspesquisa.entities.enums.Platform;


@Entity //Com essa anotacion vou dizer que os objetos do tipo genero vão ser mapeados pelo jpa, quando salvar um objeto do tipo Genre vou salvar um novo dados no banco.
@Table(name = "tb_game")
public class Game<platform> implements Serializable {
	// Serializable : No java por padrão para que o objeto seja convertido em bytes
	// e trafegar pela rede.
	// SerialVersionUID: Numero de serie indica que é a primeira versão da classe
	// ID.
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private Platform platform;
	
	
	@ManyToOne
	@JoinColumn(name = "genre_id") /*Isso faz com que os objetos se reaciona através da chave estrangeira
	Associação com o genero*/
	private Genre genre;
	
		
	
	//Associação com varios record por isso a implementação em lista Record
	
	@ManyToMany(mappedBy = "game")
	private List<Record> records = new ArrayList<>();
	
	public Game(){}

	public Game(Long id, String title, Platform platform, Genre genre) {
		super();
		this.id = id;
		this.title = title;
		this.platform = platform;
		this.genre = genre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	

	public void getRecords(List<Record> records) {
		this.records = records;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public List<Record> getRecords() {
		return records;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		@SuppressWarnings("rawtypes")
		Game other = (Game) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
