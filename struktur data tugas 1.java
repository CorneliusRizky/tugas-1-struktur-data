// Java
import java.util.LinkedList;

int StrukturBaris = 0;

String KataBaru = "Deklarasi tipe data String";

// Deklarasi array satu dimensi dengan nama empatAngka
int[] empatAngka = {7, 10, 20, 23};

// Deklarasi array dua dimensi dengan nama Angka (3 baris x 3 kolom)
String[][] Angka = {
    {"1", "3", "5"},
    {"14", "19", "20"},
    {"22", "27", "29"}
};

// Deklarasi LinkedList dengan nama listAngka
LinkedList<Integer> listAngka = new LinkedList<>();
listAngka.add(22);
listAngka.add(19);
listAngka.add(44);
listAngka.add(60);
listAngka.add(72);

// Atau cara singkat menggunakan Arrays.asList:
// LinkedList<Integer> listAngka = new LinkedList<>(Arrays.asList(22, 19, 44, 60, 72));

// Deklarasi array satu dimensi dengan nama empatAngka
int[] empatAngka = {7, 10, 20, 23};

// Deklarasi array dua dimensi dengan nama Angka (3 baris x 3 kolom)
String[][] Angka = {
    {"1", "3", "5"},
    {"14", "19", "20"},
    {"22", "27", "29"}
};

// Atau cara lain pendeklarasian array dua dimensi:
// String[][] Angka = new String[3][3];
// Angka[0][0] = "1";  Angka[0][1] = "3";  Angka[0][2] = "5";
// Angka[1][0] = "14"; Angka[1][1] = "19"; Angka[1][2] = "20";
// Angka[2][0] = "22"; Angka[2][1] = "27"; Angka[2][2] = "29";