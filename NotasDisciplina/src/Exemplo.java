//package io.github.jiangdequan;

public class Exemplo {
    public static void main(String[] args) {
        Prova prova = new Prova();
        Aluno junior = new Aluno();
        Coordenador paiTarso = new Coordenador();

        prova.addStalker(paiTarso);
        prova.addStalker(junior);

        prova.setNota(9);
    }
}