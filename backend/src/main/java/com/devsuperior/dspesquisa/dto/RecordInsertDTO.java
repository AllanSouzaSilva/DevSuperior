package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;

public class RecordInsertDTO implements Serializable {
	// Serializable : No java por padrão para que o objeto seja convertido em bytes
	// e trafegar pela rede.
	// SerialVersionUID: Numero de serie indica que é a primeira versão da classe
	// ID.
	private static final long serialVersionUID = 1L;

	private String name;
	private Integer age;
	private Long gameId;

	public RecordInsertDTO() {
	}

	public RecordInsertDTO(String name, Integer age, Long gameId) {
		super();
		this.name = name;
		this.age = age;
		this.gameId = gameId;
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

	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}

}
