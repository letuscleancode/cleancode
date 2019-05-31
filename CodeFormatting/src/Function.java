//Dirty Code
class Customer{

public openOrCloseAccount(){

if(accountService.isValidUser(id,name,dateOfBirth)){

accountService.openAccount();
}

}

//Dirty Code
class Customer{

public openOrCloseAccount(){

if(accountService.isValidUser(id,name,dateOfBirth)){
try{
accountService.openAccount();
log.info("Success");
}
catch(Exception ex)
{
log.info("Failed");
}

}else{
log.info("InValid");
}

}


}


//Clean Code
class Customer{


//split openOrCloseAccount() method as per behavior
public openAccount(){
//reduce the parameter size
if(accountService.isValidUser(user)){
try{
accountService.openAccount();
log.info("Account has been opened successfuly");//Meaningfull log
}
catch(Exception ex)
{
logError(ex); //create a new method to log the exception/customized log
}

}else{
log.info("This user "+user + "is not a valid user." );
}

}

//split openOrCloseAccount() method as per behavior
public closeAccount(){
accountService.closeAccount();
}

//create a new method to log the exception/customized log
public void logError(Exception ex){
logger.info(ex.getMessage());
}


}