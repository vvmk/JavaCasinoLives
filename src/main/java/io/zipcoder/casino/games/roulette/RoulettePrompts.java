package io.zipcoder.casino.games.roulette;

import io.zipcoder.casino.utils.IOHandler;

import java.util.ArrayList;
import java.util.Arrays;


public class RoulettePrompts {

    RouletteBoardAndWheel rouletteBoardAndWheel = new RouletteBoardAndWheel();
    ArrayList<Integer> lastColumn = new ArrayList<>();
    ArrayList<Integer> secondColumn = new ArrayList<>();
    ArrayList<Integer> firstColumn = new ArrayList<>();

    public RoulettePrompts() {
        lastColumn.addAll(Arrays.asList(rouletteBoardAndWheel.columnSelection(3)));
        secondColumn.addAll(Arrays.asList(rouletteBoardAndWheel.columnSelection(2)));
        firstColumn.addAll(Arrays.asList(rouletteBoardAndWheel.columnSelection(1)));
    }


    public String startMessage() {
        String welcomePrompt =
                "\n\n\n\n*******************************************************\n" +
                        "*          This is the table for high roller          *\n" +
                        "*          Indulgence here at our casino.             *\n" +
                        "*           Roulette is a casino game named           *\n" +
                        "*          after the French word meaning              *\n" +
                        "*          little wheel. In the game, players         *\n" +
                        "*          may choose to place bets on either         *\n" +
                        "*           a single number, various groupings        *\n" +
                        "*           of numbers, the colors red or             *\n" +
                        "*           black, whether the number is odd          *\n" +
                        "*           or even, or if the numbers are            *\n" +
                        "*           high (19–36) or low (1–18).               *\n" +
                        "*******************************************************\n\n" +
                        "*             Press 'y' to place your bets            *\n" +
                        "*                  Press 'q' to quit                  *\n" +
                        "*                 Press 'r' for rules                 *\n" +
                        "*              Press 'b' for betting info             *\n\n" +
                        "*******************************************************\n";

        return IOHandler.promptForStringWithMessage(welcomePrompt);
    }

    public String rules() {
        String rules = "************************RULES**********************\n" +
                "\n" +
                "Roulette is a game played with a large wheel that \n" +
                "contains 38 pockets. These stops are numbered \n" +
                "from 0 to 36, while the American roulette wheel also \n" +
                "contains a 00 pocket. All the pockets are all \n" +
                "colored; the zeroes are green, while the other spots \n" +
                "are evenly divided between 18 red and 18 black \n" +
                "pockets.\n" +
                "\n" +
                "The croupier (or dealer) spins a ball on the outer \n" +
                "rim of the wheel, after which it will eventually \n" +
                "fall into one of the numbered spaces. The object for \n" +
                "the player is to guess what number the ball will \n" +
                "land in.\n" +
                "\n" +
                "Before each spin, players have the opportunity to \n" +
                "place bets around the roulette table. Players can \n" +
                "bet on individual numbers or virtually any \n" +
                "combination of numbers – most of the available bets \n" +
                "are outlined below.\n" +
                "\n" +
                "In a live casino each player will have to exchange \n" +
                "cash or casino chips for special roulette chips, \n" +
                "with each player being given a unique color that can \n" +
                "be used to distinguish who made each bet. Of course, \n" +
                "in computer casino (this one), this isn’t necessary.\n" +
                "\n" +
                "Once the ball falls into a pocket and rests there, \n" +
                "the croupier will call out the winning number as \n" +
                "well as the color of the pocket it landed in. \n" +
                "Markers are typically used to protect winning bets, \n" +
                "after which all losing bets are swept off the table. \n" +
                "Then the croupier will pay all winning bets and, \n" +
                "once all of the payouts are completed, players may \n" +
                "place bets for the next spin.\n\n";
        return rules;
    }

    public int firstSetOfOptionsPrompt(int n) {
        String options = "****************** BET #" + n + " ******************\n" +
                "*         Please choose an option          *\n" +
                "*        Each bet is 10 chip ($50)         *\n" +
                "*                                          *\n" +
                "* Betting:                                 *\n" +
                "* 1. Single number                         *\n" +
                "* 2. On the line (2 numbers)               *\n" +
                "* 3. Corner (4 numbers of a corner)        *\n" +
                "* 4. Stright (one row)                     *\n" +
                "* 5. Basket (0, 00, 2)                     *\n" +
                "* 6. 5 number bet (0, 00, 1, 2, 3)         *\n" +
                "* 7. line (6 numbers in 2 rows adjacent)   *\n" +
                "* 8. Column                                *\n" +
                "* 9. 12 number sections (1st, 2nd, 3rd)    *\n" +
                "* 10. Numbers 1-18                         *\n" +
                "* 11. Numbers 19-36                        *\n" +
                "* 12. Even numbers                         *\n" +
                "* 13. Odd numbers                          *\n" +
                "* 14. Black Numbers                        *\n" +
                "* 15. Red Numbers                          *\n" +
                "*                                          *\n" +
                "* Other options:                           *\n" +
                "* 16. Betting info                         *\n" +
                "* 17. Display board                        *\n" +
                "* 18. FINISH BETTING                       *\n" +
                "********************************************\n";
        return IOHandler.promptForIntWithMessage(options);
    }

