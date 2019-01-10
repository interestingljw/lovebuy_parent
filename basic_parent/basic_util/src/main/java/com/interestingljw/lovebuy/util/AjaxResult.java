package com.interestingljw.lovebuy.util;
//ajax响应对象的类
public class AjaxResult {
    //操作状态
    private boolean success=true;
    //操作结果信息
    private String message="操作成功";
    //返回 给前台需要的对象
    private Object ResultObj;

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getResultObj() {
        return ResultObj;
    }

    public AjaxResult setResultObj(Object resultObj) {
        ResultObj = resultObj;
        return this;
    }
    public static AjaxResult me(){
        return new AjaxResult();
    }
}
