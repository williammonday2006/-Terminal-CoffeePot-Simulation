# Phase 0
I'm most unsure about how the Controller communicates with the Model and handles invalid commands.

# Phase 1
I created CoffeePotModel with methods for brewing and pouring coffee. I tested normal operations and invalid amounts. The Model protects its own data by preventing negative volumes and exceeding capacity.

The Model is responsible for managing data and enforcing rules in MVC.

# Phase 2
I created CoffeePotView to display the menu and read user input using Scanner. Keeping input and output separate makes the program easier to organize and maintain.

# Phase 3
I created CoffeePotController to connect the Model and View. It reads commands, converts amounts into integers, and calls the correct Model methods. It also handles invalid commands and errors.

The View receives input, the Controller processes it, and the Model updates the coffee volume.

# Phase 4
I updated the Controller to display the pot's volume after successful actions. I also improved error handling so invalid commands and amounts don't crash the program. The exit command now closes the application properly.

# Phase 5
I tested brewing, pouring, maximum capacity, empty pots, and invalid commands. The program handled these situations correctly without crashing. I learned how MVC separates data, user interaction, and application logic, making the program easier to organize and maintain.