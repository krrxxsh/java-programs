class Printer {
    private boolean isNumberTurn = true;  

    public synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            
            while (!isNumberTurn) {
                try {
                    wait();  
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

            System.out.println(i);
            try {
                Thread.sleep(1000);  
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            isNumberTurn = false;  
            notify();  
        }
    }

    public synchronized void printLetters() {
        for (char c = 'A'; c <= 'E'; c++) {
            
            while (isNumberTurn) {
                try {
                    wait();  
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

            System.out.println(c);
            try {
                Thread.sleep(1000);  
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            isNumberTurn = true;  
            notify();  
        }
    }
}

public class ThreadCommunicationExample {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread t1 = new Thread(() -> {
            printer.printNumbers();
        });

        Thread t2 = new Thread(() -> {
            printer.printLetters();
        });

        t1.start();
        t2.start();
    }
}
