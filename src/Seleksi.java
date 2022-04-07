import Beasiswa.BeasiswaPelajar;
import Beasiswa.BeasiswaMahasiswa;
import java.util.Scanner;

public class Seleksi implements BeasiswaPelajar, BeasiswaMahasiswa {
    String nama;
    int usia;
    double nilaiske,nilaitv,nilaikdt,nilaiskj,nilaird,nilaikps;

    public Seleksi(double nilaiske, double nilaitv, double nilaikdt, double nilaiskj, double nilaird, double nilaikps) {
        this.nilaiske = nilaiske;
        this.nilaitv = nilaitv;
        this.nilaikdt = nilaikdt;
        this.nilaiskj = nilaiskj;
        this.nilaird = nilaird;
        this.nilaikps = nilaikps;
    }
    
    @Override
    public void pendaftaranPelajar(){
        Scanner input = new Scanner(System.in);
        System.out.println("==FORM PENDAFTARAN==");
        System.out.print("Nama lengkap    : ");
        nama = input.nextLine();
        System.out.print("Usia    : ");
        usia = input.nextInt();
    }
    
    @Override
    public void penilaianPelajar(){
        Scanner input = new Scanner(System.in);
        System.out.println("==FORM PENILAIAN==");
        System.out.println("Keterangan : nilai valid dalam rentang 0-100");
        do{
        System.out.print("Nilai Struktur dan Konten Esai : ");
        nilaiske = input.nextDouble();
        }while(nilaiske <0 || nilaiske > 100);
        do{
        System.out.print("Nilai Teknik Visualisasi : ");
        nilaitv = input.nextDouble();
        }while(nilaitv <0 || nilaitv > 100);
        do{
        System.out.print("Nilai Kemampuan Design Thinking : ");
        nilaikdt = input.nextDouble();
        }while(nilaikdt <0 || nilaikdt > 100);
    }
    
    @Override
    public double nilaiPelajar(){
      return nilaiske * 0.5 + nilaitv * 0.2 + nilaikdt * 0.3;  
    }
    
    @Override
    public void pendaftaranMahasiswa(){
        Scanner input = new Scanner(System.in);
        System.out.println("==FORM PENDAFTARAN==");
        System.out.print("Nama lengkap    : ");
        nama = input.nextLine();
        System.out.print("Usia    : ");
        usia = input.nextInt();
    }
    
    @Override
    public void penilaianMahasiswa(){
        Scanner input = new Scanner(System.in);
        System.out.println("==FORM PENILAIAN==");
        System.out.println("Keterangan : nilai valid dalam rentang 0-100");
        do{
        System.out.print("Nilai Struktur dan Konten Jurnal : ");
        nilaiskj = input.nextDouble();
        }while(nilaiskj <0 || nilaiskj > 100);
        do{
        System.out.print("Nilai Relevansi Data : ");
        nilaird = input.nextDouble();
        }while(nilaird <0 || nilaird > 100);
        do{
        System.out.print("Nilai Kemampuan DProblem Solving : ");
        nilaikps = input.nextDouble();
        }while(nilaikps <0 || nilaikps > 100);
    }
    
    @Override
    public double nilaiMahasiswa(){
      return nilaiskj * 0.6 + nilaird * 0.25 + nilaikps * 0.15;  
    }
   
}
