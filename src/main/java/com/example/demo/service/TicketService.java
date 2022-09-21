package com.example.demo.service;

import com.example.demo.model.Station;
import com.example.demo.model.Ticket;
import com.example.demo.util.Route;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class TicketService {

    public Ticket getTicket(String source, String destination){
        List<Station> route = Route.routeMap.get("delhi-shivpur");

        Iterator<Station> it = route.iterator();
        Station sourceStation = null;
        Station destinationStation = null;

        while(it.hasNext()){
            Station curr = it.next();
            if(curr.getStationName().equals(source))
                sourceStation = curr;
            if(curr.getStationName().equals(destination))
                destinationStation = curr;
        }

        int distance = destinationStation.getDistance() - sourceStation.getDistance();

        int fare = 50 + (distance - 100) * 3;

        return new Ticket(source, destination,fare, distance, new Date());
    }

    public static void main(String[] args) {
        TicketService service = new TicketService();

        System.out.println( service.getTicket("delhi", "gwalior"));
    }
}
