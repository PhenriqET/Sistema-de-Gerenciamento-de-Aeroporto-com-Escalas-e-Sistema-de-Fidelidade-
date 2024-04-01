package Classe;


public class Passageiro {
    private String nome;
    private String cpf;
    private SistemaFidelidade sistFidelidade;
    
    //Metodos
    
    public Passageiro(){
        this.nome = " ";
        this.cpf = " ";
        this.sistFidelidade = new SistemaFidelidade();
    }
    
    public Passageiro(String nome, String cpf, SistemaFidelidade sistFidelidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.sistFidelidade = sistFidelidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public SistemaFidelidade getSistFidelidade() {
        return sistFidelidade;
    }
    public void setSistFidelidade(SistemaFidelidade sistFidelidade) {
        this.sistFidelidade = sistFidelidade;
    }
    
    @Override
    public String toString(){
        return "Pessoa { Nome: " + this.nome
               + ", CPF: " + this.cpf
               + ", Pontos Fidelidades: " + this.sistFidelidade.getSaldoPontos() + "}";
    }
    
}
