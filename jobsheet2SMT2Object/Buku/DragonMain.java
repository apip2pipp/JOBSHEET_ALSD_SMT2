package Buku;
public class DragonMain {

    public static void main(String[] args) {
        Dragon19 dr19 = new Dragon19(1, 2, 3, 4);
        dr19.position();
        dr19.moveLeft();
        dr19.position();
        dr19.moveRight();
        dr19.position();
        dr19.moveUp();
        dr19.position();
        dr19.moveDown();
    }
}