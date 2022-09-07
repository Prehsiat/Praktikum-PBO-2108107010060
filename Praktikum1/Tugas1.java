import java.util.Scanner;

public class Lat1 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
                
        int unit; 
        int harga; 

        System.out.print("Masukkan jumlah barang: " );
        unit = myInput.nextInt();

        System.out.print("Masukkan harga barang: " );
        harga = myInput.nextInt();

        int harga1 = unit * harga;
        int diskon = harga1 * 15/100;
        int harga2 = harga1 - diskon;

        System.out.println("Harga yang harus dibayarkan adalah: " + harga2);
        myInput.close();
    }
}
