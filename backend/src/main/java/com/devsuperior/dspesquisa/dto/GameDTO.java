package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;

import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.entities.enums.Platform;

public class GameDTO implements Serializable{
	//Serializable : No java por padrão para que o objeto seja convertido em bytes e trafegar pela rede.
	//SerialVersionUID: Numero de serie indica que é a primeira versão da classe ID. 
	private static final long serialVersionUID = 1L;
	private Long id;
	private String title;
	private Platform platform;
	
	public GameDTO() {}
	
	public GameDTO(Game<Platform> entity) {
		id = entity.getId();
		title = entity.getTitle();
		platform = entity.getPlatform();
		
	}
	
	public GameDTO(Long id, String title, Platform platform) {
		super();
		this.id = id;
		this.title = title;
		this.platform = platform;
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
	
}
