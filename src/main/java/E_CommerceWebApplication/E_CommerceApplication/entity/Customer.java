package E_CommerceWebApplication.E_CommerceApplication.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name ="customer")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    private String address;

}
