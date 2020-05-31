/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author crys
 */
 class HasDebitCardState implements AtmMachineState
{
  @Override
  public void insertDebitCard()
  {
    System.out.println("Debit Card is already there,So you cannot insert the Debit Card ...");

  }

  @Override
  public void ejectDebitCard()
  {
    System.out.println("Debit Card is ejected...");
  }

  @Override
  public void enterPinAndWithdrawMoney()
  {
    System.out.println("Pin number has been entered correctly and money has been withdrawn...");
  }
}
