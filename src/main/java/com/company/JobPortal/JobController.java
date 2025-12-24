package com.company.JobPortal;
import com.company.JobPortal.model.JobPost;
import com.company.JobPortal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    JobService jobService;

    @RequestMapping({"/", "home"})
    public String home(){
        return "home";
    }

    @RequestMapping("addjob")
    public String addJob(){
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        jobService.addPost(jobPost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewJob(Model m){
        List<JobPost> jobPost = jobService.findAll();
        m.addAttribute("jobPosts", jobPost);
        return "viewalljobs";
    }
}
