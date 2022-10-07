package br.com.projeto1;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloWord")
public class HelloWorld {

	private String nome;
	private String sobrenome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
