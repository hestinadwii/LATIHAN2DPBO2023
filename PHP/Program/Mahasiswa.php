<!-- /* 
    Saya Hestina Dwi Hartiwi NIM 2108077 mengerjakan soal Latihan 2 dalam Praktikum
    mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahan-Nya maka 
    saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/ -->

<?php

require ('Sivitas.php');

class Mahasiswa extends Sivitas
{
    // Private attributes
    private $nim = '';
    private $major = '';
    private $faculty = '';

    // Constructor
    public function __construct($nim = '', $major = '', $faculty = '')
    {
        $this->nim = $nim;
        $this->major = $major;
        $this->faculty = $faculty;
    }
    //---> Getter and Setter <---//
    // Set NIM
    public function setNim($nim)
    {
        $this->nim = $nim;
    }

    // Set Major
    public function setMajor($major)
    {
        $this->major = $major;
    }

    // Set Faculty
    public function setFaculty($faculty)
    {
        $this->faculty = $faculty;
    }

    // Get NIM
    public function getNim()
    {
        return $this->nim;
    }

    // Get Major
    public function getMajor()
    {
        return $this->major;
    }

    // Get Faculty
    public function getFaculty()
    {
        return $this->faculty;
    }

    public function printMahasiswa()
    {
        echo "<h3>" . "NIM      : " . $this->getNim() . "</h3>";
        echo "<h3>" . "Major    : " . $this->getMajor() . "</h3>";
        echo "<h3>" . "Faculty  : " . $this->getFaculty() . "</h3>";
    }
}

?>