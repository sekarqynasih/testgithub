import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class belajarstring{
    // tipe data string
    // merupakan tipe data non primitif / reference
    // merupakan pengembangan dari tipe data char
    // string adalah terdiri dari beberapa karakter
    // strinng juga dapat dikatakan sebagai array of char
    public static void main(String[] args) throws IOException {

        // karena String terdiri dari beberapa karakter
        // maka karakter di dalam suatu String dapat dihitung
        // dalam kata lain suatu String memiliki panjang karakter
        // contoh: "saya sedang makan" = ???karakter 17 --> spasi juga termasuk yang dihitung
        // karena sesuai dengan ketentuan ASCII
        // panjang 17 --> indexnya mulai dari 0 - 16
        // String memiliki nilai panjang (length)
        // contoh: String nama = "poltek harber" ---> nama.length = 13


        //MATERI PERTAMA
        String nama = "Poltek Harber";
        System.out.println(nama.length());
        char karakter_pertama = nama.charAt(0);
        char karakter_terakhir = nama.charAt(0);
        System.out.println("Karakter pertama adalah : " + karakter_pertama);
        System.out.println("Karakter terakhir adalah : " + karakter_terakhir);

        //MATERI KEDUA
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // masukan cpu, creat new Constructor
        System.out.print("Masukan kalimat = ");
        String p = reader.readLine();
        char huruf = 'r';
        int jumlah_huruf = 0;
        for (int counter = 0; counter<p.length(); counter++){
            if (p.charAt(counter)==huruf){
                jumlah_huruf++;
            }
        }
        System.out.println("Jumlah huruf r adalah = "+ jumlah_huruf);
    }
}