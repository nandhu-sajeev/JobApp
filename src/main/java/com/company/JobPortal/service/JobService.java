package com.company.JobPortal.service;

import com.company.JobPortal.model.JobPost;
import com.company.JobPortal.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addPost(JobPost jobPost){
        repo.addJob(jobPost);

    }

    public List<JobPost> findAll(){
        return repo.findAllJobs();
    }
}
