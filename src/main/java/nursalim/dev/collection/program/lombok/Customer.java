package nursalim.dev.collection.program.lombok;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    private String id;
    private String name;
    private String email;

}
