package br.edu.ifpi.ads.pc.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {
		Connection c = DriverManager.getConnection("jdbc:hsqldb:hsql://"
				+ "localhost/loja-virtual","SA", "");
		Statement statement = c.createStatement();
		boolean resultado = statement.execute("select * from Produto;");
		ResultSet resultSet = statement.getResultSet();
		while (resultSet.next()){
			int id = resultSet.getInt("id");
			String nome = resultSet.getString("nome");
			String descricao = resultSet.getString("descricao");
			System.out.println(id );
			System.out.println(nome);
			System.out.println(descricao);
		}
		resultSet.close();
		c.close();
	}
}
