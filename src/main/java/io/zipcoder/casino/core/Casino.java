package io.zipcoder.casino;

public class Casino {
    private Player player;
    private Game running;
    int answer;

    public Casino() {
        this.player = player;
        answer = 0;
    }
    
    public int getAnswer() {

        return answer;
    }

    public void mainMenu(){
        String prompt = "Welcome to High Rollers Club!\n"+
                "As a welcome gift, here's 500 chips ($2500)\n" +
                "Please choose a game to play\n(Enter a number for your selection)\n\n" +
                "\t1. Black Jack\n\t2. Crazy 8's\n\t3. Ceelo\n\t4. Roulette\n\t\t5.EXIT";
        answer = IOHandler.promptForIntWithMessage(prompt);
    }

    public void enter(){
        while(answer != 5) {
            mainMenu();

            switch(answer) {
                case 1:
                    //running = new BlackJack();
                    break;
                case 2:
                    //running = new CrazyEights();
                    break;
                case 3:
                    //running= new CeeLo();
                    break;
                case 4:
                    //running = new Roulette();
                    break;

            }

            //running.play(player);
        }
    }
}
