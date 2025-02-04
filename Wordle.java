import java.applet.Applet;
import java.awt.*;
import java.util.Scanner;

//This program utilizes the Expo class, a class created by Mr. Leon Schram, to preform some of the graphics functions seen below. I did not create the Expo class.
//This code should work with any Java-supported IDE and computer that has Java pre-installed on it
//Copy everything on here and the Expo Class file, paste each of them into Java files within the same folder, and then run the program Wordle file (this file)
//The window size this program runs on is 1920x1080, so readjsuting the window size might be optimal to get the best experience while running the code
//If there are any bugs, feel free to email me about them at setuokwu@gmail.com!
//Enjoy :)

public class Wordle extends Applet
{

   //Variables and Lists
   
   //A list of 488 5-letter words
   String[]fiveLetterWords = {"About","Alert","Argue","Beach","Above","Alike","Arise","Began","Abuse","Alive","Array","Begin","Actor","Allow","Aside","Begun","Acute","Alone","Asset","Being","Admit","Along","Audio","Below","Adopt","Alter","Audit","Bench","Adult","Among","Avoid","Billy","After","Anger","Award","Birth","Again","Angle","Aware","Black","Agent","Angry","Badly","Blame","Agree","Apart","Baker","Blind","Ahead","Apple","Bases","Block","Alarm","Apply","Basic","Blood","Album","Arena","Basis","Board","Boost","Buyer","China","Cover","Booth","Cable","Chose","Craft","Bound","Calif","Civil","Crash","Brain","Carry","Claim","Cream","Brand","Catch","Class","Crime","Bread","Cause","Clean","Cross","Break","Chain","Clear","Crowd","Breed","Chair","Click","Crown","Brief","Chart","Clock","Curve","Bring","Chase","Close","Cycle","Broad","Cheap","Coach","Daily","Broke","Check","Coast","Dance","Brown","Chest","Could","Dated","Build","Chief","Count","Dealt","Built","Child","Court","Death","Debut","Entry","Forth","Group","Delay","Equal","Forty","Grown","Depth","Forum","Guard","Doing","Event","Found","Guess","Doubt","Every","Frame","Guest","Dozen","Exact","Frank","Guide","Draft","Exist","Fraud","Happy","Drama","Extra","Fresh","Harry","draw","Faith","Front","Heart","Dream","False","Fruit","Heavy","Dress","Fault","Fully","Hence","Drill","Fibre","Funny","Night","Drink","Field","Giant","Horse","Drive","Fifth","Given","Hotel","Drove","Fifty","Glass","House","Dying","Fight","Globe","Human","Eager","Final","Going","Ideal","Early","First","Grace","Image","Earth","Fixed","Grade","Index","Eight","Flash","Grand","Inner","Elite","Fleet","Grant","Input","Empty","Floor","Grass","Issue","Enemy","Fluid","Great","Irony","Enjoy","Focus","Green","Juice","Enter","Force","Gross","Joint","Judge","Metal","Media","Newly","Known","Local","Might","Noise","Label","Logic","Minor","North","Large","Loose","Minus","Noted","Laser","Lower","Mixed","Novel","Later","Lucky","Model","Nurse","Laugh","Lunch","Money","Occur","Layer","Lying","Month","Ocean","Learn","Magic","Moral","Offer","Lease","Major","Motor","Often","Least","Maker","Mount","Order","Leave","March","Mouse","Other","Legal","Music","Mouth","Ought","Level","Match","Movie","Paint","Light","Mayor","Needs","Paper","Limit","Meant","Never","Party","Peace","Power","Radio","Round","Panel","Press","Raise","Route","Phase","Price","Range","Royal","Phone","Pride","Rapid","Rural","Photo","Prime","Ratio","Scale","Piece","Print","Reach","Scene","Pilot","Prior","Ready","Scope","Pitch","Prize","Refer","Score","Place","Proof","Right","Sense","Plain","Proud","Rival","Serve","Plane","Prove","River","Seven","Plant","Queen","Quick","Shall","Plate","Sixth","Stand","Shape","Point","Quiet","Roman","Share","Pound","Quite","Rough","Sharp","Sheet","Spare","Style","Times","Shelf","Speak","Sugar","Tired","Shell","Speed","Suite","Title","Shift","Spend","Super","Today","Shirt","Spent","Sweet","Topic","Shock","Split","Table","Total","Shoot","Spoke","Taken","Touch","Short","Sport","Taste","Tough","Shown","Staff","Taxes","Tower","Sight","Stage","Teach","Track","Since","Stake","Teeth","Trade","Sixty","Start","Texas","Treat","Sized","State","Thank","Trend","Skill","Steam","Theft","Trial","Sleep","Steel","Their","Tried","Slide","Stick","Theme","Tries","Small","Still","There","Truck","Smart","Stock","These","Truly","Smile","Stone","Thick","Trust","Smith","Stood","Thing","Truth","Smoke","Store","Think","Twice","Solid","Storm","Third","Under","Solve","Story","Those","Undue","Sorry","Strip","Three","Union","Sound","Stuck","Threw","Unity","South","Study","Throw","Until","Space","Stuff","Tight","Upper","Upset","Whole","Waste","Wound","Urban","Whose","Watch","Write","Usage","Woman","Water","Wrong","Usual","Train","Wheel","Wrote","Valid","World","Where","Yield","Value","Worry","Which","Young","Video","Worse","While","Youth","Virus","Worst","White","Worth","Visit","Would","Vital","Voice"};
   
   //The areas for the user to click
   
   Rectangle play, rules, letterA, letterB, letterC, letterD, letterE, letterF, letterG, letterH, letterI, letterJ, letterK, letterL, letterM, letterN, letterO, letterP, letterQ, letterR, letterS, letterT, letterU, letterV, letterW, letterX, letterY, letterZ, enter, clearRow, exit;
   
   //The case variable
   int theButton = 0;
   
   //Timer variables
   long startTime;
   long endTime;
   
   //The board's 25 sqaures and their corresponding x andd y coordinates
   int x1sq1 = 500;
   int x2sq1 = 630;
   int y1sq1 = 200;
   int y2sq1 = 310;
   
   int x1sq2 = 650;
   int x2sq2 = 790;
   int y1sq2 = 200;
   int y2sq2 = 310;
   
   int x1sq3 = 810;
   int x2sq3 = 950;
   int y1sq3 = 200;
   int y2sq3 = 310;
   
   int x1sq4 = 970;
   int x2sq4 = 1110;
   int y1sq4 = 200;
   int y2sq4 = 310;   
   
   int x1sq5 = 1130;
   int x2sq5 = 1300;
   int y1sq5 = 200;
   int y2sq5 = 310;
   
   int x1sq6 = 500;
   int x2sq6 = 630;
   int y1sq6 = 330;
   int y2sq6 = 430;
   
   int x1sq7 = 650;
   int x2sq7 = 790;
   int y1sq7 = 330;
   int y2sq7 = 430;
   
   int x1sq8 = 810;
   int x2sq8 = 950;
   int y1sq8 = 330;
   int y2sq8 = 430;
   
   int x1sq9 = 970;
   int x2sq9 = 1110;
   int y1sq9 = 330;
   int y2sq9 = 430;   
   
   int x1sq10 = 1130;
   int x2sq10 = 1300;
   int y1sq10 = 330;
   int y2sq10 = 430;

   
   int x1sq11 = 500;
   int x2sq11 = 630;
   int y1sq11 = 450;
   int y2sq11 = 550;
   
   int x1sq12 = 650;
   int x2sq12 = 790;
   int y1sq12 = 450;
   int y2sq12 = 550;
   
   int x1sq13 = 810;
   int x2sq13 = 950;
   int y1sq13 = 450;
   int y2sq13 = 550;
   
   int x1sq14 = 970;
   int x2sq14 = 1110;
   int y1sq14 = 450;
   int y2sq14 = 550;   
   
   int x1sq15 = 1130;
   int x2sq15 = 1300;
   int y1sq15 = 450;
   int y2sq15 = 550;

   
   int x1sq16 = 500;
   int x2sq16 = 630;
   int y1sq16 = 570;
   int y2sq16 = 670;
   
   int x1sq17 = 650;
   int x2sq17 = 790;
   int y1sq17 = 570;
   int y2sq17 = 670;
   
   int x1sq18 = 810;
   int x2sq18= 950;
   int y1sq18 = 570;
   int y2sq18 = 670;
   
   int x1sq19 = 970;
   int x2sq19 = 1110;
   int y1sq19 = 570;
   int y2sq19 = 670;   
   
   int x1sq20 = 1130;
   int x2sq20 = 1300;
   int y1sq20 = 570;
   int y2sq20 = 670;

   int x1sq21 = 500;
   int x2sq21 = 630;
   int y1sq21 = 690;
   int y2sq21 = 800;
     
   int x1sq22 = 650;
   int x2sq22 = 790;
   int y1sq22 = 690;
   int y2sq22 = 800;
   
   int x1sq23 = 810;
   int x2sq23 = 950;
   int y1sq23 = 690;
   int y2sq23 = 800;
   
