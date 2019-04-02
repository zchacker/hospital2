/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital2;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author user00
 */
public class Program {
    public static void main(String args[]){
        ArrayList<Administration> admins = new ArrayList<Administration>();
        //ArrayList<Nurse> nurses = new ArrayList<Nurse>();
        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        ArrayList<Patients> patients = new ArrayList<Patients>();
        ArrayList<Service> services = new ArrayList<Service>();  
        
        // add three admins
        admins.add(new Administration("admin", 1, "salwa", "makkah", "0500000", "email@gmail.com", 8500));
        admins.add(new Administration("admin", 2, "ahmed", "makkah", "0500000", "email@gmail.com", 8500));
        admins.add(new Administration("admin", 3, "rana", "makkah", "0500000", "email@gmail.com", 8500));
        
        boolean loggedin = false;
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.print("Enter name: ");
            String name = scan.next();
            
            // search for name in admins collection
            for(int i = 0; i < admins.size(); i++){
                if(admins.get(i).getName().equals(name)){
                   loggedin = true;
                   break;
                }
            }            
        }while(loggedin == false);
        
        
        int ans = 0;
        do{
            System.out.println("1) Add doctor\n2) Add patients\n3) Add services\n4) add service for patient\n5)Print the patient’s bill\n6) Print the doctor information\n7) Print the patient information\n8) Exit the program");
           
            try{
                ans = scan.nextInt();

                if(ans == 1){
                    // add doctor
                    int ID;
                    String name;
                    String address;
                    String phone;
                    String email;
                    int salary;
                    String specialty;
                    int rank;
                    Nurse nurse;
                    
                    System.out.print("ID : ");
                    ID = scan.nextInt();
                    System.out.print("name : ");
                    name = scan.next();
                    System.out.print("Address : ");
                    address = scan.next();
                    System.out.print("Phone : ");
                    phone = scan.next();
                    System.out.print("Email : ");
                    email = scan.next();
                    System.out.print("Salary : ");
                    salary = scan.nextInt();
                    System.out.print("specialty : ");
                    specialty = scan.next();
                    System.out.print("rank : ");
                    rank = scan.nextInt();
                    
                    System.out.println("nurse information : ");
                    
                    int ID2;
                    String name2;
                    String address2;
                    String phone2;
                    String email2;
                    int salary2;
                    String specialty2;
                    int rank2;
                    
                    System.out.print("ID : ");
                    ID2 = scan.nextInt();
                    System.out.print("name : ");
                    name2 = scan.next();
                    System.out.print("Address : ");
                    address2 = scan.next();
                    System.out.print("Phone : ");
                    phone2 = scan.next();
                    System.out.print("Email : ");
                    email2 = scan.next();
                    System.out.print("Salary : ");
                    salary2 = scan.nextInt();
                    System.out.print("specialty : ");
                    specialty2 = scan.next();
                    System.out.print("rank : ");
                    rank2 = scan.nextInt();
                    
                    // معلومات المرضة
                    Nurse nurse_object = new Nurse(specialty2, rank2, ID2, name2, address2, phone2, email2, salary2);
                    // معلومات الطبيب
                    Doctor doctor = new Doctor(specialty, rank, nurse_object, ID, name, address, phone, email, salary);
                    
                    // اضافة الطبيب لقائمة الاطباء
                    doctors.add(doctor);
                    
                }else if(ans == 2){
                    // هنا اضافة المريض
                    int ID;
                    String name;
                    String address;
                    String phone;
                    String email;
                    int salary;
                    String type;
                    
                    System.out.print("ID : ");
                    ID = scan.nextInt();
                    System.out.print("name : ");
                    name = scan.next();
                    System.out.print("Address : ");
                    address = scan.next();
                    System.out.print("Phone : ");
                    phone = scan.next();
                    System.out.print("Email : ");
                    email = scan.next();
                    System.out.print("Salary : ");
                    salary = scan.nextInt();
                    System.out.print("Type : ");
                    type = scan.next();
                    
                    // اضافة المريض لقائمة المستشفى
                    Patients patient = new Patients(ID, name, address, phone, email, salary, type);
                    patients.add(patient);
                    
                }else if(ans == 3){
                    // هنا اضافة الخدمات
                    int ID;
                    String name;
                    int price;
                    
                    System.out.print("ID : ");
                    ID = scan.nextInt();
                    System.out.print("Name : ");
                    name = scan.next();
                    System.out.print("Price : ");
                    price = scan.nextInt();
                    
                    Service service = new Service(ID, name, price);
                    services.add(service);
                    
                }else if(ans == 4){      
                    
                    // هنا نضيف الخدمة للمريضس
                    int patient_index = -1;
                   
                    // اولا نختار المريض 
                    System.out.print("enter patient name : ");
                    String name = scan.next();
                    // نبحث عن المريض فس المصفوفة
                    for(int i = 0; i < patients.size(); i++){
                        if(patients.get(i).getName().equals(name)){
                            patient_index = i;
                            break;
                        }
                    }
                    
                    if(patient_index == -1){
                        System.out.println("Not found");
                    }else{
                        // عرض جميع الخدمات المتاحة
                        for(int i = 0; i < services.size(); i++){
                            // حتى نحسب الخصم 
                            // نضرب  المبلغ الاجمالي في  
                            // 25
                            // ثم نقسم على  
                            // 100
                            // بعدها ينتج لنا العدد الذي يمثل النسبة 
                            // نقوم بخصمه من المبلغ الكبير الاجمالي فنحصل على الاجمالي بعد الخصم
                            int discount = ((25 * services.get(i).getPrice()) / 100);// هنا نحسب كم المبلغ المطلوب خصمة 
                            int total_after_discount = services.get(i).getPrice() - discount;
                            
                            if(patients.get(patient_index).getType().equals("a"))
                                System.out.println(i + ") Name : " + services.get(i).getName() + " --- " + services.get(i).getPrice() + " SR after discount = " + total_after_discount + " SR" );
                            else
                                System.out.println(i + ") Name : " + services.get(i).getName() + " --- " + services.get(i).getPrice() + " SR" );
                        }
                        
                        System.out.print("choose service : ");
                        int service_number = scan.nextInt();                                                
                        
                        // هذا اوبجيكت نسخة من الذي اختاره المستخدم
                        Service modified_service = services.get(service_number);
                        
                        if(patients.get(patient_index).getType().equals("a")){
                            // هنا نعدل على السعر بعد الخصيم اذا كان المريض من نوع أ
                            int discount = ((25 * modified_service.getPrice()) / 100);// هنا نحسب كم المبلغ المطلوب خصمة 
                            int total_after_discount = modified_service.getPrice() - discount;// اجمالي المبلغ بعد الخصم
                            modified_service.setPrice(total_after_discount); 
                        }
                        
                        patients.get(patient_index).getServices().add(modified_service);
                    }
                    
                }else if(ans == 5){
                     // هنا نضيف الخدمة للمريضس
                    int patient_index = -1;
                   
                    // اولا نختار المريض 
                    System.out.print("enter patient name : ");
                    String name = scan.next();
                    // نبحث عن المريض فس المصفوفة
                    for(int i = 0; i < patients.size(); i++){
                        if(patients.get(i).getName().equals(name)){
                            patient_index = i;
                            break;
                        }
                    }
                    
                    if(patient_index == -1){
                        System.out.println("Not found");
                    }else{
                        // هنا طباعة الفاتورة للمريض
                        int total = 0;
                        for(int i = 0 ; i < patients.size(); i++){
                            System.out.println("Service Name : " + patients.get(patient_index).getServices().get(i).getName() + " --- " + patients.get(patient_index).getServices().get(i).getPrice());
                        }
                        System.out.println("Total: " + total);
                    }
                    
                    
                }else if(ans == 6){
                    // طباعة معلومات الاطباء
                    for(int i = 0 ; i < doctors.size(); i++){
                        System.out.println("id : " + doctors.get(i).getID());
                        System.out.println("name : " + doctors.get(i).getName());
                        System.out.println("address : " + doctors.get(i).getAddress());
                        System.out.println("phone : " + doctors.get(i).getPhone());
                        System.out.println("email : " + doctors.get(i).getEmail());
                        System.out.println("salary : " + doctors.get(i).getSalary());
                        System.out.println("specialty : " + doctors.get(i).getSpecialty());
                        System.out.println("rank : " + doctors.get(i).getRank());
                        
                        System.out.println("*******************************************");
                        System.out.println("Nurse info : ");
                        System.out.println("id : " + doctors.get(i).getNurse().getID());
                        System.out.println("name : " + doctors.get(i).getNurse().getName());
                        System.out.println("address : " + doctors.get(i).getNurse().getAddress());
                        System.out.println("phone : " + doctors.get(i).getNurse().getPhone());
                        System.out.println("email : " + doctors.get(i).getNurse().getEmail());
                        System.out.println("salary : " + doctors.get(i).getNurse().getSalary());
                        System.out.println("specialty : " + doctors.get(i).getNurse().getSpecialty());
                        System.out.println("*******************************************");
                    }
                    
                }else if(ans == 7){
                    // طباعة معلومات المرضى
                    
                    for(int i = 0; i < patients.size(); i++){
                        System.out.println("id : " + patients.get(i).getID());
                        System.out.println("name : " + patients.get(i).getName());
                        System.out.println("address : " + patients.get(i).getAddress());
                        System.out.println("phone : " + patients.get(i).getPhone());
                        System.out.println("email : " + patients.get(i).getEmail());
                        System.out.println("type : " + patients.get(i).getType());
                    }
                }else if(ans == 8){
                    System.out.println("Thanks for using hospital app");
                    System.exit(1);
                }else{

                }
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }while(ans != 7);
    }
}
