
/// interface java.lang.reflect.InvocationHandler ///

package org.genie.java_lang;

public class InvocationHandlerProxy implements java.lang.reflect.InvocationHandler {

    long swiftObject;

    InvocationHandlerProxy( long swiftObject ) {
        this.swiftObject = swiftObject;
    }

    /// public abstract java.lang.Object java.lang.reflect.InvocationHandler.invoke(java.lang.Object,java.lang.reflect.Method,java.lang.Object[]) throws java.lang.Throwable

    public native java.lang.Object __invoke( java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] args );

    public java.lang.Object invoke( java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] args ) throws java.lang.Throwable {
        return __invoke( proxy, method, args );
    }

}
