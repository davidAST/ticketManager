package com.david.tickets.services;

import com.david.tickets.domain.entities.QrCode;
import com.david.tickets.domain.entities.Ticket;

import java.util.UUID;

public interface QrCodeService {

    QrCode generateQrCode(Ticket ticket);

    byte[] getQrCodeForUserAndTicket(UUID userId, UUID ticketId);
}
