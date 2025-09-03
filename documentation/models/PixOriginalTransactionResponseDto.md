# PixOriginalTransactionResponseDto

Original transaction information if a chargeback has occurred

**Properties**

| Name               | Type   | Required | Description                                                  |
| :----------------- | :----- | :------- | :----------------------------------------------------------- |
| id                 | String | ❌       | Unique transaction identifier                                |
| endToEndIdentifier | String | ❌       | Unique identifier of the Pix transaction at the Central Bank |
| value              | Double | ❌       | Original transaction value                                   |
| effectiveDate      | String | ❌       | Transaction date                                             |

