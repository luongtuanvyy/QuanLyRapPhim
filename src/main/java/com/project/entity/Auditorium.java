package com.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@Table(name = "auditorium")
@NoArgsConstructor
@AllArgsConstructor
public class Auditorium implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;

    @Column(name="seats_no")
    private String amountSeat;

    @OneToMany(mappedBy = "auditorium", cascade = CascadeType.ALL)
    private Collection<Screening> screenings;

    @OneToMany(mappedBy = "auditorium", cascade = CascadeType.ALL)
    private Collection<Seat> seats;
}
