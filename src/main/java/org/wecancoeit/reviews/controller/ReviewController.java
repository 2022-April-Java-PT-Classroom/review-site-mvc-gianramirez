package org.wecancoeit.reviews.controller;

import org.springframework.stereotype.Controller;
import org.wecancoeit.reviews.repo.ReviewRepository;

import javax.annotation.Resource;

@Controller
public class ReviewController {

    @Resource
    private ReviewRepository reviewRepo;


}
