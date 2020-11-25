# Coffee Machine project from JetBrains Academy

### Description
#### Stage 1/6 :
Let's start with a program that makes you a coffee – virtual coffee, of course.
But in this project, you will implement functionality that simulates a real coffee machine.
It can run out of milk, it can run out of coffee beans, 
it can make different varieties of coffee, and it can take the money for making a coffee.
The first version of the program just makes you a coffee.
It prints to the standard output what it is doing as it makes a coffee.
#### Stage 2/6 :
Now let's consider a case where you need a lot of coffee. 
Maybe, for example, you’re hosting a party with a lot of guests. 
The program should calculate how much water, coffee, and milk are necessary to make the specified amount of coffee. 
One cup of coffee made on this coffee machine contains 200 ml of water, 50 ml of milk, and 15 g of coffee beans.
The user should input the amount of coffee he needs, in cups, for all the guests.
Of course, all this coffee is not needed right now, so at this stage, the coffee machine doesn’t actually make any coffee.
#### Stage 3/6 :
A real coffee machine never has an infinite supply of water, milk, or coffee beans. 
And if you input a really big number, 
it’s almost certain that a real coffee machine wouldn't have the supplies needed to make all that coffee.
In this stage, you need to improve the previous program. 
Now you need to input amounts of water, milk, and coffee beans that your coffee machine has at the moment.
If the coffee machine has enough supplies to make the specified amount of coffee, 
the program should print "Yes, I can make that amount of coffee". 
If the coffee machine can make more than that, 
the program should output "Yes, I can make that amount of coffee (and even N more than that)", 
where N is the number of additional cups of coffee that the coffee machine can make. 
If the amount of resources is not enough to make the specified amount of coffee, 
the program should output "No, I can make only N cup(s) of coffee".
Like in the previous stage, the coffee machine needs 200 ml of water, 
50 ml of milk, and 15 g of coffee beans to make one cup of coffee.

### Introduction
#### Stage 1/6 : 
Write a program that prints the steps necessary to make coffee.
#### Stage 2/6 :
Write a program that calculates the amount of ingredients needed to make a certain amount of coffee.
#### Stage 3/6 :
Write a program that calculates whether it will be able to make 
the required amount of coffee from the specified amount of ingredients.