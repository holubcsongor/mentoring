# Lesson 1
## Basic types, modifiers, parameter passing

### Representation of numbers
#### Integer types
The following integer-types are present in Java
- ~~boolean (1 byte or less)~~
- byte (1 byte)
- char (2 byte)
- int  (4 byte)
- long (8 byte)

In the most languages signed and unsigned values can be stored in these. \
If you store a signed number, than the first bit is the sign (minus or plus). \
The range of the storable numbers are calculated in this way in the case of unsigned values:
> 0 .. (2<sup>bitcount</sup>-1)

for 4 bytes (32 bits) this is 0 .. (2<sup>32</sup>-1) 
<!-- todo example -->

#### Floating point
If we want to store fraction numbers, we have to store, where the point is. \
A float type is built-up in the following scheme:
- The first some bit (the number of bit is calculated from the length of type, because you are indexing a location in the bytes) contains the **location**/index of the point.
- The second section (the number of bits equal to the number stored in the first section) contains the **integer part** of the number
- The last section (after the point) contains the **fraction part** of the number
<!-- todo example -->

<!-- todo why not use == with float -->

#### Endianness

<!-- todo -->

### Logical type
In Java the type is called bool, but the full name of it is Boolean \
Historical information, which is still true:
- In the original (ANSI) C there was no boolean type, instead integers are used for evaulating logical expressions:
  - 0 means FALSE
  - Every other means TRUE
  
In Java you can assign only **true** and **false** to a bool, these are the only allowed values.

### Modifiers
#### static

#### final (const)

#### volatile

### Parameter passing

#### Pass by values

#### Pass by reference