package com.david.tickets.services;

import com.david.tickets.domain.entities.QrCode;
import com.david.tickets.domain.entities.Ticket;

public interface QrCodeService {

    QrCode generateQrCode(Ticket ticket);
}
