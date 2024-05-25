package umc.study.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="User")
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 15)
    private String name;

    @Column(nullable = false, length = 100)
    private String address;

    @Column(nullable = false, length = 40)
    private String password;

    @Column(nullable = false, length = 50)
    private String email;

    @Column
    private Integer point;

    @Column(nullable = false, length = 20)
    private Integer birth;
}
