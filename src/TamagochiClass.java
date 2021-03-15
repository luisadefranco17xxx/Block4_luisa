public class TamagochiClass {

    int x;
    int y;
    int futterStand;

    public void bewegeTagagochi(String dir, int value) {
        if (dir.equals(x)) {
            x = x + value;
        }
        if (dir.equals(y)) {
            y = y + value;
        }

        futterStand = futterStand - Math.abs(value);
    }

    public int futternTamagochi(int futter){
        futterStand=futterStand+futter;
        return futterStand;
    }
    
    public int getFutterStand(){
        return futterStand;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
