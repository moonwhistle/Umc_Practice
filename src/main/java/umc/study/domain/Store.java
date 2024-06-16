package umc.study.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Store")
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 15)
    private String name;

    @Column(nullable = false, length = 20)
    private String category;

    @Column(nullable = false, length = 150)
    private String img_url;
}
