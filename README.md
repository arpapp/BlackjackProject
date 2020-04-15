###Overview

The program is laid out in the format of a story. This was done in order to give context and direction to the object oriented nature of
this project. The project was presented at first with a UML diagram that had many, but not all, of the classes that would be needed. As
such, it was difficult to interpret how those different classes needed to interact with each other and relay information between themselves.
The framework of the story was used to give direction and purpose to each of the different classes and their methods.

Other than the presentation of the story, the program starts out by assigning two cards to the player and dealer. After the assignment, the
menu method is passed the player's two cards and the player can then choose to hit or stay. The program runs checks on the player's hand total
in order to make sure the player hasn't bust and can continue to play. Assuming the player did not bust, the program then continues on
to the dealer choices method.

The dealer choices method follows a small selection of standard casino rules. If the dealer's total is under seventeen, then the dealer
must hit. Otherwise, they will stay. Afterwards, the player and dealer's hand totals are compared in order to declare the winner.

###Technologies Used
- Eclipse
- Java
- GitHub

###Lessons Learned

This project was a really good demonstration of how different objects can communicate with each other. For example, the dealer was the only
class to have an instance of the deck; therefore, whenever the deck needed to be manipulated, (a card needed to be dealt), the only 
class with the accessibility to do so was the dealer. There were many different classes that forced me to skew my thinking towards object
oriented programming, (such as each player having an instance of a hand object that had to be maintained). 

I also found the story
method as a valuable tool to just get started; when first presented with the UML for this project, I was very lost. I was inundated with
many different classes and had no clue how to make sense of them. Once I took a step back and applied it to the process of a 
realword Blackjack game, I gained some clarity and direction of which objects and methods to call first.
