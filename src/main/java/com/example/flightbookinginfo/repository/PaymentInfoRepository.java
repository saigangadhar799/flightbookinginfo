package com.example.flightbookinginfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flightbookinginfo.entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {

}
