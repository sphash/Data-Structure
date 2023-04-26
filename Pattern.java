import java.util.*;

class Pattern{
     public static void main(String[] args){
        System.out.println("Star Patern 1");
        starPattern1(5);
        System.out.println("--------------------");
        System.out.println("Star Patern 2");
        starPattern2(5);
        System.out.println("--------------------");
        System.out.println("Star Patern 3");
        starPattern3(5);
        System.out.println("--------------------");
        System.out.println("Star Patern 4");
        starPattern4(5);
        System.out.println("--------------------");
        System.out.println("Star Patern 5");
        starPattern5(5);
        System.out.println("--------------------");
        System.out.println("Star Patern 6");
        starPattern6(5);
        System.out.println("--------------------");
        System.out.println("Star Patern 7");
        starPattern7(5);
        System.out.println("--------------------");
        System.out.println("Star Patern 8");
        starPattern8(5);
        System.out.println("--------------------");
        System.out.println("Star Patern 9");
        starPattern9(5);
        System.out.println("--------------------");
        System.out.println("Star Patern 10");
        starPattern10(5);
        System.out.println("--------------------");
        System.out.println("Star Patern 11");
        starPattern11(5);
        System.out.println("--------------------");
        System.out.println("Star Patern 12");
        starPattern12(5);
        System.out.println("--------------------");
        System.out.println("Star Patern 13");
        starPattern13(5);
        System.out.println("--------------------");
        System.out.println("Star Patern 14");
        starPattern14(5);
        System.out.println("--------------------");
        System.out.println("Star Patern 15");
        starPattern15(5);
        System.out.println("--------------------");
        System.out.println("Star Patern 16");
        starPattern16(5);
        System.out.println("--------------------");
        System.out.println("Star Patern 17");
        starPattern17(5);
        System.out.println("--------------------");
        System.out.println("Star Patern 18");
        starPattern18(5);
        System.out.println("--------------------");

     }

     public static void starPattern1(int number){
        for(int i =0 ;i<number;i++){
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
     }
     
     public static void starPattern2(int number){
        for(int i =0 ;i<number;i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
     }

     public static void starPattern3(int number){
        for(int i =0 ;i<number;i++){
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1);  
            }
            System.out.println();
        }
     }

     public static void starPattern4(int number){
        for(int i =0 ;i<number;i++){
            for (int j = 0; j <= i; j++) {
                System.out.print(i+1);    
            }
            System.out.println();
        }
     }

     public static void starPattern5(int number){
        for(int i =0 ;i<number;i++){
            for (int j = 0; j < number-i; j++) {
                System.out.print("*");    
            }
            System.out.println();
        }
     }

     public static void starPattern6(int number){
        for(int i =0 ;i<number;i++){
            for (int j = 0; j < number-i; j++) {
                System.out.print(j+1);   
            }
            System.out.println();
        }
     }

     public static void starPattern7(int number){
        for(int i =0 ;i<number;i++){
            for (int j = 0; j < number-i-1; j++) {
                System.out.print(" ");   
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");   
            }
            System.out.println();
        }
     }

     public static void starPattern8(int number){
        for(int i =0 ;i<number;i++){
            for (int j = 0; j < i; j++) {
                System.out.print(" ");  
            }
            for (int j = 0; j < 2*(number-i)-1; j++) {
                System.out.print("*");  
            }
            System.out.println();
        }
     }

     public static void starPattern9(int number){
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();  
        }
        for(int i =0 ;i<number;i++){
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
                
            }
            for (int j = 0; j < 2*(number-i)-1; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
     }

     public static void starPattern10(int number){
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < (number-i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
     }

     public static void starPattern11(int number){
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <=i; j++) {
                if((i%2==0 && j%2==0) ||(i%2!=0 && j%2!=0)){
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
     }
    
     public static void starPattern12(int number){
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(j+1);
            }
            for (int j = 0; j <2*(number-i-1); j++) {
                System.out.print(" ");
            }  
            for (int j = i; j >=0; j--) {
                
                System.out.print(j+1);
                
            }  
            System.out.println();     
        }
     }

     public static void starPattern13(int number){
        int flag = 1;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(flag++ +" ");
            }
            System.out.println();
        }
     }

     public static void starPattern14(int number){
        for (int i = 0; i < number; i++) {
            char ascii = 65; //A-Z : 65-90, a-z : 97-122
            for (int j = 0; j <=i; j++) {
                System.out.print(ascii++);
            }
            System.out.println();
        }
     }

      public static void starPattern15(int number){
        for (int i = 0; i < number; i++) {
            char ascii = 65;
            for (int j = 0; j < number-i; j++) {
                System.out.print(ascii++);
            }
            System.out.println();
        }
      }

      public static void starPattern16(int number){
        char ascii = 65;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(ascii);
            }
            ascii++;
            System.out.println();
        }
      }

      public static void starPattern17(int number){
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number-i-1; j++) {
                System.out.print(" ");
            }
            char ascii = 65;
            for (int j = 0; j <=i; j++) {
                System.out.print(ascii++);
            }
            int ascii1 = 65;
            for (int j = i; j>0; j--) {
                System.out.print((char)(ascii1+j-1));
                
            }
            System.out.println();
        }
      }

      public static void starPattern18(int number){
        for (int i = 0; i < number; i++) {
            int ascii = 69;
            for (int j = i; j>=0; j--) {
                System.out.print((char)(ascii-j) + " ");
            }
            System.out.println();
        }
      }
     

}