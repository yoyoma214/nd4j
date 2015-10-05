/*
 *
 *  * Copyright 2015 Skymind,Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 *
 */

package jcuda.driver;

import jcuda.NativePointerObject;
import jcuda.runtime.cudaEvent_t;

/**
 * Java port of a CUevent.
 *
 * @see JCudaDriver#cuEventCreate
 * @see JCudaDriver#cuEventRecord
 * @see JCudaDriver#cuEventQuery
 * @see JCudaDriver#cuEventSynchronize
 * @see JCudaDriver#cuEventDestroy
 * @see JCudaDriver#cuEventElapsedTime
 */
public class CUevent extends NativePointerObject
{
    /**
     * Creates a new, uninitialized CUevent
     */
    public CUevent()
    {
    }

    /**
     * Creates a CUevent for the given {@link cudaEvent_t}. This
     * corresponds to casting a cudaEvent_t to a CUevent.
     * 
     * @param event The other event
     */
    public CUevent(cudaEvent_t event)
    {
        super(event);
    }
    
    /**
     * Returns a String representation of this object.
     *
     * @return A String representation of this object.
     */
    @Override
    public String toString()
    {
        return "CUevent["+
            "nativePointer=0x"+Long.toHexString(getNativePointer())+"]";
    }

}