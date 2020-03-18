class TestGroovy {
    static void main(args) {

        evaluateTest();
    }

    /**
     * 7、执行字符串
     */
    static void evaluateTest() {
        def a = '1 + ';
        a += '1';
        println evaluate(a)
    }
    /**
     * 6、闭包的使用
     * 闭包允许指定执行一块任意指定的代码块
     *
     * 意思:闭包就是用 {} 括号起来的代码块，为了让参数可以传递，使用 {param -> print param}
     */
    static void closedPackage() {
        //举一个list遍历的的例子
        def list = [1, 2, 3];
        list.each {param -> println(param)}
    }

    /**
     * 5、range的使用
     */
    static void range() {
        def range = 1..10;
        assert range.contains(5)
        assert range.contains(15) == false
        assert range.size() == 10
        assert range.from == 1
        assert range.to == 10
        assert range.reverse() == 10..1
    }

    /**
     * 4、map的使用
     */
    static void map() {
        def http = [
                100 : 'continue',
                200 : 'ok'
        ]
        assert http[200] == 'ok'
    }

    /**
     * 3、参数引用
     */
    static void ref() {
        def foo = "asd";
        def doo = "mnm";
        assert "$foo is $doo" == "asd is mnm";
    }

    /**
     * 2、正则使用
     */
    static void regex() {
        println("正则表达式被调用")
        assert '123456'=~/\d+/
        assert 'xxxxx' == '12345'.replaceAll(/\d/, 'x');
    }
    /**
     * 1、repeat语法
     */
    static void repeat() {
        //声明变量
        def foo = "apple";
        println("重复语法被调用");
        10.times {
            println("asdf");
        }
    }
}
