package maping.project;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class StartApp {

	
	public static SessionFactory noXmlORMConfiguration_v1() throws FileNotFoundException, IOException {
		Configuration config = new Configuration();
		Properties props = new Properties();
		props.load(new FileReader("db.properties"));
		config.setProperties(props);	
		
		
		
		
		config.addAnnotatedClass(Address.class);
		config.addAnnotatedClass(Course.class);
		config.addAnnotatedClass(College.class);
		config.addAnnotatedClass(Dept.class);
		config.addAnnotatedClass(Student.class);
		config.addAnnotatedClass(Professors.class);
		
		ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		return config.buildSessionFactory(registry);
	}
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		SessionFactory sfactory = noXmlORMConfiguration_v1();
		
		System.out.println(sfactory);
		//Data
		//Student
	
		Address cad=new Address(102,"Pune","MH",413045);		//int adrId, String city, String state, int pincode
		List<Dept> ld=new ArrayList<Dept>();
		List<Professors> lp=new ArrayList<Professors>();
		List<Student> ls=new ArrayList<Student>();
		
		List<Course> deptCourse=new ArrayList<Course>();
		Course c1=new Course(51,"Java",40000,ls,lp);
		Course c2=new Course(52,"Angular",45000,ls,lp);
		Course c3=new Course(53,"React",65000,ls,lp);
		
		deptCourse.add(c1);
		deptCourse.add(c2);
		deptCourse.add(c3);
		
		List<Course> cseCourse=new ArrayList<Course>();
		Course cse1=new Course(21,"Asp",40000,ls,lp);
		Course cse2=new Course(22,"Angular",45000,ls,lp);
		Course cse3=new Course(23,"JSP",65000,ls,lp);

		cseCourse.add(cse1);
		cseCourse.add(cse2);
		cseCourse.add(cse3);

		List<Course> mechCourse=new ArrayList<Course>();
		Course mech1=new Course(31,"CAD",40000,ls,lp);
		Course mech2=new Course(32,"TOM",45000,ls,lp);
		Course mech3=new Course(33,"SOM",65000,ls,lp);

		mechCourse.add(mech1);
		mechCourse.add(mech2);
		mechCourse.add(mech3);

		List<Course> itCourse=new ArrayList<Course>();
		Course it1=new Course(41,"Bussiness Intelligence",40000,ls,lp);
		Course it2=new Course(42,"Cyber Security",45000,ls,lp);
		Course it3=new Course(43,"Governance",65000,ls,lp);

		itCourse.add(it1);
		itCourse.add(it2);
		itCourse.add(it3);

		
		
		//int courseId, String courseName, double courseFees, List<Student> students,
		// List<Professors> professors
		
		
		List<Course> studCourse1=new ArrayList<Course>();
		studCourse1.add(c1);
		studCourse1.add(c2);
		
		List<Course> studCourse2=new ArrayList<Course>();
		studCourse2.add(c1);
		studCourse2.add(c3);
		
		List<Course> studCourse3=new ArrayList<Course>();
		studCourse3.add(c2);
		studCourse3.add(c3);
		
		Address sad1=new Address(11,"Kolhapur","MH",416010);
		Address sad2=new Address(12,"Latur","MH",418010);
		Address sad3=new Address(13,"Usmanabad","MH",416011);
		
		
		Student s1= new Student(1111,"Madhuri",25000,25,studCourse1,sad1);//int studId, String studName, double studFees, int studAge, List<Course> courses,
		Student s2= new Student(1112,"Bharat",30000,23,studCourse2,sad2);
		Student s3= new Student(1113,"Amol",27000,23,studCourse3,sad3);
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		
		
		Address pad1=new Address(201,"Pune5","MH",413045);
		Address pad2=new Address(202,"Pune1","MH",413045);
		Address pad3=new Address(203,"Pune2","MH",413045);
		
		
		
		
		List<Course> profCourse1=new ArrayList<Course>();
		Course profCourses1=new Course(91,"Java",440000,ls,lp);
		Course profCourses2=new Course(92,"Angular",30000,ls,lp);
		profCourse1.add(profCourses1);
		profCourse1.add(profCourses2);
		
		List<Course> profCourse2=new ArrayList<Course>();
		Course profCourses3=new Course(93,"Angular",25000,ls,lp);
		Course profCourses4=new Course(94,"React",85000,ls,lp);
		profCourse2.add(profCourses3);
		profCourse2.add(profCourses4);
		
		List<Course> profCourse3=new ArrayList<Course>();
		Course profCourses5=new Course(95,"Java",65000,ls,lp);
		Course profCourses6=new Course(96,"Angular",67000,ls,lp);
		profCourse3.add(profCourses5);
		profCourse3.add(profCourses6);
		
		Professors p1=new Professors(1101,"Bharati",75000.00,8,pad1,profCourse1);	//int profId, String profName, profFees, yearOfExp, Address address,List<Course> courses
		Professors p2=new Professors(1102,"Ganesh",85000.00,10,pad2,profCourse2);
		Professors p3=new Professors(1103,"Manoday",76000.00,5,pad3,profCourse3);
		lp.add(p1);
		lp.add(p2);
		lp.add(p3);
		
		
		List<Student> csestud=new ArrayList<Student>();
		Student csestud1= new Student(1511,"XX",20000,30,studCourse1,sad1);//int studId, String studName, double studFees, int studAge, List<Course> courses,
		Student csestud2= new Student(1412,"HH",18000,22,studCourse2,sad2);
		csestud.add(csestud1);
		csestud.add(csestud2);

		
		
		List<Student> mechstud=new ArrayList<Student>();
		Student mechstud1= new Student(12111,"AAA",25000,25,studCourse1,sad1);//int studId, String studName, double studFees, int studAge, List<Course> courses,
		Student mechstud2= new Student(2112,"BBBB",30000,23,studCourse2,sad2);
		mechstud.add(mechstud1);
		mechstud.add(mechstud2);
		
		
		List<Student> itstud=new ArrayList<Student>();
		Student itstud1= new Student(4111,"KKK",21000,25,studCourse1,sad1);//int studId, String studName, double studFees, int studAge, List<Course> courses,
		Student itstud2= new Student(5112,"TTTT",78000,33,studCourse2,sad2);
		itstud.add(itstud1);
		itstud.add(itstud2);
		
		
		Dept d1=new Dept("cse01","CSE",csestud,lp,cseCourse);		//Str deptCode, Str deptName, students,  professors, courses
		Dept d2=new Dept("Mech01","Mechanical",mechstud,lp,mechCourse);
		Dept d3=new Dept("IT01","IT",itstud,lp,itCourse);
		ld.add(d1);
		ld.add(d2);
		ld.add(d3);
		
		College college=new College(102,"BVCOEK",ld,cad);  //int collegeId, String collegeName, List<Dept> departments, Address address
		//college = (Cascade=Dept(Cascade = Professor, Students & course) & Address)
		
		org.hibernate.Session session=sfactory.openSession();
		org.hibernate.Transaction tr= session.beginTransaction();
		
		session.save(college);
		
		session.flush();
		tr.commit();
		session.close();
	}
	
}

