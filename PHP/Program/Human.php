<!-- /* 
    Saya Hestina Dwi Hartiwi NIM 2108077 mengerjakan soal Latihan 2 dalam Praktikum
    mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahan-Nya maka 
    saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/ -->

<?php

class Human
{
    // Private attributes
    private $nik = '';
    private $name = '';
    private $gender = '';

    // Constructor
    public function __construct($nik = '', $name = '', $gender = '')
    {
        $this->nik = $nik;
        $this->name = $name;
        $this->gender = $gender;
    }
    //---> Getter and Setter <---//
    // Set nik (primary key)
    public function setNik($nik)
    {
        $this->nik = $nik;
    }

    // Set Name
    public function setName($name)
    {
        $this->name = $name;
    }

    // Set gender
    public function setGender($gender)
    {
        $this->gender = $gender;
    }

    // Get nik
    public function getNik()
    {
        return $this->nik;
    }

    // Get Name
    public function getName()
    {
        return $this->name;
    }

    // Get gender
    public function getGender()
    {
        return $this->gender;
    }

    public function printHuman()
    {
        echo "<h3>" . "NIK          : " . $this->getNik() . "</h3>";
        echo "<h3>" . "Gender       : " . $this->getGender() . "</h3>";
    }
}

?>