package com.company.controller;


import com.company.entity.Country;
import com.company.entity.User;
import com.company.form.UserDetailForm;
import com.company.service.inter.CountryServiceInter;
import com.company.service.inter.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserDetailController {

    @Autowired
    private UserServiceInter userService;

    @Autowired
    private CountryServiceInter countryService;


    @RequestMapping(method = RequestMethod.GET, value = "/userDetail")
    public ModelAndView index(
            @RequestParam(value ="id") Integer id
    ){

        ModelAndView mv =new ModelAndView("userDetail");

        List<User> users=new ArrayList<>();
        users.add(userService.getById(id));
        System.out.println(users.get(0).getName()+"Name's id is "+ users.get(0).getId());
        List<Country> countryList= countryService.getAllCountry();
        mv.addObject("countryObject",countryList);
        mv.addObject("userObject",users);
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/userDetailUpdate")
    public ModelAndView indexUpdate(
            @ModelAttribute("userData") UserDetailForm userDetailForm)
    {

       ModelAndView mv=new ModelAndView("userDetail");

        User user=userService.getById(userDetailForm.getId());
        user.setName(userDetailForm.getName());
        user.setSurname(userDetailForm.getSurname());
        user.setAddress(userDetailForm.getAddress());
        user.setEmail(userDetailForm.getEmail());
        user.setPhone(userDetailForm.getPhone());
        user.setBirthDate(userDetailForm.getBirthdate());

        Country country=countryService.getById(userDetailForm.getBirthplaceId());
        user.setBirthPlace(country);

        Country nationality=countryService.getById(userDetailForm.getNationalityId());
        user.setNationality(nationality);

        userService.updateUser(user);

        List<User> users=new ArrayList<>();
        users.add(user);
        List<Country> countryList= countryService.getAllCountry();

        mv.addObject("countryObject",countryList);
        mv.addObject("userObject",users);

        return mv;
    }

}
