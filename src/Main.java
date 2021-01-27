public class Main {
    public static void main(String[] args) {
 Mi8 mi8= new Mi8();
 Boeing737 boeing737= new Boeing737() ;
        TransporterPlane transporterPlane=new TransporterPlane();
 Test test = new  Test();
 test.foo(mi8);


    Test test1=new Test();
    test1.hor(transporterPlane);
    Test test3 =new Test();
    test3.boen(boeing737);


    }
}
