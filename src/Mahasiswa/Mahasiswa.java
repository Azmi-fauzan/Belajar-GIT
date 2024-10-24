
package Mahasiswa;


public class Mahasiswa {
    private  String nama ;
    private int npm ;
    private String kelas ;
    private String jurusan ;
    
    public void SetNama(String nama){
        this.nama = nama ;
                
    }
    public void SetNpm(int npm){
        this.npm = npm ;
                
    }
    public void SetKelas(String kelas){
        this.kelas = kelas ;
                
    }
    public void SetJurusan(String jurusan){
        this.jurusan = jurusan ;
                
    }
  

   
    
    public String getNama (){
        return nama ;
    }
    
    public int getNpm(){
        return npm ;
    }
    
    public String getKelas(){
        return kelas ;
    }
    
    public String getJurusan(){
        return jurusan ;
    }
  
 
  
  public void IsiDataMhs(String name , String clas , int nim , String jrusan){  
  this.SetNama(name);
  this.SetKelas(clas);
  this.SetNpm(nim);
  this.SetJurusan(jrusan);
  }
    
  public void CetakDataMhs(){
      System.out.println("Nama = "+getNama());
      System.out.println("Kelas = "+getKelas());
      System.out.println("NPM = "+getNpm());
      System.out.println("Jurusan"+getJurusan());
  }
    
}



