public class ProcessoRicorrente extends Processo {
    private int timesExecuted;

    public ProcessoRicorrente(String nome) {
        super(nome);
        this.timesExecuted = 0;
    }

    public int getTimesExecuted() {
        return this.timesExecuted;
    }

    @Override
    protected void body() {
        System.out.println("ProcessoRicorrente in sviluppo");
    }

    @Override
    public void execute() {
        super.execute();
        this.timesExecuted++;
    }
}
