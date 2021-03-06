package com.redhat.demos.unlisteddrugrequest;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DrugRequest implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("DIN")
   private Drug din;
   @org.kie.api.definition.type.Label("Start Date")
   private java.lang.String startDate;

   public DrugRequest()
   {
   }

   public java.lang.String getStartDate()
   {
      return this.startDate;
   }

   public void setStartDate(java.lang.String startDate)
   {
      this.startDate = startDate;
   }

   public com.redhat.demos.unlisteddrugrequest.Drug getDin()
   {
      return this.din;
   }

   public void setDin(com.redhat.demos.unlisteddrugrequest.Drug din)
   {
      this.din = din;
   }

   public DrugRequest(com.redhat.demos.unlisteddrugrequest.Drug din,
         java.lang.String startDate)
   {
      this.din = din;
      this.startDate = startDate;
   }

}