    public String bettingInfo() {
        String info = "***************** BETTING INFO *********************\n" +
                "- Black, Red, 1-8, 19-36, Odd, and Even spaces payout evenly (1 to 1)\n" +
                "- 1st 12, 2nd 12, and 3rd 12 payout 2 to 1\n" +
                "- column wins pay 2 to 1 as well\n" +
                "- Inside part of board:\n" +
                "\t- single number win pays out 35 to 1\n" +
                "\t- on the line (the two numbers on both sides of the line) wins 17 to 1 \n" +
                "\t- Straight (the whole row of three numbers) wins 11 to 1\n" +
                "\t- Basket (0, 00, and 2) wins 11 to 1\n" +
                "\t- Corner (4 numbers) wins 8 to 1\n" +
                "\t- 5 number bet ( 0, 00, 1, 2, 3) wins 6 to 1\n" +
                "\t- line bet (6 numbers/2 rows) wins 5 to 1\n";
        return info;
    }


    //SingleNumberAdd
    public Integer singleNumberPrompt() {
        String prompt = "***************** Single Number ********************\n" +
                "You selected to bet 10 chips on a single number space. \n" +
                "The payout for this bet is 35 to 1 if your \n" +
                "selection is the winning number. \n\n";
        System.out.println(prompt);
        Integer numberChoice = IOHandler.promptForIntWithMessage("Please choose a number between 1-36:");
        if (numberChoice > 36) {
            do {
                System.out.println("\n\nERROR!\n\n");
                numberChoice = IOHandler.promptForIntWithMessage("Please choose a number between 1-36: ");
            } while (numberChoice > 36);
        }
        return numberChoice;
    }


    //On the line start
    public Integer[] onTheLine() {
        System.out.println("************* On The Line (2 numbers) **************\n" +
                "You selected to bet 10 chips on two number spaces. \n" +
                "The instructions are to choose one number out of\n" +
                "two numbers that you want to select. For example,\n" +
                "if you enter the number 2, the dealer will take\n" +
                "that as 'betting on 2 and 3'. \n" +
                "NUMBERS HAVE TO BE NEXT TO EACH OTHER. \n" +
                "The payout for this bet is 17 to 1 if your \n" +
                "selection is the winning number.\n\n");
        Integer[] result = new Integer[2];
        int numberChoice = IOHandler.promptForIntWithMessage("Please choose a number between 1-35: ");
        if (numberChoice > 35 || lastColumn.contains(numberChoice)) {
            do {
                System.out.println("\n\nERROR!\n\n");
                numberChoice = IOHandler.promptForIntWithMessage("Please choose a number between 1-35: ");
            } while (numberChoice > 35 || lastColumn.contains(numberChoice));
        }
        if (numberChoice < 36) {
            result = returnDoubleNumberArray(numberChoice);
        }
        return result;
    }

    public Integer[] returnDoubleNumberArray(int numberChoice) {
        Integer[] result = {numberChoice, numberChoice + 1};
        return result;
    }
    //on the line end


    public Integer[] corner() {
        String prompt = "********************* Corner **********************\n" +
                "You selected to bet 10 chips on four number spaces.\n" +
                "These 4 spaces are numbers at every side of the \n" +
                "corner you want to select. You will enter the 1st\n" +
                "corner number to enter your decision. For example, \n" +
                "if I wanted to choose the corner that intersects \n" +
                "17, 18, 20, and 21, I would enter the number 17.\n" +
                "The payout for this bet is 8 to 1 if your \n" +
                "selection is the winning number.\n\n" +
                "Please enter your number choice:";
        Integer[] result = new Integer[4];
        int counterForArray = 0;
        int startingNumber = IOHandler.promptForIntWithMessage(prompt);
        if (startingNumber > 31 || lastColumn.contains(startingNumber)) {
            do {
                System.out.println("\n\nERROR!\n\n");
                startingNumber = IOHandler.promptForIntWithMessage(prompt);
            } while (startingNumber > 31 || lastColumn.contains(startingNumber));
        }
        for (int i = startingNumber; i < startingNumber + 5; i++) {
            if (i != (startingNumber + 2)) {
                result[counterForArray] = i;
                counterForArray++;
            }
        }
        return result;
    }

