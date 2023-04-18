package com.UST.Flightservices.dto;

import com.UST.Flightservices.entity.Passengerinfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="passenger_info")
public class FlightBookingAcknowledgement {
    private String Status;
    private double amount;
    private String pnrno;
    private Passengerinfo passengerinfo;

}
