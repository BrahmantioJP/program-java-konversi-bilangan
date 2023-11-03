package TugasAOK1;

import java.util.Scanner;

public class ProgramKonversiAOK {
    public static void main(String[] args) {
        Scanner newInput = new Scanner(System.in);
        int pilihan = 0;

        do {
            System.out.println("===============================");
            System.out.println("Program Java Konversi Bilangan");
            System.out.println("===============================");

            System.out.print("Menu Konversi Bilangan :\n" 
                            + "1. Biner ke Desimal\n"
                            + "2. Desimal ke Biner\n"
                            + "3. Desimal ke Hexadesimal\n"  
                            + "4. Biner ke Hexadesimal\n"  
                            + "5. Hexadesimal ke Desimal\n"  
                            + "6. Hexadesimal ke Biner\n"
                            + "7. Keluar Menu\n"
                            + "Masukkan pilihan Anda : ");
            pilihan = newInput.nextInt();
            newInput.nextLine(); // Reset int to strings

            switch (pilihan){
                case 1:
                System.out.println("\n===================================");
                System.out.println("Konversi Bilangan Biner ke Desimal");
                System.out.println("===================================");
                System.out.print("Masukkan bilangan biner : ");
                String biner = newInput.nextLine();

                int nilaiDesimal = 0;
                int panjangBiner = biner.length(); // Mengetahui panjang bilangan biner yang diinputkan

                for (int i = 0; i < panjangBiner; i++) {
                    char digitBiner = biner.charAt(i); // Konversi dari string ke char
                    int n = panjangBiner - i - 1;

                    // Penghitungan 
                    if (digitBiner == '1') {
                        double desimalPerDigit = Math.pow(2, n); // 2^(n-i-1)
                        nilaiDesimal += desimalPerDigit;
                        System.out.println("Nilai digit biner ke " + (n+1) + " = " + (int) desimalPerDigit);
                    } else if (digitBiner == '0'){
                        double desimalPerDigit = 0;
                        System.out.println("Nilai digit biner ke " + (n+1) + " = " + (int) desimalPerDigit);
                    } else if (digitBiner != '0') {
                        System.out.println("Maaf, Bilangan biner hanya terdapat 0 dan 1");
                        return;
                    }         
                }

                System.out.println("\nHasil konversi dari biner ke desimal : " + nilaiDesimal  + "\n");
                break;

                case 2:
                String biner2 = "";
                String step = "";
                System.out.println("\n===================================");
                System.out.println("Konversi Bilangan Desimal ke Biner");
                System.out.println("===================================");
                System.out.print("Masukkan bilangan desimal : ");
                int desimal2 = newInput.nextInt();

                if (desimal2 > 0){
                    while (desimal2 > 0) {
                        int sisa = desimal2 % 2;
                        biner2 = sisa + biner2;
                        step = step + desimal2 + " / 2 = " + desimal2 / 2  + " \nSisa " + sisa + "\n\n";
                        desimal2 = desimal2 / 2;
                    }
                    
                } else if (desimal2 == 0){
                    biner2 = "0";
                    step = "Tidak ada perhitungan\n";
                }
                System.out.println("\nPerhitungan : \n" + step);
                System.out.println("Hasil konversi dari desimal ke biner : " + biner2 + "\n");
                break;

                case 3:
                System.out.println("\n========================================");
                System.out.println("Konversi Bilangan Desimal ke Hexadesimal");
                System.out.println("========================================");
                System.out.print("Masukkan bilangan desimal : ");
                int desimal3 = newInput.nextInt();

                StringBuilder konversiDesHex = new StringBuilder();
                while (desimal3 > 0) {
                    int digitDes = desimal3 % 16;
                    char digitHexa; 
                    if (digitDes < 10){
                        digitHexa = (char) ('0' + digitDes);
                    } else {
                        digitHexa = (char) ('A' + (digitDes - 10));
                    }
                    System.out.println("Digit hexa (kanan --> kiri) : " + digitHexa);
                    konversiDesHex.insert(0, digitHexa);
                    desimal3 /= 16;
                }

                String nilaiHexa = konversiDesHex.toString();
                System.out.println("\nHasil konversi dari desimal ke hexadesimal : " + nilaiHexa + "\n");
                break;
                
                case 4:
                // Konversi dari biner ke desimal 
                System.out.println("\n======================================");
                System.out.println("Konversi Bilangan Biner ke Hexadesimal");
                System.out.println("======================================");
                System.out.print("Masukkan bilangan biner : ");
                String biner4 = newInput.nextLine();

                int nilaiDesimal4 = 0;
                int panjangBiner4 = biner4.length(); // Mengetahui panjang bilangan biner yang diinputkan
                // Konversi Biner ke Desimal
                System.out.println("\n===Perhitungan Biner ke Desimal===");
                for (int i = 0; i < panjangBiner4; i++) {
                    char digitBiner = biner4.charAt(i); // Konversi dari string ke char
                    int n = panjangBiner4 - i - 1;

                    // Penghitungan
                    if (digitBiner == '1') {
                        double desimalPerDigit = Math.pow(2, n); // 2^(n-i-1)
                        nilaiDesimal4 += desimalPerDigit;
                        System.out.println("Nilai digit biner ke " + (n+1) + " = " + (int) desimalPerDigit);
                    } else if (digitBiner == '0'){
                        double desimalPerDigit = 0;
                        System.out.println("Nilai digit biner ke " + (n+1) + " = " + (int) desimalPerDigit);
                    } else if (digitBiner != '0') {
                        System.out.println("Maaf, Bilangan biner hanya terdapat 0 dan 1");
                        return;
                    }         
                }
                
                System.out.println("\nHasil konversi dari biner ke desimal : " + nilaiDesimal4 + "\n");


                // Konversi Desimal ke hexadesimal 
                System.out.println("===Perhitungan Desimal ke Hexadesimal===");
                StringBuilder konversiDesHex4 = new StringBuilder();
                while (nilaiDesimal4 > 0) {
                    int digitDes = nilaiDesimal4 % 16;
                    char digitHexa;
                    if (digitDes < 10){
                        digitHexa = (char) ('0' + digitDes);
                    } else {
                        digitHexa = (char) ('A' + (digitDes - 10));
                    }
                    System.out.println("Digit hexa (kanan --> kiri) : " + digitHexa);
                    konversiDesHex4.insert(0, digitHexa);
                    nilaiDesimal4 /= 16;
                }

                String nilaiHexa4 = konversiDesHex4.toString();
                System.out.println("\nHasil Konversi Biner ke Hexadesimal : " + nilaiHexa4 + "\n");
                break;

                case 5:
                System.out.println("\n========================================");
                System.out.println("Konversi Bilangan Hexadesimal ke Desimal");
                System.out.println("========================================");
                
                System.out.print("Masukkan bilangan heksadesimal: ");
                String heksadesimal5 = newInput.nextLine().toUpperCase();

                int desimal5 = 0;
                int pangkat = 0;

                String hexaReverse = new StringBuilder(heksadesimal5).reverse().toString();

                for (int i = 0; i < hexaReverse.length(); i++) {
                    char digitHexa = hexaReverse.charAt(i);
                    int valueKonversi = 0;

                    if (digitHexa >= '0' && digitHexa <= '9') {
                        valueKonversi = digitHexa - '0';
                    } else if (digitHexa >= 'A' && digitHexa <= 'F') {
                        valueKonversi = digitHexa - 'A' + 10;
                    } else {
                        System.out.println("Input tidak valid.");
                        return;
                    }
                    desimal5 +=  valueKonversi * Math.pow(16, pangkat);
                    
                    System.out.println(digitHexa + " = " + valueKonversi + " x 16^" + pangkat);

                    pangkat++;
                }

                    System.out.println("\nHasil konversi dari hexadesimal ke desimal : " + desimal5 + "\n");
                    break;

            case 6:
            System.out.println("\n====================================");
            System.out.println("Konversi Bilangan Hexdesimal ke Biner");
            System.out.println("====================================");
            System.out.print("Masukkan bilangan heksadesimal: ");
            String heksadesimal6 = newInput.nextLine().toUpperCase();

            int desimal6 = 0;
            int pangkat6 = 0;

            // Konversi dari hexadesimal ke desimal
            String hexaReverse6 = new StringBuilder(heksadesimal6).reverse().toString();
            System.out.println("\n===Perhitungan Hexadesimal ke Desimal===");
            for (int i = 0; i < hexaReverse6.length(); i++) {
                char digitHexa = hexaReverse6.charAt(i);
                int valueKonversi = 0;

                if (digitHexa >= '0' && digitHexa <= '9') {
                    valueKonversi = digitHexa - '0';
                } else if (digitHexa >= 'A' && digitHexa <= 'F') {
                    valueKonversi = digitHexa - 'A' + 10;
                } else {
                    System.out.println("Input tidak valid.");
                    return;
                }

                
                desimal6 +=  valueKonversi * Math.pow(16, pangkat6);
                
                System.out.println(digitHexa + " = " + valueKonversi + " x 16^" + pangkat6);

                pangkat6++;
            }

            System.out.println("Hasil konversi ke desimal : " + desimal6 + "\n");

            // Konversi dari desimal ke biner  
            String biner6 = "";
            String step6 = "";
            
            System.out.println("===Perhitungan Desimal ke Biner===");

            if (desimal6 > 0){
                while (desimal6 > 0) {
                    int sisa = desimal6 % 2;
                    biner6 = sisa + biner6;
                    step6 = step6 + desimal6 + " / 2 = " + desimal6 / 2  + " \nSisa " + sisa + "\n\n";
                    desimal6 = desimal6 / 2;
                }
                
            } else if (desimal6 == 0){
                biner6 = "0";
                step = "Tidak ada perhitungan\n";
            }
            System.out.println("\nPerhitungan : \n" + step6);
            System.out.println("Hasil konversi dari desimal ke biner : " + biner6 + "\n");
            }

        }while (pilihan == 1 || pilihan == 2 || pilihan == 3 || pilihan == 4 || pilihan == 5 || pilihan == 6);
    }
}
