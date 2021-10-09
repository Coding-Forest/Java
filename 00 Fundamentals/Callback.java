// Java program to illustrate Asynchronous callback
interface onEventListener {

    // this can be any type of method
    void interfaceCallback();
}


public class B {

    public static int threadCount = 0;
    public static int callbackCount = 0;
    private onEventListener mListener; // listener field

    // listener setter
    public void setEventListener(onEventListener mListener)
    {
        this.mListener = mListener;
    }

    // Asynchronous task
    public void classB_task() throws InterruptedException {
        threadCount += 1;

        // An Async task always executes in new thread
        Runnable r = new Runnable() {

            public void run()
            {
                System.out.println("Class B thread starting...");
                System.out.println(String.format("Thread count: %x", threadCount));
                mListener.interfaceCallback();
            }
        };

        Thread thread = new Thread(r);
        thread.start();
        thread.join();
    }

    // Driver Program
    public static void main(String[] args) throws InterruptedException {
        int i;

        for (i=0; i < 5; i++) {
            B classB_obj = new B();
            onEventListener mListener = new A();

            classB_obj.setEventListener(mListener);
            classB_obj.classB_task();

        }
    }
}

class A implements onEventListener {

     @Override
    public void interfaceCallback() {
        System.out.println("Callback in class A executed");
        B.callbackCount += 1;
        System.out.println(String.format("interface ended. Callback count: %s \n", B.callbackCount));
    }
}

/*
Class B thread starting...
Thread count: 1
Callback in class A executed
interface ended. Callback count: 1 

Class B thread starting...
Thread count: 2
Callback in class A executed
interface ended. Callback count: 2 

Class B thread starting...
Thread count: 3
Callback in class A executed
interface ended. Callback count: 3 

Class B thread starting...
Thread count: 4
Callback in class A executed
interface ended. Callback count: 4 

Class B thread starting...
Thread count: 5
Callback in class A executed
interface ended. Callback count: 5 


Process finished with exit code 0
*/
