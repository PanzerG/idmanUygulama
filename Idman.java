
import java.util.Scanner;


public class Idman {

    private int burpeesayisi;
    private int pushupsayisi;
    private int situpsayisi;
    private int squatsayisi;

    public Idman(int burpeesayisi, int pushupsayisi, int situpsayisi, int squatsayisi) {
        this.burpeesayisi = burpeesayisi;
        this.pushupsayisi = pushupsayisi;
        this.situpsayisi = situpsayisi;
        this.squatsayisi = squatsayisi;
    }

    /**
     * @return the burpeesayisi
     */
    public int getBurpeesayisi() {
        return burpeesayisi;
    }

    /**
     * @param burpeesayisi the burpeesayisi to set
     */
    public void setBurpeesayisi(int burpeesayisi) {
        this.burpeesayisi = burpeesayisi;
    }

    /**
     * @return the pushupsayisi
     */
    public int getPushupsayisi() {
        return pushupsayisi;
    }

    /**
     * @param pushupsayisi the pushupsayisi to set
     */
    public void setPushupsayisi(int pushupsayisi) {
        this.pushupsayisi = pushupsayisi;
    }

    /**
     * @return the situpsayisi
     */
    public int getSitupsayisi() {
        return situpsayisi;
    }

    /**
     * @param situpsayisi the situpsayisi to set
     */
    public void setSitupsayisi(int situpsayisi) {
        this.situpsayisi = situpsayisi;
    }

    /**
     * @return the squatsayisi
     */
    public int getSquatsayisi() {
        return squatsayisi;
    }

    /**
     * @param squatsayisi the squatsayisi to set
     */
    public void setSquatsayisi(int squatsayisi) {
        this.squatsayisi = squatsayisi;
    }
    
    public void burpeeYap(int sayi){
        if (burpeesayisi == 0) {
            System.out.println("Yapacak burpee kalmadi");
        }
        else if (burpeesayisi - sayi < 0 ) {
            System.out.println("burpee hedefinizi aştınız tebrikler");
            burpeesayisi = 0;
            System.out.println("Kalan burpee : " + burpeesayisi);
            
        }
        else{
            burpeesayisi -= sayi;
            
            System.out.println("Kalan burpee sayisi : " + burpeesayisi);
        }
        
    }
    
    public void pushupYap(int sayi){
        if (pushupsayisi == 0) {
            System.out.println("Yapacak pushup kalmadi");
            
        }
        else if(pushupsayisi - sayi < 0){
            System.out.println("pushup hedefinizi aştınız tebrikler");
            pushupsayisi = 0;
            System.out.println("Kalan pushup : " + pushupsayisi);
        }
        else{
            pushupsayisi -= sayi;
            System.out.println("Kalan pushup sayisi : " + pushupsayisi);}
        
    }
    public void situpYap(int sayi){
        if (situpsayisi == 0) {
            System.out.println("Yapacak situp kalmadi");
            
        }
        else if(situpsayisi - sayi < 0){
            System.out.println("situp hedefinizi aştınız tebrikler");
            situpsayisi = 0;
            System.out.println("Kalan situp : " + situpsayisi);
        }
        else{
            situpsayisi -= sayi;
            System.out.println("Kalan pushup sayisi : " + situpsayisi);}
        
    }
    public void squatYap(int sayi){
        if (squatsayisi == 0) {
            System.out.println("Yapacak pushup kalmadi");
            
        }
        else if(squatsayisi - sayi < 0){
            System.out.println("pushup hedefinizi aştınız tebrikler");
            squatsayisi = 0;
            System.out.println("Kalan pushup : " + squatsayisi);
        }
        else{
            squatsayisi -= sayi;
            System.out.println("Kalan pushup sayisi : " + squatsayisi);}
        
    }

    public void hareketYap(String hareketTürü, int sayi) {
        if(hareketTürü.equals("burpee")) {
            burpeeYap(sayi);

        } else if(hareketTürü.equals("pushup")) {
            pushupYap(sayi);
        } else if(hareketTürü.equals("situp")) {
            situpYap(sayi);
        } else if(hareketTürü.equals("squat")) {
            squatYap(sayi);
        }
        else{System.out.println("Gecersiz hareket...");}
        

    }
    public boolean idmanBittiMi(){
    return (burpeesayisi == 0) && (squatsayisi == 0) && (situpsayisi == 0) && (pushupsayisi == 0);
    }

}
