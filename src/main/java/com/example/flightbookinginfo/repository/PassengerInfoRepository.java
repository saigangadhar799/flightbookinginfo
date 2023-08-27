package com.example.flightbookinginfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flightbookinginfo.entity.PassangerInfo;

public interface PassengerInfoRepository extends JpaRepository<PassangerInfo, Long> {

}
