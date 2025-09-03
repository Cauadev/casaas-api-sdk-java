
package com.asaas.apisdk.validation.validators;

import com.asaas.apisdk.validation.Violation;

public interface Validator<T> {
  Violation[] validate(T value);
}
