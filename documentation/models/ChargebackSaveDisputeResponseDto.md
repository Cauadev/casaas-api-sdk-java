# ChargebackSaveDisputeResponseDto

**Properties**

| Name         | Type                                                 | Required | Description                                                            |
| :----------- | :--------------------------------------------------- | :------- | :--------------------------------------------------------------------- |
| chargebackId | String                                               | ❌       | Unique identifier of chargeback for which the dispute will be created. |
| status       | ChargebackSaveDisputeResponseChargebackDisputeStatus | ❌       | Dispute status.                                                        |
| files        | List\<String\>                                       | ❌       | Names of the dispute files.                                            |

