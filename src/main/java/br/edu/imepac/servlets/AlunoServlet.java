package br.edu.imepac.servlets;

import br.edu.imepac.entidades.Aluno;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.google.gson.Gson;

public class AlunoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        try {
            super.doGet(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        try {
            Aluno aluno = new Aluno("Bruno", "34234");
            Gson gson = new Gson();

            String alunoGson = gson.toJson(aluno);



        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException{
        try {
            super.doDelete(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }
}
