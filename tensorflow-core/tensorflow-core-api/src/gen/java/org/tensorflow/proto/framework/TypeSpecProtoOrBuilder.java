// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/struct.proto

package org.tensorflow.proto.framework;

public interface TypeSpecProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.TypeSpecProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tensorflow.TypeSpecProto.TypeSpecClass type_spec_class = 1;</code>
   */
  int getTypeSpecClassValue();
  /**
   * <code>.tensorflow.TypeSpecProto.TypeSpecClass type_spec_class = 1;</code>
   */
  org.tensorflow.proto.framework.TypeSpecProto.TypeSpecClass getTypeSpecClass();

  /**
   * <pre>
   * The value returned by TypeSpec._serialize().
   * </pre>
   *
   * <code>.tensorflow.StructuredValue type_state = 2;</code>
   */
  boolean hasTypeState();
  /**
   * <pre>
   * The value returned by TypeSpec._serialize().
   * </pre>
   *
   * <code>.tensorflow.StructuredValue type_state = 2;</code>
   */
  org.tensorflow.proto.framework.StructuredValue getTypeState();
  /**
   * <pre>
   * The value returned by TypeSpec._serialize().
   * </pre>
   *
   * <code>.tensorflow.StructuredValue type_state = 2;</code>
   */
  org.tensorflow.proto.framework.StructuredValueOrBuilder getTypeStateOrBuilder();

  /**
   * <pre>
   * The name of the TypeSpec class.
   *  * If type_spec_class == REGISTERED_TYPE_SPEC, the TypeSpec class is
   *    the one registered under this name. For types registered outside
   *    core TensorFlow by an add-on library, that library must be loaded
   *    before this value can be deserialized by nested_structure_coder.
   *  * If type_spec_class specifies a particular TypeSpec class, this field is
   *    redundant with the type_spec_class enum, and is only used for error
   *    reporting in older binaries that do not know the tupe_spec_class enum.
   * </pre>
   *
   * <code>string type_spec_class_name = 3;</code>
   */
  java.lang.String getTypeSpecClassName();
  /**
   * <pre>
   * The name of the TypeSpec class.
   *  * If type_spec_class == REGISTERED_TYPE_SPEC, the TypeSpec class is
   *    the one registered under this name. For types registered outside
   *    core TensorFlow by an add-on library, that library must be loaded
   *    before this value can be deserialized by nested_structure_coder.
   *  * If type_spec_class specifies a particular TypeSpec class, this field is
   *    redundant with the type_spec_class enum, and is only used for error
   *    reporting in older binaries that do not know the tupe_spec_class enum.
   * </pre>
   *
   * <code>string type_spec_class_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getTypeSpecClassNameBytes();

  /**
   * <pre>
   * The number of flat tensor components required by this TypeSpec.
   * </pre>
   *
   * <code>int32 num_flat_components = 4;</code>
   */
  int getNumFlatComponents();
}
