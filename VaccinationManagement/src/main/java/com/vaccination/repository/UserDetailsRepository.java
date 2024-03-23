package com.vaccination.repository;

import com.vaccination.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository  extends JpaRepository<UserDetails, Integer> {

}
