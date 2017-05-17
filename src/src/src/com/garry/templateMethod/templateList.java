package com.garry.templateMethod;

/**
 * Created by Administrator on 2017/5/16 0016.
 * 模板方法：
 * HttpServlet类提供了一个service()方法.这个方法调用了一个或是多个do方法,完成对客户端发起的请求的处理,这些do方法则是由具体的HttpServlet类提供的.那么这里的service()方法就是一个摸板方法.
 * 在多个子类拥有相同的方法，并且这些方法逻辑相同时，可以考虑使用模版方法模式。在程序的主框架相同，细节不同的场合下，也比较适合使用这种模式。
 */
public abstract class templateList {
    //初始化不可重写
    public final void init(){

    }
    //排序方法自实现
    public abstract void sort();
}
