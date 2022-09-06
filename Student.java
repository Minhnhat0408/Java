public class Student {
   
   private String name,id,group,email; // thuộc tính name
   // phương thức khởi tạo không tham số
   // getter cho thuộc tính name

   Student() {
      name = "Student";
      id = "000";
      group = "K62CB";
      email = "uet@vnu.edu.vn";
   }

   Student(String name, String id, String email) {
      group = "K62CB";
   }

   Student(Student s) {
      name = s.getName();
      id = s.getId();
      group = s.getGroup();
      email = s.getEmail();
   }
   public String getName() {
      return name;
   }

   // setter cho thuộc tính name
   public void setName(String n) {
      this.name = n;
   }

   public String getId() {
      return id;
   }

   // setter cho thuộc tính name
   public void setId(String n) {
      this.id = n;
   }
   public String getGroup() {
      return group;
   }

   // setter cho thuộc tính name
   public void setGroup(String n) {
      this.group = n;
   }
   public String getEmail() {
      return email;
   }

   // setter cho thuộc tính name
   public void setEmail(String n) {
      this.email = n;
   }

   
   String getInfo() {
      return name + " - " + id + " - " + group + " - " + email;
   }

   public static void main(String[] args) {
      Student s1 = new Student();
      Student s2 = new Student();
      System.out.println(s2.getInfo());
      s1.setName("Nguyen Van An");
      s1.setId("17020001");
      s1.setGroup("K62CC");
      s1.setEmail("17020001@vnu.edu.vn");
      System.out.println(s1.getInfo());

   }
}