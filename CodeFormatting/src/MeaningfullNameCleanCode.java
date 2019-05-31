//Clean Code

class Customer{

private String id;
private String name;
private String address;
private List<Long> accounts;
private Date dateOfBirth;

public String getCustomerInfo(){
return id+","+ name +","+ address +","+ accounts.toString()+" ," dateOfBirth.toString();
}

public void openAccount(){
accountService.openAccount();
}

public void getAccounts(){

for(Long accountNumber : accounts){
System.out.println(accountNumber);
}

}


}