    public Integer[] straight() {
        String prompt = "********************* Straight *********************\n" +
                "You selected to bet 10 chips on three number spaces.\n" +
                "These 3 spaces are numbers that lie in the same row. You will enter the 1st number in the row to make\n" +
                "your decision For example, if I wanted to choose \n" +
                "the row that contains 4, 5, and 6, I would enter the number 4. If any of those numbers win, the bet is\n" +
                "won. The payout for this bet is 11 to 1 if your \n" +
                "selection is the winning number.\n\n";
        System.out.println(prompt);
        Integer[] result = new Integer[3];
        Integer[] column2 = rouletteBoardAndWheel.columnSelection(2);
        Integer[] column3 = rouletteBoardAndWheel.columnSelection(3);
        int startingNumber = IOHandler.promptForIntWithMessage(prompt);
        if (startingNumber > 34 || secondColumn.contains(startingNumber) || lastColumn.contains(startingNumber)) {
            do {
                System.out.println("\n\nERROR!\n\n");
                startingNumber = IOHandler.promptForIntWithMessage("Please enter a number between 1-34: ");
            } while (startingNumber > 34 || secondColumn.contains(startingNumber) || lastColumn.contains(startingNumber));
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = startingNumber + i;
        }
        return result;
    }

    public Integer[] basket() {
        String prompt = "********************* Basket *********************\n" +
                "You selected to bet 10 chips on three number spaces.\n" +
                "These 3 spaces are numbers 0, 00, and 2. The payout \n" +
                "for this bet is 11 to 1 if your selection is the \n" +
                "winning number. Press 'c' to continue and place bet.";
        String goOnAhead = IOHandler.promptForStringWithMessage(prompt);
        whereYouGetStuckForJustNotPressingC(goOnAhead, prompt);
        Integer[] result = {0, 00, 2};
        return result;
    }

    public Integer[] fiveNumberBet() {
        String prompt = "***************** Five Number Bet *****************\n" +
                "You selected to bet 10 chips on the top five number \n" +
                "spaces.These 3 spaces are numbers 0, 00, 1, 2, and \n" +
                "3. The payout for this bet is 6 to 1 if your \n" +
                "selection is the winning number. Press 'c' to \n" +
                "continue and place bet.";
        String goOnAhead = IOHandler.promptForStringWithMessage(prompt);
        whereYouGetStuckForJustNotPressingC(goOnAhead, prompt);
        Integer[] result = {0, 00, 1, 2, 3};
        return result;
    }

    public Integer[] lineBet() {
        String prompt = "********************* Line Bet *********************\n" +
                "You selected to bet 10 chips on 6 number spaces. This \n" +
                "selection includes 6 numbers in a 2 row format.\n" +
                "\n" +
                "Visual example:\n" +
                "\t              -   -   -\n" +
                "\t            | 4 | 5 | 6 |\n" +
                "\t              -   -   - \n" +
                "\t            | 7 | 8 | 9 |\n" +
                "\t              -   -   -\n" +
                "\n" +
                "Above is a visual example of your line bet. If you \n" +
                "enter the first number in the line bet (top left \n" +
                "corner, number being 4 in the example), your bet \n" +
                "will include the other 5 numbers. The payout for \n" +
                "this bet is 5 to 1.\n\n";
        Integer[] result = new Integer[6];
        int startingNumber = IOHandler.promptForIntWithMessage(prompt);
        if (startingNumber > 31 || secondColumn.contains(startingNumber) || lastColumn.contains(startingNumber)) {
            do {
                System.out.println("\n\nERROR!\n\n");
                startingNumber = IOHandler.promptForIntWithMessage(prompt);
            }
            while (startingNumber > 31 || secondColumn.contains(startingNumber) || lastColumn.contains(startingNumber));
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = startingNumber + i;
        }
        return result;
    }

    public Integer[] columnBet() {
        String prompt = "******************** Column Bet ********************\n" +
                "You selected to bet 10 chips on one column of the \n" +
                "board. There are three column on our Roulette board. \n" +
                "When betting on one column, you are betting on every \n" +
                "number in that column. The payout for this bet is 2 \n" +
                "to 1.\n" +
                "\n" +
                "Please enter 1, 2, or 3 for the first column, second \n" +
                "column, or third column respectively:";
        int selection;
        do{
            selection = IOHandler.promptForIntWithMessage(prompt);
        } while (selection > 3 || selection < 1);
        Integer[] result = rouletteBoardAndWheel.columnSelection(selection);
        return result;
    }

