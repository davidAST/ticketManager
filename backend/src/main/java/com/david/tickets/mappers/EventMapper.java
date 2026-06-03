package com.david.tickets.mappers;

import com.david.tickets.domain.CreateEventRequest;
import com.david.tickets.domain.CreateTicketTypeRequest;
import com.david.tickets.domain.dtos.*;
import com.david.tickets.domain.entities.Event;
import com.david.tickets.domain.entities.TicketType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

    CreateTicketTypeRequest fromDto(CreateTicketTypeResponseDto dto);

    CreateEventRequest fromDto(CreateEventRequestDto dto);

    CreateEventResponseDto toDto(Event event);

    ListEventTicketTypeResponseDto toDto(TicketType ticketType);

    ListEventResponseDto toListEventResponseDto(Event event);
}
