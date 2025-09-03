
package com.asaas.apisdk.validation.validators.modelValidators;

import com.asaas.apisdk.models.ListBillPaymentsParameters;
import com.asaas.apisdk.validation.Violation;
import com.asaas.apisdk.validation.ViolationAggregator;
import com.asaas.apisdk.validation.validators.NumericValidator;

public class ListBillPaymentsParametersValidator extends AbstractModelValidator<ListBillPaymentsParameters> {

  public ListBillPaymentsParametersValidator(String fieldName) {
    super(fieldName);
  }

  public ListBillPaymentsParametersValidator() {}

  @Override
  protected Violation[] validateModel(ListBillPaymentsParameters requestParameters) {
    return new ViolationAggregator()
      .add(new NumericValidator<Long>("limit").max(100L).optional().validate(requestParameters.getLimit()))
      .aggregate();
  }
}
