package br.edu.ifpi.ads.pc.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteInsercao {
	public static void main(String[] args) throws SQLException {
		Connection c = DriverManager.getConnection("jdbc:hsqldb:hsql://"
				+ "localhost/loja-virtual","SA", "");
		Statement statement = c.createStatement();
		boolean resultado = statement.execute("insert into Produto (nome, descricao) values "
				+ "('Notebook','Notebook i5')");
		System.out.println(resultado);
		statement.close();
		c.close();
	}
}
