public class TestCircle {
    public static void main(String[] args){
        Circle cr1= new Circle();
        Circle cr2= new Circle(3.4);
        System.out.println("cr1 radius = " +cr1.getRadius());
        System.out.println("cr1 color = " +cr1.getColor());
        System.out.println("cr2 radius = " +cr2.getRadius());
        System.out.println("cr2 color = " +cr2.getColor());
    }
}
