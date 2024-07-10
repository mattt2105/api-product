package com.customer.demo.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import java.time.LocalDateTime;


@Entity
@Table(name = "trx_product")
public class Product {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "productId")
    private String productId;

    @Column(name = "productName")
    private String productName;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "customerName")
    private String customerName;

    @Column(name = "status")
    private Integer status;

    @Column(name = "transactionDate")
    private LocalDateTime transactionDate;

    @Column(name = "createBy")
    private String createBy;

    @Column(name = "createdOn")
    private LocalDateTime createdOn;

    public Product() {}

    public Product(Long id, String productId, String productName, Integer amount, String customerName, Integer status, LocalDateTime transactionDate, String createBy, LocalDateTime createdOn) {
        this.id = id;
        this.productId = productId;
        this.productName = productName;
        this.amount = amount;
        this.customerName = customerName;
        this.status = status;
        this.transactionDate = transactionDate;
        this.createBy = createBy;
        this.createdOn = createdOn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }
}
