package praktikum;


public class vcd extends rental {
    String aktor,sutradara, kategori;
    
    vcd(String aktor, String sutradara, String kategori, String judul, String publisher, int stok){
        super(judul,publisher,stok);
        this.aktor=aktor;
        this.sutradara=sutradara;
        this.kategori=kategori;
    }
    vcd(){
        
    }
}
