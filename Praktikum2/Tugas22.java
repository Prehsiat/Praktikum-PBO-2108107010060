import java.util.Scanner;

public class Tugas22 {
    public static void main(String[] args) {
        Scanner Skor = new Scanner( System.in );

        int Nilai;

        System.out.print("Masukkan nilai anda: ");
        Nilai = Skor.nextInt();

        if(Nilai < 41){
            System.out.println("Anda mendapatkan skor E dengan nilai 0.00");
        }
        else if(Nilai >=41 && Nilai <51){
            System.out.println("Anda mendapatkan skor D dengan nilai 1.00");
        } 

        else if(Nilai >=51 && Nilai <60){
            System.out.println("Anda mendapatkan skor C dengan nilai 2.00");
        }

        else if(Nilai >=60 && Nilai <69){
            System.out.println("Anda mendapatkan skor BC dengan nilai 2.50");
        }

        else if(Nilai >=69 && Nilai <78){
            System.out.println("Anda mendapatkan skor B dengan nilai 3.00");   
        }

        else if(Nilai >=78 && Nilai <87){
            System.out.println("Anda mendapatkan skor AB dengan nilai 3.50");
        }

        else if(Nilai >=87 && Nilai <=100){
            System.out.println("Anda mendapatkan skor A dengan nilai 4.00");
        }

        else{
            System.out.println("Mohon input data yang benar!!");
        } 

        Skor.close();
    } 
}
