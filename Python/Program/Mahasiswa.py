# /* 
#     Saya Hestina Dwi Hartiwi NIM 2108077 mengerjakan soal Latihan 2 dalam Praktikum
#     mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahan-Nya maka 
#     saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
# */

from Sivitas import Sivitas

class Mahasiswa(Sivitas):
    __nim = ""
    __major = ""
    __faculty = ""

    # Konstruktor
    def __init__(self):
        self.__nim = ""
        self.__major = ""
        self.__faculty = ""
    
    # Getter and Setter #
    
    # Get nim
    def get_nim (self):
        return self.__nim
    
    # Get major
    def get_major (self):
       return self.__major

    # Get faculty
    def get_faculty (self):
        return self.__faculty
    
    # Set nim
    def set_nim (self, nim):
        self.__nim = nim
    
    # set major
    def set_major (self, major):
        self.__major = major

    # set faculty
    def set_faculty (self, faculty):
        self.__faculty = faculty
    
    # Public Method #
    def printMahasiswa(self):
        print("NIM              : ", self.get_nim())
        print("Major            : ", self.get_major())
        print("Faculty          : ", self.get_faculty())