public class SandPitDemApp {
    public static void main(String[] args) {

        double l=1.4;
        double w=1.4;
        double h=0.2;
        String name= "Homemode Sandpit";
        double price =0;

        Sandpit homeMade= new Sandpit();
        Sandpit  bauhaus =new Sandpit();
        Sandpit  whikey =new Sandpit();

        homeMade.height= 0.2;
        homeMade.width = 1.4;
        homeMade.length=1.4;
        homeMade.name ="Selbstgemacht";
        homeMade.price= 59;


        bauhaus.height= 0.2;
        bauhaus.width = 1.4;
        bauhaus.length=1.4;
        bauhaus.name ="Selbstgemacht";
        bauhaus.price= 59;


        whikey.height= 0.2;
        whikey.width = 1.9;
        whikey.length=1.4;
        whikey.name ="Selbstgemacht";
        whikey.price= 59;

        bauhaus.print();
    }
    public static double calcVolume(double length, double width, double height){

        return length*width*height;
    }


}
