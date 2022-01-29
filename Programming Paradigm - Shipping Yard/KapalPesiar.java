package ShippingYard;

public class KapalPesiar extends Kapal {


    public KapalPesiar(){
        System.out.println("Ini Kapal Pesiar");
    }

    @Override
    public void Speed(){
        System.out.println("20 KM/Jam");
    }

    @Override
    public void Capacity(){
        System.out.println("1000 Person");
    }

}
