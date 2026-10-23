# Character Manager — TP3 (Java Visual SIH-6406)

Character Manager adalah project Java yang dibuat untuk mempelajari konsep class, object, constructor, enum, dan encapsulation. Pada tugas ini, project dikembangkan dengan menambahkan atribut mana, validasi mana agar tidak bernilai negatif, serta method isAlive() untuk memeriksa status hidup karakter.

<img width="1920" height="1020" alt="Screenshot 2026-10-16 151604" src="https://github.com/user-attachments/assets/bf614c49-c640-4c55-b26b-e38762e5815a" />

Struktur Folder

```
CharacterManager/
├── src/
│   ├── Main.java
│   └── com/
│       └── unpri/
│           └── charactermanager/
│               └── model/
│                   ├── Character.java
│                   └── CharacterType.java
```

Identitas Mahasiswa

Nama lengkap: Priscilla Chyntia Simanullang

NIM: 253303621212

Google Docs Analisis: https://1drv.ms/w/c/711877E32029CA45/IQD4hOyfZ7AHSYfR643nN2uPAcfcvBNCh9Cc7JuHXVqNbdw?e=hCm5Ar

# Character Manager — TP5

 output CRUD 
   <img width="1920" height="1020" alt="Screenshot 2026-10-16 224210" src="https://github.com/user-attachments/assets/7356cca4-6ef0-4783-b6d1-8235dfcfb85f" />
   <img width="1920" height="1020" alt="Screenshot 2026-10-16 224221" src="https://github.com/user-attachments/assets/1d459471-9055-4d08-b2bd-b0e1f54b5c26" />
   <img width="1920" height="1020" alt="Screenshot 2026-10-16 224232" src="https://github.com/user-attachments/assets/db53846d-1c43-4c7b-910c-453daee20efc" />
   <img width="1920" height="1020" alt="Screenshot 2026-10-16 224253" src="https://github.com/user-attachments/assets/3b5be374-630f-41c8-9c91-6a79b64a0b16" />

   # Fitur Utama
- Menambahkan karakter dengan validasi nama duplikat.
- Mencari karakter berdasarkan nama.
- Menghapus karakter berdasarkan nama.
- Menghitung jumlah karakter yang tersimpan.
- Mengambil salinan daftar karakter.
- Menghitung rata-rata level dengan aman saat daftar kosong.
- Mencari karakter berdasarkan tipe.
- Menghitung jumlah karakter berdasarkan tipe.

# Fitur Analitik Tambahan
Method `countByType()` menghitung jumlah karakter dengan tipe tertentu. Method ini membantu memperoleh ringkasan jumlah Warrior, Mage, dan Archer tanpa menghitung secara manual.

# Encapsulation dan Reference
Daftar karakter disimpan sebagai atribut private. Method `getAllCharacters()` mengembalikan salinan ArrayList agar perubahan struktur pada daftar hasil tidak mengubah daftar internal CharacterManager.

Salinan tersebut merupakan shallow copy. Objek Character di dalamnya masih menggunakan reference yang sama dengan objek pada daftar internal.

Link Google Docs : https://1drv.ms/w/c/711877E32029CA45/IQA0inSEJKxvQpdu6rFVqQigAQWqys-3mUGngN9mlMoYNUE?e=hLyrp6

# Character Manager — TP8

### Screenshot MainWindow

![Sebelum]<img width="1920" height="1020" alt="Screenshot 2026-10-24 000801" src="https://github.com/user-attachments/assets/649ab04d-ce6b-4298-af55-1c52d7709706" />

![Sesudah]<img width="1920" height="1020" alt="Screenshot 2026-10-24 000049" src="https://github.com/user-attachments/assets/0e935c62-0c06-4611-9030-30a004668b8b" />


### Aliran Data dan MVC

Main.java membuat data karakter dan menyiapkan aplikasi.
CharacterManager bertugas menyimpan serta mengelola daftar karakter.
CharacterController menjadi penghubung antara pengelolaan data dan View.
MainWindow menampilkan daftar karakter beserta statistik pada antarmuka GUI.

### Karakter Baru

- Bima — WARRIOR level 7, dipilih sebagai karakter petarung dengan level lebih tinggi.
- Sakura — HEALER level 6, dipilih untuk mewakili karakter penyembuh dengan kemampuan yang berbeda.

### Analisis GUI & MVC

Google Docs: https://1drv.ms/w/c/711877E32029CA45/IQBwEi4NWF6lSL-Aa5ysh5ilAdBXFKsUnWUFoWzMojRLUY4?e=NFhwo6


   





