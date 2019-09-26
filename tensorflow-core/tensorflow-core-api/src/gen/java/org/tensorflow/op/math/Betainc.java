/* Copyright 2018 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.math;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Compute the regularized incomplete beta integral \\(I_x(a, b)\\).
 * <p>
 * The regularized incomplete beta integral is defined as:
 * <p>
 * \\(I_x(a, b) = \frac{B(x; a, b)}{B(a, b)}\\)
 * <p>
 * where
 * <p>
 * \\(B(x; a, b) = \int_0^x t^{a-1} (1 - t)^{b-1} dt\\)
 * <p>
 * is the incomplete beta function and \\(B(a, b)\\) is the <i>complete</i>
 * beta function.
 * 
 * @param <T> data type for {@code z()} output
 */
@Operator(group = "math")
public final class Betainc<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new Betainc operation.
   * 
   * @param scope current scope
   * @param a 
   * @param b 
   * @param x 
   * @return a new instance of Betainc
   */
  public static <T extends Number> Betainc<T> create(Scope scope, Operand<T> a, Operand<T> b, Operand<T> x) {
    OperationBuilder opBuilder = scope.env().opBuilder("Betainc", scope.makeOpName("Betainc"));
    opBuilder.addInput(a.asOutput());
    opBuilder.addInput(b.asOutput());
    opBuilder.addInput(x.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new Betainc<T>(opBuilder.build());
  }
  
  /**
   */
  public Output<T> z() {
    return z;
  }
  
  @Override
  public Output<T> asOutput() {
    return z;
  }
  
  private Output<T> z;
  
  private Betainc(Operation operation) {
    super(operation);
    int outputIdx = 0;
    z = operation.output(outputIdx++);
  }
}
