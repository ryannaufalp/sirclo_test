package ShippingYard;

public class PerahuLayar extends Kapal{


    public PerahuLayar(){
        System.out.println("Ini Perahu Layar");
    }

    @Override
    public void Speed(){
        System.out.println("10 KM/Jam");
    }

    @Override
    public void Capacity(){
        System.out.println("10 Person");
    }
}
