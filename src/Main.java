package org.example;

import java.util.Scanner;
//import library inputan user

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di sistem login library!");

        while (true) {
            //pilihan buat milih opsi admin atau student switch case  System.out.println("\nPilih jenis pengguna: ");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Membersihkan newline

            switch (choice) {
                case 1:
                    System.out.println("Masukkan username: ");
                    String adminUsername = scanner.nextLine();
                    System.out.println("Masukkan password: ");
                    String adminPassword = scanner.nextLine();
                    // Validasi kredensial admin
                    if (adminUsername.equals("admin") && adminPassword.equals("admin123")) {
                        System.out.println("Login admin berhasil.");
                        // Lakukan apa yang perlu dilakukan setelah login admin
                    } else {
                        System.out.println("Username atau password salah.");
                    }
                    break;
                case 2:
                    System.out.println("Masukkan NIM (panjang harus 15 karakter): ");
                    String nim = scanner.nextLine();
                    // Validasi panjang NIM
                    if (nim.length() == 15) {
                        System.out.println("Login mahasiswa berhasil.");
                        // Lakukan apa yang perlu dilakukan setelah login mahasiswa
                    } else {
                        System.out.println("Panjang NIM harus 15 karakter.");
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan sistem login library.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }
}