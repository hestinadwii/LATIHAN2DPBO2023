<!-- /* 
    Saya Hestina Dwi Hartiwi NIM 2108077 mengerjakan soal Latihan 2 dalam Praktikum
    mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahan-Nya maka 
    saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/ -->

<?php

require ('Human.php');

class Sivitas extends Human
{
    // Private attributes
    private $asal_univ = '';
    private $email_edu = '';

    // Constructor
    public function __construct($asal_univ = '', $email_edu = '')
    {
        $this->asal_univ = $asal_univ;
        $this->email_edu = $email_edu;
    }
    //---> Getter and Setter <---//
    // Set asal_univ 
    public function set_asal_univ($asal_univ)
    {
        $this->asal_univ = $asal_univ;
    }

    // Set email_edu
    public function set_email_edu($email_edu)
    {
        $this->email_edu = $email_edu;
    }

    // Get asal_univ
    public function get_asal_univ()
    {
        return $this->asal_univ;
    }

    // Get email_edu
    public function get_email_edu()
    {
        return $this->email_edu;
    }

    public function printSivitas()
    {
        echo "<h3>" . "Home University      : " . $this->get_asal_univ() . "</h3>";
        echo "<h3>" . "Email Edu            : " . $this->get_email_edu() . "</h3>";
    }
}

?>