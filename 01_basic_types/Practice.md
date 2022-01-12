# Practice projects for Lesson 1

### 1. Float - double difference
Write a program, that is capable of displaying the accurateness-difference between 
the float and double type by using **Math.PI** (Math.PI is double type)
#### Your tasks
- A single Main function is enough, no need to write other function or class
- Cast down the Math.PI to float, and substract it from (default) Math.PI 
- Print out the result to the console
- *The result is cca. 9×10<sup>-8</sup>*

### 2. Correct endianness
Write a program, that is capable of handling input from both endianness.
Every 2 byte is a character in the context of our project. The first 2 byte on the input is 
always an endianness-signal, with no other meaning:
- If the first 2 byte is in the order **0xFE 0xFF**, than the input is in Big Endian format
- If the first 2 byte is in the order **0xFF 0xFE**, than the input is in Little Endian format.
#### Your tasks
- The program reads even number of bytes from the Console
- You may write as many functions as you want (no need for other classes)
- The program determines (from the first 2 byte) the endianness
- You have to write a function that swaps the endianness on the whole input
- You print out to the console, that the input was in which format
- After the format, you print out the data (swapped or not swapped) to the console in Little Endian format
- You have an example [input](Practice/endian/input.txt) and [output](Practice/endian/output.txt)
  - You don't have to read txt file, it is just for you, you may copy-paste the input into the console
- The input will be in hexadecimal format, but <ins>without</ins> the 0x tags.
#### Tips
- Use byte type
- You can loop through the input with a for-cycle incrementing always by 2

### 3. Creative
Fix the example function (static increment) in the lesson, to be able to handle reference-type correctly

#### To do
- The function shall not work with value-type (int)
- The function shall work correctly with a reference-type 
  - You may choose any class for this, which you like, e.g. BigDecimal, Integer,...
  - Or you can write your own Number class
  
#### Tips
- The built-in Integer class is immutable (constant value), so you should search or write a mutable one.
