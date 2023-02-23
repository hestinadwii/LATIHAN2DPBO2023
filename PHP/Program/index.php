<!-- /* 
    Saya Hestina Dwi Hartiwi NIM 2108077 mengerjakan soal Latihan 2 dalam Praktikum
    mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahan-Nya maka 
    saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/ -->

<?php
    // import file
    require ('Mahasiswa.php');

    // buat array
    $arrayStudent = array();

    // input data ke array secara hard code
    $student1 = new Mahasiswa();
    $student1->setNik('123');
    $student1->setName('Jeon Jungkook');
    $student1->setGender('Male');
    $student1->set_asal_univ('UPI');
    $student1->set_email_edu('jeonjungkook@upi.edu');
    $student1->setNim('2653');
    $student1->setMajor('English Language and Literature');
    $student1->setFaculty('Faculty of Languages and Literatures');

    $student2 = new Mahasiswa();
    $student2->setNik('567');
    $student2->setName('Kim Namjoon');
    $student2->setGender('Male');
    $student2->set_asal_univ('UI');
    $student2->set_email_edu('kimnamjoon@ui.ac.id');
    $student2->setNim('2397');
    $student2->setMajor('Medicine');
    $student2->setFaculty('Faculty of Medicine');
    
    // Push data ke array students
    array_push($arrayStudent, $student1);
    array_push($arrayStudent, $student2);
    
    // Judul untuk tampilan di localhost
    echo '<hr>';
    echo '<hr>';
    echo "<h2><b><center>List of Students in BigHit Music University</center></b></h2>";
    echo '<hr>';
    echo '<hr>';

    // Menampilkan array
    for ($i = 0; $i < count($arrayStudent); $i++) 
    {
        echo "<h3>" . $i+1 . "." . " " . $arrayStudent[$i]->getName() . "</h3>";
        $arrayStudent[$i]->printHuman();
        $arrayStudent[$i]->printSivitas();
        $arrayStudent[$i]->printMahasiswa();
        echo "<br />";
        echo '<hr>';
    }

?>