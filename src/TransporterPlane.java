public  class TransporterPlane extends Aircraft implements HorizontalTakeoff{
    @Override
    public void fly() {
        System.out.println("Transporting goods");
    }

    @Override
    public void horizontalTakeoff() {
        System.out.println("TransporterPlane horizontal");

    }
}
