package com.ca.dp.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by yanya04 on 6/12/2017.
 */
public class ImageProxy implements InvocationHandler{

    private Object obj;
    private ImageProxy(Object obj){
        this.obj = obj;
    }
    public static Object newInstance(Object obj){
        return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), new ImageProxy(obj));
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        try{
            if(method.getName().contains("download")){
                System.out.println("download is not allowed");
                return null;
            } else {
                result = method.invoke(obj, args);
            }
        } catch(InvocationTargetException e){
            throw e.getTargetException();
        }catch (Exception e){
            throw new RuntimeException("unexpected invocation exception: " + e.getMessage());
        }
        return result;
    }
}
