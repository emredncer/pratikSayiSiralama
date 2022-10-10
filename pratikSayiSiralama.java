import java.util.Scanner;

public class pratikSayiSiralama {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        num1 = input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        num2 = input.nextInt();
        System.out.print("3. sayıyı giriniz: ");
        num3 = input.nextInt();
        if ((num1<num2)&&(num1<num3)){
            if (num2<num3){
                System.out.println("1.sayı<2.sayı<3.sayı");
            }else {
                System.out.println("1.sayı<3.sayı<2.sayı");
            }
        }else if ((num2<num3)&&(num2<num1)){
            if (num3<num1){
                System.out.println("2.sayi<3.sayı<1.sayı");
            }else {
                System.out.println("2.sayı<1.sayı<3.sayı");
            }
        }else {
            if (num2<num1){
                System.out.println("3.sayı<2.sayı<1.sayı");
            }else {
                System.out.println("3.sayı<1.sayı<2.sayı");
            }
        }
    }
}
