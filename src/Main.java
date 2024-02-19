public class Main {
    public static void main(String[] args) {
        Processo p = new Processo("Prova") {
            @Override
            protected void body() {
                System.out.println("Nel body");
            }
        };

        p.execute();
    }
}