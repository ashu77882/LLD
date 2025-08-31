package LLD.Lesson5_Practice_ISP.BetterCode;

import LLD.Lesson5_Practice_ISP.ProblematicCode.Account;

public interface ILoan extends IAccount {
    public void payEMI();

}
