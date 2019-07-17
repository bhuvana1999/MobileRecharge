package mobile.dao;

import mobile.bean.Account;

public interface AccountDao {

    Account getAccountDetails(String mobileNo);

    int rechargeAccount(String mobileNo,double rechargeAmount);
}
