package Lab5;

public class CustomerService {

    public boolean validateCustomer (int age){
        if (age>=18 && age<=60){
            return true;
        }
        else{
            return false;
        }
    }
}
