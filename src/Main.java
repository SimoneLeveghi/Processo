public class Main {
    public static void main(String[] args) {
        Processo p = new Processo("Prova") {
            @Override
            protected void body() {
                System.out.println("Nel body");
            }
        };

        p.execute();

        ProcessoRicorrente pr = new ProcessoRicorrente("ProvaRicorrente");
        pr.execute();
        pr.execute();
        System.out.println("ProcessoRicorrente eseguito " + pr.getTimesExecuted() + " volte");
    }
}