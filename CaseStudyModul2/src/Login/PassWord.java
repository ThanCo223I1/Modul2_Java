package Login;

import Fashion.Validate;

public class PassWord {
    Validate validate = new Validate();
}

//    public Order createOrder(Admin employee) {
//        List<Customer> customers = ManagerCustomer.readDataFromFile();
//        List<Product> products = new ArrayList<>();
//        System.out.println("Enter nameCustomer : ");
//        String nameCustomer;
//        while (true) {
//            System.out.println("Enter Name Customer: ");
//            String inputName = scanner.nextLine();
//            if (validate.isValidateInputString(inputName, Validate.Name_PATTERN)) {
//                nameCustomer = inputName;
//                break;
//            } else System.out.println("Not validate!");
//        }
//        Customer customer;
//        for (Customer customer1 : customers) {
//            if (customer1.getName().equals(nameCustomer)) {
//                customer = customer1;
//                return new Order(products, employee, customer);
//            }
//        }
//        System.out.println("Not found NameCustomer!");
//        customer = managerCustomer.creatCustomer();
//        return new Order(products, employee, customer);
//    }