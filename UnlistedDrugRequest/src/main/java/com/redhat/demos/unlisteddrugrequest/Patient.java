package com.redhat.demos.unlisteddrugrequest;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Patient implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("First Name")
   private java.lang.String firstName;
   @org.kie.api.definition.type.Label("Last Name")
   private java.lang.String lastName;
   @org.kie.api.definition.type.Label("Age")
   private java.lang.Integer age;

   @org.kie.api.definition.type.Label("Email")
   private java.lang.String email;

   @org.kie.api.definition.type.Label("Phone")
   private java.lang.String phone;

   @org.kie.api.definition.type.Label("Address")
   private com.redhat.demos.unlisteddrugrequest.Address address;

   @org.kie.api.definition.type.Label(value = "Health Number")
   private java.lang.String healthNumber;

   @org.kie.api.definition.type.Label(value = "Health Canada Approved?")
   private boolean healthCanadaApproved;

   public Patient()
   {
   }

   public java.lang.String getFirstName()
   {
      return this.firstName;
   }

   public void setFirstName(java.lang.String firstName)
   {
      this.firstName = firstName;
   }

   public java.lang.String getLastName()
   {
      return this.lastName;
   }

   public void setLastName(java.lang.String lastName)
   {
      this.lastName = lastName;
   }

   public java.lang.Integer getAge()
   {
      return this.age;
   }

   public void setAge(java.lang.Integer age)
   {
      this.age = age;
   }

   public java.lang.String getEmail()
   {
      return this.email;
   }

   public void setEmail(java.lang.String email)
   {
      this.email = email;
   }

   public java.lang.String getPhone()
   {
      return this.phone;
   }

   public void setPhone(java.lang.String phone)
   {
      this.phone = phone;
   }

   public com.redhat.demos.unlisteddrugrequest.Address getAddress()
   {
      return this.address;
   }

   public void setAddress(com.redhat.demos.unlisteddrugrequest.Address address)
   {
      this.address = address;
   }

   public java.lang.String getHealthNumber()
   {
      return this.healthNumber;
   }

   public void setHealthNumber(java.lang.String healthNumber)
   {
      this.healthNumber = healthNumber;
   }

   public boolean isHealthCanadaApproved()
   {
      return this.healthCanadaApproved;
   }

   public void setHealthCanadaApproved(boolean healthCanadaApproved)
   {
      this.healthCanadaApproved = healthCanadaApproved;
   }

   public Patient(java.lang.String firstName, java.lang.String lastName,
         java.lang.Integer age, java.lang.String email, java.lang.String phone,
         com.redhat.demos.unlisteddrugrequest.Address address,
         java.lang.String healthNumber, boolean healthCanadaApproved)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.email = email;
      this.phone = phone;
      this.address = address;
      this.healthNumber = healthNumber;
      this.healthCanadaApproved = healthCanadaApproved;
   }

}