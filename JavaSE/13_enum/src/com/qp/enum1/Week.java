package com.qp.enum1;

public enum Week {
    MON("星期一"){
        @Override
        void show() {
            System.out.println("show:星期一");
        }
    },TUE("星期二"){
        @Override
        void show() {
            System.out.println("show:星期二");
        }
    },WEN("星期三"){
        @Override
        void show() {
            System.out.println("show:星期三");
        }
    };
    private String name;
    private Week(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    abstract void show();
}
