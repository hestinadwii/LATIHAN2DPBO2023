# /* 
#     Saya Hestina Dwi Hartiwi NIM 2108077 mengerjakan soal Latihan 2 dalam Praktikum
#     mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahan-Nya maka 
#     saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
# */

class Human:
    __NIK = 0
    __name = ""
    __gender = ""

    # Konstruktor
    def __init__(self):
        self.__NIK = 0
        self.__name = ""
        self.__gender = ""
    
    # Getter and Setter #

    # Get NIK
    def get_nik (self):
        return self.__NIK
    
    # Get Name
    def get_name (self):
        return self.__name

    # Get Gender
    def get_gender (self):
        return self.__gender
    
    # Set NIK
    def set_nik (self, NIK):
        self.__NIK = NIK

    # Set Name
    def set_name (self, name):
        self.__name = name
    
    # set Gender
    def set_gender (self, gender):
        self.__gender = gender
    
    # Public Method #
    def printName (self):
        print("Name             : ", self.__name)
    def printHuman(self):
        print("NIK              : ", self.get_nik())
        print("Gender           : ", self.get_gender())