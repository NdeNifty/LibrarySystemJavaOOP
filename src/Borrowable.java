import java.util.ArrayList;
import java.util.List;

public interface Borrowable {
    void borrow (User user);
    void returnItem (User user);
}
