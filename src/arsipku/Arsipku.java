/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arsipku;

/**
 *
 * @author Ipit
 */
public class Arsipku implements Biodata, Nilai{
    public static void main(String[] args) {
 Arsipku ps = new Arsipku();
 ps.nama();
 ps.tempatLahir();
 ps.hobi();
 ps.agama();
 ps.BahasaIndonesia();
 ps.matematika();
    }
    public void nama(){
        System.out.println("Nama = Amelia firjani putri");
       }
       public void tempatLahir(){
           System.out.println("TepatLahir = Jember");
       }
       public void hobi(){
           System.out.println("Hobi = Memasak");
       }
       public void agama(){
           System.out.println("Agama = 80 ");
       }
       public void BahasaIndonesia(){
          System.out.println("BahasaIndonesia = 100 ");
       }
       public void matematika(){
           System.out.println("matematika = 75 ");
       }
    }

