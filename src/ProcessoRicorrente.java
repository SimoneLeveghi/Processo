public abstract class ProcessoRicorrente extends Processo {
    private int timesExecuted;

    public ProcessoRicorrente(String nome) {
        super(nome);
        this.timesExecuted = 0;
    }

    public int getTimesExecuted() {
        return this.timesExecuted;
    }

    @Override
    public void execute() {
        super.execute();
        this.timesExecuted++;
    }
}
