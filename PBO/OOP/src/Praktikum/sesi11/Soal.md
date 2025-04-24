Soal:
Buatlah sebuah program yang mengelola informasi tentang hewan peliharaan dengan menggunakan konsep inheritance (pewarisan) dan interface.

Abstract Class:

Buatlah sebuah kelas abstrak bernama Hewan yang memiliki dua properti:
nama (String)
usia (int)
Kelas Hewan memiliki dua metode:
bersuara() (metode abstrak) yang nantinya akan diimplementasikan oleh kelas turunannya untuk mengeluarkan suara khas dari hewan tersebut.
tampilkanInfo() (metode konkret) yang menampilkan informasi tentang nama dan usia hewan.
Interface:

Buatlah sebuah interface bernama Pemeliharaan yang memiliki dua metode:
memberiMakan() untuk memberi makan hewan peliharaan.
merawat() untuk merawat hewan peliharaan.
Subclass:

Buatlah kelas turunan dari Hewan bernama Kucing yang mengimplementasikan interface Pemeliharaan.
Kelas Kucing harus memiliki properti tambahan yaitu warna (String) dan menyediakan implementasi untuk metode bersuara(), memberiMakan(), dan merawat().
Kelas Kucing juga harus memiliki metode tampilkanSemuaInfo() yang menampilkan semua informasi tentang kucing, termasuk nama, usia, warna, dan aktivitas memberi makan serta merawat.
Kelas Utama:

Di dalam kelas utama Main, buat objek dari kelas Kucing dengan nama "Tommy", usia 3 tahun, dan warna "Hitam".
Panggil metode yang sesuai untuk menampilkan informasi tentang kucing dan suara yang dikeluarkan.
Catatan:
Program harus dapat menampilkan informasi nama, usia, warna, serta suara yang dihasilkan oleh kucing.
Gunakan konsep pewarisan untuk mewarisi kelas Hewan dan implementasikan interface Pemeliharaan untuk melakukan operasi memberi makan dan merawat.