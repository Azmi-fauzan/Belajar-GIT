
package oop.tugas;

import MataKuliah.MataKuliah;
import Mahasiswa.Mahasiswa;

public class OOPTugas {

    public static void main(String[] args) {
   Mahasiswa mhs = new Mahasiswa() ;
   MataKuliah matkul = new MataKuliah() ;
   
   mhs.IsiDataMhs("azmi","23PB",2355,"TIF");
   matkul.isiData("OAK", 3 , 90);
   matkul.convertNilaiToGrade();
   mhs.CetakDataMhs();
   matkul.cetakData();
   
   
       
   
   

   
    
        
   
    
        
        
        
    }
    
}
