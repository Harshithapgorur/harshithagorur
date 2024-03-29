package com.xworkz.egg.repositary;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.egg.dto.EggDTO;
@Repository
public class EggRepositoryImpl implements EggResository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public EggRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(EggDTO dto) {
			System.out.println("Running save method");
			EntityManager entityManager = this.entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(dto);
			entityTransaction.commit();
			entityManager.close();
			return true;
		}
	}





