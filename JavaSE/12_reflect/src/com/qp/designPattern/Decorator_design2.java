package com.qp.designPattern;

public class Decorator_design2 {
    public static void main(String[] args) {
        test1();
    }

    private static void test1(){
        Component component,componentSB,componentBB;
        component = new Window();
        componentSB = new ScrollBarDecorator(component);//window窗体 + 装饰滚动条
        componentSB.display();

        System.out.println("--------------------");
        componentBB = new BlackBoarderDecorator(componentSB);//window窗体 + 装饰滚动条 + 装饰黑色边框

        componentBB.display();
    }
}


abstract class Component {
    public abstract void display();
}


//2.组件装饰者
class ComponentDecorator extends Component {
    private Component component; // 维持对抽象构件类型对象的引用

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    public void display() {
        component.display();
    }

}

//3.继承类ListBox
class ListBox extends Component {
    public void display() {
        System.out.println("显示列表框！");
    }
}


//4.继承类TextBox
class TextBox extends Component {
    public void display() {
        System.out.println("显示文本框！");
    }
}


//5.继承类Window

class Window extends Component {
    public void display() {
        System.out.println("显示窗体！");
    }
}


//6.黑框装饰者
class BlackBoarderDecorator extends ComponentDecorator {
    public BlackBoarderDecorator(Component component) {
        super(component);
    }

    public void display() {
        this.setBlackBoarder();
        super.display();
    }

    public void setBlackBoarder() {
        System.out.println("为构件增加黑色边框！");

    }
}


//7.滚动条装饰者
class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component); // 调用父类构造函数
    }

    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("为构件增加滚动条！");
    }
}


