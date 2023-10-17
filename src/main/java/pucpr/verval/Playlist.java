package pucpr.verval;

import java.util.ArrayList;

public class Playlist {

    private ArrayList<Filme> list;

    public Playlist(){
        list = new ArrayList<>();
    }

    public void inserir(Filme novoFilme){
        list.add(novoFilme);
    }

    public ArrayList<Filme> getList(){
        return list;
    }
}
