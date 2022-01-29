package ShippingYard;


public class PerahuMotor extends Kapal {


    public PerahuMotor(){
        System.out.println("Ini Perahu Motor");
    }

    @Override
    public void Speed(){
        System.out.println("50 KM/Jam");
    }

    @Override
    public void Capacity(){
        System.out.println("2 Person");
    }

}