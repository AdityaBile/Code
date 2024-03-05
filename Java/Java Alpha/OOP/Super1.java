package OOP;

// import javax.sql.rowset.spi.SyncResolver;

public class Super1 {
    public static void main(String args[]){
        Vin modal = new Vin();
        System.out.println(modal.color);
    }    
}

class Spec{
    Spec(){
        System.out.println("This is spectacles");
    }
    String color = "Silver";
}

class Vin extends Spec{

    Vin(){
        // super();
        // super.color = "Pink";
        System.out.println("This is vintage spectacles");
    }

}
