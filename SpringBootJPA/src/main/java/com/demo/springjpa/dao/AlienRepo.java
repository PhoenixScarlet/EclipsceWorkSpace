package com.demo.springjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.demo.springjpa.model.Alien;

/** for CURD Operations**/
//public interface AlienRepo extends CrudRepository<Alien,Integer> {
	

/** Data JPA | MVC | H2 | Query Methods**/
/*List<Alien> findByTech(String tech);

List<Alien> findByAidGreaterThan(int aid); 

@Query("from Alien where tech=?1 order by aname")
List<Alien> findByTechSorted(String tech);*/ 

//}

/**Data JPA | MVC | H2 | REST Example**/
/**JpaRepository extends CrudRepository,it has all features of CurdRepository +Extra features **/
/**Main feature is List while in Curd it returns as iterable**/
public interface AlienRepo extends JpaRepository<Alien,Integer>
{
	
}

