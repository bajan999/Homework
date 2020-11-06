
package hangman;

import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Hangman {
    
    static void death(){
        System.out.println(" _____");
        System.out.println("|  |   ");
        System.out.println("|  0   ");
        System.out.println("| /|\\  ");
        System.out.println("| / \\  ");
        System.out.println("|      ");
    }
    static void hit1(){
        System.out.println("       ");
        System.out.println("|      ");
        System.out.println("|      ");
        System.out.println("|      ");
        System.out.println("|      ");
        System.out.println("|      ");
    }
    static void hit2(){
        System.out.println(" _____");
        System.out.println("|      ");
        System.out.println("|      ");
        System.out.println("|      ");
        System.out.println("|      ");
        System.out.println("|      ");
    }
    static void hit3(){
        System.out.println(" _____");
        System.out.println("|  |   ");
        System.out.println("|  0   ");
        System.out.println("|      ");
        System.out.println("|      ");
        System.out.println("|      ");
    }
    static void hit4(){
        System.out.println(" _____");
        System.out.println("|  |   ");
        System.out.println("|  0   ");
        System.out.println("| /|\\  ");
        System.out.println("|      ");
        System.out.println("|      ");
    }

    
    public static void main(String[] args) {
                                                //words that can appear
        String[] words = {"computing", "java", "hangman", "hippopotomonstrosesquippedaliophobia"};
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        
        String chosenWord = words[random.nextInt(words.length)];
        
        int fails = 0;
        
        ArrayList<Character> codedWord = new ArrayList<>();
        
        Iterator myIteration = codedWord.iterator();
        
        for (int i=0;i<chosenWord.length();i++){
            codedWord.add('_');
        } 
        
        boolean found = false;
        int l = (0);
        while(found == false & fails<5){                      //loop for guessing
            for (int f=0; f<chosenWord.length() ; f++){
                System.out.print(codedWord.get(f)+" ");
                
            }
            System.out.println("");
            
            if (fails==1){
                hit1();                         //prints the hangman
            } else if (fails==2){
                hit2();
            }else if (fails==3){
                hit3();
            }else if (fails==4){
                hit4();
            }else{
                System.out.println("no strikes");
            }
            System.out.println("guess a character");
            char guess = input.next().charAt(0);    //gets a guess
            
            for (int p=0;p<chosenWord.length();p++){
                if (chosenWord.charAt(p)==guess){
                    codedWord.set(p,guess);
                    System.out.println(codedWord);
                }else{
                    
                }
            
            }
            
            if (chosenWord.contains(Character.toString(guess))){
                
            }else{
                System.out.println("incorrect guess");
                fails=fails+1;
            }
            
            if (fails==5){
                death();
                System.out.println("you lose");
            }
            
            if (codedWord.contains('_')){
                
            }else{
                System.out.println("you win");
                found=true;
            }
            
            
        }
        
        
        
        
        
    }
    
}
