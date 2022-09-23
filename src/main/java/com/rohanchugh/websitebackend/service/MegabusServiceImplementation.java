package com.rohanchugh.websitebackend.service;
import com.rohanchugh.websitebackend.model.MegabusAPI;
import com.rohanchugh.websitebackend.repository.MegabusAPIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MegabusServiceImplementation implements MegabusAPIService {
    @Autowired
    private MegabusAPIRepository mapirepo;
    @Override
    public MegabusAPI saveStudent(MegabusAPI api) {
        return mapirepo.save(api);
    }

    @Override
    public List<MegabusAPI> getAllStudents() {
        return mapirepo.findAll();
    }
}
