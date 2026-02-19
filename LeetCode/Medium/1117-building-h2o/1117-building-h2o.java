class H2O {
    private int hCount = 0;

    public H2O() {
        
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
		
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        synchronized(this){
            while(hCount == 2){
                this.wait();
            }
            releaseHydrogen.run();
            hCount++;
            this.notifyAll();
        }
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        synchronized(this){
            while(hCount < 2){
                this.wait();
            }
            releaseOxygen.run();
            hCount = 0;
            this.notifyAll();
        }
		
    }
}