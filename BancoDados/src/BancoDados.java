import java.util.ArrayList;

//package io.github.jiangdequan;

public class BancoDados {
    private static BancoDados uniqueInstance = new BancoDados();
    private ArrayList<Dados> banco;

    private BancoDados(){
        banco = new ArrayList<Dados>();
    }
    public void addDados(Dados dados){
        banco.add(dados);
    }
    public void removeDados(Dados dados){
        banco.remove(dados);
    }
    public void print(){
        for(Dados d : banco){
            System.out.println(d.dados);
        }
    }
    public static BancoDados getInstance(){
        return uniqueInstance;
    }
}