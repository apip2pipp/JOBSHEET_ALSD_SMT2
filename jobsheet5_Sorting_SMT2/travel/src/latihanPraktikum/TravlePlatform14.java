package travel.src.latihanPraktikum;

public class TravlePlatform14 {
    penginapanHotel14[] listPenginapan;
    int idx;

    TravlePlatform14(int totalPenginapan) {
        listPenginapan = new penginapanHotel14[totalPenginapan];
        idx = 0;
    }

    void listTambah(penginapanHotel14 z) {
        if (idx < listPenginapan.length) {
            listPenginapan[idx] = z;
            idx++;
        } else {
            System.out.println("List room is full");
        }
    }

    void bubbleSortByPrice() {
        for (int i = 0; i < listPenginapan.length - 1; i++) {
            for (int j = 0; j < listPenginapan.length - 1 - i; j++) {
                if (listPenginapan[j] != null && listPenginapan[j + 1] != null
                        && listPenginapan[j].price > listPenginapan[j + 1].price) {
                    penginapanHotel14 temp = listPenginapan[j];
                    listPenginapan[j] = listPenginapan[j + 1];
                    listPenginapan[j + 1] = temp;
                }

                {

                }
            }
        }
    }

    void selectionSortByRating(){
        for (int i = 0; i<listPenginapan.length -1; i++){
            int idxMax = i;
            for (int j = i + 1; j< listPenginapan.length; j++){
                if (listPenginapan[j] != null && listPenginapan[idxMax] != null && listPenginapan[idxMax] != null && listPenginapan[j].rating> listPenginapan[idxMax].rating) {
                    idxMax=j;
                }
            }
            if (listPenginapan[idxMax] != null) {
                penginapanHotel14 temp = listPenginapan[idxMax];
                listPenginapan[idxMax] = listPenginapan [i];
                listPenginapan[i]= temp; 
            }
        }
    }
}
