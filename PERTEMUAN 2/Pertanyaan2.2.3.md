SOAL
1. Sebutkan 2 karakteristik class/objek!
2. Kata kunci apakah yang digunakan untuk mendeklarasikan class?
3. Perhatikan class Barang yang ada di Praktikum di atas, ada berapa atribut yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja deklarasi atribut dilakukan?
4. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja deklarasi method dilakukan?
5. Perhatikan method kurangiStok() yang ada di class Barang, modifikasi isi method tersebut sehingga proses pengurangan hanya dilakukan jika stok masih ada (masih lebih besar dari 0)
6. Menurut Anda, mengapa method tambahStok() dibuat dengan memiliki 1 parameter berupa bilangan int?
7. Menurut Anda, mengapa method hitungHargaTotal() memiliki tipe data int?
8. Menurut Anda, mengapa method tambahStok() memiliki tipe data void?

JAWABAN

1. Ciri-ciri class :
a. Class merupakan tempat untuk membuat objek 
b. Didalam class akan dideklarasikan variabel atau atribut dan method yang dalam istilah prosedural dikenal dengan fungsi atau prosedur.
c. Proses pembuatan objek dari sebuah class disebut dengan instantiation (Instansiasi)

Ciri-ciri objek :
a. Obyek itu memiliki status(state) dan memiliki tingkah laku (Behavior)
b. Status didalam pemrograman itu dikenal dengan istilah atribut atau variabel.
c. Tingkah laku (Behavior) merupakan fungsi atau prosedur yang didalam konsep OOP dikenal dengan method.
2. Class
3. Ada 4 yaitu namaBarang, jenisBarang (baris 13) dan stok, hargaSatuan (baris 14)
4. Ada 4 yaitu :
1) tampilBarang -> baris 16
2) tambahStok -> baris 23
3) kurangiStok -> baris 27
4) hitungHargaTotal -> baris 31
5. void kurangiStok(int n) {
        if (stok > 0) {
            stok = stok - n;
        }
    }
6. Karena, nantinya nilai yang akan terupdate adalah nilai dari variabel stok yang bertipe data int. Jadi, agar dapat menggunakan operasi aritmatika harus menggunakan tipe data yang sama.
7. karena variabel hargaSatuan bertipe data int. Disamakan agar bisa menggunakan operasi aritmatika
8. Karena tidak perlu return