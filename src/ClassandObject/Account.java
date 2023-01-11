package ClassandObject;

public class Account {
    int CustomerId=210;
    int AccountNumber=5255;
    String accountHolderName="SAGAR";

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "CustomerId=" + CustomerId +
                ", AccountNumber=" + AccountNumber +
                ", accountHolderName='" + accountHolderName + '\'' +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        Account account=new Account();
        System.out.println(account);
    }
}
