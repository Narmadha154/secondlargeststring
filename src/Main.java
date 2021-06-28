import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            String firststring="null";
            String secondstring="null";
            Scanner sc=new Scanner(System.in);
            System.out.println("please enter the number of strings you want to enter");
            String [] string= new String[sc.nextInt()];
            sc.nextLine();
            for(int i=0;i< string.length;i++){
                string [i]=sc.nextLine();
            }
            for(int i=0;i<string.length;i++){
                int s= string[i].length();
                int a=firststring.length();
                int b=secondstring.length();
                if(a<s){
                    secondstring=firststring;
                    firststring=string[i];
                    a=s;
                }
                else if(b<s){
                    secondstring=string[i];
                    b=s;
                }
            }
            System.out.println("second largest string is:"+secondstring);
        }
    }
