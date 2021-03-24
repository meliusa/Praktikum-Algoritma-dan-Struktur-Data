/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meliusa
 */
public class DaftarMahasiswaBerprestasi {

    Mahasiswa[] listMhs = new Mahasiswa[5];
    public int idx;

    public void tambah(Mahasiswa m) {
        if (idx < listMhs.length) { //kalau nilai yang ada di idx kurang dari panjang listMhs
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil() {
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("--------------------------");
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    //swap
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            //swap  
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

//    public void insertionSort() {
//        for (int i = 1; i < listMhs.length; i++) {
//            Mahasiswa tmp = listMhs[i];
//            int j = i;
//            while (j > 0 && listMhs[j - 1].ipk > tmp.ipk) {
//                listMhs[j] = listMhs[j - 1];
//                j--;
//            }
//            listMhs[j] = tmp;
//        }
//    }
    
    public void insertionSort(boolean asc) {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa tmp = listMhs[i]; 
            int j = i;

            if (asc) {
                while (j > 0 && listMhs[j - 1].ipk > tmp.ipk) {
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }
            } else {
                while (j > 0 && listMhs[j - 1].ipk < tmp.ipk) {
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }
            }
            listMhs[j] = tmp;
        }
    }

}
