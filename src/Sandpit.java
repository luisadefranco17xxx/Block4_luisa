/*

  Klassem sin Dantetypen
  Klasse, haben kein main-Methode
  Klasse, haben Attribute/ Eigenschaften
 */

public class Sandpit {

    double length;
    double width;
    double height;
    String name;
    double price;

    public double calcVolume() {

        return length * width * height;
    }

    public void print() {

            System.out.println("Fur "+name+" benötigen wir mq sand"+calcVolume()+". Kostem :"+price);
    }
}
