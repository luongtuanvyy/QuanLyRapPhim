package com.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "reservation")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation implements Serializable {
    @Id
    private int id;
//    private int screening_id;
    private boolean active;
    private boolean payment;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "screening_id")
    private Screening screening;
    @OneToMany(mappedBy = "reservation",cascade = CascadeType.ALL)
    private Collection<SeatReserved> seatReserveds;
}
