package com.bandiClasses.DMS.repository;
/**
 * @author S564535 (Nithish Kumar Madavali)
 */
import java.util.List;



import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	
	List<Dog> findByName(String name);
	

}