    public Integer[] twelveNumberBet() {
        String prompt = "******************** Column Bet ********************\n" +
                "You selected to bet 10 chips on twelve number spaces.  \n" +
                "You are able to bet on bulk options that include the \n" +
                "first twelve numbers on the board, second twelve, or \n" +
                "third twelve. The payout for this bet is 2 to 1.\n" +
                "\n" +
                "Please enter 1, 2, or 3 for the first 12, second \n" +
                "12, or third 12 respectivly:";
        int selection;
        do{
            selection = IOHandler.promptForIntWithMessage(prompt);
        } while (selection > 3 || selection < 1);
        Integer[] result = rouletteBoardAndWheel.twelveNumberBet(selection);
        return result;
    }

    public Integer[] numbers1Thru18() {
        String prompt = "********************* 1-18 Bet *********************\n" +
                "You selected to bet 10 chips on numbers 1-18. The \n" +
                "payout for this bet is 1 to 1. Please press 'c' to \n" +
                "continue.\n";
        String goOnAhead = IOHandler.promptForStringWithMessage(prompt);
        whereYouGetStuckForJustNotPressingC(goOnAhead, prompt);
        Integer[] result = new Integer[18];
        for (int i = 1; i <= result.length; i++) {
            result[i - 1] = i;
        }
        return result;
    }

    public Integer[] numbers19thru36() {
        String prompt = "******************** 19-36 Bet *********************\n" +
                "You selected to bet 1 chip on numbers 19-36. The \n" +
                "payout for this bet is 1 to 1. Please press 'c' to \n" +
                "continue.\n";
        String goOnAhead = IOHandler.promptForStringWithMessage(prompt);
        whereYouGetStuckForJustNotPressingC(goOnAhead, prompt);
        Integer[] result = new Integer[18];
        int startingNumber = 19;
        for (int i = 0; i < result.length; i++) {
            result[i] = startingNumber + i;
        }
        return result;
    }

    public Integer[] evenNumbers() {
        String prompt = "******************* Even Numbers *******************\n" +
                "You selected to bet 10 chips on numbers all even \n" +
                "numbers on the board. The payout for this bet is 1 \n" +
                "to 1. Please press 'c' to continue.\n";
        String goOnAhead = IOHandler.promptForStringWithMessage(prompt);
        whereYouGetStuckForJustNotPressingC(goOnAhead, prompt);
        Integer[] result = rouletteBoardAndWheel.evenNumberSet();
        return result;
    }

    public Integer[] oddNumbers() {
        String prompt = "******************** Odd Numbers *******************\n" +
                "You selected to bet 10 chips on numbers all odd \n" +
                "numbers on the board. The payout for this bet is 1 \n" +
                "to 1. Please press 'c' to continue.\n";
        String goOnAhead = IOHandler.promptForStringWithMessage(prompt);
        whereYouGetStuckForJustNotPressingC(goOnAhead, prompt);
        Integer[] result = rouletteBoardAndWheel.oddNumberSet();
        return result;
    }

    public Integer[] blackNumbers() {
        String prompt = "******************* Black Numbers ******************\n" +
                "You selected to bet 10 chips on numbers all black colored \nnumbers on the board. " +
                "The payout for this bet is 1 to 1. \n" +
                "\n" +
                "Black numbers: \n" +
                "{2, 4, 6, 8, 10, 11,\n" +
                "13, 15, 17, 20, 22, 24,\n" +
                "26, 28, 29, 31, 33, 35}\n" +
                "\n" +
                "Please press 'c' to continue.\n";
        String goOnAhead = IOHandler.promptForStringWithMessage(prompt);
        whereYouGetStuckForJustNotPressingC(goOnAhead, prompt);
        Integer[] result = rouletteBoardAndWheel.blackNumberSet();
        return result;
    }

    public Integer[] redNumbers() {
        String prompt = "******************** Red Numbers *******************\n" +
                "You selected to bet 10 chips on numbers all red colored \nnumbers on the board. " +
                "The payout for this bet is 1 to 1. \n" +
                "\n" +
                "Red numbers: \n" +
                "{1, 3, 5, 7, 9, 12,\n" +
                "14, 16, 18, 19, 21, 23,\n" +
                "25, 27, 30, 32, 34, 36}\n" +
                "\n" +
                "Please press 'c' to continue.\n";
        String goOnAhead = IOHandler.promptForStringWithMessage(prompt);
        whereYouGetStuckForJustNotPressingC(goOnAhead, prompt);
        Integer[] result = rouletteBoardAndWheel.redNumberSet();
        return result;
    }

    public void whereYouGetStuckForJustNotPressingC(String input, String prompt) {
        if (!input.equals("c")) {
            do {
                System.out.println("\n\nERROR!\n\n");
                input = IOHandler.promptForStringWithMessage(prompt);
            } while (!input.equals("c"));
        }
    }
}
