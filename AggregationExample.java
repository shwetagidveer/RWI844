public class AggregationExample {    
    // declare variables  
    int empId;    
    String empName;    
    Address empAddress;    
      
    // initialize variables using constructor  
    public AggregationExample(int empId, String empName, Address empAddress) {    
        this.empId = empId;    
        this.empName = empName;    
        this.empAddress = empAddress;    
    }    

    // create display() method for showing data  
    void display(){    
        System.out.println("Employee Id: "+empId);  
        System.out.println("Employee Name: "+empName);    
        System.out.println("Address: "+empAddress.street+" "+empAddress.city+"        "+empAddress.state+" "+empAddress.zip+" "+empAddress.country);    
    }  
  
    // main() method start  
    public static void main(String[] args) {   
        // create objects of Address class  
        Address add1 = new Address("Kondhava","Swargate","SSG", "412056", "Pune");    
        Address add2 = new Address("Bavdhan", "Shivaji Chowk","EOD", "411058",        "Pune");    
          
        // create object of AggregationExample by passing value to the constructor  
        AggregationExample employee1 = new AggregationExample(RWI01, "Shweta",         add1);    
        AggregationExample employee2 = new AggregationExample(RWI02, "Pooja", add2);    
        // show data to the users  
        employee1.display();    
        employee2.display();            
    }    