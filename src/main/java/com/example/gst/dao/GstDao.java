package com.example.gst.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.gst.entity.Gst;
import com.example.gst.repository.GstRepository;

@Repository
public class GstDao {
@Autowired
GstRepository gr;
public String postGst( List<Gst> a) {
	gr.saveAll(a);
	return "update successfully";
}
public int getper(int a) {
	return gr.getper(a);
}
}
