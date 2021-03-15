public class TamagochiSteuerungApp {
    public static void main(String[] args) {

        TamagochiClass my_tamagochi =new TamagochiClass();
        my_tamagochi.x=6;
        my_tamagochi.y=4;
        my_tamagochi.futterStand=5;

        my_tamagochi.futternTamagochi(5);
        my_tamagochi.bewegeTagagochi("x",-6);
        my_tamagochi.bewegeTagagochi("y",-4);

        System.out.println("Futter Stand ist: "+my_tamagochi.getFutterStand());
        System.out.println("X position ist: "+my_tamagochi.getX());
        System.out.println("Y position ist: "+my_tamagochi.getY());
    }
}
