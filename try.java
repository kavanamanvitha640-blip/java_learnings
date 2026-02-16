class A extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hey Hello:");
        }
    }
}

class Try1 {
    public static void main(String[] args) {
        A threadA = new A();
        for (int i = 0; i < 50; i++) {
            System.out.println("hello world");
        }
        threadA.start();
    }
}

// Example 2: Implementing Runnable interface
class Try2 {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Hello");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
    }
}

// Example 3: Using Lambda expression
class Try3 {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            System.out.println("Hello");
        };
        Thread t1 = new Thread(r1);
        t1.start();
    }
}

// Example 4: Synchronizing threads
class Try4 {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

class Try5 {
    public static void main(String[] args) throws InterruptedException {
        Try4 t = new Try4();
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    t.increment();
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    t.increment();
                }
            }
        };
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final count: " + t.count);
    }
}
