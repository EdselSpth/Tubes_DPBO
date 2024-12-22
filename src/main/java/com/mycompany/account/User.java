/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.account;

import java.util.ArrayList;
import java.util.Scanner;
import com.mycompany.sistem.Menu;
import com.mycompany.sistem.BookManagement;
import com.mycompany.sistem.Pembelian;
import com.mycompany.sistem.Perpustakaan;
import com.mycompany.sistem.ReadBook;
import com.mycompany.book.Book;
import com.mycompany.book.Komik;
import com.mycompany.book.Majalah;
import com.mycompany.book.Novel;
import com.mycompany.book.Pendidikan;
import com.mycompany.book.Sejarah;

/**
 *
 * @author りおん塩田
 */
public class User implements IAccount {

    private ArrayList<Account> userList;
    Scanner S = new Scanner(System.in);
    Menu menu = new Menu();
    boolean passwordValidation = false;
    BookManagement BM = new BookManagement();
    Pembelian P = new Pembelian();
    Perpustakaan perpus = new Perpustakaan();
    ReadBook RB = new ReadBook();

    public User() {
        userList = new ArrayList<>();
        userList.add(new Account("User123", "User123"));
        userList.add(new Account("Rinitial", "RintialPassword"));
        userList.add(new Account("ZetaZeta", "VestiaZeta"));
    }

