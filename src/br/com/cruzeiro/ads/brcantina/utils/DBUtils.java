package br.com.cruzeiro.ads.brcantina.utils;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {

    private static final String HOST = "localhost";
    private static final String PORT = "3306";
    private static final String DATABASE = "brcantina";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    
    public static Connection getConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String stringConexao = new StringBuilder()
                .append("jdbc:mysql://")
                .append(HOST)
                .append(":")
                .append(PORT)
                .append("/")
                .append(DATABASE)
                .append("?user=")
                .append(USER)
                .append("&password=")
                .append(PASSWORD).toString();
        Connection connection = DriverManager.getConnection(stringConexao);
        return connection;

    }

    public static ResultSet getResultSet(Connection connection, String sql) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(sql);
    }

    public static PreparedStatement getPreparedStatement(Connection connection, String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }
}