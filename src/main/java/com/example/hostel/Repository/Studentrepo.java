package com.example.hostel.Repository;

import com.example.hostel.model.Studentname;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepo extends JpaRepository<Studentname,Integer> {
}
