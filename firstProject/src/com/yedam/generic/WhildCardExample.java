package com.yedam.generic;

// Course는 generic 타입을 받도록 하는데 그 중 누구를 받느냐에 대한 제한?을 하는 것이 와일드카드 타입
public class WhildCardExample {
	// <?> : 매개값으로 올 수 있는 Course 타입이으로 모든 타입의 클래스를 받겠다.
	public static void registerCourse(Course<?> cour) {

	}

	// 매개값으로 올 수 있는 Course 타입이 Student 클래스 / Student 클래스를 상속받는 하위 클래스(HighStudent)
	// Course<Student>, Course<HighStudent>
	public static void registerCourseStudent(Course<? extends Student> cour) {

	}

	// Worker 클래스이거나 Worker 클래스보다 상위에있는 클래스(Person 같은)
	// Course<Worker>, Course<Person>
	public static void registerCourseWorker(Course<? super Worker> cour) {

	}

	public static void main(String[] args) {
		Course<Person> crsPerson = new Course<>("일반인과정", 5);
		crsPerson.add(new Person("일반인1"));
		crsPerson.add(new Worker("직장인1"));
		crsPerson.add(new Student("학생1"));
		crsPerson.add(new HighStudent("고등학생1"));
		
		Course<Worker> crsWorker = new Course<>("직장인과정", 5);
//		crsWorker.add(new Person("일반인2"));	// type 안맞아 ERROR. 상위는 x
		crsWorker.add(new Worker("직장인2"));	// Worker나 Worker 하위
		
		Course<Student> crsStudent = new Course<>("학생과정", 5);
		crsStudent.add(new Student("학생2"));	
		crsStudent.add(new HighStudent("고등학생2"));	// Student나 Student 하위
		
		Course<HighStudent> crsHighStudent = new Course<>("고등학생과정", 5);
		crsHighStudent.add(new HighStudent("고등학생3"));

		// 일반인 등록 가능. 매개값으로 받을 수 있는 generic 타입이 모두 가능
		registerCourse(crsPerson);
		registerCourse(crsWorker);
		registerCourse(crsStudent);
		registerCourse(crsHighStudent);

		// 직장인 등록 가능. Course<? super Worker>. Worker / Worker 상위 클래스
		registerCourseWorker(crsPerson);
		registerCourseWorker(crsWorker);
//		registerCourseWorker(crsStudent);	// 타입이 맞지 않아 ERROR
//		registerCourseWorker(crsHighStudent);	// 타입이 맞지 않아 ERROR

		// 학생 등록 가능. Student / Student 상속받는 하위 클래스
		registerCourseStudent(crsStudent);
		registerCourseStudent(crsHighStudent);

		// 고등학생 등록 가능
	}
}
