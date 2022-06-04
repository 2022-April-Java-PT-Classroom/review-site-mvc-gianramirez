package org.wecancoeit.reviews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancoeit.reviews.repo.ReviewRepository;

import javax.annotation.Resource;

@Controller
public class ReviewController {

    @Resource
    private ReviewRepository reviewRepo;

    @RequestMapping("/reviews")
    public String findAllReviews(Model model){
        model.addAttribute("coursesModel", reviewRepo.findAll());
        return "reviewsTemplate";
    }

    @RequestMapping("/review")
    public String findOneReview(@RequestParam(value = "id") Long id){
        return "reviewTemplate";
    }


}
