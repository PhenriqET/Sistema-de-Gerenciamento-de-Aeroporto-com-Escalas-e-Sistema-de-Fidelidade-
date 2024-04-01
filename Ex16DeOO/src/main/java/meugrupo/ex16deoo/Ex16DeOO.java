package meugrupo.ex16deoo;

import Classe.Aeroporto;
import Classe.GerenciadorPassageiro;
import Classe.Passageiro;
import Classe.Voo;
import Classe.SistemaFidelidade;

import java.util.List;
import java.util.ArrayList;



public class Ex16DeOO {

    public static void main(String[] args) {
    //Iniciando as coisas
    List<Voo> listavoos = new ArrayList<>();
    GerenciadorPassageiro gp1 = new GerenciadorPassageiro();
    List<String> escalas = new ArrayList<>();
    SistemaFidelidade sf1 = new SistemaFidelidade();
    
    Aeroporto aeroporto = new Aeroporto("Aeroporto Internacional de Brasília", "Brasília", listavoos);
    Voo voo1 = new Voo("BR123", "Nova York", 6, "Aguardando Decolagem", gp1, escalas);
    Passageiro passageiro1 = new Passageiro("João Silva", "12345678900", sf1);

    // Adicionando escalas ao voo
    voo1.adicionarEscala("Miami");
    voo1.adicionarEscala("Orlando");

    aeroporto.addVoo(voo1);
    voo1.adicionarPassageiros(passageiro1);
    
    // Passageiro acumula pontos após completar um voo
    passageiro1.getSistFidelidade().adicionarPontos(500);

    // Iniciar voo
    System.out.println("Iniciando voo!");
    aeroporto.iniciarVoo("BR123");

    //Verificar voos com prejuízo
    aeroporto.voosComPrejuizo();
    
    }
}