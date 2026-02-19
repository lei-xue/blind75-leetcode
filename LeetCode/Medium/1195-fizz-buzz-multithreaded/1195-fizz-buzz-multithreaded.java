class FizzBuzz {
    private int n;
    private int current = 1;

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        synchronized (this) {
            while (current <= n) {
                if (current % 3 == 0 && current % 5 != 0) {
                    printFizz.run();
                    current++;
                    this.notifyAll();
                } else {
                    this.wait();
                }
            }
            // important to exit, no deadlock;
            this.notifyAll();
        }     
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        synchronized (this) {
            while (current <= n) {
                if (current % 5 == 0 && current % 3 != 0) {
                    printBuzz.run();
                    current++;
                    this.notifyAll();
                } else {
                    this.wait();
                }
            }
            this.notifyAll();
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        synchronized(this){
            while(current <=n){
                if(current % 15 == 0){
                    printFizzBuzz.run();
                    current++;
                    this.notifyAll();
                }else{
                    this.wait();
                }
            }
            this.notifyAll();
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        synchronized(this){
            while(current <=n){
                if(current %3 != 0 && current%5 != 0){
                    printNumber.accept(current);
                    current++;
                    this.notifyAll();
                }else{
                    this.wait();
                }
            }
            this.notifyAll();
        }
    }   
}