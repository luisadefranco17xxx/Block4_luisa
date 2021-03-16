public class PingPongClass {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                System.out.print("Ping");
            }
            if (i%3 == 0) {
                System.out.print("Pong");
            }
            if (i%5 == 0) {
                System.out.print("King");
            }
            if (i%7 == 0) {
                System.out.print("Kong");
            }
            if (i%11 == 0) {
                System.out.print("Kung");
            }
            if (i%13 == 0)
                System.out.print("Kang");
            if (i%17 == 0)
                System.out.print("Keng");

            //System.out.println(i);
            System.out.println(i);
        }
    }
}
