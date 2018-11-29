import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Hobby {
    private String nameHobby;
    private int frequency;
    private List<Address> addressList;

    public Hobby(String nameHobby, int frequency, Address... address) {
        this.nameHobby = nameHobby;
        this.frequency = frequency;
        this.addressList = new ArrayList<>();
        Collections.addAll(this.addressList, address);

    }

    @Override
    public String toString() {
        return "\nName of hobby: " + nameHobby + "; " +
                " Frequency: " + frequency + "; " +
                " Address: " + addressList;
    }

}
