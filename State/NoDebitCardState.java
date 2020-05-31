/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author crys
 */
 class NoDebitCardState implements AtmMachineState
{

  @Override
  public void insertDebitCard()
  {
    System.out.println("DebitCard inserted ....");

  }

  @Override
  public void ejectDebitCard()
  {

    System.out.println("No Debit Card in ATM Machine slot, so you cannot eject the Debit Card...");
  }

  @Override
  public void enterPinAndWithdrawMoney()
  {
    System.out.println("No Debit Card in ATM Machine slot, so you cannot enter the pin and withdraw the money...");

  }

}