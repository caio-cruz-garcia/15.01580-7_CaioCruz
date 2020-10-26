package com.company.model;

import com.company.interfaces.Validator;

import java.util.Objects;

public class Vendedor implements Validator {
    private String id;
    private String nome;
    private String password;

    public Vendedor(String id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean validate(String pass) {
        return hashCode() == Objects.hash(pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.password);
    }

    public String getSenhaHash() {
        return "" + hashCode();
    }
}
