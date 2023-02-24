# /* 
#     Saya Hestina Dwi Hartiwi NIM 2108077 mengerjakan soal Latihan 2 dalam Praktikum
#     mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahan-Nya maka 
#     saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
# */

from Mahasiswa import Mahasiswa

students = []

# Data mahasiswa pertama
student1 = Mahasiswa()
NIK = int(input("\nNIK : "))
name = str(input("Name : "))
gender = str(input("Gender : "))
asal_univ = str(input("\nHome University : "))
email_edu = str(input("Email Edu: "))
nim = str(input("\nNIM : "))
major = str(input("Major : "))
faculty = str(input("Faculty : "))

student1.set_nik(NIK)
student1.set_name(name)
student1.set_gender(gender)
student1.set_asal_univ(asal_univ)
student1.set_email_edu(email_edu)
student1.set_nim(nim)
student1.set_major(major)
student1.set_faculty(faculty)

students.append(student1)

# Data mahasiswa kedua
student2 = Mahasiswa()
NIK = int(input("\nNIK : "))
name = str(input("Name : "))
gender = str(input("Gender : "))
asal_univ = str(input("\nHome University : "))
email_edu = str(input("Email Edu: "))
nim = str(input("\nNIM : "))
major = str(input("Major : "))
faculty = str(input("Faculty : "))

student2.set_nik(NIK)
student2.set_name(name)
student2.set_gender(gender)
student2.set_asal_univ(asal_univ)
student2.set_email_edu(email_edu)
student2.set_nim(nim)
student2.set_major(major)
student2.set_faculty(faculty)

students.append(student2)

# Output #
print("\nHere's the List")
i = 0
for student in students:
    print(str(i + 1) + ".", student.get_name())
    student.printHuman()
    student.printSivitas()
    student.printMahasiswa()
    i += 1