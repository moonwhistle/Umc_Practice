package umc.study.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Point")
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String save_point;

    @Column
    private String complete_point;

    @Column
    private String convert_point;

    @Column
    private String ten_mission_point;
}
