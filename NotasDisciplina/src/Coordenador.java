//package io.github.jiangdequan;

public class Coordenador implements Stalker{

    @Override
    public void atualizaProva(int nota) {
        System.out.println("Divulgando nova nota: "+ nota);
    }
}