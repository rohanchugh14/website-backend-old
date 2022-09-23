package com.rohanchugh.websitebackend.service;
import com.rohanchugh.websitebackend.model.MegabusAPI;
import java.util.List;


public interface MegabusAPIService {
    public MegabusAPI saveStudent(MegabusAPI student);
    public List<MegabusAPI> getAllStudents();
}
