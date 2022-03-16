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
public class Consulta {
     private double     idade;
     private double     renda;
     private double     score;
     private double     valor;
     private double     credito;
     private String       resultado = "seu credito foi Aprovado ja está disponivel." ;

    public Consulta(double idade, double renda, double score, double valor, double credito) {
        this.idade = idade;
        this.renda = renda;
        this.score = score;
        this.valor = valor;
        this.credito = credito;
    }
    
    
    
    public double avaliacao(double idade, double score){
        
        if(idade < 18 ){
            
            this.valor = 0;
            
        } else  if (score <= 100){
            
            this.valor = 0;
            
        } else if ((idade >= 18 && idade <= 25) && score > 300){
            
            this.valor = 1;
        } else if (idade > 25){
            
            this.valor = 1;
        }
        
        return this.valor;
    }

    public String aprovado(double renda, double valor, double score){
        
        if ( valor == 1){
            
            if(score >= 100 && score <= 500){
                
                this.resultado = "seu credito foi Aprovado ja está disponivel." ;
                
            } else if (score > 500 && score < 1000){
                
                this.resultado = "seu credito foi Aprovado ja está disponivel." ;
            }       
                
        }if (this.valor == 0){
            
            this.resultado = "Desculpe não podemos liberar o credito nesse momento.";
        }
        
        return this.resultado;
        
    }
    
    
    public double limiteDeCredito(double score , double renda){
        
         if(score >= 100 && score <= 500){
             renda = renda * 6;
             
         } else if (score > 500 && score < 1000){
             
             renda = renda * 12;
         }
         
         this.credito = renda;
        return this.credito;
    }

// Getters and setters
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
