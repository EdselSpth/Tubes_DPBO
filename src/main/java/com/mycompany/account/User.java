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
                switch (pilihan) {
                    case 1:
                        System.out.println("Daftar Buku");
                        menu.FormatBukuPrint();
                        BM.printBuku();
                        System.out.print("Pilih Buku : ");
                        int milihBuku = S.nextInt();
                        menu.menuBeliBuku();
                        System.out.print("Pilih :");
                        int pilihanSistem = S.nextInt();
                        int index = milihBuku - 1;
                        ;
                        switch (pilihanSistem) {
                            case 1:
                                if (index < 0 || index > BM.books.size()) {
                                    System.out.println("Pilihan buku tidak ada");
                                } else {
                                    BM.books.get(index).printInfoBuku();
                                }
                                break;
                            case 2:
                                P.beliBuku(index);
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Pilihan Menu Tidak tersedia");
                        }
                        break;
                    case 2:
                        System.out.print("Masukkan nama buku yang dicari : ");
                        S.nextLine();
                        int indexc2 = 0;
                        String dicari = S.nextLine();
                        for (i = 0; i < BM.books.size(); i++) {
                            if (BM.books.get(i).getJudulBuku().equalsIgnoreCase(dicari)) {
                                indexc2 = i;
                            } else {
                                System.out.println("Buku " + dicari + " tidak tersedia");
                            }
                        }
                        menu.menuPilihBuku();
                        pilihanSistem = S.nextInt();
                        switch (pilihanSistem) {
                            case 1:
                                if (indexc2 < 0 || indexc2 > BM.books.size()) {
                                    System.out.println("Pilihan buku tidak ada");
                                } else {
                                    BM.books.get(indexc2).printInfoBuku();
                                }
                                break;
                            case 2:
                                indexc2 = i;
                                P.beliBuku(indexc2);
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Pilihan Tidak ada");
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
                        if (!perpus.koleksiBuku.isEmpty()) {
                            perpus.printBuku();
                            System.out.print("Pilih Buku : ");
                            int milihBuku2 = S.nextInt();
                            menu.menuPilihBuku();
                            int pilihanc4 = S.nextInt();
                            switch (pilihanc4) {
                                case 1:
                                    RB.bacaBuku();
                                    menu.menuBacaBuku();
                                    int pilihanc41 = S.nextInt();
                                    if (pilihanc41 == 1) {
                                        break;
                                    } else {
                                        System.out.println("Pilihan tidak tersedia");
                                    }
                                case 2:
                                    P.refundBuku(milihBuku2 - 1);
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
