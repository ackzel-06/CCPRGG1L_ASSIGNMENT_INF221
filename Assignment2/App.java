public class App {
    public static void main(String[] args) throws Exception {
         
        // for Loop
        for (int firstnameCount = 5; firstnameCount != 0; firstnameCount--) {
          
            // break 
            if (firstnameCount == 3){
                System.out.println("Break timeout!");
                break;
            }
            System.out.println("Ackzel ");
        }
        // While Loop
        int nicknameCount = 5;
         while (nicknameCount != 0) {
            System.out.println("zel");
            nicknameCount--;
            //continue 
            if (nicknameCount == 3){
                System.out.println("Go ahead i will skip this third loop. i will ride on the next loop");
                continue;
            }
            System.out.println("Zel");
        }
         //Do-while Loop
        int surnameCount = 5;
          do {
            System.out.println("Borero");
            surnameCount--;
        } while (surnameCount != 0);
    }
}
 
