package br.com.projformulario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServFormulario")
public class ServFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	int tipoPessoa; //1 fisica - 2 juridica
	String cnpjCpf;
	String nome;
	String dataNasc;
	String end;
	String comp;
	String cidade;
	String estado;
	String cep;
	String email;
	String confEmail;
	String senha;
	
	
    public ServFormulario(int tipoPessoa, String cnpjCpf, String nome, String dataNasc, String end, String comp,
			String cidade, String estado, String cep, String email, String confEmail, String senha) {
		super();
		this.tipoPessoa = tipoPessoa;
		this.cnpjCpf = cnpjCpf;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.end = end;
		this.comp = comp;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.email = email;
		this.confEmail = confEmail;
		this.senha = senha;
	}

	public ServFormulario() {
        super();
        
    }
	
	public int getTipoPessoa() {
		return tipoPessoa;
	}


	public void setTipoPessoa(int tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}


	public String getCnpjCpf() {
		return cnpjCpf;
	}


	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}


	public String getEnd() {
		return end;
	}


	public void setEnd(String end) {
		this.end = end;
	}


	public String getComp() {
		return comp;
	}


	public void setComp(String comp) {
		this.comp = comp;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getConfEmail() {
		return confEmail;
	}


	public void setConfEmail(String confEmail) {
		this.confEmail = confEmail;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
