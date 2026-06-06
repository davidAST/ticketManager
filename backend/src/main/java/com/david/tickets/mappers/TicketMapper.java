package com.david.tickets.mappers;

import com.david.tickets.domain.dtos.ListTicketResponseDto;
import com.david.tickets.domain.dtos.ListTicketTicketTypeResponseDto;
import com.david.tickets.domain.entities.Ticket;
import com.david.tickets.domain.entities.TicketType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TicketMapper {

    ListTicketTicketTypeResponseDto toListTicketTicketTypeResponseDto(TicketType ticketType);

    ListTicketResponseDto toListTicketResponseDto(Ticket ticket);
}
