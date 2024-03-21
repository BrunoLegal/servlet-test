package br.edu.imepac.daos;

import br.edu.imepac.entidades.Aluno;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class AlunoDao {

    private Connection connection;

    private void createConnection() throws SQLException{
        this.connection = DriverManager.getConnection("url");
    }
    private void destroyConnection() throws SQLException{
        this.connection.close();
    }
    public Aluno create(Aluno aluno) throws SQLException {
        return null;
    }

    public Aluno read(long id) throws SQLException{
        return null;
    }


    public List<Array> readAll() throws SQLException {
        return null;
    }


    public Aluno update(Aluno aluno) throws SQLException {
        return null;
    }


    public Aluno delete(long id) throws SQLException {
        return null;
    }
}
