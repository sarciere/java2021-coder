package lambdas;

public class Threads {
    public static void main(String[] args) {
        Runnable Thread_1 = new Trabalho1();

        Runnable Thread_2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Tarefa #002");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }                              
                }
            }
        };

        Runnable Thread_3 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Tarefa #003");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }                              
            }            
        };

        Thread t1 = new Thread(Thread_1);
        Thread t2 = new Thread(Thread_2);
        Thread t3 = new Thread(Thread_3);


        t1.start();
        t2.start();
        t3.start();

    }
}