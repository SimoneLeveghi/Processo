public abstract class Processo {
    private String nome;
    private boolean fatto;

    public Processo(String nome) {
        this.nome = nome;
        this.fatto = false;
    }

}
