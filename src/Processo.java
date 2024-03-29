public abstract class Processo {
    private String nome;
    private boolean fatto;

    public Processo(String nome) {
        this.nome = nome;
        this.fatto = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isFatto() {
        return fatto;
    }

    private void start() {
        System.out.println("Processo iniziato");
    }

    protected abstract void body();

    private void end() {
        System.out.println("Processo terminato");
        this.fatto = true;
    }

    public void execute() {
        start();
        body();
        end();
    }
}
