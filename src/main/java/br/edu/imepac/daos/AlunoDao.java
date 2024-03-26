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
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost/alunos?"+"user=root&password=1234");
    }
    private void destroyConnection() throws SQLException{
        this.connection.close();
    }
    public void create(Aluno aluno) throws SQLException {

    }

    public Aluno read(long id) throws SQLException{
        return null;
    }


    public List<Array> readAll() throws SQLException {
        return null;
    }


    public void update(Aluno aluno) throws SQLException {

    }


    public void delete(long id) throws SQLException {

    }
}
