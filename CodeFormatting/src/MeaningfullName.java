
//Dirty Code
class Cust{

private String custId;
private String custNm;
private String custAdd;
private Date d;
private List accountList;

public String getInfo(){
return custId +","+ custName +","+ custAdd +"," + accountList.toString()+" ," d.toString();
}

}



//Dirty Code
class Cust{

public void openAcc(){

accServ.openAcc();
}

public void getAccountsList(){

for(Long l : accountList;{
System.out.println(l);
}

}

}



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




