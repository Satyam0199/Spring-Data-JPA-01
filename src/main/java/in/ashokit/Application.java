package in.ashokit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.ashokit.entity.Person;
import in.ashokit.entity.Product;
import in.ashokit.entity.Student;
import in.ashokit.repository.PersonRepository;
import in.ashokit.repository.ProductRepository;
import in.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		// StudentRepository studentRepository =
		// context.getBean(StudentRepository.class);
//==============================Add single Data=========================================
//	Student st= new Student();
//	st.setId(103);
//	st.setName("Atul");
//	st.setCity("Pune");
//	studentRepository.save(st);
//	System.out.println("Data Inserted..");

//	Student st= new Student();
//	st.setId(101);
//	st.setName("Deepa");
//	st.setCity("Pune");
//	studentRepository.save(st);
//	System.out.println("Data Inserted..");

		// ==============================Find By ID
		// ========================================= //get the result by the id
//	Optional<Student> optional =studentRepository.findById(102);
//	if(optional.isPresent())
//	{
//		System.out.println(optional.get());
//	}
//	
		// ==============================Find All
		// Data=========================================
		// get all the result;
//		Iterable<Student> findAll = studentRepository.findAll();
//		findAll.forEach(s -> System.out.println(s));
		// ==============================Delete By Id
		// Data=========================================
//	Delete result by id
//	if(studentRepository.existsById(999))
//	{
//		studentRepository.deleteById(999);
//		System.out.println("Deleted Data 103");
//		
//	}
//	else
//	{
//		System.out.println("No Data present");
//	}
		// ==============================Count
		// Data=========================================
//	long count = studentRepository.count();
//	System.out.println("Totle Data is "+ count);

//==============================Add all Data Person=========================================
		//PersonRepository repo = context.getBean(PersonRepository.class);
//	Person p1 = new Person(101,"Satyam","male");
//	Person p2 = new Person(102,"Deepa","female");
//	Person p3 = new Person(103,"Deepak","male");
//	Person p4 = new Person(104,"Jyoti","female");
//	Person p5 = new Person(105,"Ram","male");
//	
//	List<Person> li= Arrays.asList(p1,p2,p3,p4,p5);
//	repo.saveAll(li);
//	
		// ==============================Find Data which is Gender
		// male=========================================
//	List<Person> malePerson= repo.findByGender("female");
//	malePerson.forEach(System.out::println);
//	System.out.println("=======================================================================");
//	List<Person> findbyid = repo.findByIdGreaterThan(103);
//	findbyid.forEach(System.out::println);
//	

		// ==============================Save all the
		// data=========================================
//	Person p1 = new Person(101, "Satyam", "male");
//    Person p2 = new Person(102, "Priya", "female");
//    Person p3 = new Person(103, "Rahul", "male");
//    Person p4 = new Person(104, "Ananya", "female");
//    Person p5 = new Person(105, "Vikas", "male");
//    Person p6 = new Person(106, "Riya", "female");
//    Person p7 = new Person(107, "Amit", "male");
//    Person p8 = new Person(108, "Sneha", "female");
//    Person p9 = new Person(109, "Rohan", "male");
//    Person p10 = new Person(110, "Pooja", "female");
//    Person p11 = new Person(111, "Aman", "male");
//    Person p12 = new Person(112, "Neha", "female");
//    Person p13 = new Person(113, "Karan", "male");
//    Person p14 = new Person(114, "Shivani", "female");
//    Person p15 = new Person(115, "Arjun", "male");
//    Person p16 = new Person(116, "Divya", "female");
//    Person p17 = new Person(117, "Ravi", "male");
//    Person p18 = new Person(118, "Komal", "female");
//    Person p19 = new Person(119, "Sachin", "male");
//    Person p20 = new Person(120, "Anjali", "female");
//    
//    List<Person> li = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20);
//	repo.saveAll(li);

// ===========Pagenations in Spring Boot===============================

//		Scanner sobjr = new Scanner(System.in);
//		System.out.println("Enter Page Number");
//		int pageNo = sobjr.nextInt();
//		int pageSize = 5;
//
//		PageRequest page = PageRequest.of(pageNo - 1, pageSize);
//		Page<Person> findAll = repo.findAll(page);
//		List<Person> p = findAll.getContent();
//		p.forEach(System.out::println);

// ===========Sorting in Spring Boot===============================
//	List<Person> p = repo.findAll(Sort.by("name"));
//	p.forEach(System.out::println);

// ===========Query by Example in Spring Boot===============================

//		Person p = new Person();
//		p.setGender("male");
//		
//		Example<Person> ex = Example.of(p);
//		
//		List<Person> p1 = repo.findAll(ex);
//		p1.forEach(System.out::println);

//===========Using Custom Query in Spring Boot===============================

//		repo.deletePerson(120);
//		System.out.println("120 data deleted");
//===========================================================================

// Update Records with using custom query			
//	repo.updatePerson(114,"male");
//	System.out.println("Updated Records");

//===========================================================================
		
		ProductRepository productRepo=context.getBean(ProductRepository.class);
		Product p = new Product();
		p.setProductName("Keyboard");
		p.setProductPrice(500.00);
		productRepo.save(p);
		
		System.out.println("Data Inserted");
	

	}

}
