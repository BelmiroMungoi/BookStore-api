package com.bbm.bookstore.model;

import java.util.Objects;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

public class Distrito {

	@Id
	private Long id;

	@Size(max = 60)
	private String nome;

	@ManyToOne
	private Provincia provincia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Distrito other = (Distrito) obj;
		return Objects.equals(id, other.id);
	}

}
