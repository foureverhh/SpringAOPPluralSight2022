package com.example.pluralsightspringaop2022;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passenger {
    private int id;

    @Override
    public String toString() {
        return "Passenger: " + id;
    }
}
