
package com.asaas.apisdk.validation.validators.modelValidators;

import com.asaas.apisdk.models.ListWebhooksParameters;
import com.asaas.apisdk.validation.Violation;
import com.asaas.apisdk.validation.ViolationAggregator;
import com.asaas.apisdk.validation.validators.NumericValidator;

public class ListWebhooksParametersValidator extends AbstractModelValidator<ListWebhooksParameters> {

  public ListWebhooksParametersValidator(String fieldName) {
    super(fieldName);
  }

  public ListWebhooksParametersValidator() {}

  @Override
  protected Violation[] validateModel(ListWebhooksParameters requestParameters) {
    return new ViolationAggregator()
      .add(new NumericValidator<Long>("limit").max(100L).optional().validate(requestParameters.getLimit()))
      .aggregate();
  }
}
