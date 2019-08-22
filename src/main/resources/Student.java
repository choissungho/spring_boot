import org.springframework.stereotype.Indexed;

public class Student implements Serializable{
    @In
    @GeneratedValue
    private Long id;
    private String name;
    private String passportNumber;
}