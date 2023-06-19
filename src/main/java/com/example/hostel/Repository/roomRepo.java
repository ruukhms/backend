package com.example.hostel.Repository;


import com.example.hostel.model.Room;
import com.example.hostel.model.Studentname;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface roomRepo extends JpaRepository<Room,String> {
}





