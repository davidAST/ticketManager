# 🎟️ Event Ticket Platform

A complete platform for event and ticket management. Organizers can create and publish events with different ticket types, attendees can browse and purchase tickets, and staff can validate entry via QR code scanning or manual lookup.

---

## 🚀 How to Run the Application

See issue [#1 — How to start the application](../../issues/1) for the full step-by-step guide including a video walkthrough.

---

## 👥 Roles

### 🧑‍💼 Organizer
Manages the full event lifecycle: creates events with name, dates, venue and sales periods; defines ticket types with price and description; edits or deletes existing events; and publishes events to make them visible to the public.

> See issue [#2 — Organizer Capabilities & Use Cases](../../issues/2)

---

### 🎫 Attendee
Browses published events from the landing page with built-in search. Can purchase tickets for available events, view acquired tickets and download the QR code for each one to present at the door.

> See issue [#3 — Attendee Capabilities & Use Cases](../../issues/3)

---

### 🔍 Staff
Validates attendee entry at the event. Can scan the ticket QR code with the camera or enter it manually. The system shows in real time whether the ticket is valid or has already been used.

> See issue [#4 — Staff Capabilities & Use Cases](../../issues/4)

---

## 🔌 API Endpoints

| Method | Endpoint | Description | Auth |
|--------|----------|-------------|------|
| `GET` | `/api/v1/published-events` | List public events | ❌ |
| `GET` | `/api/v1/published-events/:id` | Get public event details | ❌ |
| `GET` | `/api/v1/events` | List organizer's events | ✅ |
| `POST` | `/api/v1/events` | Create event | ✅ |
| `PUT` | `/api/v1/events/:id` | Update event | ✅ |
| `DELETE` | `/api/v1/events/:id` | Delete event | ✅ |
| `POST` | `/api/v1/events/:eventId/ticket-types/:typeId/tickets` | Purchase ticket | ✅ |
| `GET` | `/api/v1/tickets` | List my tickets | ✅ |
| `GET` | `/api/v1/tickets/:id` | Get ticket details | ✅ |
| `GET` | `/api/v1/tickets/:id/qr-codes` | Get ticket QR code | ✅ |
| `POST` | `/api/v1/ticket-validations` | Validate a ticket | ✅ |

---

## 📁 Project Structure

```
ticketManager/
├── backend/
│   ├── docker-compose.yml             # PostgreSQL, Adminer and Keycloak
│   └── src/main/java/com/david/tickets/
│       ├── controllers/               # REST endpoints
│       ├── services/                  # Business logic
│       ├── domain/
│       │   ├── entities/              # JPA entities
│       │   └── dtos/                  # Request/response DTOs
│       ├── repositories/              # Spring Data repositories
│       ├── config/                    # Security and app configuration
│       └── exceptions/                # Custom exceptions
│
└── frontend/
    └── src/
        ├── pages/                     # Route-level components
        ├── components/                # Shared UI components
        ├── hooks/                     # Custom hooks (e.g. useRoles)
        ├── lib/                       # API client
        └── domain/                    # TypeScript types and enums
```
