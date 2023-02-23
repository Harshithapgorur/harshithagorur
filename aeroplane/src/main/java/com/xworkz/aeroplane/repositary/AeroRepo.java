package com.xworkz.aeroplane.repositary;
import com.xworkz.aeroplane.Entity.AeroEntity;
public interface AeroRepo {
	boolean save(AeroEntity entity);

	default AeroEntity findById(int id) {
		return null;
	}
}
