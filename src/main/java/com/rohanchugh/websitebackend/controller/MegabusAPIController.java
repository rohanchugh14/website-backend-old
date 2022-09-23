package com.rohanchugh.websitebackend.controller;

import com.rohanchugh.websitebackend.model.MegabusAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rohanchugh.websitebackend.service.MegabusAPIService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class MegabusAPIController {
    @Autowired
    private MegabusAPIService mservice;

    @PostMapping("/add")
    public String add(@RequestBody MegabusAPI mapi) {
        mservice.saveStudent(mapi);
        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<MegabusAPI> getAllStudents() {
        return mservice.getAllStudents();
    }
}
