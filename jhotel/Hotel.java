/**
 * Program JHotel untuk bisnis perhotelan.
 *
 * @author Faisal Akbar
 * @version March-01-2018
 */

public class Hotel
{
    // instance variables - replace the example below with your own
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        //instance variable
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
    }
    
    /**
     * Accessor for objects of class Hotel
     * untuk mendapatkan nilai binatang
     * 
     * @return bintang
     */
    public int getBintang()
    {
        return bintang;
    }
    
    /**
     * Accessor for objects of class Hotel
     * untuk mendapatkan nilai nama
     * 
     * @return nama
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * Accessor for objects of class Hotel
     * untuk mendapatkan nilai lokasi
     * 
     * @return lokasi
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }
    
    /**
     * Mutator for objects of class Hotel
     * untuk menentukan nilai nama
     * 
     * @param nama
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /**
     * Mutator for objects of class Hotel
     * untuk menentukan nilai lokasi
     * 
     * @param lokasi
     */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }
    
    /**
     * Mutator for objects of class Hotel
     * untuk menentukan nilai bintang
     * 
     * @param bintang
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }
    
    public void printData()
    {
        System.out.printf("Nama Hotel: %s \n", nama);
    }
}
