package com.api.universidadecontroler.models;

import java.util.Date;
public class Aluno {

    private static int contador = 1;
    private int id;
    private String nome;
    private Date dataNascimento;

    private static int  gerarIdAluno(){
        return contador++;
    }

    public Aluno(String nome, Date dataNascimento) {
        this.id = gerarIdAluno();
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date data_nascimento) {
        this.dataNascimento = data_nascimento;
    }
}