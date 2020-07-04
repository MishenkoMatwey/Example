package com.uberCoffe.pickPoint.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "PickPoint")
@Data
@NoArgsConstructor
public class PickPoint {

    @Id
    @Column(name = "ID", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "adress", nullable = false)
    private String adress;

    @Column(name = "width", unique = true, nullable = false)
    private Double width;

    @Column(name = "longitude", unique = true, nullable = false)
    private Double longitude;

    public static void main(String[] args) {
        
    }
}
