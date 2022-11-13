package Lambda_3B_Functional_Interfases;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String firstName;
    private String lastname;
    private int age;
}
