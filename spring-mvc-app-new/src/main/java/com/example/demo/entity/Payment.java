
package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Component
@Table(name = "lumen_payment")
public class Payment {
	 @Id
	 @Column(name="payment_id")
	 private int paymentId;
	 
	 @Column(name="customer_name")
	 private String customerName;
	 
	 @Column(name="amount")
	 private double amount;
	 
	 @Column(name="payment_date")
	 @DateTimeFormat(iso=ISO.DATE)
	 private LocalDate paymentDate;
}
