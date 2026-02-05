package kz.aitu.OOP2.dao;

import kz.aitu.OOP2.db.DatabaseConnection;
import kz.aitu.OOP2.model.Player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAO {

    public void addPlayer(Player player) throws Exception {
        String sql = "INSERT INTO players VALUES (?, ?, ?)";
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, player.getId());
        ps.setString(2, player.getName());
        ps.setInt(3, player.getAge());

        ps.executeUpdate();
        conn.close();
    }

    public List<Player> getAllPlayers() throws Exception {
        List<Player> players = new ArrayList<>();
        String sql = "SELECT * FROM players";

        Connection conn = DatabaseConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            players.add(new Player(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("age")
            ));
        }
        conn.close();
        return players;
    }

    public void deletePlayer(int id) throws Exception {
        String sql = "DELETE FROM players WHERE id=?";
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        conn.close();
    }
    public void testConnection() throws Exception {
        Connection conn = DatabaseConnection.getConnection();
        System.out.println("CONNECTED TO DATABASE");
        conn.close();
    }

}