    @Override
    public boolean loginValidation() {
        System.out.print("> Username : ");
        String username = S.nextLine();
        System.out.print("> Password : ");
        String password = S.nextLine();
        for (int i = 0; i < userList.size(); i++) {
            if (username.equals(userList.get(i).getUsername()) && password.equals(userList.get(i).getPassword())) {
                passwordValidation = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public void menuInside(boolean passwordValidation) throws Exception {
        if (passwordValidation) {
            int pilihan = 0;
            boolean exit = false;
            int i;
            while (!exit) {
                menu.menuUser();
                System.out.print("Pilih Menu : ");
                pilihan = S.nextInt();
                S.nextLine();
                switch (pilihan) {
                    case 1:
                        System.out.println("Daftar Buku");
                        menu.FormatBukuPrint();
                        BM.printBuku();
                        System.out.print("Pilih Buku : ");
                        int milihBuku = S.nextInt();
                        S.nextLine();
                        int index = milihBuku - 1;

                        if (index < 0 || index >= BM.books.size()) {
                            System.out.println("Pilihan Buku tidak ada");
                            break;
                        }

                        menu.menuBeliBuku();
                        System.out.print("Pilih Menu : ");
                        int pilihanSistem = S.nextInt();
                        S.nextLine();
                        switch (pilihanSistem) {
                            case 1:
                                BM.books.get(index).printInfoBuku();
                                break;
                            case 2:
                                P.beliBuku(index, BM, perpus);
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Pilihan Menu Tidak tersedia");
                        }
                        break;
                    case 2:
                        System.out.print("Judul buku yang ingin dicari: ");
                        String judul = S.nextLine();
                        index = BM.cariBuku(judul);
                        if (index == -1) {
                            System.out.println("Buku " + judul + " tidak ditemukan");
                            break;
                        } else {
                            System.out.println("Buku ditemukan!");
                        }
                        menu.menuBeliBuku();
                        System.out.print("Pilih Menu : ");
                        pilihanSistem = S.nextInt();
                        S.nextLine();
                        switch (pilihanSistem) {
                            case 1:
                                BM.books.get(index).printInfoBuku();
                                break;
                            case 2:
                                P.beliBuku(index, BM, perpus);
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Pilihan Menu Tidak tersedia");
                        }
                        break;
                    case 3:
                        System.out.println("Pilih Kategori yang mau ditampilkan");
                        menu.menuKategoriBuku();
                        int pilihanc3 = S.nextInt();
                        menu.FormatBukuPrint();
                        switch (pilihanc3) {
                            case 1:
                                System.out.println("Daftar Buku Pendidikan");
                                int no = 1;
                                for (Book book : BM.books) {
                                    if (book instanceof Pendidikan) {
                                        System.out.println(no + book.toString());
                                        no++;
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Daftar Buku Sejarah");
                                no = 1;
                                for (Book book : BM.books) {
                                    if (book instanceof Sejarah) {
                                        System.out.println(no + book.toString());
                                        no++;
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Daftar Buku Novel");
                                no = 1;
                                for (Book book : BM.books) {
                                    if (book instanceof Novel) {
                                        System.out.println(no + book.toString());
                                        no++;
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Daftar Buku Komik");
                                no = 1;
                                for (Book book : BM.books) {
                                    if (book instanceof Komik) {
                                        System.out.println(no + book.toString());
                                        no++;
                                    }
                                }
                                break;
                            case 5:
                                System.out.println("Daftar Buku Majalah");
                                no = 1;
                                for (Book book : BM.books) {
                                    if (book instanceof Majalah) {
                                        System.out.println(no + book.toString());
                                        no++;
                                    }
                                }
                                break;
                            default:
                                System.out.println("Pilihan tidak tersedia");
                        }
                        break;
                    case 4:
                        Menu.menuPerpustakaan();
                        System.out.print("Pilih Menu: ");
                        pilihan = S.nextInt();
                        S.nextLine();
                        switch (pilihan) {
                            case 1:
                                if (!perpus.koleksiBuku.isEmpty()) {
                                    perpus.printBuku();
                                    System.out.print("Pilih Buku (1 - " + perpus.koleksiBuku.size() + "): ");
                                    int milihBuku2 = S.nextInt();

                                    if (milihBuku2 < 1 || milihBuku2 > perpus.koleksiBuku.size()) {
                                        System.out.println("Pilihan buku tidak valid");
                                        break;
                                    }

                                    menu.menuPilihBuku();
                                    System.out.print("Pilih Menu : ");
                                    int pilihanc4 = S.nextInt();

                                    switch (pilihanc4) {
                                        case 1:
                                            RB.bacaBuku();
                                            menu.menuBacaBuku();
                                            System.out.print("Pilih Menu : ");
                                            int pilihanc41 = S.nextInt();
                                            if (pilihanc41 == 1) {
                                                break;
                                            } else {
                                                System.out.println("Pilihan tidak tersedia");
                                            }
                                            break;
                                        case 2:
                                            P.refundBuku(milihBuku2 - 1, BM, perpus);
                                            break;
                                        case 3:
                                            break;
                                        default:
                                            System.out.println("Pilihan tidak tersedia");
                                    }
                                } else {
                                    System.out.println("Belum ada buku yang dimiliki");
                                }
                                break;
                            case 2:
                                System.out.print("Judul buku yang ingin dicari di perpus: ");
                                String title = S.nextLine();
                                int indeks = perpus.cariBuku(title);
                                if (indeks == -1) {
                                    System.out.println("Buku " + title + " tidak ditemukan di perpus anda");
                                    break;
                                }
                                menu.menuPilihBuku();
                                System.out.print("Pilih opsi: ");
                                pilihanSistem = S.nextInt();
                                switch (pilihanSistem) {
                                    case 1:
                                        RB.bacaBuku();
                                        menu.menuBacaBuku();
                                        System.out.print("Pilih Menu : ");
                                        int pilihanc41 = S.nextInt();
                                        if (pilihanc41 == 1) {
                                            break;
                                        } else {
                                            System.out.println("Pilihan tidak tersedia");
                                        }
                                        break;
                                    case 2:
                                        P.refundBuku(indeks, BM, perpus);
                                        break;
                                    case 3:
                                        break;
                                    default:
                                        System.out.println("Pilihan Tidak ada");
                                }
                                break;
                            case 3:
                                break;
                        }

                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Pilihan Menu Tidak Ada");
                }
            }
        } else {
            throw new Exception("Username atau Password Salah");
        }

    }
}
