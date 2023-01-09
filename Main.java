import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;

class Main {

   public static void main(String[] args)
   {
      //Student = new Student();
      //Supervisor = new Supervisor();

      int nim[] = {2000, 1000, 3000, 4000};
      String nama[] = {"Hana", "Nadd", "Caca", "Mim"};
      String alamat[] = {"a", "as", "bd", "sbd"};
      String sekolah[] = {"v", "2", "av", "sb"};
      String warna[] = {"k", "d", "la", "sb"};

      //create arraylist Student
      ArrayList<Student> student = new ArrayList<>();
      ArrayList<Supervisor> supervisor = new ArrayList<>();

      // for (int i = 0; i < 4; i++) {
      //    student.add(new Student(nim[i], nama[i], alamat[i], sekolah[i], warna[i]));
      // }
      
      student.add(new Student(2000, "Hana", "Gerum", "UPI", "Pink"));
      student.add(new Student(1000, "Nadd", "Smi", "UPI", "Biru"));
      student.add(new Student(3000, "Caca", "Bandung", "UPI", "Putih"));
      student.add(new Student(4000, "Mim", "Jakarta", "UPI", "Hitam"));
      
      supervisor.add(new Supervisor(121, "naa", "smi", "mhs", "Hijau"));
      supervisor.add(new Supervisor(122, "mim", "bdg", "mhs", "Coklat"));
      supervisor.add(new Supervisor(123, "caa", "jkt", "mhs", "Cream"));
      supervisor.add(new Supervisor(124, "laa", "sby", "mhs", "Navy"));
      
      System.out.println(student);
      System.out.println(supervisor);

      //Iterator
      Iterator<Student> it = student.iterator();
      Iterator<Supervisor> in = supervisor.iterator();

      //Print
      // int i=5;
      // while (it.hasNext()) {
      //    System.out.println(it.next());         
      //    System.out.println(i);
      //    i++;         
      // }

      for (int i = 0; i < 4; i++) {
         Student hana = student.get(i);
         System.out.println(hana.getNim() + " " + hana.getNama() + " " + hana.getAlamat() + " " + hana.getSekolah() + " " + hana.getWarna());
      }

      for (int i=0; i<4; i++){
         Supervisor mup = supervisor.get(i);
         System.out.println(mup.getId() + " " + mup.getNama() + " "+ mup.getAlamat() + " " + mup.getPekerjaan() + " " + mup.getWarna());
      }


      //create hashmap
      HashMap<Integer, String> latihanMap = new HashMap<Integer, String>();
      //HashMap<Integer, String> supervisorMap = new HashMap<Integer, String>(); 

      //student
      latihanMap.put(2000, "Hana");
      latihanMap.put(1000, "Nadd");
      latihanMap.put(3000, "Caca");
      latihanMap.put(4000, "Mim");
      latihanMap.put(400, "naa");
      latihanMap.put(122, "mim");
      latihanMap.put(123, "caa");
      latihanMap.put(124, "laa");

      for(int a : latihanMap.keySet()){
         System.out.println("Nama: "+ a + " " + "Kode: " + latihanMap.get(a));
      }
     
   }
}
