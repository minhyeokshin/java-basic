package Day13.inheritance.level2;

public class CheckingAccount extends Account {
    private String cardNO;
    private String accid;
    private String ownerName;
    private long balance;
    private long amount;

    public String getCardNO() {
        return cardNO;
    }

    public void setCardNO(String cardNO) {
        this.cardNO = cardNO;
    }

    public String getAccid() {
        return accid;
    }

    public void setAccid(String accid) {
        this.accid = accid;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void calcRate() {

    }

    @Override
    public long getBalance() {
        return balance;
    }

    @Override
    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public CheckingAccount(String accid, String ownerName, long balance, String cardNO){
        this.accid = accid;
        this.ownerName = ownerName;
        this.balance = balance;
        this.cardNO = cardNO;
    }
    public void pay(String cardNO, long amount) {
            if (amount < balance && cardNO.equals(this.cardNO)) {
                setBalance(balance-amount);
            } else{
                System.out.println("지불이 불가능합니다.");
            }
    }

    }

