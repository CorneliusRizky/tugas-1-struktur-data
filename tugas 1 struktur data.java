import java.util.LinkedList;

public class DeklarasiData {
    public static void main(String[] args) {
        // 1. Deklarasi variabel integer bernama 'StrukturBaris'
        int StrukturBaris;
        
        // 2. Deklarasi variabel string bernama 'KataBaru'
        String KataBaru = "Deklarasi tipe data String";
        
        // 3. Deklarasi array satu dimensi bernama 'empatAngka'
        int[] empatAngka = {07, 10, 20, 23};
        
        // 4. Deklarasi array dua dimensi bernama 'Angka' (3x3)
        String[][] Angka = {
            {"1", "3", "5"},
            {"14", "19", "20"},
            {"22", "27", "29"}
        };
        
        // 5. Deklarasi linked list bernama 'listAngka'
        LinkedList<Integer> listAngka = new LinkedList<>();
        listAngka.add(22);
        listAngka.add(19);
        listAngka.add(44);
        listAngka.add(60);
        listAngka.add(72);
        
        // Menampilkan hasil deklarasi
        System.out.println("StrukturBaris (belum diinisialisasi)");
        System.out.println("KataBaru: " + KataBaru);
        
        System.out.print("empatAngka: ");
        for (int angka : empatAngka) {
            System.out.print(angka + " ");
        }
        System.out.println();
        
        System.out.println("\nArray dua dimensi 'Angka':");
        for (int i = 0; i < Angka.length; i++) {
            for (int j = 0; j < Angka[i].length; j++) {
                System.out.print(Angka[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nlistAngka: " + listAngka);
    }
}