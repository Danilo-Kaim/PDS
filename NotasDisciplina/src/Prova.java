import java.util.ArrayList;

//package io.github.jiangdequan;

public class Prova implements Inocente{
    ArrayList <Stalker> stalkers;
    private int nota;

    public Prova(){
        this.stalkers = new ArrayList<Stalker>();
		this.nota = 0;
    }

    @Override
    public void notifica() {
        for(Stalker x : stalkers){
            x.atualizaProva(this.nota);
        }
        
    }

    @Override
    public void addStalker(Stalker stalker) {
        this.stalkers.add(stalker);
        
    }

    @Override
    public void prendeStalker(Stalker stalker) {
        this.stalkers.remove(stalker);
        
    }
    public void setNota(int nota){
        this.nota = nota;
        this.notifica();
    }
    
}