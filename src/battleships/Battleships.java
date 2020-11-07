package battleships;

import java.util.Random;
import java.util.Scanner;

public class Battleships {

    public static int[][] board = new int[10][10];
    public static String[][] viewBoard = new String[10][10];
    
    public static void setUpGrid() {     //0=empty, 1=full, 2=hit, 3=miss
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = 0;

            }

        }

    }
    
    public static void setUpViewGrid(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                viewBoard[i][j]="[ ]";
                
            }
            
        }
    }
    
    public static int shipLocationX(int length, char direction){
        if (direction=='r'){
            int locationX=getRandomNumberBelow(11-length);
            return locationX;
        }else{
            int locationX=getRandomNumberBelow(10);
            return locationX;
        }
    }
    public static int shipLocationY(int length, char direction){
        if (direction=='d'){
            int locationY=getRandomNumberBelow(11-length);
            return locationY;
        }else{
            int locationY=getRandomNumberBelow(10);
            return locationY;
        }
    }    
    
    
    public static void printBoard(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(viewBoard[i][j]);
                
            }
            System.out.println("");
        }
        
    }
    
    public static int noOfShips(){
        int shipParts=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (board[i][j]==1){
                    shipParts++;
                }else{
                    
                }
                
            }
            
        }
        return shipParts;
    }

    public static int getRandomNumberBelow(int max) {

        Random random = new Random();
        int randomNumber = random.nextInt(max);
        return randomNumber;
    }
    
    public static int getXInput(){
        System.out.println("write a Y value");
        Scanner input=new Scanner(System.in);
        int XGuess=input.nextInt();
        XGuess--;
        return XGuess;
    }
    
    public static int getYInput(){
        System.out.println("write an X value");
        Scanner input=new Scanner(System.in);
        int YGuess=input.nextInt();
        YGuess--;
        return YGuess;
    }

        public static char directionDecide() {

        int coinflip = getRandomNumberBelow(2);

        if (coinflip == 0) {          //r=right, d=down
            char direction = 'r';
            return direction;
        } else {
            char direction = 'd';
            return direction;
        }

    }

    public static void main(String[] args) {

        setUpGrid();

        setUpViewGrid();

        char ship1Direction = directionDecide();
        char ship2Direction = directionDecide();
        char ship3Direction = directionDecide();  //setting ship direction 
        char ship4Direction = directionDecide();
        char ship5Direction = directionDecide();
        char ship6Direction = directionDecide();
        char ship7Direction = directionDecide();
        
        int ship1Length = 2;
        int ship2Length = 2;
        int ship3Length = 3;
        int ship4Length = 3;
        int ship5Length = 4;
        int ship6Length = 4;
        int ship7Length = 6;
        
        int ship1LocationX=shipLocationX(ship1Length,ship1Direction);
        int ship1LocationY=shipLocationY(ship1Length,ship1Direction);
        
        board[ship1LocationX][ship1LocationY]=1;
        if (ship1Direction=='r'){
            board[ship1LocationX+1][ship1LocationY]=1;
        }else{
            board[ship1LocationX][ship1LocationY+1]=1;
        }
        
        int ship2LocationX=shipLocationX(ship2Length,ship2Direction);
        int ship2LocationY=shipLocationY(ship2Length,ship2Direction);
        
        board[ship2LocationX][ship2LocationY]=1;
        if (ship2Direction=='r'){
            board[ship2LocationX+1][ship2LocationY]=1;
        }else{
            board[ship2LocationX][ship2LocationY+1]=1;
        }
        
        int ship3LocationX=shipLocationX(ship3Length,ship3Direction);
        int ship3LocationY=shipLocationY(ship3Length,ship3Direction);
        
        board[ship3LocationX][ship3LocationY]=1;
        if (ship3Direction=='r'){
            board[ship3LocationX+1][ship3LocationY]=1;
            board[ship3LocationX+2][ship3LocationY]=1;
        }else{
            board[ship3LocationX][ship3LocationY+1]=1;
            board[ship3LocationX][ship3LocationY+2]=1;
            
        }
        
        int ship4LocationX=shipLocationX(ship4Length,ship4Direction);
        int ship4LocationY=shipLocationY(ship4Length,ship4Direction);
        
        board[ship4LocationX][ship4LocationY]=1;
        if (ship4Direction=='r'){
            board[ship4LocationX+1][ship4LocationY]=1;
            board[ship4LocationX+2][ship4LocationY]=1;
        }else{
            board[ship4LocationX][ship4LocationY+1]=1;
            board[ship4LocationX][ship4LocationY+2]=1;
            
        }
        
        int ship5LocationX=shipLocationX(ship5Length,ship5Direction);
        int ship5LocationY=shipLocationY(ship5Length,ship5Direction);
        
        board[ship5LocationX][ship5LocationY]=1;
        if (ship5Direction=='r'){
            board[ship5LocationX+1][ship5LocationY]=1;
            board[ship5LocationX+2][ship5LocationY]=1;
            board[ship5LocationX+3][ship5LocationY]=1;
        }else{
            board[ship5LocationX][ship5LocationY+1]=1;
            board[ship5LocationX][ship5LocationY+2]=1;
            board[ship5LocationX][ship5LocationY+3]=1;
        }
        
        int ship6LocationX=shipLocationX(ship6Length,ship6Direction);
        int ship6LocationY=shipLocationY(ship6Length,ship6Direction);
        
        board[ship6LocationX][ship6LocationY]=1;
        if (ship6Direction=='r'){
            board[ship6LocationX+1][ship6LocationY]=1;
            board[ship6LocationX+2][ship6LocationY]=1;
            board[ship6LocationX+3][ship6LocationY]=1;
        }else{
            board[ship6LocationX][ship6LocationY+1]=1;
            board[ship6LocationX][ship6LocationY+2]=1;
            board[ship6LocationX][ship6LocationY+3]=1;
        }
        
        int ship7LocationX=shipLocationX(ship7Length,ship7Direction);
        int ship7LocationY=shipLocationY(ship7Length,ship7Direction);
        
        board[ship7LocationX][ship7LocationY]=1;
        if (ship7Direction=='r'){
            board[ship7LocationX+1][ship7LocationY]=1;
            board[ship7LocationX+2][ship7LocationY]=1;
            board[ship7LocationX+3][ship7LocationY]=1;
            board[ship7LocationX+4][ship7LocationY]=1;
            board[ship7LocationX+5][ship7LocationY]=1;
        }else{
            board[ship7LocationX][ship7LocationY+1]=1;
            board[ship7LocationX][ship7LocationY+2]=1;
            board[ship7LocationX][ship7LocationY+3]=1;
            board[ship7LocationX][ship7LocationY+4]=1;
            board[ship7LocationX][ship7LocationY+5]=1;
        }
        
        int shipParts=noOfShips();
        
        int misses=0;
        int hits=0;
        
        while (misses<20&hits!=shipParts){
            printBoard();
            int YGuess=getYInput();
            int XGuess=getXInput();
            if (board[XGuess][YGuess]==1){
                System.out.println("hit");
                hits++;
                board[XGuess][YGuess]=2;
                viewBoard[XGuess][YGuess]="[O]";
            }else if (board[XGuess][YGuess]==0){
                System.out.println("miss");
                misses++;
                board[XGuess][YGuess]=3;
                viewBoard[XGuess][YGuess]="[X]";
            }else if (board[XGuess][YGuess]==2^board[XGuess][YGuess]==3){
                System.out.println("you've already shot here");
                
            }
            
        }
        System.out.println("you got "+hits+" hits after "+(hits+misses)+" shots.");
        System.out.println("There were "+shipParts+" spots to hit");
    }

}


//test code
//for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print(board[i][j]);
//                
//            }
//            System.out.println("");