package mobile.service;

import mobile.bean.Account;
import mobile.dao.AccountDao;
import mobile.dao.IncorrectMobileNoException;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;//has-a
    public AccountDao getAccountDao(){
        return accountDao;
    }
    public void setAccountDao(final AccountDao accountDao){
        this.accountDao=accountDao;
    }
    public AccountServiceImpl(){
    }
    public AccountServiceImpl(final AccountDao accountDao){
        this.accountDao=accountDao;
    }
    public void validateNumber(String mobileNo){
        if(mobileNo==null || mobileNo.length()!=10){
            throw new IncorrectMobileNoException("Incorrect mobile number");
        }
    }
    @Override
    public Account getAccountDetails(final String mobileNo) {
        validateNumber(mobileNo);
        Account account= getAccountDao().getAccountDetails(mobileNo);
        return account;
    }
    @Override
    public int rechargeAccount(final String mobileNo,final double rechargeAmount) {
        validateNumber(mobileNo);
        int balanceNow=getAccountDao().rechargeAccount(mobileNo, rechargeAmount);
        return balanceNow;
    }
}

