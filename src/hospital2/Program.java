/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author user00
 */
public class Program {

    public static void main(String args[]) {

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

        do {
            System.out.print("Enter name: ");
            String name = "";

            try {
                name = scan.next();
            } catch (Exception e) {
                e.printStackTrace();
            }

            // search for name in admins collection
            for (int i = 0; i < admins.size(); i++) {
                if (admins.get(i).getName().equals(name)) {
                    loggedin = true;
                    break;
                }
            }
        } while (loggedin == false);

        int ans = 0;
        do {
            System.out.println("1) Add doctor\n2) Add patients\n3) Add services\n4) add service for patient\n5)Print the patient’s bill\n6) Print the doctor information\n7) Print the patient information\n8) Order the Doctors salary\n9) Order Services Prices \n10) Exit the program");

            try {
                ans = scan.nextInt();

                if (ans == 1) {
                    // add doctor
                    int ID = 0;
                    String name = "";
                    String address = "";
                    String phone = "";
                    String email = "";
                    int salary = 0;
                    String specialty = "";
                    int rank = 0;
                    Nurse nurse = null;

                    System.out.print("ID : ");
                    try {
                        ID = scan.nextInt();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("name : ");
                    try {
                        name = scan.next();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("Address : ");
                    try {
                        address = scan.next();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("Phone : ");
                    try {
                        phone = scan.next();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("Email : ");
                    try {
                        email = scan.next();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("Salary : ");
                    try {
                        salary = scan.nextInt();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("specialty : ");
                    try {
                        specialty = scan.next();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("rank : ");
                    try {
                        rank = scan.nextInt();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.println("nurse information : ");

                    int ID2 = 0;
                    String name2 = "";
                    String address2 = "";
                    String phone2 = "";
                    String email2 = "";
                    int salary2 = 0;
                    String specialty2 = "";
                    int rank2 = 0;

                    System.out.print("ID : ");
                    try {
                        ID2 = scan.nextInt();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("name : ");
                    try {
                        name2 = scan.next();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("Address : ");
                    try {
                        address2 = scan.next();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("Phone : ");
                    try {
                        phone2 = scan.next();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("Email : ");
                    try {
                        email2 = scan.next();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("Salary : ");
                    try {
                        salary2 = scan.nextInt();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("specialty : ");
                    try {
                        specialty2 = scan.next();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("rank : ");
                    try {
                        rank2 = scan.nextInt();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    // معلومات المرضة
                    Nurse nurse_object = new Nurse(specialty2, rank2, ID2, name2, address2, phone2, email2, salary2);
                    // معلومات الطبيب
                    Doctor doctor = new Doctor(specialty, rank, nurse_object, ID, name, address, phone, email, salary);

                    // اضافة الطبيب لقائمة الاطباء
                    doctors.add(doctor);

                } else if (ans == 2) {
                    // هنا اضافة المريض
                    int ID =0;
                    String name = "";
                    String address = "";
                    String phone = "";
                    String email = "";
                    int salary = 0;
                    String type = "";

                    System.out.print("ID : ");
                    try {
                        ID = scan.nextInt();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("name : ");
                    try {
                        name = scan.next();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("Address : ");
                    try {
                        address = scan.next();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("Phone : ");
                    try {
                        phone = scan.next();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("Email : ");
                    try {
                        email = scan.next();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("Salary : ");
                    try {
                        salary = scan.nextInt();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.print("Type : ");
                    try {
                        type = scan.next();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    // اضافة المريض لقائمة المستشفى
                    Patients patient = new Patients(ID, name, address, phone, email, salary, type);
                    patients.add(patient);

                } else if (ans == 3) {
                    // هنا اضافة الخدمات
                    int ID = 0;
                    String name = "";
                    int price = 0;

                    System.out.print("ID : ");
                    try{
                        ID = scan.nextInt();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    
                    System.out.print("Name : ");
                    try{
                        name = scan.next();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    
                    System.out.print("Price : ");
                    try{
                        price = scan.nextInt();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    
                    System.out.println("Select a doctor for this service :- ");
                    
                    for(int i = 0 ; i < doctors.size(); i++){
                        System.out.println(i + ") " + doctors.get(i).getName());
                    }
                    
                    int doctorChoose = 0;
                    try{
                        doctorChoose = scan.nextInt();
                    }catch(Exception e){
                        e.printStackTrace();
                    }                            
                    
                    if(doctorChoose < doctors.size()){
                        Service service = new Service(ID, name, price, doctors.get(doctorChoose));
                        services.add(service); 
                    }else{
                        System.out.println("Pleas select right doctor!");
                    }
                                        

                } else if (ans == 4) {

                    // هنا نضيف الخدمة للمريضس
                    int patient_index = -1;

                    // اولا نختار المريض 
                    System.out.print("enter patient name : ");
                    String name = "";
                    
                    try{
                        scan.next();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                     
                    // نبحث عن المريض فس المصفوفة
                    for (int i = 0; i < patients.size(); i++) {
                        if (patients.get(i).getName().equals(name)) {
                            patient_index = i;
                            break;
                        }
                    }

                    if (patient_index == -1) {
                        System.out.println("Not found");
                    } else {
                        // عرض جميع الخدمات المتاحة
                        for (int i = 0; i < services.size(); i++) {
                            // حتى نحسب الخصم 
                            // نضرب  المبلغ الاجمالي في  
                            // 25
                            // ثم نقسم على  
                            // 100
                            // بعدها ينتج لنا العدد الذي يمثل النسبة 
                            // نقوم بخصمه من المبلغ الكبير الاجمالي فنحصل على الاجمالي بعد الخصم
                            int discount = ((25 * services.get(i).getPrice()) / 100);// هنا نحسب كم المبلغ المطلوب خصمة 
                            int total_after_discount = services.get(i).getPrice() - discount;

                            if (patients.get(patient_index).getType().equals("a")) {
                                System.out.println(i + ") Name : " + services.get(i).getName() + "--- Doctor Name : " + services.get(i).getDoctor().getName() + " --- " + services.get(i).getPrice() + " SR after discount = " + total_after_discount + " SR");
                            } else {
                                System.out.println(i + ") Name : " + services.get(i).getName() + "--- Doctor Name : " + services.get(i).getDoctor().getName() + " --- " + services.get(i).getPrice() + " SR");
                            }
                        }

                        System.out.print("choose service : ");
                        int service_number = 0;
                        
                        try{
                            scan.nextInt();
                        }catch(Exception e){
                            e.printStackTrace();
                        }

                        // هذا اوبجيكت نسخة من الذي اختاره المستخدم
                        Service modified_service = null;
                        
                        try{
                            services.get(service_number);
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                        

                        if (patients.get(patient_index).getType().equals("a")) {
                            // هنا نعدل على السعر بعد الخصيم اذا كان المريض من نوع أ
                            int discount = ((25 * modified_service.getPrice()) / 100);// هنا نحسب كم المبلغ المطلوب خصمة 
                            int total_after_discount = modified_service.getPrice() - discount;// اجمالي المبلغ بعد الخصم
                            modified_service.setPrice(total_after_discount);
                        }

                        patients.get(patient_index).getServices().add(modified_service);
                    }

                } else if (ans == 5) {
                    // هنا نختار المريض حتى نطبع له الفاتورة
                    int patient_index = -1;

                    // اولا نختار المريض 
                    System.out.print("enter patient name : ");
                    String name = "";
                    
                    try{
                        scan.next();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    
                    // نبحث عن المريض فس المصفوفة
                    for (int i = 0; i < patients.size(); i++) {
                        if (patients.get(i).getName().equals(name)) {
                            patient_index = i;
                            break;
                        }
                    }

                    if (patient_index == -1) {
                        System.out.println("Not found");
                    } else {
                        System.out.println("************** The Bill *************");
                        // هنا طباعة الفاتورة للمريض
                        int total = 0;
                        for (int i = 0; i < patients.size(); i++) {
                            System.out.println("Service Name : " + patients.get(patient_index).getServices().get(i).getName() + " --- " + patients.get(patient_index).getServices().get(i).getPrice() + " SR");
                        }
                        
                        System.out.println("*********************");
                        System.out.println("Total: " + total);
                        System.out.println("*********************");
                    }

                } else if (ans == 6) {
                    // طباعة معلومات الاطباء
                    for (int i = 0; i < doctors.size(); i++) {
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

                } else if (ans == 7) {
                    // طباعة معلومات المرضى

                    for (int i = 0; i < patients.size(); i++) {
                        System.out.println("id : " + patients.get(i).getID());
                        System.out.println("name : " + patients.get(i).getName());
                        System.out.println("address : " + patients.get(i).getAddress());
                        System.out.println("phone : " + patients.get(i).getPhone());
                        System.out.println("email : " + patients.get(i).getEmail());
                        System.out.println("type : " + patients.get(i).getType());
                    }
                }else if(ans == 8){
                    // order doctors
                       // i get this code from this website 
                    // https://dzone.com/articles/sorting-java-arraylist
                    
                    // order services
                    ArrayList<Doctor> sorted_doctors = new ArrayList<Doctor>();
                    
                    // copy array to sort it
                    for(int i = 0; i < doctors.size(); i++){
                        sorted_doctors.add(doctors.get(i));
                    }
                    
                    Collections.sort(sorted_doctors , Collections.reverseOrder());
                    
                    System.out.println("****** Ordered Doctors by salary **********");
                    // print it 
                    for(int i = 0 ; i < sorted_doctors.size(); i++){
                        System.out.println("Doctor Name : " + sorted_doctors.get(i).getName() + " --- " + sorted_doctors.get(i).getSalary()+ " SR " );
                    }
                    
                }else if(ans == 9){
                    
                    // i get this code from this website 
                    // https://dzone.com/articles/sorting-java-arraylist
                    
                    // order services
                    ArrayList<Service> sorted_serviecs = new ArrayList<Service>();
                    
                    // copy array to sort it
                    for(int i = 0; i < services.size(); i++){
                        sorted_serviecs.add(services.get(i));
                    }
                    
                    Collections.sort(sorted_serviecs , Collections.reverseOrder());
                    
                    System.out.println("****** Ordered Servies by price **********");
                    // print it 
                    for(int i = 0 ; i < sorted_serviecs.size(); i++){
                        System.out.println("Service Name : " + sorted_serviecs.get(i).getName() + " --- " + sorted_serviecs.get(i).getPrice() + " SR " );
                    }
                    
                }else if (ans == 10) {
                    System.out.println("Thanks for using hospital app");
                    System.exit(1);
                } else {

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (ans != 7);
    }
}