   int x1sq24 = 970;
   int x2sq24 = 1110;
   int y1sq24 = 690;
   int y2sq24 = 800;   
   
   int x1sq25 = 1130;
   int x2sq25 = 1300;
   int y1sq25 = 690;
   int y2sq25 = 800;

   //Determines what row this is
   
   boolean firstRow = true;
   boolean secondRow = false;
   boolean thirdRow = false;
   boolean fourthRow = false;
   boolean fifthRow = false;
   boolean lastRow = false;
   
   //Determines the completed Row
   
   boolean firstRowDone = false;
   boolean secondRowDone = false;
   boolean thirdRowDone = false;
   boolean fourthRowDone = false;
   boolean fifthRowDone = false;
   
   //The Color of the sqaure (yes, this is going to be a lot)
   
   boolean ySq1 = false;
   boolean ySq2 = false;
   boolean ySq3 = false;
   boolean ySq4 = false;
   boolean ySq5 = false;
   boolean ySq6 = false;
   boolean ySq7 = false;
   boolean ySq8 = false;
   boolean ySq9 = false;
   boolean ySq10 = false;
   boolean ySq11 = false;
   boolean ySq12 = false;
   boolean ySq13 = false;
   boolean ySq14 = false;
   boolean ySq15 = false;
   boolean ySq16 = false;
   boolean ySq17 = false;
   boolean ySq18 = false;
   boolean ySq19 = false;
   boolean ySq20 = false;
   
   boolean gSq1 = false;
   boolean gSq2 = false;
   boolean gSq3 = false;
   boolean gSq4 = false;
   boolean gSq5 = false;
   boolean gSq6 = false;
   boolean gSq7 = false;
   boolean gSq8 = false;
   boolean gSq9 = false;
   boolean gSq10 = false;
   boolean gSq11 = false;
   boolean gSq12 = false;
   boolean gSq13 = false;
   boolean gSq14 = false;
   boolean gSq15 = false;
   boolean gSq16 = false;
   boolean gSq17 = false;
   boolean gSq18 = false;
   boolean gSq19 = false;
   boolean gSq20 = false;
   
   //Determines the position of letter
   
   boolean firstLetter = true;
   boolean secondLetter = false;
   boolean thirdLetter = false;
   boolean fourthLetter = false;
   boolean fifthLetter = false; 
   boolean isFifthLetter = false;
     
   //Checks whether the Title Screen Has Been Displayed
   
   boolean titleScreenDisplayed = false;
   
   //Checks if the user won the game
   
   boolean gameWin = false;
   boolean gameOver = false;
   
   //Starting values for the letters on the Wordle Board
   
   int startingX = 540;
   int startingY = 275;
   
   //Number of attempts the user has made
   
   int attempts = 1;
   
   //Statistics (Wins/Losses/Etc)
   
   int wins = 0;
   int losses = 0;
   int winsInARow = 0;
   int lossesInARow = 0;
   int bestWinningStreak = 0;
   int worstLosingStreak = 0;
   int totalAttempts = 0;
   
   long currentTime = 0;
   long bestTime = 2147483647;
   
   //Checks if there's been one game completed
   
   boolean firstGameDone = false;
   boolean onBoard = false;
   
   //Random Word Generator
   
   int randomNumber = Expo.random(0,488);
   String randomWord = fiveLetterWords[randomNumber].toUpperCase();
      
   //Counts the number of letters drawn in a game
   
   int drawnLetters = 0;    
    
   //The User String
   
   String userString = "";
   
   //Remebers the pervious guess made by the user
   
   String firstGuess = "";
   String secondGuess = "";
   String thirdGuess = "";
   String fourthGuess = "";
   
   //Creates the area for the various buttons the user can interact with
         
   public void init()
   {
      play = new Rectangle(600,200,600,200);
      rules = new Rectangle(600,500,600,200);
      
      letterA = new Rectangle(0,850,73,330);
      letterB = new Rectangle(73,850,73,330);
      letterC = new Rectangle(148,850,73,330);
      letterD = new Rectangle(222,850,73, 330);
      letterE = new Rectangle(296,850,73, 330);
      letterF = new Rectangle(370,850,73, 330);
      letterG = new Rectangle(444,850,73, 330);
      letterH = new Rectangle(518,850,73, 330);
      letterI = new Rectangle(592,850,73, 330);
      letterJ = new Rectangle(666,850,73, 330);
      letterK = new Rectangle(730,850,73, 330);
      letterL = new Rectangle(814,850,73, 330);
      letterM = new Rectangle(888,850,73, 330);
      letterN = new Rectangle(962,850,73, 330);
      letterO = new Rectangle(1036,850,73, 330);
      letterP = new Rectangle(1110,850,73, 330); 
      letterQ = new Rectangle(1184,850,73, 330); 
      letterR = new Rectangle(1258,850,73, 330);
      letterS = new Rectangle(1332,850,73, 330); 
      letterT = new Rectangle(1406,850,73, 330); 
      letterU = new Rectangle(1480,850,73, 330); 
      letterV = new Rectangle(1554,850,73, 330); 
      letterW = new Rectangle(1628,850,73, 330); 
      letterX = new Rectangle(1692,850,73, 330);
      letterY = new Rectangle(1766,850,73, 330);
      letterZ = new Rectangle(1840,850,80, 330); 
      
      enter = new Rectangle(1500,450,200,200);
      clearRow = new Rectangle(1450,250,300,100);
      
      exit = new Rectangle(0,0,200,100);  
   }

   //Where the program preforms Graphics Command

   public void paint(Graphics g)
   {   
   
      //Stops the title screen from appearing after the user clicks a button
      
      if (titleScreenDisplayed == false)
      {
         mainScreenBackground(g);
         Button(g);
         titleScreenDisplayed = true;
      }
    
      //Methods that preform based on the area of the screen that's clicked
      
      g.setFont(new Font("Arial",Font.BOLD,50));
   	
      switch (theButton)
      {
         //The loading screen after the user clicks the "Play" Button
         
         case 1:
         
         Expo.setBackground(g,Expo.white);
         g.drawString("Welcome to Wordle! Give us a few seconds to get everything ready :)",150,500);
         Expo.delay(5000);         
         boardSetup(g);
         Expo.delay(1000);
         wordleSetup(g);
         break;
         
         //The rules page after the user clicks the "Rules" Button
           
         case 2:        
                  
         Expo.setBackground(g,Expo.white);
         g.drawString("Welcome to the Rules Page! Here are the main Rules for Wordle:",225,50);
         g.setFont(new Font("Arial",Font.BOLD,25));
         g.drawString("Rule 1: Words you enter have to be exactly 5 letters, or else the game won't work properly :(",200,200);
         g.drawString("Rule 2: If you want to clear a row, you may click the CLEAR ROW Button",200,300);
         g.drawString("Rule 3: If you want to add a letter to your word, click the corresponding letter on the keyboard towards the bottom of the screen",200,400);
         g.drawString("Rule 4: To enter your inputted word, click the ENTER button to the right of the Wordle Board",200,500);
         g.drawString("Rule 5: After entering a word, there will be three colors:",200,575); 
         g.setFont(new Font("Arial",Font.BOLD,25));
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,200,625,250,675);
         g.drawString("A yellow letter means that the letter is in the mystery word, but it's in the wrong spot",275,660);
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,200,700,250,750);
         g.drawString("A green letter means that the letter is in the mystery word and it's in the right space",275,735);
         Expo.setColor(g,Expo.grey);
         Expo.fillRectangle(g,200,775,250,825);
         g.drawString("A grey letter means that the letter not in the mystery word at all",275,810);
         Expo.setColor(g,Expo.black);
         g.drawString("Rule 6: The game ends when you correctly guess the word in 5 tries or less or you fail to",200,900);
         
         //Drawing the Exit Button
         
         Expo.setColor(g,Expo.red);
         Expo.fillRectangle(g,0,0,200,100);
         Expo.setColor(g,Expo.black);
         g.setFont(new Font("Arial",Font.BOLD,20));
         g.drawString("Exit to Main Menu",15,60);
         
         break;
         
         case 3:
         
