package com.kg.springxml;

import org.springframework.stereotype.Component;

@Component
public class College {
    private int id,age;
    private String name,department;
    public College()
    {
        
    }
         public College(int id,String name,String department,int age)

         {
             this.id=id;
             this.age=age;
             this.department=department;
             this.name=name;
         }
         /**
          * @return the id
          */
         public int getId() {
             return id;
         }
         /**
          * @param id the id to set
          */
         public void setId(int id) {
             this.id = id;
         }
         /**
          * @return the age
          */
         public int getAge() {
             return age;
         }
         /**
          * @param age the age to set
          */
         public void setAge(int age) {
             this.age = age;
         }
         /**
          * @return the name
          */
         public String getName() {
             return name;
         }
         /**
          * @param name the name to set
          */
         public void setName(String name) {
             this.name = name;
         }
         /**
          * @return the department
          */
         public String getDepartment() {
             return department;
         }
         /**
          * @param department the department to set
          */
         public void setDepartment(String department) {
             this.department = department;
         }
}
