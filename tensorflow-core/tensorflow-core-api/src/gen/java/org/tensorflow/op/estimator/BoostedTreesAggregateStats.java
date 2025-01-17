/* Copyright 2018-2022 The TensorFlow Authors. All Rights Reserved.

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

package org.tensorflow.op.estimator;

import java.util.Arrays;
import org.tensorflow.GraphOperation;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.RawOpInputs;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.OpInputsMetadata;
import org.tensorflow.op.annotation.OpMetadata;
import org.tensorflow.types.TFloat32;
import org.tensorflow.types.TInt32;

/**
 * Aggregates the summary of accumulated stats for the batch.
 * The summary stats contains gradients and hessians accumulated for each node, feature dimension id and bucket.
 */
@OpMetadata(
    opType = BoostedTreesAggregateStats.OP_NAME,
    inputsClass = BoostedTreesAggregateStats.Inputs.class
)
public final class BoostedTreesAggregateStats extends RawOp implements Operand<TFloat32> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "BoostedTreesAggregateStats";

  private Output<TFloat32> statsSummary;

  public BoostedTreesAggregateStats(Operation operation) {
    super(operation, OP_NAME);
    int outputIdx = 0;
    statsSummary = operation.output(outputIdx++);
  }

  /**
   * Factory method to create a class wrapping a new BoostedTreesAggregateStats operation.
   *
   * @param scope current scope
   * @param nodeIds int32; Rank 1 Tensor containing node ids for each example, shape [batch_size].
   * @param gradients float32; Rank 2 Tensor (shape=[batch_size, logits_dimension]) with gradients for each example.
   * @param hessians float32; Rank 2 Tensor (shape=[batch_size, hessian_dimension]) with hessians for each example.
   * @param feature int32; Rank 2 feature Tensors (shape=[batch_size, feature_dimension]).
   * @param maxSplits int; the maximum number of splits possible in the whole tree.
   * @param numBuckets int; equals to the maximum possible value of bucketized feature.
   * @return a new instance of BoostedTreesAggregateStats
   */
  @Endpoint(
      describeByClass = true
  )
  public static BoostedTreesAggregateStats create(Scope scope, Operand<TInt32> nodeIds,
      Operand<TFloat32> gradients, Operand<TFloat32> hessians, Operand<TInt32> feature,
      Long maxSplits, Long numBuckets) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "BoostedTreesAggregateStats");
    opBuilder.addInput(nodeIds.asOutput());
    opBuilder.addInput(gradients.asOutput());
    opBuilder.addInput(hessians.asOutput());
    opBuilder.addInput(feature.asOutput());
    opBuilder.setAttr("max_splits", maxSplits);
    opBuilder.setAttr("num_buckets", numBuckets);
    return new BoostedTreesAggregateStats(opBuilder.build());
  }

  /**
   * Gets statsSummary.
   * output Rank 4 Tensor (shape=[splits, feature_dimension, buckets, logits_dimension + hessian_dimension])
   * containing accumulated stats for each node, feature dimension and bucket.
   * @return statsSummary.
   */
  public Output<TFloat32> statsSummary() {
    return statsSummary;
  }

  @Override
  public Output<TFloat32> asOutput() {
    return statsSummary;
  }

  @OpInputsMetadata(
      outputsClass = BoostedTreesAggregateStats.class
  )
  public static class Inputs extends RawOpInputs<BoostedTreesAggregateStats> {
    /**
     * int32; Rank 1 Tensor containing node ids for each example, shape [batch_size].
     */
    public final Operand<TInt32> nodeIds;

    /**
     * float32; Rank 2 Tensor (shape=[batch_size, logits_dimension]) with gradients for each example.
     */
    public final Operand<TFloat32> gradients;

    /**
     * float32; Rank 2 Tensor (shape=[batch_size, hessian_dimension]) with hessians for each example.
     */
    public final Operand<TFloat32> hessians;

    /**
     * int32; Rank 2 feature Tensors (shape=[batch_size, feature_dimension]).
     */
    public final Operand<TInt32> feature;

    /**
     * int; the maximum number of splits possible in the whole tree.
     */
    public final long maxSplits;

    /**
     * int; equals to the maximum possible value of bucketized feature.
     */
    public final long numBuckets;

    public Inputs(GraphOperation op) {
      super(new BoostedTreesAggregateStats(op), op, Arrays.asList("max_splits", "num_buckets"));
      int inputIndex = 0;
      nodeIds = (Operand<TInt32>) op.input(inputIndex++);
      gradients = (Operand<TFloat32>) op.input(inputIndex++);
      hessians = (Operand<TFloat32>) op.input(inputIndex++);
      feature = (Operand<TInt32>) op.input(inputIndex++);
      maxSplits = op.attributes().getAttrInt("max_splits");
      numBuckets = op.attributes().getAttrInt("num_buckets");
    }
  }
}
