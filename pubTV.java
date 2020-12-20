import java.util.Scanner;                                                                                                                    // Allows for the use of scanners throughout the program.
public class pubTV{                                                                                                                          // Main class and class definition.
   public static void main (String [] args){                                                                                                 // Main method.
      Scanner input = new Scanner (System.in);                                                                                               // Creates a scanner that allows for user input in this method only.
      int LCV = 0;                                                                                                                           // Loop Control Variable.
      int userInputTV = -1;                                                                                                                  // Determines which TV is being selected. Starts at -1 to allow for while loop condition.
      int userInputChannel = 0;                                                                                                              // Determines what channel the TV is on (stores channel value).
      int userInputVolume = 0;                                                                                                               // Determines what volume the TV has (stores channel value).
      int userInputMenu = 0;                                                                                                                 // Stores the value of what menu option the user wants.
      int userInputSelection = -1;                                                                                                           // Stores user input within the method option4, which starts at -1 and runs in a while loop to ask for what 
      int volume = 1;                                                                                                                        // Value to pass by reference to create an object's volume propety value.
      int channel = 1;                                                                                                                       // Value to pass by reference to crate an object's channel property value.
      int on = 0;                                                                                                                            // Value to pass by reference to create an object's channel property value.
      int[][] myArray = new int[8][3];                                                                                                       // Creates a 2D array of 24 elements: eight rows representing each object, and 3 columns representing each property of that object.
      boolean isOff = false;                                                                                                                 // Creates an infinite loop to loop a menu selection for as long as the user does not quit the program (not determined by this variable).
      boolean uniqueChannel = true;                                                                                                          // Determines whether a given channel is not found in any other TV.
      television television1 = new television(volume, channel, on);                                                                          // Creates the first television with the preset arguments.
      television television2 = new television(volume, channel, on);                                                                          // Creates the second television with the preset arguments.
      television television3 = new television(volume, channel, on);                                                                          // Creates the third television with the preset arguments.
      television television4 = new television(volume, channel, on);                                                                          // Creates the fourth television with the preset arguments.
      television television5 = new television(volume, channel, on);                                                                          // Creates the fifth television with the preset arguments.
      television television6 = new television(volume, channel, on);                                                                          // Creates the sixth television with the preset arguments.
      television television7 = new television(volume, channel, on);                                                                          // Creates the seventh television with the preset arguments.
      television television8 = new television(volume, channel, on);                                                                          // Creates the eighth television with the preset arguments.
      for(LCV = 0; LCV < 8; LCV++){                                                                                                          // Runs eight times and the loop control variable governs which row the selection below applies to within myArray.
         myArray[LCV][0] = channel;                                                                                                          // In row LCV, the first column is given a value of channel, which mirrors the property in the class television of the same name.
         myArray[LCV][1] = volume;                                                                                                           // In row LCV, the second column is given a value of volume, which mirrors the property in the class television of the same name.
         myArray[LCV][2] = on;                                                                                                               // In row LCV, the third column is given a value of on, which mirrors the property in the class television of the same name.
      }                       
      while(userInputTV > 8 || userInputTV < 1){                                                                                             // While a TV number given is not between 1 and 8 (there are TVs labeled 1-8), this loop will continue.
         System.out.println("Enter a TV number 1-8, or enter 10 to exit.");                                                                  // Asks the user for a number 1-8 if they want to select a TV, and 10 if they want to exit.
         userInputTV = input.nextInt();                                                                                                      // Gets user input for the TV selection.
         if(userInputTV == 10){                                                                                                              // If the selection was 10...
            System.out.println("System exited.");                                                                                            // The system will note that it stopped running.
            System.exit(1);                                                                                                                  // Exits system with no errors.
         }
      }   
      while(isOff == false){                                                                                                                 // While the TV has not been turned off, this loop will run (until the system stops running). This loop always runs as this variable never changes.
         System.out.println("---------");                                                                                                    // Prints a line of dashes to represent a border line.
         System.out.println("TV " + userInputTV + " is selected.");                                                                          // Displays what TV is currently selected.
          if(userInputTV == 1){                                                                                                              // If the TV currently selected is 1...
               System.out.println("Channel: " + myArray[0][0]);                                                                              // Shows the current channel of the TV.
               System.out.println("Volume: " + myArray[0][1]);                                                                               // Shows the current volume of the TV.
               System.out.println("TV is on (0 = off, 1 = on): " + myArray[0][2]);                                                           // Shows the current on/off state of the TV.
            }else if(userInputTV == 2){                                                                                                      // If the TV currently selected is 2...
               System.out.println("Channel: " + myArray[1][0]);                                                                              // Shows the current channel of the TV.
               System.out.println("Volume: " + myArray[1][1]);                                                                               // Shows the current volume of the TV.
               System.out.println("TV is on (0 = off, 1 = on): " + myArray[1][2]);                                                           // Shows the current on/off state of the TV.
            }else if(userInputTV == 3){                                                                                                      // If the TV currently selected is 3...
               System.out.println("Channel: " + myArray[2][0]);                                                                              // Shows the current channel of the TV.
               System.out.println("Volume: " + myArray[2][1]);                                                                               // Shows the current volume of the TV.
               System.out.println("TV is on (0 = off, 1 = on): " + myArray[2][2]);                                                           // Shows the current on/off state of the TV.
            }else if(userInputTV == 4){                                                                                                      // If the TV currently selected is 4...
               System.out.println("Channel: " + myArray[3][0]);                                                                              // Shows the current channel of the TV.
               System.out.println("Volume: " + myArray[3][1]);                                                                               // Shows the current volume of the TV.
               System.out.println("TV is on (0 = off, 1 = on): " + myArray[3][2]);                                                           // Shows the current on/off state of the TV.
            }else if(userInputTV == 5){                                                                                                      // If the TV currently selected is 5...
               System.out.println("Channel: " + myArray[4][0]);                                                                              // Shows the current channel of the TV.
               System.out.println("Volume: " + myArray[4][1]);                                                                               // Shows the current volume of the TV.
               System.out.println("TV is on (0 = off, 1 = on): " + myArray[4][2]);                                                           // Shows the current on/off state of the TV.
            }else if(userInputTV == 6){                                                                                                      // If the TV currently selected is 6...
               System.out.println("Channel: " + myArray[5][0]);                                                                              // Shows the current channel of the TV.
               System.out.println("Volume: " + myArray[5][1]);                                                                               // Shows the current volume of the TV.
               System.out.println("TV is on (0 = off, 1 = on): " + myArray[5][2]);                                                           // Shows the current on/off state of the TV.
            }else if(userInputTV == 7){                                                                                                      // If the TV currently selected is 7...
               System.out.println("Channel: " + myArray[6][0]);                                                                              // Shows the current channel of the TV.
               System.out.println("Volume: " + myArray[6][1]);                                                                               // Shows the current volume of the TV.
               System.out.println("TV is on (0 = off, 1 = on): " + myArray[6][2]);                                                           // Shows the current on/off state of the TV.
            }else if(userInputTV == 8){                                                                                                      // If the TV currently selected is 8...
               System.out.println("Channel: " + myArray[7][0]);                                                                              // Shows the current channel of the TV.
               System.out.println("Volume: " + myArray[7][1]);                                                                               // Shows the current volume of the TV.
               System.out.println("TV is on (0 = off, 1 = on): " + myArray[7][2]);                                                           // Shows the current on/off state of the TV.
            }
         System.out.println("1. Select TV");                                                                                                 // Displays the first menu option: selecting the TV.
         System.out.println("2. Change Channel");                                                                                            // Displays the second menu option: changing the channel.
         System.out.println("3. Change volume");                                                                                             // Displays the third menu option: changing the volume.
         System.out.println("4. On/Off");                                                                                                    // Displays the fourth menu option: changing the on/off state of the TV.
         System.out.println("5. Exit program.");                                                                                             // Displays the fifth menu option: exiting the program.
         System.out.println("---------");                                                                                                    // Prints a border line at the end of menu list.
         userInputMenu = input.nextInt();                                                                                                    // Stores user input based on one of the 5 options above.
         if(userInputMenu == 1){                                                                                                             // If the first menu option was selected...
            userInputTV = -1;                                                                                                                // Sets userInputTV to =-1 to let the while loop below run at least once.
            while(userInputTV < 1 || userInputTV > 8){                                                                                       // Runs as long as a number between 1-8 is not selected.
               System.out.println("Enter TV number (1-8).");                                                                                 // Asks the user for a number 1-8 based on the TV the user wishes to select.
               userInputTV = input.nextInt();                                                                                                // Stores the number entered in userInputTV.
            }
         }else if(userInputMenu == 2){                                                                                                       // If the second menu option was selected...
            userInputChannel = -1;                                                                                                           // Sets userInputChannel =-1 to let the while loop below run at least once.
            while(uniqueChannel == true || userInputChannel < 1 || userInputChannel > 400){                                                  // As long as there is not a unique channel, or the user input is either less than 1 or greater than 400 (channel range is 1-400)...
               System.out.println("TV channel: " + userInputChannel);                                                                        // Displays the selected TV's channel.
               System.out.println("Please enter a channel not currently selected by other TV's, or is between 0 and 400.");                  // Asks for a user to enter a channel between 0 and 400.
               userInputChannel = input.nextInt();                                                                                           // Stores the channel entered in userInputChannel.
               uniqueChannel = channelSearch(myArray, userInputChannel);                                                                     // Change property with action.
            }
            if(userInputTV == 1){                                                                                                            // If the TV selected is TV 1...
               myArray[0][0] = userInputChannel;                                                                                             // The first element in row 0 stores the channel entered...
               television1.channelChange(userInputChannel);                                                                                  // Changes the channel property for the first television object (action).
            }else if(userInputTV == 2){                                                                                                      // If the TV selected is TV 2...
               myArray[1][0] = userInputChannel;                                                                                             // The first element in row 1 stores the channel entered...
               television2.channelChange(userInputChannel);                                                                                  // Changes the channel property for the second television object (action).
            }else if(userInputTV == 3){                                                                                                      // If the TV selected is TV 3...
               myArray[2][0] = userInputChannel;                                                                                             // The first element in row 2 stores the channel entered...
               television3.channelChange(userInputChannel);                                                                                  // Changes the channel property for the third television object (action).
            }else if(userInputTV == 4){                                                                                                      // If the TV selected is TV 4...
               myArray[3][0] = userInputChannel;                                                                                             // The first element in row 3 stores the channel entered...
               television4.channelChange(userInputChannel);                                                                                  // Changes the channel property for the fourth television object (action).
            }else if(userInputTV == 5){                                                                                                      // If the TV selected is TV 5...
               myArray[4][0] = userInputChannel;                                                                                             // The first element in row 4 stores the channel entered...
               television5.channelChange(userInputChannel);                                                                                  // Changes the channel property for the fifth television object (action).
            }else if(userInputTV == 6){                                                                                                      // If the TV selected is TV 6...
               myArray[5][0] = userInputChannel;                                                                                             // The first element in row 5 stores the channel entered...
               television6.channelChange(userInputChannel);                                                                                  // Changes the channel property for the sixth television object (action).
            }else if(userInputTV == 7){                                                                                                      // If the TV selected is TV 7...
               myArray[6][0] = userInputChannel;                                                                                             // The first element in row 6 stores the channel entered...
               television7.channelChange(userInputChannel);                                                                                  // Changes the channel property for the seventh television object (action).
            }else if(userInputTV == 8){                                                                                                      // If the TV selected is TV 8...
               myArray[7][0] = userInputChannel;                                                                                             // The first element in row 7 stores the channel entered...
               television8.channelChange(userInputChannel);                                                                                  // Changes the channel property for the eighth television object (action).
            }
         }else if(userInputMenu == 3){                                                                                                                // If the third menu option is selected...
            option3(myArray, userInputTV, television1, television2, television3, television4, television5, television6, television7, television8);    // Passes the array and all objects and calls the third menu selection method.
         }else if(userInputMenu == 4){                                                                                                                // If the fourth menu option is selected...
            option4(myArray, userInputTV, television1, television2, television3, television4, television5, television6, television7, television8);    // Passes the array and all objects and calls the fourth menu selection method.
         }else if(userInputMenu == 5){                                                                                                                // If the fifth
            System.out.println("System exited.");
            System.exit(1);
         }
      }
   }
public static boolean channelSearch(int [][] myArray, int userInput){
   if(myArray[0][0] == userInput){
      return true;
   }else if(myArray[1][0] == userInput){
      return true;
   }else if(myArray[2][0] == userInput){
      return true;
   }else if(myArray[3][0] == userInput){
      return true;
   }else if(myArray[4][0] == userInput){
      return true;
   }else if(myArray[5][0] == userInput){
      return true;
   }else if(myArray[6][0] == userInput){
      return true;
   }else if(myArray[7][0] == userInput){
      return true;
   }
   return false;
}
   public static void option4(int [][] myArray, int userInputTV, television television1, television television2, television television3, television television4, television television5, television television6, television television7, television television8){
      Scanner input = new Scanner (System.in);
      int userInputSelection = -1;
      System.out.println("Would you like to turn this TV off/on?");
      while(userInputSelection != 1){
         System.out.println("Enter 1 for power change.");
         userInputSelection = input.nextInt();
      }   
            if(userInputTV == 1 && myArray[0][2] == 1){
               myArray[0][2] = 0;
               television1.systemChange(0);
               System.out.println(myArray[0][2]);
               System.out.println(television1.on);
            }else if(userInputTV == 2 && myArray[1][2] == 1){
               myArray[1][2] = 0;
               television2.systemChange(0);
            }else if(userInputTV == 3 && myArray[2][2] == 1){
               myArray[2][2] = 0;
               television3.systemChange(0);
            }else if(userInputTV == 4 && myArray[3][2] == 1){
               myArray[3][2] = 0;
               television4.systemChange(0);
            }else if(userInputTV == 5 && myArray[4][2] == 1){
               myArray[4][2] = 0;
               television5.systemChange(0);
            }else if(userInputTV == 6 && myArray[5][2] == 1){
               myArray[5][2] = 0;
               television6.systemChange(0);
            }else if(userInputTV == 7 && myArray[6][2] == 1){
               myArray[6][2] = 0;
               television7.systemChange(0);
            }else if(userInputTV == 8 && myArray[7][2] == 1){
               myArray[7][2] = 0;
               television8.systemChange(0);
            }else if(userInputTV == 1 && myArray[0][2] == 0){
               myArray[0][2] = 1;
               television1.systemChange(1);
               System.out.println(myArray[0][2]);
               System.out.println(television1.on);
            }else if(userInputTV == 2 && myArray[1][2] == 0){
               myArray[1][2] = 1;
               television2.systemChange(1);
            }else if(userInputTV == 3 && myArray[2][2] == 0){
               myArray[2][2] = 1;
               television3.systemChange(1);
            }else if(userInputTV == 4 && myArray[3][2] == 0){
               myArray[3][2] = 1;
               television4.systemChange(1);
            }else if(userInputTV == 5 && myArray[4][2] == 0){
               myArray[4][2] = 1;
               television5.systemChange(1);
            }else if(userInputTV == 6 && myArray[5][2] == 0){
               myArray[5][2] = 1;
               television6.systemChange(1);
            }else if(userInputTV == 7 && myArray[6][2] == 0){
               myArray[6][2] = 1;
               television7.systemChange(1);
            }else if(userInputTV == 8 && myArray[7][2] == 0){
               myArray[7][2] = 1;
               television8.systemChange(1);
            }
  }
   public static void option3(int [][] myArray, int userInputTV, television television1, television television2, television television3, television television4, television television5, television television6, television television7, television television8){
      Scanner input = new Scanner(System.in);
      int userInputVolume = 0;
      userInputVolume = -1;
      while(userInputVolume < 0 || userInputVolume > 100){
         System.out.println("Enter a valid volume number.");
         userInputVolume = input.nextInt();
      }   
      if(userInputTV == 1){
         myArray[0][1] = userInputVolume;
         television1.volumeChange(userInputVolume);
      }else if(userInputTV == 2){
         myArray[1][1] = userInputVolume;
         television2.volumeChange(userInputVolume);
      }else if(userInputTV == 3){
         myArray[2][1] = userInputVolume;
         television3.volumeChange(userInputVolume);
      }else if(userInputTV == 4){
         myArray[3][1] = userInputVolume;
         television4.volume = userInputVolume;
      }else if(userInputTV == 5){
         myArray[4][1] = userInputVolume;
         television5.volumeChange(userInputVolume);
      }else if(userInputTV == 6){
         myArray[5][1] = userInputVolume;
         television6.volumeChange(userInputVolume);
      }else if(userInputTV == 7){
         myArray[6][1] = userInputVolume;
         television7.volumeChange(userInputVolume);
      }else if(userInputTV == 8){
         myArray[7][1] = userInputVolume;
         television8.volumeChange(userInputVolume);
      }
   }
}
class television{
   double volume = 1, channel = 1, on = 1;                                                               // Variable initialization for no argument constructor.
   public television(){                                                                                  // No argument constructor.
   }
   public television(int newVolume, int newChannel, int newOn){                                          // Constructor for the television.
      volume = newVolume;                                                                                // Property of the television (volume of sound).
      channel = newChannel;                                                                              // Property of the television (it's channel).
      on = newOn;                                                                                        // Property of the television's on/off state.
   }
   public double turnOn(){                                                                               // Function that turns on the television.                                                                                      // The television is off if the above if statement's conditions are not determined to be true. Function returns false.
      on = 1;                                                                                            // The variable storing the TV's state becomes 1 (on).
      return on;                                                                                         // Returns the TV's state (1).
   }
   public double turnOff(){                                                                              // Function that turns off the television.
      on = 0;                                                                                            // The variable stroing the TV's state becomes 1 (off).
      return on;                                                                                         // Returns the TV's state (0).
   }
   public void volumeChange(int userInput){
      int volume2 = 0;
      volume2 = userInput;
      if(volume <= 100 && volume >= 0){                                                          // If the volume level is between 0 and 100 when it is incremented by 1...
         volume = volume2;
      }
      System.out.println("Maximum volume reached.");
   }
   public void systemChange(int userInput){
      int on2 = 0;
      on2 = userInput;
      on = on2;
   }
   public int channelChange(int userInput){                                                              // Function that changes the current channel to the next channel.
      int channel = 0;
      channel = userInput;
      return channel;
   }
   public double channelDown(){                                                                          // Function that changes the current channel to the previous channel.
      if(channel - 1 <= 120 && channel - 1 >= 1){                                                        // If the next channel is between 1-120...
         return channel--;                                                                               // Returns that channel (number).
      }
      System.out.println("The minimum channel number has been reached.");                                // Tells the user that the minimum channel number was reached.
      return channel;                                                                                    // Returns the current channel.
   }
   public double volumeUp(){                                                                             // Function that raises the volume of the television's speakers.
      if(volume + 1 <= 100 && volume + 1 >= 0){                                                          // If the volume level is between 0 and 100 when it is incremented by 1...
         return volume++;                                                                                // The TV's volume is incremented by 1.
      }
      System.out.println("The max volume has been reached.");                                            // Tells the user that the max volume has been reached.
      return volume;                                                                                     // Returns original volume setting.
   }
   public double volumeDown(){                                                                           // Function that lowers the volume of the television's speakers.
      if(volume - 1 <= 100 && volume - 1 >= 0){                                                          // If the volume level is between 0 and 100 when it is lowered by 1...
         return volume--;                                                                                // The TV's volume is lowered by 1.
      }
      System.out.println("The minimum volume has been reached.");                                        // Tells the user that the minimum volume level has been reached.
      return volume;                                                                                     // Returns original volume setting.
   }
}