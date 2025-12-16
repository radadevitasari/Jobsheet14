Pertanyaan Percobaan 1 
1. Apa yang dimaksud dengan fungsi rekursif?
  Jawab= Fungsi rekursif adalah fungsi yang memanggil dirinya sendiri untuk menyelesaikan suatu masalah. Fungsi ini akan terus dipanggil sampai mencapai kondisi berhenti yang disebut base case, agar program tidak berjalan tanpa henti.

2. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi
faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan
fungsi rekursif dan fungsi iteratif!
 Jawab= ya, hasil yang diberikan oleh fungsi faktorialRekursif() dan faktorialIteratif() adalah sama. Perbedaannya terletak pada cara kerja program. Fungsi rekursif menghitung faktorial dengan memanggil fungsi itu sendiri berulang kali hingga mencapai base case, sedangkan fungsi iteratif menghitung faktorial menggunakan perulangan for tanpa pemanggilan fungsi berulang.


Pertanyaan Percobaan 2
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan,
pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat()
secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan
dijalankan!
 Jawab= Pemanggilan fungsi rekursif hitungPangkat() akan terus dijalankan selama nilai pangkat (y) belum bernilai 0. Setiap pemanggilan, nilai pangkat akan dikurangi satu (y - 1). Proses ini akan berhenti ketika y == 0, karena kondisi tersebut merupakan base case yang mengembalikan nilai 1. Setelah base case tercapai, hasil perhitungan akan dikembalikan secara bertahap sampai ke pemanggilan awal di fungsi main. 

2. Tambahkan kode program untuk mencetak deret perhitungan pangkatnya. Contoh:
hitungPangkat(2,5) dicetak 2x2x2x2x2x1 = 32
 Jawab= commit tambah kode program pertanyaan 2


Pertanyaan Percobaan 3
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case”
dan “recursion call”!
 Jawab= Pada Percobaan 3, base case terdapat pada kondisi if (tahun == 0) yang berfungsi sebagai penghentian proses rekursif. Pada saat kondisi ini terpenuhi, fungsi akan langsung mengembalikan nilai saldo tanpa melakukan pemanggilan fungsi lagi.
Sedangkan recursion call terdapat pada bagian return 1.11 * hitungLaba(saldo, tahun - 1);. Pada bagian ini, fungsi hitungLaba() memanggil dirinya sendiri dengan nilai tahun yang dikurangi satu, sehingga proses perhitungan laba dilakukan secara berulang sampai mencapai base case.

2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika
diberikan nilai hitungLaba(100000,3)
 Jawab= Fase ekspansi (pemanggilan fungsi):
hitungLaba(100000, 3)
= 1.11 * hitungLaba(100000, 2)
= 1.11 * hitungLaba(100000, 1)
= 1.11 * hitungLaba(100000, 0)

Fase substitusi (pengembalian nilai):
hitungLaba(100000, 0) = 100000
hitungLaba(100000, 1) = 1.11 × 100000 = 111000
hitungLaba(100000, 2) = 1.11 × 111000 = 123210
hitungLaba(100000, 3) = 1.11 × 123210 = 136763.1

Jadi, hasil akhir dari hitungLaba(100000, 3) adalah 136763.1.
