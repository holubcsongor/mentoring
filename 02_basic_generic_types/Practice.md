# Practice projects for Lesson 2

## Enumerations

### 1. Enum - int converter
- **Difficulty: 1/5**
- **Creativity: 3/5**
- **Research need: 0/5** \
Sometimes there is a need, that you have to send enum values through the internet, but the network can only handle numbers, so you have to cast it to- or from int.
Write any code/function, that is capable of converting your custom enum to integer, and vica versa! 

#### Your tasks
- You shall write an enum class (as you like it)
- Write a function, that gets this enum as parameter, and return the int value of it. 
- Write a function, that gets an int as parameter, and return the enum value of it.
  - This function throws standard InvalidArgumentException, if the int is smaller or bigger than the enum values (so cannot convert)
- Demonstrate the functions on a simple example (2 function call)

### 2. Morse-ABC
- **Difficulty: 3/5**
- **Creativity: 3/5**
- **Research need: 4/5** \
Write a program, that is capable of handling Morse-codes.
You must not write a whole decoder program, only some "helper" function, and a data structure to store the letters!
Hint: this is an enum lesson, and the morse has only some signal: short, long, space
#### Your tasks
- Make an enum for a signal
- Make a class or other structure for a letter (a letter can consist some signal, use list or array for this)
- Write a function for converting a character into a morse type
- Write a function for converting a morse type into a character
- Demonstrate it on some argument (e.g. call the converter with a given character,...)

## Arrays

### 3. Resizing array
- **Difficulty: 1/5**
- **Creativity: 2/5**
- **Research need: 0/5** \
Write a function, that is capable of resizing a given-type array (for example only int array).
Every data from the original array must be copied to the new array-reference.
If the new array is smaller, you should discard the leftover data.
#### Your tasks
- Write a function, that resizes an array
  - The function has 2 parameters:
    - the original array
	- the size of the new array (int)
  - The function returns with the new array
  - The function makes a new array with the given size (parameter).
  - You copy all data from the old array to the new array, as long as it has empty "space"
- Demonstrate it on some array (e.g. make a 5-size int-array with some data, resize it to 3-size,...)

### 4. Vector
- **Difficulty: 2/5**
- **Creativity: 2/5**
- **Research need: 1/5** \
Write a class, that operates, like the standard Vector class. 
The class holds an array, and gives functions to handle the data in it.
#### Your tasks
- Write a class, that holds an array (template not needed, it is enough if it can only handle integers, e.g. the name is IntVector)
- The inner array is fully **private**, there is no setter or getter!
- Write 3 constuctor for it:
  - An parameterless constructor, which creates the vector with a default size (e.g. 10)
  - Constructor with an array as a single parameter (the array has the type of your choosing, e.g. int[])
  - Constructor with an int as a parameter, in this case the parameter is the starting size of the array inside the class
- Write a (public) function, that returns a single item from the array
  - the function gets an index (int) as parameter
- Write a function that can add a new item to the end of the array.
  - If the array is full, than the array will be resized to double size.
    - You shall use the logic from the 3rd lesson for this resizing.
- Demonstrate your Vector class

## 	String

### 5. Basic string-operations
- **Difficulty: 2/5**
- **Creativity: 2/5**
- **Research need: 2/5** \
Write functions, that works as standard C string functions (described below).
The strings you use will be byte arrays, ending with a '\0' character (standard c string).
For reference, the strcpy and the strcat C-functions shall be implemented, if you want to look it up on the internet!

#### Your tasks
- Write a function, that copies a C-string into a new C-string
  - the function returns with a new byte array (byte[])
    - the new C-string must be also terminated with a '\0' character!!
  - the function gets a byte array as parameter
  - you don't know the size of the array (don't use the array.length!), instead go until a '\0' character is found (hint: use while-cycle)
- Write a function, that concatenates 2 C-string into 1
  - the function returns with the new byte array 
    - the new C-string must be also terminated with a '\0' character!! 
    - the null-terminator shall be present only at the end of the whole array!	
  - the function gets 2 byte array (C-string) as parameter.
  - place the 2 string after each other in the new array.  
- Demonstrate your functions with some custom byte array!

### 6. Float-parser
- **Difficulty: 3/5**
- **Creativity: 2/5**
- **Research need: 0/5** \
Write a function, that works as standard Double.Parse().

#### Your tasks
- Write a function, that parses a double from string
  - the function returns with a double
  - the function gets a string as parameter
  - the parser shall handle the point and the minus operator as well.
  - the parser shall ignore the "f", "g" or any other modifier at the end of the string
  - the parser shall work with this format as well: 1e-8 
- Demonstrate your function with some input!

## Bitwise operations

### 7. Smart-shift
- **Difficulty: 2/5**
- **Creativity: 2/5**
- **Research need: 0/5** \
Write 2 function, that shifts the given integer with the given number, but the bits do not go to oblivion4 

#### Your tasks
- Write a function, that shifts an integer with a given number to the left
  - the function returns with an int
  - the function gets 2 int as parameter:
    - the number that needs to be shifted
	- the number of bits to be shifted
  - from the left side of the int the values go to the right side instead of oblivion
  - to the right side not 0 comes, instead the value from the left side
  - so the bits will circle around 
- Write another function, that does the same as the previous, just to the right side  
- Demonstrate your functions with some input!


### 8. XOR-cypher
- **Difficulty: 2/5**
- **Creativity: 5/5**
- **Research need: 4/5** \
Because of Bool-algebran correlations if you use XOR on a number 2 times with the same parameter, you receive the original number back.
You can use this behaviour for encryption purposes: if you encrypt a character with a given "password" number,
you can decrypt it with the same number.
Write functions, that encrypts/decrypts strings with a given number.

#### Your tasks
- Write a function, that encrypt a character-array (may be generated from string with string.toarray)
  - the function returns with a character-array (encrypted)
  - the function gets 2 parameter:
    - the original character-array that needs to be encrypted
	- an integer (your password number)
- Write the same to the other way: a decrypt function	
- Demonstrate your functions with some input! 
Because it is a creativity and research lesson, I do not give other hints, only when asked.