package mobile.service;

import mobile.bean.Account;

public interface AccountService {

    Account getAccountDetails(String mobileNo);

    int rechargeAccount(String mobileNo,double rechargeAmount);
}