// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.tensorflow.c_api;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.tensorflow.c_api.global.tensorflow.*;


// TF_ImportGraphDefOptions holds options that can be passed to
// TF_GraphImportGraphDef.
@Opaque @Properties(inherit = org.tensorflow.c_api.presets.tensorflow.class)
public class TF_ImportGraphDefOptions extends org.tensorflow.c_api.AbstractTF_ImportGraphDefOptions {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TF_ImportGraphDefOptions() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_ImportGraphDefOptions(Pointer p) { super(p); }
}
