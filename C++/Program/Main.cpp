/* 
    Saya Hestina Dwi Hartiwi NIM 2108077 mengerjakan soal Latihan 2 dalam Praktikum
    mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahan-Nya maka 
    saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

#include <bits/stdc++.h>
#include "Mahasiswa.cpp"

using namespace std;

int main()
{
    /* Deklarasi atribut */
    int NIK, i, n = 0;
    string name, gender, asal_univ, email_edu, nim, major, faculty;

    list<Mahasiswa> llist;

    cout << "How Much Data Do You Want To Insert? : ";
    cin >> n;
    for (i = 0; i < n; i++)
    {
        Mahasiswa temp;

        cout << '\n' << "NIK : ";
        cin >> NIK;
        cout << "Name : ";
        cin >> name;
        cout << "Gender : ";
        cin >> gender;
        cout << '\n' << "Home University : ";
        cin >> asal_univ;
        cout << "Email Edu : ";
        cin >> email_edu;
        cout << '\n' << "NIM : ";
        cin >> nim;
        cout << "Major : ";
        cin >> major;
        cout << "Faculty : ";
        cin >> faculty;

        temp.set_NIK(NIK);
        temp.set_name(name);
        temp.set_gender(gender);
        temp.set_asal_univ(asal_univ);
        temp.set_email_edu(email_edu);
        temp.set_nim(nim);
        temp.set_major(major);
        temp.set_faculty(faculty);

        llist.push_back(temp);
    }

    /* Output */
    cout << '\n' << "Here's the List" << endl;
    i = 0;
    for (list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it ++) 
    {
        cout << (i + 1) << ". " << it->get_name() << endl;
        it->printHuman();
        it->printSivitas();
        it->printMahasiswa();
        i++;
    }
    
    return 0;
}