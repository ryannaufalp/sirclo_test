package ShippingYard;

public class Main {

    public static void main(String[] args){
        Kapal perahuMotor = new PerahuMotor();
        perahuMotor.Capacity();
        perahuMotor.Speed();
        perahuMotor.setName("Perahu Motor");
        perahuMotor.setId(1);

        System.out.println(perahuMotor.getName());
        System.out.println(perahuMotor.getId());

        Kapal perahuLayar = new PerahuLayar();
        perahuLayar.Capacity();
        perahuLayar.Speed();
        perahuLayar.setName("Perahu Layar");
        perahuLayar.setId(2);

        System.out.println(perahuLayar.getName());
        System.out.println(perahuLayar.getId());

        Kapal kapalPesiar = new KapalPesiar();
        kapalPesiar.Capacity();
        kapalPesiar.Speed();
        kapalPesiar.setName("Kapal Pesiar");
        kapalPesiar.setId(3);

        System.out.println(kapalPesiar.getName());
        System.out.println(kapalPesiar.getId());
    }
}
