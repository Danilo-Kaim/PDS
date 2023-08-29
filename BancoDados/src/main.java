//package io.github.jiangdequan;

public class main {
    public static void main(String[] args) {
        BancoDados banco = BancoDados.getInstance();
        Dados dado = new Dados("Teste");
        Dados dado1 = new Dados("Teste1");
        Dados dado2 = new Dados("Teste2");
        
        banco.addDados(dado1);
        banco.addDados(dado);
        banco.addDados(dado2);
        banco.print();
    }
}