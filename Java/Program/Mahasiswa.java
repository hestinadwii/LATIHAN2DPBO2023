/* 
    Saya Hestina Dwi Hartiwi gender 2108077 mengerjakan soal Latihan 2 dalam Praktikum
    mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahan-Nya maka 
    saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

/*--- Deklarasi Class ---*/
class Mahasiswa extends Sivitas
{
    /* Private Atributes */
    private String nim;     //---> untuk gender
    private String major;   //---> untuk program studi
    private String faculty; //---> untuk fakultas

    /* Constructor */
    public Mahasiswa()
    {

    }

    public Mahasiswa(String nim, String major, String faculty) {
        this.nim = nim;
        this.major = major;
        this.faculty = faculty;
    }

    /* Getter and Setter */
    
    //--- Get nim ---//
    public String getNim() {
        return this.nim;
    }

    //--- Get Major ---//
    public String getMajor() {
        return this.major;
    }

    //--- Get Faculty ---//
    public String getFaculty() {
        return this.faculty;
    }

    //--- Set nim ---//
    public void setNim(String nim)
    {
        this.nim = nim;
    }

    //--- Set Major ---//
    public void setMajor(String major)
    {
        this.major = major;
    }

    //--- Set Faculty ---//
    public void setFaculty(String faculty)
    {
        this.faculty = faculty;
    }

    public void printMahasiswa()
    {
        System.out.println("NIM                 : " + this.getNim());
        System.out.println("Major               : " + this.getMajor());
        System.out.println("Faculty             : " + this.getFaculty());
    }
}