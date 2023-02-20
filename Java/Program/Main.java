/* 
    Saya Hestina Dwi Hartiwi gender 2108077 mengerjakan soal Latihan 2 dalam Praktikum
    mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahan-Nya maka 
    saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

/* import library */
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        int NIK, i, n = 0;
        String nim, name, gender, major, faculty, asal_univ, email_edu;

        ArrayList<Mahasiswa> list = new ArrayList<>();

        Scanner scanInt = new Scanner(System.in); //---> integer input
        Scanner scanStr = new Scanner(System.in); //---> string input

        System.out.print("How Much Data Do You Want To Insert? : ");
        try
        {
            n = scanInt.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("The input is not integer!");
        }
    
        // Iteration
        for (i = 0; i < n; i++) 
        { 
            System.out.print('\n' + "NIK: ");
            NIK = scanInt.nextInt();
            System.out.print("Name: ");
            name = scanStr.next();
            System.out.print("Gender: ");
            gender = scanStr.next();

            System.out.print('\n' + "Home University: ");
            asal_univ = scanStr.next();
            System.out.print("Email Edu: ");
            email_edu = scanStr.next();

            System.out.print('\n' + "NIM  :");
            nim = scanStr.next();
            System.out.print("Major: ");
            major = scanStr.next();
            System.out.print("Faculty: ");
            faculty = scanStr.next();


            Mahasiswa temp = new Mahasiswa();
            temp.setNIK(NIK);
            temp.setName(name);
            temp.setGender(gender);
            temp.setAsal_univ(asal_univ);
            temp.setEmail_edu(email_edu);
            temp.setNim(nim);
            temp.setMajor(major);
            temp.setFaculty(faculty);
            list.add(temp);
        }


        /* Output */

        /* Output for array list */
        System.out.println('\n' + "Here's the List");
        for (i = 0; i <list.size(); i++)
        {
            System.out.println(Integer.toString(i + 1) + ". " + list.get(i).getName());
            list.get(i).printHuman();
            list.get(i).printSivitas();
            list.get(i).printMahasiswa();
        }
        
        // tutup scanner
        scanStr.close();
        scanInt.close();
    }
}