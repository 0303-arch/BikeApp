package br.com.etecia.myapp;

public class PFisica extends Pessoa {
    int cpf;

    Pessoa p = new Pessoa();
    public void executaPessoa(){
        p.setNome("Etecia");
        String nome= p.getNome();
    }
}
