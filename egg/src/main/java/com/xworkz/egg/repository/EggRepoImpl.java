package com.xworkz.egg.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.stereotype.Repository;

import com.xworkz.egg.dto.EggDTO;
@Repository
public class EggRepoImpl implements EggRepository {
	private EntityManagerFactory entityManagerFactory;

	public EggRepoImpl() {
System.out.println("created"+this.getClass().getSimpleName());	}

	@Override
	public boolean save(EggDTO dto) {
		System.out.println("running save in  egg repo");
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
		entityManager.close();
		

		return false;
	}

}
