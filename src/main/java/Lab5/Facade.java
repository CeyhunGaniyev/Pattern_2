package Lab5;

public class Facade {

    private final CreditService creditService;
    private  final CustomerService customerService;
    private final SanctionService sanctionService;
    private final WorkExperienceService workExperienceService;

    public Facade() {
        this.creditService = new CreditService();
        this.customerService = new CustomerService();
        this.sanctionService = new SanctionService();
        this.workExperienceService = new WorkExperienceService();
    }

    public void buyCredit (String id, int age, double salary,int experience){

        if (!customerService.validateCustomer(age)){
            System.out.println("Age validation failed");
            return;
        }

        if (!workExperienceService.validateExperience(experience)){
            System.out.println("Experience validation failed");
            return;
        }

        if (!sanctionService.validateSanction(id)){
            System.out.println("Sanction validation failed");
            return;
        }

        creditService.createCredit(id);
    }

}
