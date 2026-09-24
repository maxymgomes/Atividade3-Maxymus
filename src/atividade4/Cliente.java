package atividade4;

public class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email){
        validarEmail(email);
        this.nome = nome;
        this.email = email;
    }

    public void validarEmail(String email){
        if (email.contains("@") == false){
            throw new RuntimeException(" ERRO : Email não existente");
        }
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setNome(String agencia) {
        this.nome = nome;
    }

    public void setEmail(String agencia) {
        this.email = email;
    }
}
