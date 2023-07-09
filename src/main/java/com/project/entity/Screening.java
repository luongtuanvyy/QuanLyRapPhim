package com.project.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "screening")
public class Screening implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name="auditorium_id")
    private Auditorium auditorium;

    @Temporal(TemporalType.TIMESTAMP)
    private Date screening_start;

    @OneToMany(mappedBy = "screening",cascade = CascadeType.ALL)
    private Collection<Reservation> reservations;

    @OneToMany(mappedBy = "screening",cascade = CascadeType.ALL)
    private Collection<SeatReserved> seatReserveds;
}
