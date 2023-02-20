/* 
    Saya Hestina Dwi Hartiwi gender 2108077 mengerjakan soal Latihan 2 dalam Praktikum
    mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahan-Nya maka 
    saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

class Human {
    private int NIK;
    private String Name;
    private String Gender;

    /* Constructor */
    public Human() 
    {

    }

    public Human(int NIK, String Name, String Gender)
    {
        this.NIK = NIK;
        this.Name = Name;
        this.Gender = Gender;
    }

    /* Getter and Setter */
    
    //--- Get NIK ---//
    public int getNIK() {
        return this.NIK;
    }

    //--- Get Name ---//
    public String getName() {
        return this.Name;
    }

    //--- Get gender ---//
    public String getGender() {
        return this.Gender;
    }

    //--- Set NIK ---//
    public void setNIK(int NIK)
    {
        this.NIK = NIK;
    }

    //--- Set Name ---//
    public void setName(String Name)
    {
        this.Name = Name;
    }

    //--- Set gender ---//
    public void setGender(String Gender)
    {
        this.Gender = Gender;
    }

    public void printHuman()
    {
        System.out.println("NIK                 : " + this.getNIK());
        System.out.println("Gender              : " + this.getGender());
    }
}