/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class ConnectFour {

    //Instance variables
    String name;
    String instructions = "This is a game of Connect 4\n"
                    +"You will play against another player. Player 1 is \n"
                    +"black and Player 2 is red. Players will select a \n"
                    +"coordinate and keep alternating until one has four \n"
                    +" a row.";
    int boardheight=6;
    int boardwidth=7;
    String parameters = "The current board height is " + boardheight + " and the current board width is " + boardwidth + ". The option to modify these parameters will be added soon.";
            
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //Erin was here
        ConnectFour myGame = new ConnectFour();
        myGame.getName();
        myGame.displayHelp();
        myGame.displaySettings();
    }  
        public void getName(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name: ");
            this.name = input.next();
}
        
        public void displayHelp() {
            System.out.println("\nWelcome " + this.name +"\n");
            System.out.println(this.instructions);
        }
        
        public void displaySettings() {
            boardheight=6;
            boardwidth=7;
            System.out.println(this.parameters);
}

}