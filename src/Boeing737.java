public class Boeing737 extends Aircraft implements HorizontalTakeoff{
    @Override
    public void fly() {
        System.out.println("Boeing737");
    }

    @Override
    public void horizontalTakeoff() {
        System.out.println("Transporting people  from A to B");

    }
}
