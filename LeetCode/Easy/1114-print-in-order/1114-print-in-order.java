class Foo {

    private int state = 1;
    public Foo() {
    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        state = 2;
        this.notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.   
        while(state != 2){
            this.wait();
        }
        printSecond.run();
        state = 3;
        this.notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
        while(state != 3){
            this.wait();
        }
        printThird.run();
    }
}