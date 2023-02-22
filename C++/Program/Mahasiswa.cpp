/* 
    Saya Hestina Dwi Hartiwi NIM 2108077 mengerjakan soal Latihan 2 dalam Praktikum
    mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahan-Nya maka 
    saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

/* import library */
#include <string>
#include <iostream>
#include "Sivitas.cpp"

using namespace std;

/*--- Deklarasi Class ---*/
class Mahasiswa : public Sivitas {
    /* Private Atributes */
    private:
        string nim, major, faculty;
    public:
        /* Konstruktor */
        Mahasiswa()
        {
            this->nim = "";
            this->major = "";
            this->faculty = ""; 
        }

        /* Getter and Setter */

        // Get NIM
        string get_nim()
        {
            return this->nim;
        }

        // Get major
        string get_major()
        {
            return this->major;
        }

        // Get faculty
        string get_faculty()
        {
            return this->faculty;
        }

        // Set NIM
        void set_nim(string nim)
        {
            this->nim = nim;
        }

        // Set Major
        void set_major(string major)
        {
            this->major = major;
        }

        // Set Faculty
        void set_faculty(string faculty)
        {
            this->faculty = faculty;
        }

        void printMahasiswa()
        {
            cout << "NIM                : " << this->nim << '\n';
            cout << "Major              : " << this->major << '\n';
            cout << "Faculty            : " << this->faculty << '\n';
        }

        /* Destructor */
        ~Mahasiswa()
        {

        }
};