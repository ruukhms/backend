package com.example.hostel.Controller;


import com.example.hostel.Repository.Studentrepo;
import com.example.hostel.model.Studentname;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/zancare")
@CrossOrigin(origins = "*")

public class StudentController {

    @Autowired
    private Studentrepo studentrepo;

    @GetMapping("/Hospital/list")
    public List<Studentname> getAllData() {
        return studentrepo.findAll();
    }

    @GetMapping("/Hospital/{id}")
    public Optional<Studentname> getDataById(@PathVariable Integer id) {

        return studentrepo.findById(id);
    }

    @PostMapping("/Hospital/add")
    public Map putNewDataOnDb(@RequestBody Studentname student) {

        studentrepo.save(student);
        Map<String,String> response = new HashMap<>();
        response.put("message", "Inserted Successfully");
        return response;
    }

    @PutMapping("/Hospital/update")
    public Map updateDataOnDb(@RequestBody Studentname student) throws Exception {
        if(student.getStudID()> 0) {
            studentrepo.save(student);
            Map<String,String> response = new HashMap<>();
            response.put("message", "updated Successfully");
            return response;
        }
        else {
            throw new Exception("Bad Request for update");
        }

    }

    @DeleteMapping("/Hospital/delete")
    public Map deleteDataOnDb(@RequestBody Studentname student) throws Exception {
        if(student.getStudID()> 0) {
            studentrepo.delete(student);
            Map<String,String> response = new HashMap<>();
            response.put("message", "Deleted Successfully");
            return response;
        }
        else {
            throw new Exception("Bad Request for delete");
        }

    }