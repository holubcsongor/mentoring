# Practice projects for Lesson 12

## Threads

### 1. Timed random numbers
- **Difficulty: 4/5**
- **Creativity: 3/5**
- **Research need: 1/5**
This project is just some basic practice for beginner-level thread handling, every needed aspect of the tasks can be in any normal/company project!
You will create a multi-threaded application, which will generate random numbers until stopped, and handles it (writes it out).

#### Your tasks
- Create 2 thread by implementing the Runnable interface!
  - The threads will have normal priority.
- Start both thread in the Main!
- The functionalites of the 2 Threads are described under the next sections!


##### Generator thread
- This thread shall generate random numbers until stopped/interrupted!
- The function generates a random int (from the full spectrum) by using the built-in Random class, and waits some time!
- The waiting time is also a random number, but ranged from 50 millisec to 2500 millisec!
- The function copies/adds the generated number to a List, which is a shared resource


##### Consumer Thread
- This thread shall read out the shared List, and print out the items to the console!
 -The thread shall wait passively if no item is in the List, until the other thread awakens it!
- This thread will force the Generator thread to stop, after some number is generated (constant int, which is defined at a class level, defaulted to 100)!


#### Restrictions
- You shall not use Collections.Synchronized...., only not safe thread built-in classes! (ArrayList, LinkedList, or similar, you may choose)
- You shall manually lock every thread-critical/shared object!
- You may create "dummy" objects, parameterized constructors, any other functions, as you wish!


#### Tips in keywords
- wait()
- notify()
- synchronized()
- Random()
- interrupt()
- InterruptedException