# JAVA4
JAVA实验作业仓库
实验目的
掌握Java中抽象类和抽象方法的定义； 掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法 了解异常的使用方法，并在程序中根据输入情况做异常处理

实验内容
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。 设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。 设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥） 编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。

实验过程
1.设计两个管理接口：研究生应姓名、性别、年龄、每学期学费、每月薪水等属性，实现接口中的抽象方法。
2.编写测试类taxes，实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额
3.在接口利用函数find afford get建立缴纳学费、查学费、发放薪水和查询薪水。

核心方法
package system;

public class Test_1 {

    public static void main(String[] args) {
        try {
            System.out.println("******************研究生一*********************");
            Doctor xm = new Doctor();
            xm.setName("陈之");
            xm.setAge(23);
            xm.setNumber(2019311130);
            xm.setSex("女");
            xm.setTuition(8000);
            xm.setSalary(1900);
            System.out.println("学生姓名:" + xm.getName());
            System.out.println("学生年龄:" + xm.getAge());
            System.out.println("学生编号:" + xm.getNumber());
            System.out.println("学生性别:" + xm.getSex());
            xm.find_tuition();
            xm.find_salary();
            xm.taxation();
            System.out.println("******************研究生二*********************");
            Doctor xf = new Doctor();
            xf.setName("毛不易");
            xf.setAge(24);
            xf.setNumber(2010311131);
            xf.setSex("男");
            xf.setTuition(9000);
            xf.setSalary(4500);
            System.out.println("学生姓名:" + xf.getName());
            System.out.println("学生年龄:" + xf.getAge());
            System.out.println("学生编号:" + xf.getNumber());
            System.out.println("学生性别:" + xf.getSex());
            xf.find_tuition();
            xf.find_salary();
            xf.taxation();
        } catch (Exception e) {
            System.out.println("数据异常");
        }

    }

    interface Manger_student {
        double find_tuition();

        double afford_tuition();
    }

    interface Manger_teacher {
        double STANDARD = 0.2;

        double find_salary();

        double get_salary();
    }


    public static class Doctor implements Manger_student, Manger_teacher {
        public Doctor() {

        }

        public Doctor(String name, int age, int number, String sex, double tuition, double salary) {
            this.name = name;
            this.age = age;
            this.number = number;
            this.sex = sex;
            this.tuition = tuition;
            this.salary = salary;
        }

        private String name;
        private int age;
        private int number;
        private String sex;
        private double tuition;
        private double salary;


        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public void setTuition(double tuition) {
            this.tuition = tuition;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getSex() {
            return sex;
        }

        public double getTuition() {
            return tuition;
        }

        public int getNumber() {
            return number;
        }

        public double getSalary() {
            return salary;
        }


        public double find_tuition() {
            System.out.println("每年学费：" + tuition);
            return tuition;
        }

        public double find_salary() {
            System.out.println("每月工资：" + salary);
            return salary;
        }

        public double afford_tuition() {
            System.out.println("缴纳成功，已缴纳学费" + tuition);
            return tuition;
        }

        public double get_salary() {
            double c;
            c = salary - (salary - 800) * STANDARD;
            System.out.println("薪水已经发放，发放金额：" + c);
            return salary;
        }

        public void taxation() {
            double a;
            a = 12 * ((salary - 800) * STANDARD);
            System.out.println("每年应纳税为：" + a);
        }
    }
}


实验结果
******************研究生一*********************
学生姓名:陈之
学生年龄:23
学生编号:2019311130
学生性别:女
每年学费：8000.0
每月工资：1900.0
每年应纳税为：2640.0
******************研究生二*********************
学生姓名:毛不易
学生年龄:24
学生编号:2010311131
学生性别:男
每年学费：9000.0
每月工资：4500.0
每年应纳税为：8880.0

实验心得
学会了Java中抽象类和抽象方法的定义， 了解Java中接口的定义，掌握接口的定义形式以及接口的实现方法了解异常的使用方法，并尝试程序中根据输入情况做异常处理。
