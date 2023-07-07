// Corey Williams
// 06/18/2023
// Assignment 6

/* 1. For While and for loops are similar but have a few different use cases depending on context.

While statements are used when you want to repeat a specific piece of code until a condition is no longer true. */

int x = 0;
while (x < 5) {
    System.out.println("Count: " + count);
    count++;
}

/* In the example above, while x is less than 5 it will print the number and then increment the value. */

/* For loops are used when you want to iterate over a list or a string for a pre defined number of times */

String[] names = {"John", "Jason", "Jerry"};
for (String name : names) {
    System.out.println(name);
}

/* The example above takes names and iterates through it and prints each value inside of it until there are 
no more values to print */


/* 2. (a) false
      (b) true
      (c) true  
*/

// 3.(a) Should read
for (int i = 100; i <= 100; i++)

// 3.(b) Should read

int counter = 2;

while (counter <= 122) {
    System.out.println(counter);
    counter += 2;
}