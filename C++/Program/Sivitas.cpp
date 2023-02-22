/* 
    Saya Hestina Dwi Hartiwi NIM 2108077 mengerjakan soal Latihan 2 dalam Praktikum
    mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahan-Nya maka 
    saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

/* import library */
#include <string>
#include <iostream>
#include "Human.cpp"

using namespace std;

/*--- Deklarasi Class ---*/
class Sivitas : public Human {
    /* Private Atributes */
    private:
        string asal_univ, email_edu;
    public:
        /* Konstruktor */
        Sivitas ()
        {
            this->asal_univ = "";
            this->email_edu = "";
        }

        /* Getter and Setter */

        // Get asal_univ
        string get_asal_univ()
        {
            return this->asal_univ;
        }

        // Get email_edu
        string get_email_edu()
        {
            return this->email_edu;
        }

        // Set asal_univ
        void set_asal_univ(string asal_univ)
        {
            this->asal_univ = asal_univ;
        }

        // Set email_edu
        void set_email_edu(string email_edu)
        {
            this->email_edu = email_edu;
        }

        void printSivitas()
        {
            cout << "Home University    : " << this->asal_univ << '\n';
            cout << "Email Edu          : " << this->email_edu << '\n';
        }

        /* Destructor */
        ~Sivitas()
        {

        }
};