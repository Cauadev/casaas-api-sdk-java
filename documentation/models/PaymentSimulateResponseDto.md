# PaymentSimulateResponseDto

**Properties**

| Name       | Type                                 | Required | Description                         |
| :--------- | :----------------------------------- | :------- | :---------------------------------- |
| value      | Double                               | ❌       | Total installment or billing amount |
| creditCard | PaymentSimulateCreditCardResponseDto | ❌       | Card fees                           |
| bankSlip   | PaymentSimulateBankSlipResponseDto   | ❌       | Boleto fees                         |
| pix        | PaymentSimulatePixResponseDto        | ❌       | PIX fees                            |