         //Determines where to draw the letter A
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"A"); 
            secondLetter = true;
            firstLetter = false;       
         }

         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"A"); 
            thirdLetter = true;
            secondLetter = false;         
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"A"); 
            fourthLetter = true;
            firstLetter = false;         
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"A"); 
            fifthLetter = true;
            fourthLetter = false;
         }
              
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"A"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"A"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"A"); 
            thirdLetter = true;
            secondLetter = false;         
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"A"); 
            fourthLetter = true;
            thirdLetter = false;   
         }

         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"A"); 
            fifthLetter = true;
            fourthLetter = false;
         }
     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"A"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520;          
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"A"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"A"); 
            thirdLetter = true;
            secondLetter = false;                 
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"A"); 
            fourthLetter = true;
            thirdLetter = false;
         }

         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"A"); 
            fifthLetter = true;
            fourthLetter = false;
         }
     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"A"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }

         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"A"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"A"); 
            thirdLetter = true;
            secondLetter = false;         
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"A"); 
            fourthLetter = true;  
            thirdLetter = false;       
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"A"); 
            fifthLetter = true;
            fourthLetter = false;   
         }
     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"A"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }

         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"A"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"A"); 
            thirdLetter = true;
            secondLetter = false;        
         }

         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"A"); 
            fourthLetter = true;
            thirdLetter = false;            
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"A"); 
            fifthLetter = true;
            fourthLetter = false;            
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"A"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fifthRow = false;
         }

         break;
         
         case 4:     
         
         //Determines where to draw the letter B
             
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"B"); 
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"B"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"B"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"B"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"B"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
               
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"B"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"B"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"B"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"B"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"B"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"B"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"B"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"B"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"B"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"B"); 
                 isFifthLetter = true;
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"B"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"B"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"B"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"B"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"B"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"B"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"B"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"B"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"B"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"B"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fifthRow = false;
         }  
          
         break;
         
         case 5:
         
         //Determines where to draw the letter C         
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"C");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"C"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"C"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"C"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"C"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
 
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"C"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"C"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"C"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"C"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"C"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"C"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"C"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"C"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"C"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"C"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"C"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"C"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"C"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"C"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"C"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"C"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"C"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"C"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"C"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"C"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;          
         }            
          
         break;
         
         case 6:
         
         //Determines where to draw the letter D
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"D");   
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"D");  
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"D");  
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"D");  
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"D");  
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }            
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"D");  
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"D");  
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"D");  
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"D");  
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"D");  
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"D");  
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"D");  
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"D");  
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"D");  
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"D");  
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"D");  
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"D");  
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"D");  
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"D");  
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"D");  
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"D");  
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"D");  
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"D");  
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"D");  
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"D");            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;           
         }            
         
         break;
      
         case 7:
         
         //Determines where to draw the letter E

         if(firstRow == true && firstLetter == true)
         {
            draw(g,"E");   
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"E");  
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"E");  
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"E");  
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"E");  
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"E");  
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"E");  
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"E");  
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"E");  
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"E");  
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"E");  
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"E");  
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"E");  
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"E");  
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"E");  
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"E");  
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"E");  
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"E");  
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"E");  
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"E");  
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"E");  
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"E");  
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"E");  
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"E");  
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"E");  
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;           
         }

         break;
         
         case 8:
         
         //Determines where to draw the letter F
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"F");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"F"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"F"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"F"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"F"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"F"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"F"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"F"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"F"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"F"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"F"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"F"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"F"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"F"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"F"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"F"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"F"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"F"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"F"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"F"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"F"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"F"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"F"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"F"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"F"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;           
         }

         break;
         
         case 9:
         
         //Determines where to draw the letter G
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"G");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"G"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"G"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"G"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"G"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"G"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"G"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"G"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"G"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"G"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"G"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"G"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"G"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"G"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"G"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"G"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"G"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"G"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"G"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"G"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"G"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"G"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"G"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"G"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"G"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;           
         }        
          
         break;
      
         case 10:
         
         //Determines where to draw the letter H
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"H");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"H"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"H"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"H"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"H"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"H"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"H"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"H"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"H"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"H"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"H"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"H"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"H"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"H"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"H"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"H"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"H"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"H"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"H"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"H"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"H"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"H"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"H"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"H"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"H"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;           
         }
         
         break;
         
         case 11:
         
         //Determines where to draw the letter I
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"I");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"I"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"I"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"I"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"I"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"I"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"I"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"I"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"I"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"I"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"I"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"I"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"I"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"I"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"I"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"I"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"I"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"I"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"I"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"I"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"I"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"I"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"I"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"I"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"I"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;           
         }
          
         break;
         
         case 12:
         
         //Determines where to draw the letter J
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"J");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"J"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"J"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"J"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"J"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"J"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"J"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"J"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"J"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"J"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"J"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"J"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"J"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"J"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"J"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"J"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"J"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"J"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"J"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"J"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"J"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"J"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"J"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"J"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"J"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            isFifthLetter = true;           
         }                
          
         break;
         
         case 13:
         
         //Determines where to draw the letter K         
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"K");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"K"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"K"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"K"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"K"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"K"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"K"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"K"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"K"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"K"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"K"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"K"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"K"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"K"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"K"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"K"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"K"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"K"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"K"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"K"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"K"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"K"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"K"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"K"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"K"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;      
         }
             
         break;
         
         case 14:
         
         //Determines where to draw the letter L
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"L");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"L"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"L"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"L"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"L"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"L"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"L"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"L"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"L"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"L"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"L"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"L"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"L"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"L"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"L"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"L"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"L"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"L"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"L"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"L"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"L"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"L"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"L"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"L"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"L"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;           
         }

         break;
          
         case 15:
         
         //Determines where to draw the letter M
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"M");   
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"M");  
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"M");  
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"M");  
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"M");  
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"M");  
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"M");  
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"M");  
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"M");  
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"M");  
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"M");  
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"M");  
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"M");  
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"M");  
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"M");  
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"M");  
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"M");  
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"M");  
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"M");  
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"M");  
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"M");  
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"M");  
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"M");  
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"M");  
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"M");  
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;           
         }     
          
         break;
         
         case 16:
         
         //Determines where to draw the letter N         
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"N");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"N"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"N"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"N"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"N"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"N"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"N"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"N"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"N"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"N"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"N"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"N"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"N"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"N"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"N"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"N"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"N"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"N"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"N"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"N"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"N"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"N"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"N"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"N"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"N"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;           
         }
          
         break;
         
         case 17:
         
         //Determines where to draw the letter O         
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"O");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"O"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"O"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"O"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"O"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"O"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"O"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"O"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"O"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"O"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"O"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"O"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"O"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"O"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"O"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"O"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"O"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"O"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"O"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"O"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"O"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"O"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"O"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"O"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"O"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;           
         }

         break;
         
         case 18:
         
         //Determines where to draw the letter P    
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"P");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"P"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"P"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"P"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"P"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"P"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"P"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"P"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"P"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"P"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"P"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"P"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"P"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"P"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"P"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"P"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"P"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"P"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"P"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"P"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"P"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"P"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"P"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"P"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"P"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;           
         }
             
         break;
         
         case 19:
         
         //Determines where to draw the letter Q
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"Q");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"Q"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"Q"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"Q"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"Q"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"Q"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"Q"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"Q"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"Q"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"Q"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"Q"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"Q"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"Q"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"Q"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"Q"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"Q"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"Q"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"Q"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"Q"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"Q"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"Q"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"Q"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"Q"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"Q"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"Q"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;           
         }
          
         break;
         
         case 20:
         
         //Determines where to draw the letter R
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"R");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"R"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"R"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"R"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"R"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"R"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"R"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"R"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"R"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"R"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"R"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"R"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"R"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"R"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"R"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"R"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"R"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"R"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"R"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"R"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"R"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"R"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"R"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"R"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"R"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;           
         }

         break;
         
         case 21:
         
         //Determines where to draw the letter S
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"S");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"S"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"S"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"S"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"S"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"S"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"S"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"S"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"S"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"S"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"S"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"S"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"S"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"S"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"S"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"S"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"S"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"S"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"S"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"S"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"S"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"S"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"S"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"S"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"S"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;           
         }       
          
         break;
         
         case 22:
         
         //Determines where to draw the letter T
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"T");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"T"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"T"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"T"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"T"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"T"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"T"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"T"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"T"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"T"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"T"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"T"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"T"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"T"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"T"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"T"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"T"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"T"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"T"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"T"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"T"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"T"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"T"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"T"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"T"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;           
         }

         break;
         
         case 23:
         
         //Determines where to draw the letter U
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"U");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"U"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"U"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"U"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"U"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"U"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"U"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"U"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"U"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"U"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"U"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"U"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"U"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"U"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"U"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"U"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"U"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"U"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"U"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"U"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"U"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"U"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"U"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"U"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"U"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;           
         }
      
         break;
         
         case 24:
         
         //Determines where to draw the letter V
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"V");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"V"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"V"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"V"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"V"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"V"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"V"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"V"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"V"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"V"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"V"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"V"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"V"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"V"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"V"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"V"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"V"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"V"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"V"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"V"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"V"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"V"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"V"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"V"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"V"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;           
         }    

         break;
         
         case 25:
         
         //Determines where to draw the letter W         
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"W");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"W"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"W"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"W"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"W"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"W"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"W"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"W"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"W"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"W"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"W"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"W"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"W"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"W"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"W"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"W"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"W"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"W"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"W"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"W"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"W"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"W"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"W"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"W"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"W"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;          
         }          
         
         break;
         
         case 26:
         
         //Determines where to draw the letter X
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"X");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"X"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"X"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"X"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"X"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"X"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"X"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"X"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"X"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"X"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"X"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"X"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"X"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"X"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"X"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"X"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"X"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"X"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"X"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"X"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"X"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"X"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"X"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"X"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"X"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;           
         }         
  
         break;
         
         case 27:
         
         //Determines where to draw the letter Y
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"Y");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"Y"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"Y"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"Y"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"Y"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"Y"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"Y"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"Y"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"Y"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"Y"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"Y"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"Y"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"Y"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"Y"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"Y"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"Y"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"Y"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"Y"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"Y"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"Y"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 

         }

         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"Y"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"Y"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"Y"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"Y"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"Y"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            
            isFifthLetter = true;           
         }
         
         break;
      
         case 28:
         
         //Determines where to draw the letter Z
         
         if(firstRow == true && firstLetter == true)
         {
            draw(g,"Z");  
            secondLetter = true;
            firstLetter = false;        
         }
         
         else if(firstRow == true && secondLetter == true)
         {
            draw(g,"Z"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(firstRow == true && thirdLetter == true)
         {
            draw(g,"Z"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(firstRow == true && fourthLetter == true)
         {
            draw(g,"Z"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(firstRow == true && fifthLetter == true)
         {
            draw(g,"Z"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            firstRow = false;
            secondRow = true;
            startingX = 540;
            startingY = 405; 
         }   
         
         
         else if(secondRow == true && firstLetter == true)
         {
            draw(g,"Z"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(secondRow == true && secondLetter == true)
         {
            draw(g,"Z"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(secondRow == true && thirdLetter == true)
         {
            draw(g,"Z"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(secondRow == true && fourthLetter == true)
         {
            draw(g,"Z"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(secondRow == true && fifthLetter == true)
         {
            draw(g,"Z"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            secondRow = false;
            thirdRow = true;
            startingX = 540;
            startingY = 520; 
         } 
         
         else if(thirdRow == true && firstLetter == true)
         {
            draw(g,"Z"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(thirdRow == true && secondLetter == true)
         {
            draw(g,"Z"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(thirdRow == true && thirdLetter == true)
         {
            draw(g,"Z"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(thirdRow == true && fourthLetter == true)
         {
            draw(g,"Z"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(thirdRow == true && fifthLetter == true)
         {
            draw(g,"Z"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            thirdRow = false;
            fourthRow = true;
            startingX = 540;
            startingY = 640; 
         }
         
         else if(fourthRow == true && firstLetter == true)
         {
            draw(g,"Z"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fourthRow == true && secondLetter == true)
         {
            draw(g,"Z"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fourthRow == true && thirdLetter == true)
         {
            draw(g,"Z"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fourthRow == true && fourthLetter == true)
         {
            draw(g,"Z"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fourthRow == true && fifthLetter == true)
         {
            draw(g,"Z"); 
            isFifthLetter = true;
            firstLetter = true;
            fifthLetter = false;
            fourthRow = false;
            fifthRow = true;
            startingX = 540;
            startingY = 760; 
         }
         
         else if(fifthRow == true && firstLetter == true)
         {
            lastRow = true;
            draw(g,"Z"); 
            isFifthLetter = false;
            secondLetter = true;
            firstLetter = false;         
         }
         
         else if(fifthRow == true && secondLetter == true)
         {
            draw(g,"Z"); 
            thirdLetter = true;
            secondLetter = false;            
         }
         
         else if(fifthRow == true && thirdLetter == true)
         {
            draw(g,"Z"); 
            fourthLetter = true;
            thirdLetter = false;
         }
         
         else if(fifthRow == true && fourthLetter == true)
         {
            draw(g,"Z"); 
            fifthLetter = true;
            fourthLetter = false;
         }     
         
         else if(fifthRow == true && fifthLetter == true)
         {
            draw(g,"Z"); 
            
            firstLetter = false;
            fifthLetter = false;
            fifthRow = false;
            isFifthLetter = true;     
         
         }  
         
         break;      
         
         case 29:
         
         //Calls the Enter Methods
                 
         enterMethods(g);
         
         break;
         
         case 30:
         
         //Calls the Clear Row Methods
         
         clearRowMethods(g);
         
         break;
         
         case 31:
         
         //Prints the stats when the user goes to the Main Screen (Only works when the user has completed at least one round)
         
         onBoard = false;
         mainScreenBackground(g);
         Button(g);
                     
         if(firstGameDone == true)
         {
             g.setFont(new Font("Arial",Font.BOLD,45));
             g.drawString("Your Current Session Stats!",20,80);
            
            if(bestWinningStreak < winsInARow)
            {
               bestWinningStreak = winsInARow;
            }
            
            if(worstLosingStreak < lossesInARow)
            {
               worstLosingStreak = lossesInARow;
            }
            
            Expo.setColor(g,Expo.grey);
            Expo.fillRectangle(g,10,85,505,415);
            Expo.setColor(g,Expo.black);
            Expo.drawRectangle(g,10,85,505,415);
            
            g.setFont(new Font("Arial",Font.BOLD,25));
            g.drawString("You've won " + wins + " time(s) this session",30,125);
            g.drawString("You've lost " + losses + " time(s) this session",30,165);
            
            if(winsInARow > 0)
            {
               g.drawString("Your current winning streak is: " + winsInARow,30,205);
            }
            
            if(lossesInARow > 0)
            {
               g.drawString("Your current losing streak is: " + lossesInARow,30,205);
            }
            
            g.drawString("Your best winstreak is: " + bestWinningStreak,30,245);
            g.drawString("Your worst losing streak is: " + worstLosingStreak,30,285);      
            g.drawString("You've played a total of " + (wins+losses) + " times",30,325);
            g.drawString("Your total attempts this sessions is: " + totalAttempts,30,365); 
            g.drawString("Your fastest time is: " + bestTime + " seconds",30,405);       
        
         }         
         
         break;
         
         case 32:
         
         //Primarily to debug and see whether an area has been clicked or not
         
         System.out.println("Miss click");
         break;
      }
   }
 
   //Creates the Main Screen for the game
   
   public void mainScreenBackground(Graphics g)
   {  
   
      //Green background  
         
      Expo.setColor(g,Expo.darkGreen);
      Expo.fillRectangle(g,0,0,1920,1080);
      
      //Displays the Game Title
      
      Expo.setColor(g,Expo.black);
      Font font1 = new Font("Times New Romans", Font.PLAIN,100);
      g.setFont(font1);
      g.drawString("WORDLE",700,100);
      
      onBoard = false;
   }
   
   //Draws the Buttons used on the Main Screen
   
   public void Button(Graphics g)
   {           
      //Play Button Main Screen
         
      Expo.setColor(g,144,238,144);
      Expo.fillOval(g,915,300,300,100);
      Expo.setColor(g,Expo.black);
      Expo.drawOval(g,915,300,300,100);
      Font font1 = new Font("Times New Romans", Font.PLAIN,100);
      g.setFont(font1);
      g.drawString ("PLAY",795,335);
   
      //Settings Button Main Screen 
         
      Expo.setColor(g,144,238,144);
      Expo.fillOval(g,915,600,300,100);
      Expo.setColor(g,Expo.black);
      Expo.drawOval(g,915,600,300,100);
      Font font2 = new Font("Times New Romans", Font.PLAIN,100);
      g.setFont(font2);
      g.drawString ("RULES",760,635);
      
      onBoard = false;
   }
   
   //Method that sets up the board the user interacts with
   
   public void boardSetup(Graphics g)
   {
   
     //"Setting up the board" Text 
     
      Expo.setBackground(g,Expo.white);
      g.setFont(new Font("Arial", Font.BOLD, 50));
      g.drawString("Setting up the board!",610,100);
     
     //The Playing Board
     
      Expo.setColor(g,Expo.gray);
      Expo.fillRectangle(g,500,200,1300,800);
      Expo.setColor(g,Expo.white);
            
     //The White Vertical Lines
            
      Expo.fillRectangle(g,630,150,650,850);
      Expo.delay(500);
      Expo.fillRectangle(g,790,150,810,850);
      Expo.delay(500);
      Expo.fillRectangle(g,950,150,970,850);
      Expo.delay(500);
      Expo.fillRectangle(g,1110,150,1130,850);
      Expo.delay(500);
            
      //The White Horizonal Lines
            
      Expo.fillRectangle(g,200,310,1300,330);
      Expo.delay(500);
      Expo.fillRectangle(g,200,430,1300,450);
      Expo.delay(500);
      Expo.fillRectangle(g,200,550,1300,570);
      Expo.delay(500);
      Expo.fillRectangle(g,200,670,1300,690);
      Expo.delay(500);       
      
      //Covering the "Setting up the board" Text 
      
      Expo.setColor(g,Expo.white);
      g.drawString("Setting up the board!",610,100); 
      Expo.delay(2500);  
           
      onBoard = true;
   }
   
   
   //Sets up the interactive part of the Wordle Board
      
   public void wordleSetup(Graphics g)
   {
      //Array of all the capital letters
      
      String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
      
      //Starting value for the letters in the keyboard
      
      int xValue = 20;     
      g.setFont(new Font("Arial", Font.BOLD, 50));
 
      //Drawing the background of the keyboard    
           
      Expo.setColor(g,Expo.grey);
      Expo.fillRectangle(g,0,850,1920,1080);
   
      //Lines that divide the keyboard into 26 pieces
      
      Expo.setColor(g,Expo.white);
      for(int k = 73; k <= 1920; k+=73)
      {
         Expo.drawLine(g,k,850,k,1080);
         Expo.delay(100);
      }
      
      //Drawing the 26 letters of the Alphabet
      
      for(int p = 0; p < letters.length; p++)
      {
         g.drawString(letters[p],xValue,960);
         xValue += 73;
         Expo.delay(100);
      }
      
      //Drawing the "Enter" Key
      
      Expo.delay(500);
      Expo.setColor(g,Expo.grey);
      Expo.fillRectangle(g,1500,450,1700,650);
      Expo.setColor(g,Expo.black);
      g.drawString("ENTER",1515,560);
      Expo.delay(1000);
      
      //Drawing the "Clear Row" Key
      
      Expo.setColor(g,Expo.grey);
      Expo.fillRectangle(g,1450,250,1750,350);
      Expo.setColor(g,Expo.black);
      Font font3 = new Font("Times New Romans", Font.BOLD,35);
      g.setFont(font3);
      g.drawString("CLEAR ROW",1485,315);
      Expo.delay(1000);
      
      //Drawing the Exit Button
     
      Expo.setColor(g,Expo.red);
      Expo.fillRectangle(g,0,0,200,100);
      Expo.setColor(g,Expo.black);
      g.setFont(new Font("Arial",Font.BOLD,20));
      g.drawString("Exit to Main Menu",15,60);
     
      //Final Message to the Player
      
      Expo.delay(1000);
      Expo.setColor(g,Expo.black);
      g.setFont(new Font("Arial",Font.BOLD,50));
      g.drawString("Start guessing 5-letter words!",540,150);
      startTime = System.nanoTime();

      //Redraws the board after the user returns from the main screen so they can carry on from where they last left off (Both the letters and the colors)

      if(firstRowDone == true && onBoard == true)
      {
       startingX = 540;
       startingY = 275;
       
         if (ySq1 == true)
         {
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,x1sq1,y1sq1,x2sq1,y2sq1);
         }
         
         if (ySq2 == true)
         {
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,x1sq2,y1sq2,x2sq2,y2sq2);
         }
         
         if (ySq3 == true)
         {
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,x1sq3,y1sq3,x2sq3,y2sq3);
         }
         
         if (ySq4 == true)
         {
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,x1sq4,y1sq4,x2sq4,y2sq4);
         }
         
         if (ySq5 == true)
         {
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,x1sq5,y1sq5,x2sq5,y2sq5);
         }
         
         if (gSq1 == true)
         {
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,x1sq1,y1sq1,x2sq1,y2sq1);
         }
         
         if (gSq2 == true)
         {
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,x1sq2,y1sq2,x2sq2,y2sq2);
         }
         
         if (gSq3 == true)
         {
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,x1sq3,y1sq3,x2sq3,y2sq3);
         }
         
         if (gSq4 == true)
         {
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,x1sq4,y1sq4,x2sq4,y2sq4);
         }
         
         if (gSq5 == true)
         {
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,x1sq5,y1sq5,x2sq5,y2sq5);
         }         
            
       for(int k = 0; k < 5; k++)
       {                 
         Expo.setColor(g,Expo.black);
         g.drawString(firstGuess.substring(k,k+1),startingX,startingY);
         startingX+= 160;
       }

       startingX = 540;
       startingY = 405;
      }
         
      if(secondRowDone == true && onBoard == true)
      {
       startingX = 540;
       startingY = 405;
       
         if (ySq6 == true)
         {
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,x1sq6,y1sq6,x2sq6,y2sq6);
         }
         
         if (ySq7 == true)
         {
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,x1sq7,y1sq7,x2sq7,y2sq7);
         }
         
         if (ySq8 == true)
         {
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,x1sq8,y1sq8,x2sq8,y2sq8);
         }
         
         if (ySq9 == true)
         {
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,x1sq9,y1sq9,x2sq9,y2sq9);
         }
         
         if (ySq10 == true)
         {
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,x1sq10,y1sq10,x2sq10,y2sq10);
         }
         
         if (gSq6 == true)
         {
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,x1sq6,y1sq6,x2sq6,y2sq6);
         }
         
         if (gSq7 == true)
         {
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,x1sq7,y1sq7,x2sq7,y2sq7);
         }
         
         if (gSq8 == true)
         {
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,x1sq8,y1sq8,x2sq8,y2sq8);
         }
         
         if (gSq9 == true)
         {
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,x1sq9,y1sq9,x2sq9,y2sq9);
         }
         
         if (gSq10 == true)
         {
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,x1sq10,y1sq10,x2sq10,y2sq10);
         }
           
            
       for(int k = 0; k < 5; k++)
       {                 
         Expo.setColor(g,Expo.black);
         g.drawString(secondGuess.substring(k,k+1),startingX,startingY);
         startingX+= 160;
       }   
          
       startingX = 540;
       startingY = 520;
       
      }
         
      if(thirdRowDone == true && onBoard == true)
      {
       startingX = 540;
       startingY = 520;
       
         if (ySq11 == true)
         {
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,x1sq11,y1sq11,x2sq11,y2sq11);
         }
         
         if (ySq12 == true)
         {
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,x1sq12,y1sq12,x2sq12,y2sq12);
         }
         
         if (ySq13 == true)
         {
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,x1sq13,y1sq13,x2sq13,y2sq13);
         }
         
         if (ySq14 == true)
         {
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,x1sq14,y1sq14,x2sq14,y2sq14);
         }
         
         if (ySq15 == true)
         {
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,x1sq15,y1sq15,x2sq15,y2sq15);
         }
         

         if (gSq11 == true)
         {
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,x1sq11,y1sq11,x2sq11,y2sq11);
         }
         
         if (gSq12 == true)
         {
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,x1sq12,y1sq12,x2sq12,y2sq12);
         }
         
         if (gSq13 == true)
         {
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,x1sq13,y1sq13,x2sq13,y2sq13);
         }
         
         if (gSq14 == true)
         {
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,x1sq14,y1sq14,x2sq14,y2sq14);
         }
         
         if (gSq15 == true)
         {
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,x1sq15,y1sq15,x2sq15,y2sq15);
         }
          
            
       for(int k = 0; k < 5; k++)
       {                 
         Expo.setColor(g,Expo.black);
         g.drawString(thirdGuess.substring(k,k+1),startingX,startingY);
         startingX+= 160;
       }     
       startingX = 540;
       startingY = 640;
      }

      if(fourthRowDone == true && onBoard == true)
      {
       startingX = 540;
       startingY = 640;
       
         if (ySq16 == true)
         {
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,x1sq16,y1sq16,x2sq16,y2sq16);
         }
         
         if (ySq17 == true)
         {
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,x1sq17,y1sq17,x2sq17,y2sq17);
         }
         
         if (ySq18 == true)
         {
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,x1sq18,y1sq18,x2sq18,y2sq18);
         }
         
         if (ySq19 == true)
         {
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,x1sq19,y1sq19,x2sq19,y2sq19);
         }
         
         if (ySq20 == true)
         {
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,x1sq20,y1sq20,x2sq20,y2sq20);
         }
         
         if (gSq16 == true)
         {
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,x1sq16,y1sq16,x2sq16,y2sq16);
         }
         
         if (gSq17 == true)
         {
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,x1sq17,y1sq17,x2sq17,y2sq17);
         }
         
         if (gSq18 == true)
         {
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,x1sq18,y1sq18,x2sq18,y2sq18);
         }
         
         if (gSq19 == true)
         {
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,x1sq19,y1sq19,x2sq19,y2sq19);
         }
         
         if (gSq20 == true)
         {
         Expo.setColor(g,Expo.green);
         Expo.fillRectangle(g,x1sq20,y1sq20,x2sq20,y2sq20);
         }
            
       for(int k = 0; k < 5; k++)
       {                 
         Expo.setColor(g,Expo.black);
         g.drawString(fourthGuess.substring(k,k+1),startingX,startingY);
         startingX+= 160;
       }
      }
   
   
   //Developer Cheat Code (Displays the Randomly Generated Word)
   
   //Expo.setColor(g,Expo.black);
   //g.drawString(randomWord,200,250); 
   
   }
   
   //The "Clear Row" Button's Method
   
   public void clearRowMethods(Graphics g)
   {
   
   //Clears the row by filling the current row with gray/grey sqaures
   
     if(firstRow == true || isFifthLetter == true && firstRowDone == false)
     {     
      startingX = 540;
      startingY = 275;
      
      Expo.setColor(g,Expo.grey);
      Expo.fillRectangle(g,x1sq1,y1sq1,x2sq1,y2sq1);
      Expo.fillRectangle(g,x1sq2,y1sq2,x2sq2,y2sq2);
      Expo.fillRectangle(g,x1sq3,y1sq3,x2sq3,y2sq3);
      Expo.fillRectangle(g,x1sq4,y1sq4,x2sq4,y2sq4);
      Expo.fillRectangle(g,x1sq5,y1sq5,x2sq5,y2sq5);  
      drawnLetters -= userString.length();
      userString = "";
      firstRow = true;
      firstLetter = true;      
     }
     
     else if(secondRow == true || isFifthLetter == true && secondRowDone == false)
     {     
      startingX = 540;
      startingY = 405;
     
      Expo.setColor(g,Expo.grey);
      Expo.fillRectangle(g,x1sq6,y1sq6,x2sq6,y2sq6);
      Expo.fillRectangle(g,x1sq7,y1sq7,x2sq7,y2sq7);
      Expo.fillRectangle(g,x1sq8,y1sq8,x2sq8,y2sq8);
      Expo.fillRectangle(g,x1sq9,y1sq9,x2sq9,y2sq9);
      Expo.fillRectangle(g,x1sq10,y1sq10,x2sq10,y2sq10);  
      drawnLetters -= userString.length();
      userString = "";  
      secondRow = true;
      firstLetter = true;      
     }
     else if(thirdRow == true ||isFifthLetter == true && thirdRowDone == false)
     {     
      startingX = 540;
      startingY = 520;
      
      Expo.setColor(g,Expo.grey);
      Expo.fillRectangle(g,x1sq11,y1sq11,x2sq11,y2sq11);
      Expo.fillRectangle(g,x1sq12,y1sq12,x2sq12,y2sq12);
      Expo.fillRectangle(g,x1sq13,y1sq13,x2sq13,y2sq13);
      Expo.fillRectangle(g,x1sq14,y1sq14,x2sq14,y2sq14);
      Expo.fillRectangle(g,x1sq15,y1sq15,x2sq15,y2sq15);  
      drawnLetters -= userString.length();
      userString = "";
      thirdRow = true;
      firstLetter = true;        
     }
     
     else if(fourthRow == true ||isFifthLetter == true && fourthRowDone == false)  
     {     
      startingX = 540;
      startingY = 640;
      
      Expo.setColor(g,Expo.grey);
      Expo.fillRectangle(g,x1sq16,y1sq16,x2sq16,y2sq16);
      Expo.fillRectangle(g,x1sq17,y1sq17,x2sq17,y2sq17);
      Expo.fillRectangle(g,x1sq18,y1sq18,x2sq18,y2sq18);
      Expo.fillRectangle(g,x1sq19,y1sq19,x2sq19,y2sq19);
      Expo.fillRectangle(g,x1sq20,y1sq20,x2sq20,y2sq20);  
      drawnLetters -= userString.length();
      userString = "";
      fourthRow = true;
      firstLetter = true;
     }
    
     else if(fifthRow == true || isFifthLetter == true && fifthRowDone == false)   
     {     
      startingX = 540;
      startingY = 760;
      
      Expo.setColor(g,Expo.grey);
      Expo.fillRectangle(g,x1sq21,y1sq21,x2sq21,y2sq21);
      Expo.fillRectangle(g,x1sq22,y1sq22,x2sq22,y2sq22);
      Expo.fillRectangle(g,x1sq23,y1sq23,x2sq23,y2sq23);
      Expo.fillRectangle(g,x1sq24,y1sq24,x2sq24,y2sq24);
      Expo.fillRectangle(g,x1sq25,y1sq25,x2sq25,y2sq25);  
      drawnLetters -= userString.length();
      userString = "";  
      fifthRow = true;
      firstLetter = true;   
      
     }
    }
   
   
   //The "Enter" Button's Methods
   
   public void enterMethods(Graphics g)
   {             
      String currentLetterUserString = "";
      int userStringLetterIndex = 0;
      
      String currentLetterRandomWord = "";
      int randomWordLetterIndex = 0;
         
      //Determines whether letters are green, yellow, or gray when the user clicks enter
      
      if (userString.equals(randomWord) == false  && secondRow == true && isFifthLetter == true)
      {   
         System.out.println("pop");
         for(int zed = 0; zed < 5; zed++)
         {
         currentLetterUserString = userString.substring(zed,zed+1); 
         userStringLetterIndex = userString.indexOf(currentLetterUserString);
         for(int p = 0; p < 5; p++)
         {         
            currentLetterRandomWord = randomWord.substring(p,p+1);
            randomWordLetterIndex = randomWord.indexOf(currentLetterRandomWord);         
              
           if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 0)
           {       
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq1,y1sq1,x2sq1,y2sq1);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,540,275);
              ySq1 = true;         
           }
                     
           if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 1)
           {                        
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq2,y1sq2,x2sq2,y2sq2);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,700,275); 
              ySq2 = true;             
            }

            if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 2)
            {
                        
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq3,y1sq3,x2sq3,y2sq3);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,860,275);
              ySq3 = true;
            }          
                                                 
            if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 3)
            {
                        
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq4,y1sq4,x2sq4,y2sq4);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,1020,275);
              ySq4 = true;
            }
                          
            if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex && userStringLetterIndex == 4)
            {             
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq5,y1sq5,x2sq5,y2sq5);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,1180,275);
              ySq5 = true;
            }
            
                     
           if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 0)
           {
                      
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq1,y1sq1,x2sq1,y2sq1);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,540,275);
              gSq1 = true;
           }
           
                       
           if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 1)
           {
                        
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq2,y1sq2,x2sq2,y2sq2);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,700,275);  
              gSq2 = true;                 
            }
                        
            if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 2)
            {
                        
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq3,y1sq3,x2sq3,y2sq3);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,860,275); 
              gSq3 = true;    
            }
            
            if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 3)
            {
                        
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq4,y1sq4,x2sq4,y2sq4);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,1020,275); 
              gSq4 = true;                
            }
            if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 4)
            {             
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq5,y1sq5,x2sq5,y2sq5);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,1180,275); 
              gSq5 = true;
            } 
            
            Expo.setColor(g,Expo.white);
            for(int k = 73; k <= 1920; k+=73)
            {
               Expo.drawLine(g,k,850,k,1080);
            }                    
           }      
         }
         firstGuess = userString;
         userString = "";  
         attempts++;
         firstRowDone = true;
     }
     
      if (userString.equals(randomWord) == false  && thirdRow == true && isFifthLetter == true )
      {   
         for(int zed = 0; zed < 5; zed++)
         {
         currentLetterUserString = userString.substring(zed,zed+1); 
         userStringLetterIndex = userString.indexOf(currentLetterUserString);
         for(int p = 0; p < 5; p++)
         {         
            currentLetterRandomWord = randomWord.substring(p,p+1);
            randomWordLetterIndex = randomWord.indexOf(currentLetterRandomWord);
              
           if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 0)
           {
                        
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq6,y1sq6,x2sq6,y2sq6);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,540,405);
              ySq6 = true;
              
           }
           
           if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 1)
           {
                        
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq7,y1sq7,x2sq7,y2sq7);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,700,405);
              ySq7 = true;
              
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 2)
            {
                        
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq8,y1sq8,x2sq8,y2sq8);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,860,405);
              ySq8 = true;
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 3)
            {
                        
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq9,y1sq9,x2sq9,y2sq9);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,1020,405);
              ySq9 = true;
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 4)
            {             
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq10,y1sq10,x2sq10,y2sq10);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,1180,405);
              ySq10 = true;
              
            }
            
           if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 0)
           {
                        
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq6,y1sq6,x2sq6,y2sq6);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,540,405);
              gSq6 = true;
              
           }
           
           if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 1)
           {
                        
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq7,y1sq7,x2sq7,y2sq7);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,700,405);
              gSq7 = true;
              
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 2)
            {
                        
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq8,y1sq8,x2sq8,y2sq8);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,860,405);
              gSq8 = true;
                   
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 3)
            {
                        
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq9,y1sq9,x2sq9,y2sq9);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,1020,405);
              gSq9 = true;
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 4)
            {             
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq10,y1sq10,x2sq10,y2sq10);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,1180,405); 
              gSq10 = true;
            }
          }
           }
         secondGuess = userString;
         userString = "";  
         attempts++;  
         secondRowDone = true; 
        }
         
      if (userString.equals(randomWord) == false  && fourthRow == true && isFifthLetter == true)
      {
   
         for(int zed = 0; zed < 5; zed++)
         {
         currentLetterUserString = userString.substring(zed,zed+1); 
         userStringLetterIndex = userString.indexOf(currentLetterUserString);
         for(int p = 0; p < 5; p++)
         {         
            currentLetterRandomWord = randomWord.substring(p,p+1);
            randomWordLetterIndex = randomWord.indexOf(currentLetterRandomWord);
              
           if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 0)
           {
                        
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq11,y1sq11,x2sq11,y2sq11);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,540,520);
              ySq11 = true;
           }
           
           if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 1)
           {
                        
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq12,y1sq12,x2sq12,y2sq12);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,700,520);
              ySq12 = true;
                   
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 2)
            {
                        
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq13,y1sq13,x2sq13,y2sq13);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,860,520);
              ySq13 = true;
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 3)
            {
                        
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq14,y1sq14,x2sq14,y2sq14);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,1020,520);
              ySq14 = true;     
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 4)
            {             
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq15,y1sq15,x2sq15,y2sq15);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,1180,520);
              ySq15 = true;  
            }
            
           if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 0)
           {
                        
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq11,y1sq11,x2sq11,y2sq11);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,540,520);
              gSq11 = true;
         
           }
           
           if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 1)
           {
                        
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq12,y1sq12,x2sq12,y2sq12);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,700,520);
              gSq12 = true;     
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 2)
            {
                        
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq13,y1sq13,x2sq13,y2sq13);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,860,520);
              gSq13 = true;     
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 3)
            {
                        
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq14,y1sq14,x2sq14,y2sq14);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,1020,520);
              gSq14 = true;     
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 4)
            {             
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq15,y1sq15,x2sq15,y2sq15);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,1180,520);
              gSq15 = true;
              
            }
           }      
         }
         thirdGuess = userString;
         userString = ""; 
         attempts++;    
         thirdRowDone = true;      
     }
     
      if (userString.equals(randomWord) == false  && fifthRow == true && isFifthLetter == true)
      {
      
         for(int zed = 0; zed < 5; zed++)
         {
         currentLetterUserString = userString.substring(zed,zed+1); 
         userStringLetterIndex = userString.indexOf(currentLetterUserString);
         for(int p = 0; p < 5; p++)
         {         
            currentLetterRandomWord = randomWord.substring(p,p+1);
            randomWordLetterIndex = randomWord.indexOf(currentLetterRandomWord);
              
           if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 0)
           {
                        
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq16,y1sq16,x2sq16,y2sq16);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,540,640);
              ySq16 = true;       
           }
           
           if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 1)
           {
                        
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq17,y1sq17,x2sq17,y2sq17);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,700,640);
              ySq17 = true;
           }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 2)
            {
                        
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq18,y1sq18,x2sq18,y2sq18);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,860,640);
              ySq18 = true;
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 3)
            {
                        
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq19,y1sq19,x2sq19,y2sq19);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,1020,640);
              ySq19 = true;
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 4)
            {             
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq20,y1sq20,x2sq20,y2sq20);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,1180,640);
              ySq20 = true;
            }
            
           if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 0)
           {
                        
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq16,y1sq16,x2sq16,y2sq16);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,540,640);
              gSq16 = true;
           }
           
           if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 1)
           {
                        
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq17,y1sq17,x2sq17,y2sq17);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,700,640);           
              gSq17 = true;  
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 2)
            { 
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq18,y1sq18,x2sq18,y2sq18);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,860,640);  
              gSq18 = true;             
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 3)
            {
                        
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq19,y1sq19,x2sq19,y2sq19);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,1020,640); 
              gSq19 = true;                
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 4)
            {             
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq20,y1sq20,x2sq20,y2sq20);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,1180,640); 
              gSq20 = true;
            }
           }    
         }
         fourthGuess = userString;
         userString = "";
         attempts++;
         fourthRowDone = true;
      }  
                  
      if (userString.equals(randomWord) == false && lastRow == true && isFifthLetter == true)
      { 
         for(int zed = 0; zed < 5; zed++) 
         {
         currentLetterUserString = userString.substring(zed,zed+1); 
         userStringLetterIndex = userString.indexOf(currentLetterUserString);
         for(int p = 0; p < 5; p++)
         {         
            currentLetterRandomWord = randomWord.substring(p,p+1);
            randomWordLetterIndex = randomWord.indexOf(currentLetterRandomWord);
              
           if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 0)
           {
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq21,y1sq21,x2sq21,y2sq21);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,540,760);       
           }
           
           if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 1)
           {
                        
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq22,y1sq22,x2sq22,y2sq22);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,700,760);
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 2)
            {
                        
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq23,y1sq23,x2sq23,y2sq23);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,860,760);
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 3)
            {
                        
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq24,y1sq24,x2sq24,y2sq24);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,1020,760);
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && userStringLetterIndex != randomWordLetterIndex  && userStringLetterIndex == 4)
            {             
              Expo.setColor(g,Expo.yellow);
              Expo.fillRectangle(g,x1sq25,y1sq25,x2sq25,y2sq25);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,1180,760);
            }
            
           if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 0)
           {
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq21,y1sq21,x2sq21,y2sq21);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,540,760);
           }
           
           if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 1)
           {
                        
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq22,y1sq22,x2sq22,y2sq22);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,700,760);
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 2)
            {
                        
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq23,y1sq23,x2sq23,y2sq23);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,860,760);
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 3)
            {
                        
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq24,y1sq24,x2sq24,y2sq24);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,1020,760);                   
            }
                  
            if(currentLetterUserString.equals(currentLetterRandomWord) && randomWordLetterIndex == userStringLetterIndex && randomWord.charAt(p) == userString.charAt(zed) && userStringLetterIndex == 4)
            {             
              Expo.setColor(g,Expo.green);
              Expo.fillRectangle(g,x1sq25,y1sq25,x2sq25,y2sq25);
              Expo.setColor(g,Expo.black);
              g.drawString(currentLetterUserString,1180,760);
            }
          }
          fifthRowDone = true;     
      } 
     }
     
     
     //In the event the user correctly guess the randomly generated word within 5 attempts
     
      if(userString.equals(randomWord))
      {
         endTime = System.nanoTime();
         totalAttempts += attempts;
         onBoard = false;
         Expo.delay(250);
         Expo.setBackground(g,Expo.white);
         Expo.setColor(g,Expo.black);
         
         if(attempts == 1)
         {
            g.drawString("It only took " + attempts + " attempt? You're definetly cheating...",400,250);
            g.drawString("But yeah, the correct word is " + "\"" + randomWord + "\"" + "!", 450,400);
            gameWin = true;
            wins++;
            winsInARow++;
            lossesInARow = 0; 
         }                
         
         if(attempts == 2)
         {
            g.drawString("Hey, it only took " + attempts + " attempts! You're pretty sharp!",400,250);
            g.drawString("You're right, the correct word is " + "\"" + randomWord + "\"" + "!", 500,400);
            gameWin = true;
            wins++;
            winsInARow++;
            lossesInARow = 0;
         }
         
         if(attempts == 3)
         {
            g.drawString("Not bad, not bad " + attempts + " attempts is pretty good!",425,250);
            g.drawString("You're right, the correct word is " + "\"" + randomWord + "\"" + "!", 500,400);
            gameWin = true;
            wins++;
            winsInARow++;
            lossesInARow = 0;         
         }         
         
         if(attempts == 4)
         {
            g.drawString("It took a while, but you got it done in " + attempts + " attempts",425,250);
            g.drawString("You're right, the correct word is " + "\"" + randomWord + "\"" + "!", 500,400);
            gameWin = true;
            wins++;
            winsInARow++;
            lossesInARow = 0;
   
         }
         
         if(attempts == 5)
         {
            g.drawString("Took all " + attempts + " attempts? At least you got it in the end",400,250);
            g.drawString("You're right, the correct word is " + "\"" + randomWord + "\"" + "!", 500,400);
            gameWin = true;
            wins++;
            winsInARow++;
            lossesInARow = 0;
         }
      }
      
      //In the event the user doesn't get the word correct within 5 attempts
      
      if(drawnLetters >= 25 && gameWin != true)
      {
         endTime = System.nanoTime();
         totalAttempts += attempts;
         onBoard = false;
         Expo.delay(250);
         Expo.setBackground(g,Expo.white);
         Expo.setColor(g,Expo.black);
         g.drawString("You might want to brush up on your English Vocabulary",425,250);
         g.drawString("Anyway, the correct word was " + "\"" + randomWord + "\"" + "!", 500,400);
         gameOver = true;
         losses++;
         lossesInARow++;
         winsInARow = 0;
      }
      
      //Returning back to the homescreen
      
      if(gameOver == true || gameWin == true)
      {
      
      //Getting the current time
      
      currentTime = ((endTime-startTime)/1000000000);
       
      //Countdown for the user
      
      Expo.delay(3000);
      Expo.setColor(g,Expo.black);
      g.drawString("Heading back to the Main Screen in 5", 500,600);
      Expo.setColor(g,Expo.white);
      Expo.delay(1000);
      g.drawString("Heading back to the Main Screen in 5", 500,600);
      Expo.setColor(g,Expo.black);
      g.drawString("Heading back to the Main Screen in 4", 500,600);
      Expo.setColor(g,Expo.white);
      Expo.delay(1000);
      g.drawString("Heading back to the Main Screen in 4", 500,600);
      Expo.setColor(g,Expo.black);
      g.drawString("Heading back to the Main Screen in 3", 500,600);
      Expo.setColor(g,Expo.white);
      Expo.delay(1000);
      g.drawString("Heading back to the Main Screen in 3", 500,600);
      Expo.setColor(g,Expo.black);
      g.drawString("Heading back to the Main Screen in 2", 500,600);
      Expo.setColor(g,Expo.white);
      Expo.delay(1000);
      g.drawString("Heading back to the Main Screen in 2", 500,600);
      Expo.setColor(g,Expo.black);
      g.drawString("Heading back to the Main Screen in 1", 500,600);
      Expo.delay(1000);
      Expo.setColor(g,Expo.white);
      g.drawString("Heading back to the Main Screen in 1", 500,600);
      Expo.delay(250);
      Expo.setColor(g,Expo.black);
        
      
      mainScreenBackground(g);
      Button(g);     
      
      //Updates the Main Screen Statistics
      
      g.setFont(new Font("Arial",Font.ITALIC,35));
      g.drawString("Your Current Session's Stats!",5,70);
      
      //Checks for the longest winning streak
      
      if(bestWinningStreak < winsInARow)
      {
         bestWinningStreak = winsInARow;
      }
      
      //Checks for the longest losing streak
      
      if(worstLosingStreak < lossesInARow)
      {
         worstLosingStreak = lossesInARow;
      }
      
      //Checks for the fastest game the user has completed
      
      if(currentTime < bestTime)
      {
         bestTime = currentTime;
      }
      
      //Draws the statistical box in the top-right corner of the main screen
      
      Expo.setColor(g,Expo.grey);
      Expo.fillRectangle(g,10,85,505,415);
      Expo.setColor(g,Expo.black);
      Expo.drawRectangle(g,10,85,505,415);
      g.setFont(new Font("Arial",Font.BOLD,25));
      
      //Prints the amount of wins and losses the user has in this session
      
      g.drawString("You've won " + wins + " time(s) this session",30,125);
      g.drawString("You've lost " + losses + " time(s) this session",30,165);
      
      //Prints out the user's current winning streak (if they are on one)
      
      if(winsInARow > 0)
      {
         g.drawString("Your current winning streak is: " + winsInARow,30,205);
      }
      
      //Prints out the user's current losing streak (if they are on one)
      
      if(lossesInARow > 0)
      {
         g.drawString("Your current losing streak is: " + lossesInARow,30,205);
      }
      
      //Checks if the user has finsihed a game faster than all of the previous times
      
      if(currentTime < bestTime)
      {
         bestTime = currentTime;
      }
      
      //Prints out the longest winning/losing streak, total amount of games completed, and their fastest time
      
      g.drawString("Your best winstreak is: " + bestWinningStreak,30,245);
      g.drawString("Your worst losing streak is: " + worstLosingStreak,30,285);      
      g.drawString("You've played a total of " + (wins+losses) + " times",30,325);   
      g.drawString("Your total attempts this sessions is: " + totalAttempts,30,365); 
      g.drawString("Your fastest time is: " + bestTime + " seconds",30,405);       
      
      
      //Resets the rest of the commonly used global variables and generates a new random word for the next game started by the user in the current session
      
      startingX = 540;
      startingY = 275;
      drawnLetters = 0;
      
      randomNumber = Expo.random(0,488);
      randomWord = fiveLetterWords[randomNumber].toUpperCase();
      
      gameOver = false;
      gameWin = false;
      
      userString = "";
      attempts = 1;
      
      firstRow = true;
      secondRow = false;
      thirdRow = false;
      fourthRow = false;
      fifthRow = false;
      isFifthLetter = false;
      
      firstGameDone = true;
      
      ySq1 = false;
      ySq2 = false;
      ySq3 = false;
      ySq4 = false;
      ySq5 = false;
      ySq6 = false;
      ySq7 = false;
      ySq8 = false;
      ySq9 = false;
      ySq10 = false;
      ySq11 = false;
      ySq12 = false;
      ySq13 = false;
      ySq14 = false;
      ySq15 = false;
      ySq16 = false;
      ySq17 = false;
      ySq18 = false;
      ySq19 = false;
      ySq20 = false;
      
      gSq1 = false;
      gSq2 = false;
      gSq3 = false;
      gSq4 = false;
      gSq5 = false;
      gSq6 = false;
      gSq7 = false;
      gSq8 = false;
      gSq9 = false;
      gSq10 = false;
      gSq11 = false;
      gSq12 = false;
      gSq13 = false;
      gSq14 = false;
      gSq15 = false;
      gSq16 = false;
      gSq17 = false;
      gSq18 = false;
      gSq19 = false;
      gSq20 = false;
      
      firstGuess = "";
      secondGuess = "";
      thirdGuess = "";
      fourthGuess = "";
      
      firstRowDone = false;
      secondRowDone = false;
      thirdRowDone = false;
      fourthRowDone = false;
      fifthRowDone = false;
      
      firstLetter = true;
      secondLetter = false;
      thirdLetter = false;
      fourthLetter = false;
      fifthLetter = false; 
      isFifthLetter = false;
      
      startTime = 0;
      endTime = 0;
      
      }
   }
 
   //Draws the letters when the user clicks on the drawn keyboard
   
   public void draw(Graphics g, String letter)
   {
      //Checks if a letter can be printed onto the board
      
      if(userString.length() <= 5)//changed <= to <
      {
         g.drawString(letter,startingX,startingY);
         startingX += 160;
         userString += letter;
         drawnLetters++;
      }
      
      //Stops the program from drawing extra letters on spaces it isn't meant to
      
      if(userString.length() > 5 && firstRowDone == false)
      {
         Expo.setColor(g,Expo.grey);
         startingX = 540;
         startingY = 405;
         g.drawString(letter,startingX,startingY);
         isFifthLetter = true;
         firstLetter = true;
         userString = userString.substring(0,5);
         drawnLetters--;
         Expo.setColor(g,Expo.white);
         Expo.fillRectangle(g,1325,0,1400,700);
      }

      if(userString.length() > 5 && secondRowDone == false)
      {
         Expo.setColor(g,Expo.grey);
         startingX = 540;
         startingY = 520;
         g.drawString(letter,startingX,startingY);
         isFifthLetter = true;
         firstLetter = true;
         userString = userString.substring(0,5);
         drawnLetters--;
         Expo.setColor(g,Expo.white);
         Expo.fillRectangle(g,1325,0,1400,700);         
      }
      
      if(userString.length() > 5 && thirdRowDone == false)
      {
         Expo.setColor(g,Expo.grey);
         startingX = 540;
         startingY = 640;
         g.drawString(letter,startingX,startingY);
         isFifthLetter = true;
         firstLetter = true;
         userString = userString.substring(0,5);
         drawnLetters--;     
         Expo.setColor(g,Expo.white);
         Expo.fillRectangle(g,1325,0,1400,700);   
      }
      
      if(userString.length() > 5 && fourthRowDone == false)
      {
         Expo.setColor(g,Expo.grey);
         startingX = 540;
         startingY = 760;
         g.drawString(letter,startingX,startingY);
         isFifthLetter = true;
         firstLetter = true;
         userString = userString.substring(0,5);
         drawnLetters--;    
         Expo.setColor(g,Expo.white);
         Expo.fillRectangle(g,1325,0,1400,700);    
      }
    }
 
   //How the program detects where the user clicked and whether or not it's a clickable area  
             
   public boolean mouseDown(Event e, int x, int y)
   {
      if(play.inside(x,y))
         theButton = 1;
      else if(rules.inside(x,y))
         theButton = 2;
      else if(letterA.inside(x,y))
         theButton = 3;
      else if(letterB.inside(x,y))
         theButton = 4;
      else if(letterC.inside(x,y))
         theButton = 5;
      else if(letterD.inside(x,y))
         theButton = 6;
      else if(letterE.inside(x,y))
         theButton = 7;
      else if(letterF.inside(x,y))
         theButton = 8;
      else if(letterG.inside(x,y))
         theButton = 9;
      else if(letterH.inside(x,y))
         theButton = 10;
      else if(letterI.inside(x,y))
         theButton = 11;
      else if(letterJ.inside(x,y))
         theButton = 12;
      else if(letterK.inside(x,y))
         theButton = 13;
      else if(letterL.inside(x,y))
         theButton = 14;
      else if(letterM.inside(x,y))
         theButton = 15;
      else if(letterN.inside(x,y))
         theButton = 16;
      else if(letterO.inside(x,y))
         theButton = 17;
      else if(letterP.inside(x,y))
         theButton = 18;
      else if(letterQ.inside(x,y))
         theButton = 19;
      else if(letterR.inside(x,y))
         theButton = 20;
      else if(letterS.inside(x,y))
         theButton = 21;
      else if(letterT.inside(x,y))
         theButton = 22;
      else if(letterU.inside(x,y))
         theButton = 23;
      else if(letterV.inside(x,y))
         theButton = 24;
      else if(letterW.inside(x,y))
         theButton = 25;
      else if(letterX.inside(x,y))
         theButton = 26; 
      else if(letterY.inside(x,y))
         theButton = 27;
      else if(letterZ.inside(x,y))
         theButton = 28;
      else if(enter.inside(x,y))
         theButton = 29;
      else if(clearRow.inside(x,y))
         theButton = 30;
      else if(exit.inside(x,y))
         theButton = 31;
      else
         theButton = 32;
      repaint();
      return true;
   }
   
   //The backbone of the code (The code will fall apart without this command)
   
   public void update(Graphics g)
   {
      paint(g);
   }    
} 
