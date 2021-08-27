package com.springboot.transaction.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.transaction.entity.PassengerInfo;

public interface passengerInfoRepository extends JpaRepository<PassengerInfo,Long> {

}
