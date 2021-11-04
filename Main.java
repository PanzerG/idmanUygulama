
import java.util.Scanner;





public class Main {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İdman Programına Hoşgeldiniz");
        
        System.out.println("********************");
        String hareketler = "Gecerli hareketler\n"
                +"Burpee\n"
                +"Pushup\n"
                +"Squat\n"
                +"Situp";
        
        System.out.println(hareketler);
        System.out.println("********************");
        System.out.println("Bir idman olusturun...");
        System.out.println("********************");
        
        System.out.print("Burpee sayisi:");
        int burpee = scanner.nextInt();
        
        
        System.out.print("Pushup sayisi:");
        int pushup = scanner.nextInt();
        
        
        System.out.print("Situp sayisi:");
        int situp = scanner.nextInt();
        
        
        System.out.print("Squat sayisi:");
        int squat = scanner.nextInt();
        scanner.nextLine();
        
        Idman idman = new Idman(burpee, pushup, situp, squat);
        
        while(idman.idmanBittiMi() == false){
            System.out.print("Hareket adını giriniz : ");
            String hareketadi = scanner.nextLine();
            System.out.print("Bu hareketten kac tane yapacaginizi giriniz : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(hareketadi, sayi);
        
        }
        System.out.println("********************");
        System.out.println("İdmanını başarıyla bitirdin");
    }
    
}
