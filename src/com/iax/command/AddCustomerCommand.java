package com.iax.command;

public class AddCustomerCommand implements Command {
    private CustomerService cs;

    public AddCustomerCommand(CustomerService cs) {
        this.cs = cs;
    }

    public void execute() {
        cs.addCustomer();
    }
}
