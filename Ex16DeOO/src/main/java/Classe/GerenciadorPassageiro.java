package Classe;

import java.util.ArrayList;
import java.util.List;


public class GerenciadorPassageiro {
    private List<Passageiro> passageiros;
    //A quantidade de passageiros no gerenciados
    private int quant;
    
    //Metodos
    
    public GerenciadorPassageiro() {
        this.passageiros = new ArrayList<>();
        this.quant = 0;
    }
    
    public void addPassageiro (Passageiro passageiro) {
        passageiros.add(passageiro);
        quant++;
    }

    public int getQuant() {
        return quant;
    }
    
    
    
    public boolean removePassageiro(String nome){
        for(Passageiro p1 : passageiros){
            if(p1.getNome().equals(nome)){
                passageiros.remove(p1);
                quant--;
                System.out.println("Removido com sucesso!!");
                return true;
            }
        }
        System.out.println("Nao Encontrado!!");
        return false;
    }
    
    public Passageiro pesquisarPassageiro(String nome){
        for(Passageiro p1 : passageiros){
            if(p1.getNome().equals(nome)){
                return p1;
            }
        }
        System.out.println("Passageiro nao encontrado!");
        return null;
    }
    
    public void printPassageiro(){
        String write;
        for(Passageiro p1 : passageiros){
            write = p1.toString();
            System.out.println(write);
        }
    }
}
