import java.util.Scanner;


public class Main {
    static String nama;
    static int pilihan, menu, usia;
    static double nilaiske,nilaitv,nilaikdt,nilaiskj,nilaird,nilaikps;
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("+--------------------------------+");
        System.out.println("| PENDAFTARAN BEASISWA PT.BENANG |");
        System.out.println("+--------------------------------+");
        System.out.println("Terdapat 2 program beasiswa yang dibuka :");
        System.out.println("    1. Beasiswa Pelajar");
        System.out.println("    2. Beasiswa Mahasiswa");
        System.out.print("Pilih beasiswa yang akan didaftarkan : ");
        pilihan = input.nextInt();
        switch(pilihan){
            case 1 :
            do{
            Seleksi seleksi = new Seleksi(nilaiske,nilaitv,nilaikdt,nilaiskj,nilaird,nilaikps);
            seleksi.pendaftaranPelajar();
            seleksi.penilaianPelajar();
            do{
            System.out.println("==MENU==");
            System.out.println("1. Tampilkan hasil");
            System.out.println("2. Ubah data");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu : ");
            menu = input.nextInt();
            if(menu==1){
                if(seleksi.usia < 16 || seleksi.usia > 24){
                    System.out.print("Mohon maaf, " + seleksi.nama);
                    System.out.print(" dengan usia" + seleksi.usia);
                    System.out.print(" tahun dinyatakan TIDAK DITERIMA dalam program BEASISWA PELAJAR karena usia tidak memenuhi syarat");
                }
                else{
                    if(seleksi.nilaiPelajar() >= 87.5){
                        System.out.print("Selamat, " + seleksi.nama);
                        System.out.print(" dengan usia" + seleksi.usia);
                        System.out.print(" tahun dinyatakan DITERIMA dalam program BEASISWA PELAJAR karena nilai memenuhi syarat");
                    }
                    else{
                        System.out.print("Mohon maaf, " + seleksi.nama);
                        System.out.print(" dengan usia" + seleksi.usia);
                        System.out.print(" tahun dinyatakan TIDAK DITERIMA dalam program BEASISWA PELAJAR karena nilai tidak memenuhi syarat");
                    }
                }
            }
            if(menu==3){
                System.exit(0);
            }
            }while(menu!=2 && pilihan==1);
            }while(menu==2);
            break;
            
            case 2 :
                do{
                Seleksi seleksi = new Seleksi(nilaiske,nilaitv,nilaikdt,nilaiskj,nilaird,nilaikps);
                seleksi.pendaftaranMahasiswa();
                seleksi.penilaianMahasiswa();
                do{
                System.out.println("==MENU==");
                System.out.println("1. Tampilkan hasil");
                System.out.println("2. Ubah data");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu : ");
                menu = input.nextInt();
                if(menu==1){
                    if(seleksi.usia < 16 || seleksi.usia > 24){
                        System.out.print("Mohon maaf, " + seleksi.nama);
                        System.out.print(" dengan usia" + seleksi.usia);
                        System.out.print(" tahun dinyatakan TIDAK DITERIMA dalam program BEASISWA MAHASISWA karena usia tidak memenuhi syarat");
                    }
                    else{
                        if(seleksi.nilaiMahasiswa() >= 87.5){
                            System.out.print("Selamat, " + seleksi.nama);
                            System.out.print(" dengan usia" + seleksi.usia);
                            System.out.print(" tahun dinyatakan DITERIMA dalam program BEASISWA MAHASISWA karena nilai memenuhi syarat");
                        }
                        else{
                            System.out.print("Mohon maaf, " + seleksi.nama);
                            System.out.print(" dengan usia" + seleksi.usia);
                            System.out.print(" tahun dinyatakan TIDAK DITERIMA dalam program BEASISWA MAHASISWA karena nilai tidak memenuhi syarat");
                        }
                    }
                }
                if(menu==3){
                    System.exit(0);
                }
                }while(menu!=2 && pilihan==1);
                }while(menu==2);
                break;          
            
        }
        
    }
}
