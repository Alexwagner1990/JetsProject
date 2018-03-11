## Jets Project

### Week 2 for Skill Distillery

### How to Run This Program

Start the program from the JetsApplication class - this will run methods from the CommandTower class. When prompted, select a number from the menu to execute the specified function. You can continue to select options from the menu until you select the "Quit" option, which will then end the program.

### Project Description

This program on startup creates an airfield array and populates it with six Jet objects - two FighterJet objects, two PassengerJet objects, and two CargoJet objects, each of which extends the Jet abstract class. Each Jet has a fly() method, which launches the jet from the airfield when called, and each Jet also has a model, speed, range, and price. Each Jet also implements an interface with a method unique to its object type - FighterJet objects implement a Combat interface, CargoJets implement a CargoLoad interface, and PassengerJets implement a Passengers interface. 

Users can list all the Jets in the Airfield, which prints out each Jet's model, speed, range and price. The user can also fly all of the Jets in the Airfield, which calls each Jet's fly method - each fly method also displays the longest time each jet can fly at top speed, found by dividing each Jet's range by its speed. The user can also print out the information of the fastest jet and the jet with the longest range. Each interface can be called, which finds objects of the appropriate class in the airfield and executes the corresponding method listed in the interface. The user can also add up to five more Jets to the Airfield before the Airfield fills up - Jets added to the Airfield by the user can also be listed with the fleet, execute a fly() method, and show up as the fastest or longest range if applicable.  

### Lessons Learned

For this project I learned the importance of paying attention when troubleshooting. I spent a good chunk of time on an issue that shouldn't have taken long to diagnose - my fleet lists were printing out with null values for each Jet in the Airfield array. It wasn't immediately obvious to me what was happening - I thought that either the array was being populated, but with blank objects, or that the array was properly made, but it wasn't being properly accessed. I went down a rabbit hole trying to solve a problem I didn't fully understand, and I wasted lots of time tweaking methods that didn't need to be tweaked. When I realized that the problem was in the Jet constructor (I had set a Jet(String, double, int, double) constructor, but I had forgot to add the this.String = String assigners), the problem that I spent more than an hour on trying to fix was resolved in five seconds. I should have spent more time trying to pinpoint the actual problem before setting off to try to find a solution - the list was returning the correct number of jets (but each with null information), so from that I could have deduced that the problem was not with the array itself.

The project also demonstrated how objects can really facilitate development. I used an object with several methods in the last project partly to better understand how objects functioned and partly because I didn't want to retype lots of code, but in this project I used objects much more effectively. Like with the last project, separating code into several objects made it easy to compartmentalize which parts of the code worked and which didn't. For example, the first time through I got the conversion from MPH to Mach speed wrong, but fixing it required just one additional line of code in the Jet class instead of several changes across the entire program. This also made it easy to add new features - I didn't fully understand interfaces, but since I knew the objects that would be implementing them I could confidently fiddle with the Jet objects instead of disturbing code I knew already functioned. 

Programming with objects at first seemed a bit cumbersome - why make so many classes with methods that could just as easily have been included in some methods in the main class? Even though it takes a bit more work at startup, the extra time spent upfront was worth the ease of development later. If I wanted to have a FighterJet do a Combat method, for example, it was really easy to just add that extra functionality to the FighterJet and then call it when it was needed, rather than search through the logic of the program for the point where I would need a Combat method and then add some other kind of check to only execute a Combat method when a FighterJet was doing its thing. 

I'm learning more about constructors and why/when they are used. Thinking about how to write the constructors also helped solidify for me the relationship between a super class (abstract or otherwise) and its subclass. I'm also learning the value of no-arg constructors - I previously thought that if I only wanted an object with specific arguments then I would not need a no-arg constructor, but when trying to have the user create a jet of a non-JetImpl type having no-arg constructors proved valuable for their ability to help pass different objects between methods. 

### Regrets/Things to Remember for Next Time/Things I Could Have Done Better This Time

Utilizing JUnit tests would have been helpful for this project, and I wish I were more comfortable with creating tests of my own - that's something I'll work on in the future. With a JUnit test it's likely I would have completed this project much sooner.

I learned about and utilized interfaces for this project, but my understanding of interfaces is still very limited. I'll likely do some more independent review on interfaces and when to use them. 

I didn't use getters and setters to their maximum potential for this project, and I could have encapsulated better. 
 
I could have stretched more for this project, but I think that time this weekend is better spent reading Java Head First, reviewing interfaces, and going over JUnit tests. I'll have to revisit this later.