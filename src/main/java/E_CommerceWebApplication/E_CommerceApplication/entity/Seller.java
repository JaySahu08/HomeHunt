package E_CommerceWebApplication.E_CommerceApplication.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="seller")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Seller {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private String shopName;

    @Column(unique = true)
    private String email;

    private String password;

    private String gstNumber;



}
