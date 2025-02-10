package com.springcore.RemovalXML;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component
public class Student {
	private Job job;
	
	public Student(Job job) {
		super();
		this.job = job;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public void getstudy() {
		this.job.getJob();
		System.out.println("Hi...I am going to lecture");
	}
	
}
