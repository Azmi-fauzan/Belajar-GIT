//
//package oop.tugas;
//public class MataKuliah {
//   private String NamaMatkul ;
//   private int SKS ;
//   private int Nilai ;
//   private String Grade ;
//   
//   public void SetMataKuliah(String NamaMatkul ){
//   this.NamaMatkul = NamaMatkul ;
//  
//}
//   public void SetSKS(int SKS){
//   this.SKS = SKS  ;
//  
//}
//   public void SetNilai(int Nilai){
//   this.Nilai = Nilai  ;
//  
//}
//   public void SetGrade(String Grade){
//   this.Grade = Grade  ;
//  
//}
//   
//   public String getMatkul(){
//       return NamaMatkul ;
//   }
//   
//   public int getSKS(){
//       return SKS ;             
//}
//  public int getNilai(){
//      return Nilai ;
//  }
//  public String getGrade(){
//      return Grade ;
//  }
// 
// 
//          
// 
// MataKuliah matkul = new MataKuliah() ;
// 
// public void IsiData(String matakul , int sks , int nilai ){
// matkul.SetMataKuliah(NamaMatkul);
// 
// matkul.SetNilai(nilai);
// matkul.SetSKS(sks);
// 
// }
// 
// 
// int nilai = matkul.getNilai();
// 
// public void ConvertNilaiToGrade(){
//  String grade = null ;   
//     if (nilai >= 85 ) {
//         grade = "A" ;    
//     }else if (nilai < 85 && nilai >= 75 ){
//         grade = "B" ;   
//     }else if (nilai < 75 && nilai >= 65   ){
//      grade = "C"  ;  
//     }
//     
//   matkul.SetGrade(grade);
//}
// 
//} 

package MataKuliah;

public class MataKuliah {
   private String NamaMatkul;
   private int SKS;
   private int Nilai;
   private String Grade;

   // Setter methods
   public void setMataKuliah(String NamaMatkul) {
       this.NamaMatkul = NamaMatkul;
   }

   public void setSKS(int SKS) {
       this.SKS = SKS;
   }

   public void setNilai(int Nilai) {
       this.Nilai = Nilai;
   }

   public void setGrade(String Grade) {
       this.Grade = Grade;
   }

   // Getter methods
   public String getMatkul() {
       return NamaMatkul;
   }

   public int getSKS() {
       return SKS;
   }

   public int getNilai() {
       return Nilai;
   }

   public String getGrade() {
       return Grade;
   }

   // Metode untuk mengisi data mata kuliah
   public void isiData(String matakul, int sks, int nilai) {
       this.setMataKuliah(matakul);  // Menggunakan parameter `matakul`
       this.setNilai(nilai);
       this.setSKS(sks);
   }

   // Metode untuk mengkonversi nilai ke grade
   public void convertNilaiToGrade() {
       int nilai = this.getNilai();  // Ambil nilai dari objek saat ini
       String grade;

       // Konversi nilai ke grade
       if (nilai >= 85) {
           grade = "A";
       } else if (nilai >= 75) {
           grade = "B";
       } else if (nilai >= 65) {
           grade = "C";
       } else {
           grade = "D";  // Jika nilai di bawah 65, beri grade D
       }

       // Simpan grade ke objek
       this.setGrade(grade);
   }

   // Metode untuk menampilkan data mata kuliah dan grade
   public void cetakData() {
       System.out.println("Mata Kuliah: " + getMatkul());
       System.out.println("SKS: " + getSKS());
       System.out.println("Nilai: " + getNilai());
       System.out.println("Grade: " + getGrade());
   }
}
