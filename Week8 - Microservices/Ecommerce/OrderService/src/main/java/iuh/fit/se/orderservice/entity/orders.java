package iuh.fit.se.orderservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Getter
@Setter
@Table(name = "orders")
public class orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long customerId;

    private LocalDate orderDate;
    private OrderStatus status;
    private double totalPrice;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
