package in.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.Person;
import jakarta.transaction.Transactional;

public interface PersonRepository extends JpaRepository<Person, Integer>{
	
//	public List<Person> findByGender(String gender);
//	
//	public List<Person> findByIdGreaterThan(Integer id);
	
// Delete Records with using custom query by id
//	@Query("delete from Person where id = :sid")
//	@Modifying
//	@Transactional
//	public void deletePerson(Integer sid);

	
// Update Records with using custom query	
//	@Query("update Person set gender=:gender where id=:sid")
//	@Modifying
//	@Transactional
//	public void updatePerson(Integer sid,String gender);

// Insert Records with using custom query	

	//    @Query(value="INSERT INTO Person (id,gender,name) VALUES (:id, :gender, :name)", nativeQuery = true)
	//public void insertPerson(Integer id, String name, String gender);
	
}
