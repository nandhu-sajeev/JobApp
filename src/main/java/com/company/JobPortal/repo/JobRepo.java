package com.company.JobPortal.repo;

import com.company.JobPortal.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobPost = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Good java developer", 2, Arrays.asList("Java", "Maven")),
            new JobPost(2, "Python Developer", "Good python developer", 2, Arrays.asList("Python", "Flask"))
    ));

    public void addJob(JobPost jobPost){
        this.jobPost.add(jobPost);
        System.out.println(this.jobPost);
    }

    public List<JobPost> findAllJobs(){
        return this.jobPost;
    }
}
