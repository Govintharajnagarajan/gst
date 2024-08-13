package com.example.gst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.gst.entity.Gst;
import com.example.gst.service.GstService;

@RestController
public class GstController {
@Autowired
GstService gs;
@PostMapping(value="/post")
public String postGst(@RequestBody List<Gst> a) {
	return gs.postGst(a);
}
@GetMapping(value="/getper/{a}")
public int getper(@PathVariable int a) {
	return gs.getper(a);
}
}
