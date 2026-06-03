package com.david.tickets.services;

import com.david.tickets.domain.CreateEventRequest;
import com.david.tickets.domain.entities.Event;

import java.util.UUID;

public interface EventService {
    Event createEvent(UUID organizerId, CreateEventRequest event);
}
