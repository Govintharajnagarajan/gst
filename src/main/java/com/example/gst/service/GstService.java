package com.example.gst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gst.dao.GstDao;
import com.example.gst.entity.Gst;

@Service
public class GstService {
@Autowired
GstDao gd;
public String postGst( List<Gst> a) {
	return gd.postGst(a);
}
public int getper(int a) {
	return gd.getper(a);
}

}
