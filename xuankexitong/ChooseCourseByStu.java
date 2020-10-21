package xuankexitong;

public class ChooseCourseByStu {
	
	// ѧ��ѡ��
	public static boolean addStudent(Student stu,Course c) {
		if(c.hasStudent(stu)) return false;
		stu.setCourse(c);
		c.addStudent(stu);
		return true;
	}

	// ���Ƴ�ѧ��
	public static boolean removeStudent(Student stu,Course c) {
		if(!c.hasStudent(stu)) return false;
		c.rmStudent(stu);
		stu.setCourse(null);
		return true;
	}

	// ��ʾѡ��γ̵�ѧ����
	public static void displayStudent(Course c) {
		System.out.println("ѡ��Ŀγ̣�" + c.getName() + "��ѧ����:");
		for (Student s : c.getStudents()) {
			System.out.print(s.getName() + " ");
		}
		System.out.println();
	}

	 
	 /**
	  * ѡ�ι���ϵͳ
	  */
	 public static void main(String[] args) {
		 Student stu1 = new Student("1001","Lily","Ů");
		 Student stu2 = new Student("1002","Eilly","Ů");
		 Student stu3 = new Student("1003","Floris","��");
		 
		 Teacher tea1 = new Teacher("2001","zhangsan","��");
		 Teacher tea2 = new Teacher("2002","lisi","Ů");
		 Teacher tea3 = new Teacher("2003","wangwu","��");
	
		 Course c1 = new Course(101,"����","300","����9��",tea1);
		 Course c2 = new Course(102,"�ߴ�","301","����11��",tea2);
		 Course c3 = new Course(103,"������","302","����1��",tea3);
		 
		 addStudent(stu1,c1);
		 System.out.println(c1);
		 
		 removeStudent(stu1,c1);
		 System.out.println(c1);
		 
//	  Student stu0 = new Student(1001,"Lily");
//	  Student stu1 = new Student(1002,"Eilly");
////	  Student stu2 = new Student(1003,"Floris");
//	  Student stu3 = new Student(1004,"HaHa");
//	  Course cour0 = new Course(001,"����");
//	  Course cour1 = new Course(002,"�ߴ�");
////	  Course cour2 = new Course(003,"������");
//	  stu0.addCourse(cour0);
////	  stu0.addCourse(cour2);
//	  stu0.addCourse(cour1);
////	  stu1.addCourse(cour2);
////	  stu1.addCourse(cour0);
////	  stu2.addCourse(cour1);
////	  stu3.addCourse(cour0);
//	  stu3.addCourse(cour1);
////	  stu1.removeCourse(cour2);
//	  stu0.displayCourse();
//	  cour0.removeStudent(stu0);
//	  cour1.displayStudent();
	 }
	 
	}