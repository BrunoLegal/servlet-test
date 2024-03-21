package br.edu.imepac.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AlunoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        try {
            super.doGet(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        try {
            super.doPost(request,response);
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
