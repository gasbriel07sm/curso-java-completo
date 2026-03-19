package lambdas;

public class Threads {
    public static void main(String[] args) {

        // criando uma classe anonima
        Runnable t1 = new Runnable() {
            @Override
            public void run()  {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Tarefa #01");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                }
            }
        };

        Runnable t2 = Threads::t2;

        Thread trabalho1 = new Thread(t1);
        Thread trabalho2 = new Thread(t2);
        trabalho1.start();
        trabalho2.start();
    }

    static void t2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Tarefa #02");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}
