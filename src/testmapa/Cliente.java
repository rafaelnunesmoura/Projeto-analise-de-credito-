/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmapa;

/**
 *
 * @author rafael
 */
public class Cliente {
    private String nome;
    private double idade;
    private double renda;
    private double score;

    // Construtor
 
    public Cliente(String nome, double idade, double renda, double score) {
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
        this.score = score;
    }
    
    // Getters e Setters
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
