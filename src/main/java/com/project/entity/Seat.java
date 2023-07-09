package com.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "seat")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seat implements Serializable {
    @Id
    private String id;

    private int row_seat;

    private int number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="auditorium_id")
    private Auditorium auditorium;

    @OneToMany(mappedBy = "seat",cascade = CascadeType.ALL)
    private Collection<SeatReserved> seatReserveds;
}
