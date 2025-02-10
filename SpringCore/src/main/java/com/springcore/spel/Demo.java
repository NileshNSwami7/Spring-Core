package com.springcore.spel;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{8+9}")
	private int x;
	@Value("#{11+9}")
	private int y;
	@Value("Nilesh Swami")
	private String z;
	@Value("#{temp}")
	private List<String> str;
	@Value("#{7>3}")
	private boolean isActive;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getZ() {
		return z;
	}
	public void setZ(String z) {
		this.z = z;
	}
	public List<String> getStr() {
		return str;
	}
	public void setStr(List<String> str) {
		this.str = str;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", str=" + str + ", isActive=" + isActive + "]";
	}
	
	
	
	
}
