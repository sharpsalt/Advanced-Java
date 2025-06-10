class MyThread extends Thread
{
    @Override
    public void run()
    {
        //Task for User-defined Thread
        for(int i=1;i<=10;i++)
        {
          System.out.println("Child Thread");
        }
    }// Task of a Thread
}//Defining Thread

public class Intro
{
    public static void main(String[] args)
    {
        MyThread t=new MyThread();

        //This Line will create a new thread which is responsible to execute run()
        t.start();
        //Main Thread and UserDefined Thread
        for(int i=1;i<=10;i++)
        {
            System.out.println("main Thread");
        }
    }
}

//Object will get the Facility of thread when we take few Things form In-Built API

//Whenever You extends the Thread, the rules says whatever the Job, you are giving for a thread,
//that job you ahve to place it by overiding a method called run.


//Inside The Thread class whatever the Method is There, that method you should override and by overriding you should keep task for thread
//Override run() to define ur job for a thread


/*
class Thread
{
    public void start(){
        1.Register the Thread with threadScheduler
        2.All other mandatory low level activties(memory level)
        3.Invoke or call run() method
    }
    public void run(){
        //no Implementation
    }
}
  */



