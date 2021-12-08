package chainOfResponsiblity;


import java.util.ArrayList;
import java.util.List;

/**
 * 设计模式:把简单的复杂化,哪部分将来会发生变化,就封装这一部分---封装变化
 */
public class Main {
    public static void main(String[] args) {
        FilterChain fc1 = new FilterChain();
        fc1.add(new HtmlFilter());
        fc1.add(new SensitiveWordFilter());

        Request request = new Request();
        request.str = "request";
        Response response = new Response();
        response.str = "response";

        fc1.doFilter(request,response,fc1);
        System.out.println(request.str);
        System.out.println(response.str);

//        FilterChain fc2 = new FilterChain();
//        fc2.add(new HtmlFilter());
//        fc2.add(new SensitiveWordFilter());
//
//        //此时,不是arrayList加arrayList,而是arrayList加element
//        fc1.add(fc2);

    }
}

class Request{
    String str;
}

class Response{
    String str;
}

interface Filter{
    void doFilter(Request request,Response response,FilterChain chain);
}

class HtmlFilter implements Filter{

    @Override
    public void doFilter(Request request,Response response,FilterChain chain) {
        request.str = request.str + "-html-";
        chain.doFilter(request,response,chain);
        response.str = response.str + "-html-";
    }
}

class SensitiveWordFilter implements  Filter{

    @Override
    public void doFilter(Request request,Response response,FilterChain chain) {
        request.str = request.str + "-sensitive-";
        chain.doFilter(request,response,chain);
        response.str = response.str + "-sensitive-";
    }
}

class FilterChain {
    List<Filter> filterList = new ArrayList<>();
    int index = 0;

    public FilterChain add(Filter f){
        filterList.add(f);
        return this;
    }

    public void doFilter(Request request,Response response,FilterChain chain){
        if(index==filterList.size()) return;
        Filter f = filterList.get(index);
        index++;
        f.doFilter(request,response,chain);
    }
}
