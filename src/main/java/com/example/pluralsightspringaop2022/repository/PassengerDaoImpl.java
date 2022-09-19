package com.example.pluralsightspringaop2022.repository;

import com.example.pluralsightspringaop2022.log.Log;
import com.example.pluralsightspringaop2022.model.Passenger;

import java.util.HashMap;
import java.util.Map;

public class PassengerDaoImpl implements PassengerDao{
    private static Map<Integer, Passenger> passengerMap = new HashMap<>();
    @Override
    @Log
    public Passenger getPassenger(int id) {
        if(null != passengerMap.get(id))
            return passengerMap.get(id);
        Passenger passenger = new Passenger(id);
        passengerMap.put(id, passenger);
        return passenger;
    }
}
