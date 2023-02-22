/* 
    Saya Hestina Dwi Hartiwi NIM 2108077 mengerjakan soal Latihan 2 dalam Praktikum
    mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahan-Nya maka 
    saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

/* import library */
#include <string>
#include <iostream>

using namespace std;

/*--- Deklarasi Class ---*/
class Human {
    /* Private Atributes */
    private:
        int NIK;
        string name, gender;
    public:
        /* Konstruktor */
        Human ()
        {
            this->NIK = 0;
            this->name = "";
            this->gender = "";
        }

        /* Getter and Setter */

        // Get Code
        int get_NIK()
        {
            return this->NIK;
        }

        // Get name
        string get_name()
        {
            return this->name;
        }

        // Get gender
        string get_gender()
        {
            return this->gender;
        }
        
        // Set Code
        void set_NIK(int NIK)
        {
            this->NIK = NIK;
        }

        // Set name
        void set_name(string name)
        {
            this->name = name;
        }

        // Set gender
        void set_gender(string gender)
        {
            this->gender = gender;
        }

        void printHuman()
        {
            cout << "NIK                : " << this->NIK << '\n';
            cout << "Gender             : " << this->gender << '\n';
        }

        /* Destructor */
        ~Human()
        {

        }
};