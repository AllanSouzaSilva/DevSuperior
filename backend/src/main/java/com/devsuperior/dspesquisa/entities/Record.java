package com.devsuperior.dspesquisa.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity // Com essa anotacion vou dizer que os objetos do tipo genero vão ser mapeados
		// pelo jpa, quando salvar um objeto do tipo Genre vou salvar um novo dados no
		// banco.
@Table(name = "tb_record")
public class Record implements Serializable {
	// Serializable : No java por padrão para que o objeto seja convertido em bytes
	// e trafegar pela rede.
	// SerialVersionUID: Numero de serie indica que é a primeira versão da classe
	// ID.
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer age;
	private Instant moment;
	

	@SuppressWarnings("rawtypes")
	@ManyToOne
	@JoinColumn(name = "game_id") // Isso faz com que os objetos se reaciona através da chave estrangeira
	private Game game;
	public Record() {
	}

	@SuppressWarnings("rawtypes")
	public Record(Long id, String name, Integer age, Instant moment, Game game) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.moment = moment;
		this.game = game;
	}

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	@SuppressWarnings("rawtypes")
	public Game getGame() {
		return game;
	}

	public void setGame(@SuppressWarnings("rawtypes") Game game) {
		this.game = game;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Record other = (Record) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
