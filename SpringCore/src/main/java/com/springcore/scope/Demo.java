package com.springcore.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Demo {
	
	private int x;
	
	@Value("#{ T(java.lang.Math).sqrt(23) }")
	private int y;
	
	@Value("#{T(java.lang.Math).E}")
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")
	private double xy;
	
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

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getXy() {
		return xy;
	}

	public void setXy(double xy) {
		this.xy = xy;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", xy=" + xy + "]";
	}


	
	
	
}
