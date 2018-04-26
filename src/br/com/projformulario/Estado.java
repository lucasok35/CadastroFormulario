package br.com.projformulario;

public class Estado {
	
	private int id;
	private String descricao;
	
	
	public Estado(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public Estado() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
