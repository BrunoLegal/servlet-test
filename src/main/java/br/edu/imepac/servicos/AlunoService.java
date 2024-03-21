package br.edu.imepac.servicos;

import br.edu.imepac.daos.AlunoDao;
import br.edu.imepac.entidades.Aluno;

import java.sql.Array;
import java.sql.SQLException;
import java.util.List;

public class AlunoService {

    public final AlunoDao alunoDao;

    public AlunoService(){
        this.alunoDao = new AlunoDao();
    }

    public Aluno cadastrar(Aluno novoAluno) throws SQLException {
        return this.alunoDao.create(novoAluno);
    }

    public Aluno ler(long id) throws SQLException{
        return this.alunoDao.read(id);
    }

    public List<Array> lerTodos() throws SQLException {
        return this.alunoDao.readAll();
    }

    public Aluno deletar(long id) throws SQLException {
        return this.alunoDao.delete(id);
    }

    public Aluno atualizar(Aluno alunoAtualizado) throws SQLException{
        return this.alunoDao.update(alunoAtualizado);
    }
}
