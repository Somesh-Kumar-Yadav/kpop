package com.kpop.controller;

import com.kpop.service.KpopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/v1/kpop")
public class KpopController {

    @Autowired
    KpopService service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    ResponseEntity<Map<String, Object>> search() {
        Map<String, Object> result = service.search();
        return new ResponseEntity<Map<String, Object>>(result, HttpStatus.OK);
    }

}
