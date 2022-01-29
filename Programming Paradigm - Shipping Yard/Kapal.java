package ShippingYard;
public abstract class Kapal {

    private String name;
    private int id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Kapal(){
        System.out.println("Ini Kapal");
    }

    protected abstract void Speed();

    protected abstract void Capacity();
}