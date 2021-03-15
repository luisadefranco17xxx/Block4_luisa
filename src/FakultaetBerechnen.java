public class FakultaetBerechnen {
    public static void main(String[] args) {
        int i=9;
        System.out.println("Faculty of "+i+" ist "+i+ "!= "+ calcFaculty(i));
        i=2;
        System.out.println("Faculty of "+i+" ist "+i+ "!= "+ calcFaculty(i));
        i=4;
        System.out.println("Faculty of "+i+" ist "+i+ "!= "+ calcFaculty(i));
    }
    public static long calcFaculty(int value){
        long result=1;
        for (int i = 1; i <= value; i++) {
            result=result*i;
        }

        return result;
    }
}
