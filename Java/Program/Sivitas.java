/* 
    Saya Hestina Dwi Hartiwi gender 2108077 mengerjakan soal Latihan 2 dalam Praktikum
    mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahan-Nya maka 
    saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

// Derived class. It "extends" the existing property.
class Sivitas extends Human
{
    private String asal_univ;
    private String email_edu;

    /* Constructor */
    public Sivitas()
    {

    }

    public Sivitas(String asal_univ, String email_edu)
    {
        this.asal_univ = asal_univ;
        this.email_edu = email_edu;
    }

    /* Getter and Setter */

    //--- Get asal_univ ---//
    public String getAsal_univ() {
        return this.asal_univ;
    }

    //--- Get email_edu ---//
    public String getEmail_edu() {
        return this.email_edu;
    }

    //--- Set asal_univ ---//
    public void setAsal_univ(String asal_univ)
    {
        this.asal_univ = asal_univ;
    }

    //--- Set email_edu ---//
    public void setEmail_edu(String email_edu)
    {
        this.email_edu = email_edu;
    }

    public void printSivitas()
    {
        System.out.println("Home University     : " + this.getAsal_univ());
        System.out.println("Email Edu           : " + this.getEmail_edu());
    }
}