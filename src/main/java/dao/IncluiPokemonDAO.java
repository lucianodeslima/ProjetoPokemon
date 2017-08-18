package dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.PreparedStatement;

import controle.Conexao;
import modelo.Pokemon;

public class IncluiPokemonDAO {
	public static void incluir(Pokemon poke) throws SQLException {
		Connection con = Conexao.getConexao();
		String sql = "INSERT INTO equipe (id_equipe,poke_nome, poke_habil)VALUES (?,?,?)";
		PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);

		//stmt.setInt(1, equipe.getId());
		stmt.setInt(1, poke.getId_usuario());
		stmt.setString(2, poke.getNome_pokemon());
		
		stmt.executeUpdate();
		con.commit();
	}
}
