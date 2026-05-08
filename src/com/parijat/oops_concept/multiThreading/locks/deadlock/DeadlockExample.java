package com.parijat.oops_concept.multiThreading.locks.deadlock;

// **** Class Pen ****

class Pen{

    // synchronized means -> Intrinsic Lock of the object the method belongs to

    // Needs paper to write
    public synchronized void writeWithPenAndPaper(Paper paper){ // -> will acquire lock of pen
        System.out.println(Thread.currentThread().getName() + " is using Pen " + this + " and trying to use Paper");
        paper.finishWriting();
    }

    public synchronized void finishWriting(){ // needs paper lock
        System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
    }
}

// **** Class Paper ****

class Paper{
    // Needs Pen to write
    public synchronized void writeWithPenAndPaper(Pen pen){ // will acquire lock of paper
        System.out.println(Thread.currentThread().getName() + " is using Paper " + this + " and trying to use Pen");
        pen.finishWriting();
    }

    public synchronized void finishWriting(){ // need pen lock
        System.out.println(Thread.currentThread().getName() + " finished using Paper " + this);
    }

}

// Create Thread 1 -> Task 1
class Task1 implements Runnable{
    private final Pen pen;
    private final Paper paper;

    public Task1(Pen pen, Paper paper){
        this.paper = paper;
        this.pen = pen;
    }

    @Override
    public void run(){
        // DeadLock Case
        pen.writeWithPenAndPaper(paper);

        // Done in task 2
//        synchronized (paper){
//            pen.writeWithPenAndPaper(paper);
//        }
    }
}

// Create thread 2 -> Task 2
class Task2 implements Runnable{
    private final Pen pen;
    private final Paper paper;

    public Task2(Pen pen, Paper paper){
        this.paper = paper;
        this.pen = pen;
    }

    @Override
    public void run(){
        // Deadlock will occur due to this
//         paper.writeWithPenAndPaper(pen);

        // Solution :- First take hold (lock) on required resource then use it

        synchronized (pen){
            paper.writeWithPenAndPaper(pen);
        }

    }
}



public class DeadlockExample {
    public static void main(String[] args) {

        Pen pen = new Pen();
        Paper paper = new Paper();

        // Same Pen and paper is given to Both the thread
        Thread thread1 = new Thread(new Task1(pen,paper), "Thread-1");
        Thread thread2 = new Thread(new Task2(pen,paper), "Thread-2");

        thread1.start();
        thread2.start();
    }
}
