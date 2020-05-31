/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author crys
 */
 class E_State {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*
    * Initially ATM Machine in 'noDebitCardState'
    */
    AtmMachine atmMachine = new AtmMachine();

    System.out.println("ATM Machine Current state : "
                   + atmMachine.getAtmMachineState().getClass().getName());

    System.out.println();
    atmMachine.enterPinAndWithdrawMoney();
    atmMachine.ejectDebitCard();
    atmMachine.insertDebitCard();
    
    System.out.println("\n*******************************************************");

    /*
    * Debit Card has been inserted so internal state of ATM Machine
    * has been changed to 'hasDebitCardState'
    */
    System.out.println("\nATM Machine Current state : "
                   + atmMachine.getAtmMachineState().getClass().getName());
    System.out.println();

    atmMachine.enterPinAndWithdrawMoney();
    atmMachine.insertDebitCard();
    atmMachine.ejectDebitCard();
    System.out.println("\n*******************************************************");

    /*
    * Debit Card has been ejected so internal state of ATM Machine
    * has been changed to 'noDebitCardState'
    */

    System.out.println("\nATM Machine Current state : "
                   + atmMachine.getAtmMachineState().getClass().getName());

  }

}
