public class BankAccount {
    private int accountID;
    private String name;
    private String phoneNumber;
    private int cache;

    public String getName() {
        return name;
    }
    public int getAccountID() {
        return accountID;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getCache() {
        return cache;
    }

    private BankAccount(BankAccountBuilder account) {
        this.accountID = account.accountID;
        this.name = account.name;
        this.phoneNumber = account.phoneNumber;
        this.cache = account.cache;
    }
    public String toString() {
        return "User: "+this.accountID+", "+this.name+", "+this.phoneNumber+", "+this.cache;
    }
    public static class BankAccountBuilder {
        private int accountID;
        private String name;
        private String phoneNumber;
        private int cache;
        public BankAccountBuilder(int accountID, String name, String phoneNumber) {
            this.accountID = accountID;
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
        public BankAccountBuilder withStartCache(int cache) {
            this.cache = cache;
            return this;
        }
        public BankAccount build() {
            return new BankAccount(this);
        }

    }
}
