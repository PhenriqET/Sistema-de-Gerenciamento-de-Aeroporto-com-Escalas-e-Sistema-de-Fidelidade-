package Classe;
import java.util.List;
import java.util.ArrayList;

public class Aeroporto {
    private String nome;
    private String localizacao;
    private List<Voo> listavoos;
    
    //Metodos
    
    public Aeroporto() {
        this.nome = " ";
        this.localizacao = " ";
        this.listavoos = new ArrayList<>();
    }
    
    public Aeroporto(String nome, String localizacao, List<Voo> listavoos) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.listavoos = listavoos;
    }

    public void addVoo (Voo passageiro) {
        listavoos.add(passageiro);
    }
    
    public boolean removeVoo(String numvoo){
        for(Voo p1 : listavoos){
            if(p1.getNumVoo().equals(numvoo)){
                listavoos.remove(p1);
                System.out.println("Removido com sucesso!!");
                return true;
            }
        }
        System.out.println("Nao Encontrado!!");
        return false;
    }
    
    public Voo pesquisarVoo(String numvoo){
        for(Voo p1 : listavoos){
            if(p1.getNumVoo().equals(numvoo)){
                return p1;
            }
        }
        System.out.println("Voo nao encontrado!");
        return null;
    }
    
    public void printVoo(){
        String write;
        for(Voo p1 : listavoos){
            write = p1.toString();
            System.out.println(write);
        }
    }
    
    public void voosComPrejuizo(){
        List<Voo> prejuizos = new ArrayList<>();
        //Para encontrar os que darao prejuizos
        for(Voo v1 : listavoos){
            if(v1.verificaBaixaCapacidade() == true){
                prejuizos.add(v1);
            }
        }
        //Para imprimir os voos que darao prejuizo
        if(prejuizos.size() >= 1){
            String write;
            System.out.println("Voos com prejuizo");
            for(Voo v2 : prejuizos){
                write = v2.toString();
                System.out.println(write);
            }
        }
    }
    
    public void iniciarVoo(String numvoo){
        int aux = 0;
        for(Voo v1 : listavoos){
            if(v1.getNumVoo().equals(numvoo)){
                System.out.println("Voo Encontrado");
                aux++;
            }
        }
        if(aux == 0){
            System.out.println("Voo nao encontrado!");
        }
    }
    
}
