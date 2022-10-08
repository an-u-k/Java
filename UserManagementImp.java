package com.demo.repo;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.demo.bean.User;

public class UserManagementImp implements UserManagement {

	public void insertEntity() {
		// EntityManagerFactory
		
		EntityManagerFactory emf=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
		Scanner input=new Scanner(System.in);
		//start process
		try {
			emf=Persistence.createEntityManagerFactory("DemoUserDB");
			entityManager=emf.createEntityManager();
			transaction=entityManager.getTransaction();
			
			//start transaction
			transaction.begin();
			
			//create an object for professor
			User user=new User();
			
			//get input from user
			
		System.out.println("Enter UserName :");
		user.setuser(input.nextLine());
		
		System.out.println("Enter Password:");
		user.setUserPassword(input.nextLine());
		
		System.out.println("Enter role no:");
		user.setRoleId(Integer.parseInt(input.nextLine()));;
		
		System.out.println("Enter the date :");
		user.setCreatedDate(LocalDate.parse(input.nextLine()));
		
		
		//ORM
		entityManager.persist(user);
		//DB
		transaction.commit();
			
		}
		catch(Exception e) {
			transaction.rollback();
		}
		finally {
		emf.close();
		}

	}

	public void listOfEntities() {

		EntityManagerFactory emf=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
		Scanner input=new Scanner(System.in);
		try {
			
			emf=Persistence.createEntityManagerFactory("DemoUserDB");
			entityManager=emf.createEntityManager();
			//list all professors
			//jpql -java persistence query language
			
			List<User>users= entityManager.createQuery("from User").getResultList();
			
			for (User user : users) {
				System.out.println("user Id "+user.getUserId());
				System.out.println("Name"+user.getuser());
				System.out.println("role id "+user.getRoleId());
				System.out.println("date  "+user.getCreatedDate());
				
			}
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			entityManager.close();
			emf.close();
		}
		
	}

	
	
	public void updateEntity() {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
		Scanner input=new Scanner(System.in);
		try {
			
			emf=Persistence.createEntityManagerFactory("DemoUserDB");
			entityManager=emf.createEntityManager();
			transaction=entityManager.getTransaction();
			
			//start transaction
			transaction.begin();
			
			System.out.println("Enter user Id :");
			int id=Integer.parseInt(input.nextLine());
			
			//select from entity manager
			User pro=entityManager.find(User.class, id);// professorId
			
			//change first and last name 
			System.out.println("Enter the Name");
			pro.setuser(input.nextLine());
			
			
			//commit
			entityManager.getTransaction().commit();
			
			//after update
			System.out.println(pro);
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			entityManager.close();
			emf.close();
		}
		

	
	}

	public void deleteEntity() {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
		Scanner input=new Scanner(System.in);
		try {
			
			emf=Persistence.createEntityManagerFactory("DemoUserDB");
			entityManager=emf.createEntityManager();
			transaction=entityManager.getTransaction();
			
			//start transaction
			transaction.begin();
			
			System.out.println("Enter Id :");
			int id=Integer.parseInt(input.nextLine());
			
			//select from entity manager
			User pro=entityManager.find(User.class, id);// professorId
			
			//delete process
			entityManager.remove(pro);
			
			//commit
			entityManager.getTransaction().commit();
			
			//after update
			System.out.println("Record has been deleted");
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			entityManager.close();
			emf.close();
		}
		

	
		
	}

//	public void findEntity() {
//		// TODO Auto-generated method stub
//		EntityManagerFactory emf=null;
//		EntityManager entityManager=null;
//	
//		Scanner input=new Scanner(System.in);
//		try {
//			
//			emf=Persistence.createEntityManagerFactory("DemoEmpDB");
//			entityManager=emf.createEntityManager();
//			//list all professors
//			//jpql -java persistence query language
//			System.out.println("Enter Id");
//			System.out.println("Enter Professor Id :");
//			int id=Integer.parseInt(input.nextLine());
//			
//			//select from entity manager
//			User pro=entityManager.find(User.class, id);// professorId
//			pro.toString();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			entityManager.close();
//			emf.close();
//		}
//		
//	}

	public Optional<User> findByName(String name) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=null;
		EntityManager entityManager=null;
		
		Scanner input=new Scanner(System.in);
		try {
			
			emf=Persistence.createEntityManagerFactory("DemoEmpDB");
			entityManager=emf.createEntityManager();
			//list all professors
			//jpql -java persistence query language
			User professor=entityManager.createQuery("SELECT p FROM Professor p where p.firstName:name",User.class)
                    .setParameter("name",name)
                    .getSingleResult();
            
                    return (Optional<User>)(professor!=null?Optional.of(professor):Optional.empty());
		     
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			entityManager.close();
			emf.close();
		}
		return Optional.empty();
		
	}

	
}
