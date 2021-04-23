package praktikum;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        int pilih,repeat;

        do{        
            vcd film = new vcd();

            Scanner inputUser = new Scanner(System.in);

            System.out.println("");
            System.out.print("Masukkan Judul        : ");
            film.judul=inputUser.nextLine();
            System.out.print("Masukkan Publisher    : ");
            film.publisher=inputUser.nextLine();
            System.out.print("Masukkan Aktor        : ");
            film.aktor=inputUser.nextLine();
            System.out.print("Masukkan Sutradara    : ");
            film.sutradara=inputUser.nextLine();
            
            System.out.println("           Kategori");
            System.out.println("1. Semua Umur\n2. Dewasa\n3. Remaja\n4. Anak-Anak");
            System.out.print("Pilih nomer berapa?   : ");
            pilih=inputUser.nextInt();

            switch(pilih){
                case 1:
                    film.kategori="Semua Umur";
                    break;
                case 2:
                    film.kategori="Dewasa";
                    break;
                case 3:
                    film.kategori="Remaja";
                    break;
                case 4:
                    film.kategori="Anak-Anak";
                    break;
                default:
                    System.out.println("Pilihan Anda Tidak Ada");
                    return;
            }
            System.out.print("Stok                   : ");
            film.stok=inputUser.nextInt();
            System.out.println("            DAFTAR");
            System.out.println("==============================");
            
            System.out.println("Judul Film          : "+film.judul);
            System.out.println("Sutradara           : "+film.sutradara);
            System.out.println("Aktor Film          : "+film.aktor);
            System.out.println("Publishe            : "+film.publisher);
            System.out.println("Kategori            : "+film.kategori);
            System.out.println("Jumlah Stok         : "+film.stok);
            
            System.out.println("\n");
            System.out.println("Mau Coba Lagi?\nYa[1] atau Tidak [2]");
            System.out.print("Pilih nomer berapa? : ");
            repeat=inputUser.nextInt();
            }while(repeat<2);
        
    }
}
