# MyAccountGetAccountFeesPaymentDto

Billing fees

**Properties**

| Name       | Type                                        | Required | Description      |
| :--------- | :------------------------------------------ | :------- | :--------------- |
| bankSlip   | MyAccountGetAccountFeesPaymentBankSlipDto   | ❌       | Boleto fees      |
| creditCard | MyAccountGetAccountFeesPaymentCreditCardDto | ❌       | Credit card fees |
| debitCard  | MyAccountGetAccountFeesPaymentDebitCardDto  | ❌       | Debit card fees  |
| pix        | MyAccountGetAccountFeesPaymentPixDto        | ❌       | Pix Fees         |

