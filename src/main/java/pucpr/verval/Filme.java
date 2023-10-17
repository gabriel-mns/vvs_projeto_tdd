package pucpr.verval;

public class Filme {

    private String nome;

    public Filme(String nome){

        if (!validar(nome)) {
            throw new IllegalArgumentException();
        }

        this.nome = nome;

    }

    public String getNome(){
        return nome;
    }

    public static boolean validar(String nome){
        return !nome.trim().equals("");
    }

}

