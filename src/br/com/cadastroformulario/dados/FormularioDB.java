package br.com.cadastroformulario.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.cadastroformulario.util.Conexao;
import br.com.projformulario.Formulario;

public class FormularioDB {
	public class CadastroDB {

		private Connection connection;
		private PreparedStatement ps;
		private ResultSet rs;
		
		public CadastroDB() {
			connection = Conexao.getConnection();
		}
		
		public boolean inserir(Formulario formulario) throws SQLException {
			
			try {
				PreparedStatement stmt = this.connection
						.prepareStatement("INSERT INTO FORMULARIO (tipoPessoa, cnpjCpf, dataNasc, end, comp, cidade, estado, cep, email, confEmail, senha) values (?, ?)");
				
				stmt.setInt(1, formulario.getTipoPessoa());
				stmt.setString(2, formulario.getCnpjCpf());
				stmt.setString(3, formulario.getDataNasc());
				stmt.setString(4, formulario.getEnd());
				stmt.setString(5, formulario.getComp());
				stmt.setString(6, formulario.getCidade());
				stmt.setInt(7, formulario.getEstado().getId());
				stmt.setString(8, formulario.getCep());
				stmt.setString(9, formulario.getEmail());
				stmt.setString(10, formulario.getConfEmail());
				stmt.setString(11, formulario.getSenha());
				
				
				stmt.execute();
				return true;
				
				
			}catch(SQLException e) {
				System.err.println(e.toString());
			}finally {
				
				connection.close();
			}
			return false;
			
			
		}
		
		public boolean alterar(Formulario formulario) throws SQLException{
			
			try {
				
				PreparedStatement stmt = this.connection
						.prepareStatement("UPDATE FORMULARIO SET tipoPessoa = ?, cnpjCpf = ?, "
								+ "nome = ?, dataNasc = ?, end = ?, comp = ?, cidade = ? WHERE id ?");
				
				stmt.setString(1, cadastro.getNome());

				
				stmt.execute();
				return true;
				
			}catch (SQLException e) {
				
				System.err.println(e.toString());
			}finally {
				
				connection.close();
			}
			return false;
		}
		
}
