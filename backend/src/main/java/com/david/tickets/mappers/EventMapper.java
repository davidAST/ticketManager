package com.david.tickets.mappers;

import com.david.tickets.domain.CreateEventRequest;
import com.david.tickets.domain.CreateTicketTypeRequest;
import com.david.tickets.domain.dtos.CreateEventRequestDto;
import com.david.tickets.domain.dtos.CreateEventResponseDto;
import com.david.tickets.domain.dtos.CreateTicketTypeResponseDto;
import com.david.tickets.domain.entities.Event;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

    CreateTicketTypeRequest fromDto(CreateTicketTypeResponseDto dto);

    CreateEventRequest fromDto(CreateEventRequestDto dto);

    CreateEventResponseDto toDto(Event event);
}
