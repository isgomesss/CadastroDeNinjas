package dev.java10x.CadastroDeNinjas;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id // uma anotação para dizer que o atributo logo abaixo é ele
    @GeneratedValue(strategy = GenerationType.IDENTITY) // é uma anotação para passarmos uma estrategia de como vamos gerar o id
    Long id;
    String nome;
    int idade;
    String email;

    public NinjaModel(){
    }

    public NinjaModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNomee() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }
}
