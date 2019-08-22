package com.example.spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Repository
public interface StudentRepository<Student> extends JpaRepository<Student, Long> {
}
@Autowired StudentRepository repository;
@RequestMapping(value = "/student/{action}", method = { .. })
public ModelAndView actionMethod(@PathVariable String action, ...) {
String viewName = "/student/" + action ;
List<Object> resultList = new ArrayList<Object>();
resultList = (List) repository.findAll();
modelandView.setViewName(viewName);
modelandView.addObject("resultList", resultList);
return modelandView;
}