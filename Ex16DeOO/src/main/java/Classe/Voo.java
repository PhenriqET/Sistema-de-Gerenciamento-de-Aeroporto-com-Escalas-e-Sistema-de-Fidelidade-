package Classe;

import java.util.List;
import java.util.ArrayList;


public class Voo {
    private String numVoo;
    private String destino;
    private int capacidadeMax;
    private String estadoDoVoo;
    private GerenciadorPassageiro listapassageiros;
    private List<String> listaescalas;
    
    //Metodos
    
    public Voo() {
        this.numVoo = " ";
        this.destino = " ";
        this.capacidadeMax = 0;
        this.estadoDoVoo = " ";
        this.listapassageiros = new GerenciadorPassageiro();
        this.listaescalas = new ArrayList<>();
    }
    
    public Voo(String numVoo, String destino, int capacidadeMax, String estadoDoVoo, GerenciadorPassageiro listapassageiros, List<String> listaescalas) {
        this.numVoo = numVoo;
        this.destino = destino;
        this.capacidadeMax = capacidadeMax;
        this.estadoDoVoo = estadoDoVoo;
        this.listapassageiros = listapassageiros;
        this.listaescalas = listaescalas;
    }
    
    public void adicionarPassageiros(Passageiro passageiro){
        listapassageiros.addPassageiro(passageiro);
    }
    public void removerPassageiros(String nome){
        listapassageiros.removePassageiro(nome);
    }
    
    
    public void removerEscalas(String escala){
        //Cidades ou aeroportos intermediários
        for(String l1 : listaescalas){
            if(l1.equals(escala)){
                listaescalas.remove(l1);
            }
        }
        
    }
    public void adicionarEscala(String l1){
        listaescalas.add(l1);
    }
    
    
    public void alteraEstadoVoo(String estadoVoo){
        this.estadoDoVoo = estadoVoo;
    }
    
    
    public boolean verificaBaixaCapacidade(){
        Voo v1 = new Voo();
        if(v1.listapassageiros.getQuant() < (this.capacidadeMax/2)){
            System.out.println("Voo com Baixa capacidade!");
            return true;
        }else{
            System.out.println("Voo com capacidade normal!");
            return false;
        }
    }

    public String getNumVoo() {
        return numVoo;
    }

    public GerenciadorPassageiro getListapassageiros() {
        return listapassageiros;
    }
    
    

    @Override
    public String toString() {
        return "Voo { " + "Numero de Voo: " + this.numVoo 
                + ", Destino: " + this.destino 
                + ", Capacidade Maxima: " + this.capacidadeMax 
                + ", Estado Do Voo:" + this.estadoDoVoo 
                + ", Lista de Passageiros: " + this.listapassageiros 
                + ", Lista de Escalas: " + this.listaescalas + '}';
    }
    
    
    
}
