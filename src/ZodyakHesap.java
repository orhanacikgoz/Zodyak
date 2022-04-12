import java.util.Scanner;

public class ZodyakHesap {
    public static void main(String[] args) {
        int dogumyili;
        System.out.println("Dogum Yilinizi Giriniz: ");
        Scanner inp=new Scanner(System.in);
        dogumyili=inp.nextInt();

        if (dogumyili%12==0){
            System.out.println("Cin Zodyagi Burcunuz: Maymun ");

        }else if (dogumyili%12==1)
            {System.out.println("Cin Zodyagi Burcunuz: Horoz ");}
        else if (dogumyili%12==2){System.out.println("Cin Zodyagi Burcunuz: Kopek ");}
        else if (dogumyili%12==3){System.out.println("Cin Zodyagi Burcunuz: Domuz ");}
        else if (dogumyili%12==4){System.out.println("Cin Zodyagi Burcunuz: Fare ");}
        else if (dogumyili%12==5){System.out.println("Cin Zodyagi Burcunuz: Okuz ");}
        else if (dogumyili%12==6){System.out.println("Cin Zodyagi Burcunuz: Kaplan ");}
        else if (dogumyili%12==7){System.out.println("Cin Zodyagi Burcunuz: Tavsan ");}
        else if (dogumyili%12==8){System.out.println("Cin Zodyagi Burcunuz: Ejderha ");}
        else if (dogumyili%12==9){System.out.println("Cin Zodyagi Burcunuz: Yilan ");}
        else if (dogumyili%12==10){System.out.println("Cin Zodyagi Burcunuz: At ");}
        else if (dogumyili%12==11){System.out.println("Cin Zodyagi Burcunuz: Koyun ");}



    }
}
