package com.example.gst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.gst.entity.Gst;

public interface GstRepository extends JpaRepository<Gst,Integer> {
    @Query(value="select percentage from gst where hsncode = ?",nativeQuery=true)
	public int getper(int a);

}
