package com.david.tickets.services;

import com.david.tickets.domain.entities.Ticket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface TicketService {
    Page<Ticket> listTicketsForUser(UUID userId, Pageable pageable);
}
