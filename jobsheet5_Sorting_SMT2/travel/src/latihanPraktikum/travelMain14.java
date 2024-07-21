package travel.src.latihanPraktikum;

public class travelMain14 {
    public static void main(String[] args) {
        TravlePlatform14 platform14 = new TravlePlatform14(10);
        
        platform14.listTambah(new penginapanHotel14("Sunter", 100, 5));
        platform14.listTambah(new penginapanHotel14("anugerah", 100, 2));
        platform14.listTambah(new penginapanHotel14("songgoriti", 100, 3));

        System.out.println("Before sorting : ");
        for (penginapanHotel14 p : platform14.listPenginapan){
            if (p != null) {
                System.out.println("Name: " + p.name + ", Price " + p.price + ", Rating: " + p.rating);
            }
        }

        System.out.println("------------------------------------");
        platform14.bubbleSortByPrice();
        platform14.selectionSortByRating();

        System.out.println("Before sorting: ");
        for(penginapanHotel14 p : platform14.listPenginapan){
            if (p != null){
                System.out.println("Name: " + p.name + ", Price " + p.price + ", Rating: " + p.rating);
            }
        }
        System.out.println("--------------------------------------");
    }
}
