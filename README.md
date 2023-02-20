# LATIHAN2DPBO2023
    Saya Hestina Dwi Hartiwi NIM 2108077 mengerjakan soal Latihan 2 dalam Praktikum
    mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahan-Nya maka 
    saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
    
## ABOUT THE REPOSITORY
Repositori ini berisi Latihan 2 dari praktikum mata kuliah Desain dan Pemrograman Berorientasi Objek.

## HOW TO DEVELOPED
Terdapat 4 macam bahasa pemrograman yang digunakan, yaitu C++, Java, PHP, dan Python.

## INSIDE
![UML Diagram Latihan 2](https://user-images.githubusercontent.com/100210178/220074512-2276f8b7-dbf3-48be-9b43-2b0d69336d43.jpg)

### class Human
Class Human merupakan parent class atau kelas induk. Hal ini dikarenakan class Human berisi atribut mendasar yang bisa diturunkan atributnya ke kelas di bawahnya.
  
  -> Atribut: NIK, nama, dan jenis_kelamin
  
  -> Method: Konstruktor, set, dan get
  
### class Sivitas
Class Sivitas merupakan child class atau kelas anak. Hal ini dikarenakan class di bawahnya (class Mahasiswa) merupakan salah atu dari komponen dari Sivitas Akademik (selain dosen).

  -> Atribut: asal_univ dan email_edu
  
  -> Method: Konstruktor, set, dan get
  
### class Mahasiswa
Class Mahasiswa merupakan grandparent class atau kelas cucu. Hal ini dikarenakan atribut yang ada di kelas ini mencakup atribut pada kelas yang di atas. Selain itu, mahasiswa juga merupakan anggota sivitas akademik berdampingan dengan dosen sehingga urutannya berada di bawah class Sivitas.

  -> Atribut: nim, nama, jenis_kelamin, program studi, dan fakultas
  
  -> Method: Konstruktor, set, dan get

## PROGRAM's LOOK

#### Input Data
![Screenshot (60)](https://user-images.githubusercontent.com/100210178/220077017-087b8e0f-beb0-4008-9df8-cd4992d8c9a1.png)

#### Display Data
![Screenshot (61)](https://user-images.githubusercontent.com/100210178/220077043-71c529ce-ed86-450c-a65f-3a7722437984.png)
