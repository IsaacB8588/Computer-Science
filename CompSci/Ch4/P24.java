
/**
 * Shows the probability of winning on whether you stay or change in the Monte Hall Problem
 * 
 * @author Isaac Blandin
 * @version October 25, 2018
 */
public class P24
{
    public static void main(){
        int stay = 0;
        int change = 0;
        int stayPrize = 0;
        int changePrize = 0;
        int openDoor = 0;
        int door = 0;
        int choice = 0;
        //run the program 1000 times
        for (int i = 0; i < 1000; i++){
            //randomly select the door whc=ich the prize is behind
            
            int doorRand = (int)(Math.random()*3);
            if(doorRand == 0){
                door = 1;
            } else if (doorRand == 1){
                door = 2;
            } else {
                door = 3;
            }
            //random select the participants choice

            int choiceRand = (int)(Math.random()*3);
            if(choiceRand == 0){
                choice = 1;
            } else if (choiceRand == 1){
                choice = 2;
            } else {
                choice = 3;
            }
            
            //make decision of which door is opened first 
            if(choice == door){
                int firstDoor = 0;
                int firstDoorRand = (int)(Math.random()*2);
                if(firstDoorRand == 0){
                    if(door == 1){
                        openDoor = 2;
                    } else if(door == 2){
                        openDoor = 1;
                    } else {
                        openDoor = 1;
                    }
                    
                } else {
                    if(door == 1){
                        openDoor = 3;
                    } else if ( door == 2){
                        openDoor = 3;
                    } else {
                        openDoor = 2;
                    }
                }
            } else {
                if(door == 1){
                    if (choice == 2){
                        openDoor = 3;
                    } else {
                        openDoor = 2;
                    }
                }
                if(door == 2){
                    if (choice == 1){
                        openDoor = 3;
                    } else {
                        openDoor = 1;
                    }
                }
                if(door == 3){
                    if (choice == 1){
                        openDoor = 2;
                    } else {
                        openDoor = 1;
                    }
                }
                
                if(door == choice){
                    stayPrize ++;
                } else {
                    changePrize ++;
                }
         
            }
            
        }
        System.out.println("stay: " + (1000 - changePrize));
        System.out.println("change: " + changePrize);

    }
}
