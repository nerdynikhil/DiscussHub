package com.yourcompany.discusshub.controller;

import com.yourcompany.discusshub.model.Discussion;
import com.yourcompany.discusshub.service.DiscussionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/discussions")
public class DiscussionController {

    @Autowired
    private DiscussionService discussionService;

    @GetMapping("/")
    public List<Discussion> getAllDiscussions() {
        return discussionService.getAllDiscussions();
    }

    @GetMapping("/{id}")
    public Discussion getDiscussionById(@PathVariable("id") Long id) {
        return discussionService.getDiscussionById(id);
    }

    @PostMapping("/")
    public Discussion createDiscussion(@RequestBody Discussion discussion) {
        return discussionService.createDiscussion(discussion);
    }

    // Add other discussion-related endpoints
}

