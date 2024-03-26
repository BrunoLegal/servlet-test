package br.edu.imepac.entidades;

public class Aluno {
    private long id;
    private String nome;
    private String matricula;

    public Aluno(long id, String nome, String matricula){
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
    }

    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public Aluno(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
