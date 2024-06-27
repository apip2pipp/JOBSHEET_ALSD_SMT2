package Buku;
public class Dragon19 {
    int x;
    int y;
    int widht;
    int height;

    public Dragon19(){

    }

    public Dragon19(int x, int y, int widht, int height){
        this.x =x;
        this.y =y;
        this.widht =widht;
        this.height =height;
    }

    public void detectCollision(){
        if (x < 0 || x > widht || y < 0|| y > height) {
            System.out.println(" Game Over ");
            System.exit(0);
        }
    }

    public void moveRight(){
        if (x>= 0 && x <widht) {
            x++;
        } else {
            detectCollision();
        }
    }

    public void moveLeft(){
        if (x> 0 && x <=widht) {
            x++;
        } else {
            detectCollision();
        }
    }

    public void moveUp(){
        if (y> 0 && y <= height) {
            y--;
        }else{
            detectCollision();
        }
    }

    public void moveDown(){
        if (y >= 0 && y <height) {
            y++;
        } else {
            detectCollision();
        }
    }

    public void position(){
        System.out.println("posisi dragon :("+ x + ","+ y +" )");
    }

    
}
