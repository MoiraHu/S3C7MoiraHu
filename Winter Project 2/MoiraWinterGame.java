
/**
 * It's a program made in Mr.Daniel's computer science class as winter assignment.
 * 
 * Moira Hu from S3C7
 * Version 1.0
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class MoiraWinterGame
{
   public static void main()
   {
       int linzehaogan=0;
       int yeyulanhaogan=0;
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome to the world of <All the flowers withered after my flourishing>\n"+
       "In this game, you will have two perspectives and four possible ends. Restart game to enjoy different perspectives!\n"+
       "What is your gender? (male or female)");
       String gender=input.nextLine();
       //Gender
       System.out.println("Got it. Have you know about the rules of 'the killing game'?");
       String panduan=input.nextLine();
       if(panduan.equals("no"))
       {
           System.out.println("");
           System.out.println("Killers secretly walked into a small village.\n"+
           "They hided themselves as commoners, but they kill people at night.\n"+
           "The residents find that every night there are people dying.\n"+
           "They decided to find the killers and kill them.\n"+
           "\n"+
           "Each day is divided to two parts: day and night.\n"+
           "During the 'day' part, players would express their own opinions in order, and start voting for the ones that they think the killer is.\n"+
           "The person that gets the most votes will be eliminated.\n"+
           "During the 'night' part, players would use their 'abilities. Only themselves know it, others cannot see it.\n"+
           "If all the killers are eliminated, the Good side wins. If all the polices are eliminated, the Bad side wins.\n"+
           "\n"+
           "Player Cards:\n"+
           "4 KILLERS: They can communicate and kill one person each night. Belong to Bad side.\n"+
           "\n"+
           "3 POLICES: They can communicate and check a certain person's real status each night. Belong to Good side.\n"+
           "\n"+
           "1 DOCTOR: Doctor can choose to inject a person each night or not. Belongs to Good side.\n"+
           "If the person he injects is killed by killers at the same night, he will be saved.\n"+
           "but if that person isn't chosen by the killers, that person will be 'infected'. Double infected equals to death.\n"+
           "\n"+
           "1 FOREST ELDERLY: Elderly can silence anyone each night, and that person couldn't speak during the discussion and voting. Belongs to Good side. /n"+
           "\n"+
           "1 Butterfly: Butterfly can choose to hug a person each night or not. Belongs to Good side.\n"+
           "If the person he hugs is killed or being affected by others' abilities (doctor, elderly, shooter) at the same night, these abilities will be invalid\n"+
           "but if the butterfly is affected by others' abilities, he and the person he hugs at that time will both be affected by the same abilities. \n"+
           "\n"+
           "1 Shooter: Shooter has one bullet. Belongs to Good side.\n"+
           "Shooter can use his only-bullet to kill a person he doubts as killer for the whole round. If he is chosen to be killed before he shoots, he will be save.\n"+
           "\n"+
           "5 commoners: Commoners don't have special skills.\n"+
           "");
        }
       else
       {
        }
        
       System.out.println("Now, be ready to start! Press any botton to begin your game!");
       String start=input.nextLine( );
      if (start==start)
       {
           System.out.println("");
           System.out.println("Now, please answer the following questions to set some presets of the game.\n"+
           "Which word best fits you? justice or evil? (Don't spell it wrong)");
           String card=input.nextLine();
           //shenfen
           System.out.println("");
           System.out.println("Which one do you want? lover or friend? (Don't spell it wrong)");
           String seyou=input.nextLine();
           //lover or friend
           
           System.out.println("");
           System.out.println("Loading......");
           System.out.println("");
           System.out.println("You wake up in a strange place...\n"+
           "It's dark and silence, you can't see anyone or anything besides you.\n"+
           "'How did I get there?' You ask yourself, 'Wasn't I just at home?\n"+
           "Nobody answers you, only endless dark and silence are accompanying you.\n"+
           "A thick card is under your feet. As you pick it up, light turns on.\n"+
           "'You are the one to be chosen. Now, get your cards ready...'\n"+
           "Someone's voice suddenly gets in your ear, but you still can't see anybody here.\n"+
           "'Common on, get ready for the 'killing games' \n"+
           "Killing games? You wonder, the game you usually play at school with your classmates?\n"+
           "You look at your card, it's....");
           
           if(gender.equals("male"))
           {
               System.out.println("");
               System.out.println("A police!\n"+
               "");
               System.out.println("You then become unconscious...until...");
               System.out.println("\n"+
               "");
           }
           else if (gender.equals("female"))
           {
               System.out.println("");
               System.out.println("A killer!\n"+
               "");
               System.out.println("You then become unconscious...until...");
               System.out.println("\n"+
               "");
           }
           
           //the first night
           System.out.println("-----The First Night-----");
            if (gender.equals("male"))
               {
                   System.out.println("");
                   System.out.println("【Your information】");
                   System.out.println("【Name: Alan】");
                   System.out.println("【Number: 9】");
                   System.out.println("【Card: Police】");
                   System.out.println("");
                   System.out.println("");
                   System.out.println("");
                   System.out.println("You wake up again in a room. Two girls stand beside you.\n"+
                   "'Katie? Beaty?' You look at them, they are two girls at your school."); 
                   System.out.println("'Hi Alan.' says Katie, 'we are all polices.'");
                   System.out.println("'What's going on? How did we get there?' You ask.\n"+
                   "Katie and Beaty both look at each other, Beaty sighs, 'We don't know neither. But we would die if we don't follow the instruction.'\n"+
                   "'What?!' You are shocked, 'Does anybody...' \n"+
                   "'Yes.' Katie replies, 'We have seen a corpes...But we don't know who that is. Anyway, play this game, then we can get out. \n"+
                   "You force yourself to be positive, 'so......   \n"+
                   "'Who do you think we should check first?' Beaty says, 'I prefer to check number2,Sunny. She's very clever and intellegent. I want to make sure she's in our side.\n"+
                   "'I don't know her, I can't tell.' Katie says, 'let's make a chart of all the members.'\n"+
                   "\n"+
                   "1  Zeddy\n"+
                   "2  Sunny\n"+
                   "3  Liz\n"+
                   "4  Tane\n"+
                   "5  Yimi\n"+
                   "6  Melody\n"+
                   "7  Caroline\n"+
                   "8  Med\n"+
                   "9  Alan【police】\n"+
                   "10 Katie【police】\n"+
                   "11 Austin\n"+
                   "12 Apollo\n"+
                   "13 Roe\n"+
                   "14 Max\n"+
                   "15 Beaty【police】\n"+
                   "16 Willow\n"+
                   "");
                   System.out.println("Do you agree to check Sunny at the first day?(press 1 or 2)");
                   System.out.println("1. Agree.");
                   System.out.println("2. Disagree.");
                   double diyitian=input.nextDouble();
                   int yeyulanhaogan=0;
                   if(diyitian==1)
                   {
                       yeyulanhaogan+=1;
                   }
                   else
                   {
                       System.out.println("Beaty asks you, 'Do you have a better choice?'");
                       System.out.println("You can't answer as you don't know anyone yet.");
                       System.out.println("Beaty's fovor-1.");
                       yeyulanhaogan-=1;
                       
                   }
                   System.out.println("");
                   System.out.println("");
                   System.out.println("You check Sunny togther.");
                   System.out.println("The card of Sunny: a doctor.");
                   System.out.println("------Information renewed------\n"+
                   "1  Zeddy\n"+
                   "2  Sunny【doctor】\n"+
                   "3  Liz\n"+
                   "4  Tane\n"+
                   "5  Yimi\n"+
                   "6  Melody\n"+
                   "7  Caroline\n"+
                   "8  Med\n"+
                   "9  Alan【police】\n"+
                   "10 Katie【police】\n"+
                   "11 Austin\n"+
                   "12 Apollo\n"+
                   "13 Roe\n"+
                   "14 Max\n"+
                   "15 Beaty【police】\n"+
                   "16 Willow\n"+
                   "");
               }
               else if (gender.equals("female"))
               {
                   System.out.println("");
                   System.out.println("【Your information】");
                   System.out.println("【Name: Willow】");
                   System.out.println("【Number: 16】");
                   System.out.println("【Card: Killer】");
                   System.out.println("");
                   System.out.println("");
                   System.out.println("");
                   System.out.println("You wake up again in a room. Two boys and a girl stand beside you.\n"+
                   "'Liz, Med, and Roe?' You look at them, they are also students at your school."); 
                   System.out.println("'Hi Liz.' says Roe, 'we are all killers.'");
                   System.out.println("'What's going on? How did we get there?' You ask.\n"+
                   "They look at each other, Roe sighs, 'We don't know neither. But we would die if we don't follow the instruction.'\n"+
                   "'What?!' You are shocked, 'Does anybody...' \n"+
                   "'Yes.' Roe replies, 'We have seen a corpes...But we don't know who that is. Anyway, play this game, then we can get out. \n"+
                   "You force yourself to be positive, 'so......'   \n"+
                   "'Who do you think we should kill first?' Liz says, 'I prefer to kill number11,Austin. He's an overseas student, stranger to all of us. No one will doubt us.\n"+
                   "'I don't know him, I can't tell.' Med says, 'let's make a chart of all the members.'\n"+
                   "\n"+
                   "1  Zeddy\n"+
                   "2  Sunny\n"+
                   "3  Liz【killer】\n"+
                   "4  Tane\n"+
                   "5  Yimi\n"+
                   "6  Melody\n"+
                   "7  Caroline\n"+
                   "8  Med【killer】\n"+
                   "9  Alan\n"+
                   "10 Katie\n"+
                   "11 Austin\n"+
                   "12 Apollo\n"+
                   "13 Roe【killer】\n"+
                   "14 Max\n"+
                   "15 Beaty\n"+
                   "16 Willow【killer】\n"+
                   "");
                   System.out.println("Do you agree to kill Austin at the first day? (press 1 or 2)");
                   System.out.println("1. Agree.");
                   System.out.println("2. Disagree.");
                   double diyitian=input.nextDouble();
                   
                   if(diyitian==1)
                   {
                       System.out.println("");
                       linzehaogan+=1;
                   }
                   else
                   {
                       System.out.println("Liz asks you, 'Do you have a better choice?'");
                       System.out.println("You can't answer as you don't know anyone yet.");
                       System.out.println("");
                       linzehaogan-=1;
                       
                   }
                   System.out.println("");
                   System.out.println("");
                   System.out.println("You kill Austin togther.");
                   
               }
               
           // the first day
            System.out.println("");
            System.out.println("-----The First Day-----");
            System.out.println("Austin died. His card is --- commonner");
            System.out.println("1 Zeddy:'I am a commoner. I have no idea what happened. Pass.'");
            System.out.println("2 Sunny:'I am a commoner as well. Pass.");
            System.out.println("3 Liz:'Is there any police already check a killer? please tell us. I'm not police.'");
            System.out.println("4 Tane:");
            System.out.println("5 Yimi:'Liz, are you looking for police? Just curious.'");
            System.out.println("6 Melody:'I agree. Liz, why are you so hurry to find police? Are youa killer?");
            System.out.println("7 Caroline: I saw Apollo fighting with Austin just before the game start. Don't you care about this?");
            System.out.println("8 Med: Yes, I also saw it. Apollo said he would let Austin pay for beating him.");
            if(gender.equals("male"))
            {
                System.out.println("");
                System.out.println("It's your turn. What would you say?");
                System.out.println("1. Liz is very suspicious.");
                System.out.println("2. Apollo is very suspicious");
                Double dytbt=input.nextDouble();
                if(dytbt==1)
                {
                    yeyulanhaogan+=1;
                    
                }
                if(dytbt==3)
                {
                    yeyulanhaogan=yeyulanhaogan;
                    
                }
                
                
                
            }
            else 
            {
                System.out.println("9 Alan: Liz is very suspicious.");
                System.out.println("10 Alan: Liz is very suspicious.");
                System.out.println("9 Alan: Liz is very suspicious.");
                
            }   
          
       }
       
      else
      {
       }
   } 
} 
    
    
    
    
    

