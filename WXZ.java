package system;

public class Test_1 {

    public static void main(String[] args) {
        try {
            System.out.println("******************�о���һ*********************");
            Doctor xm = new Doctor();
            xm.setName("��֮");
            xm.setAge(23);
            xm.setNumber(2019311130);
            xm.setSex("Ů");
            xm.setTuition(8000);
            xm.setSalary(1900);
            System.out.println("ѧ������:" + xm.getName());
            System.out.println("ѧ������:" + xm.getAge());
            System.out.println("ѧ�����:" + xm.getNumber());
            System.out.println("ѧ���Ա�:" + xm.getSex());
            xm.find_tuition();
            xm.find_salary();
            xm.taxation();
            System.out.println("******************�о�����*********************");
            Doctor xf = new Doctor();
            xf.setName("ë����");
            xf.setAge(24);
            xf.setNumber(2010311131);
            xf.setSex("��");
            xf.setTuition(9000);
            xf.setSalary(4500);
            System.out.println("ѧ������:" + xf.getName());
            System.out.println("ѧ������:" + xf.getAge());
            System.out.println("ѧ�����:" + xf.getNumber());
            System.out.println("ѧ���Ա�:" + xf.getSex());
            xf.find_tuition();
            xf.find_salary();
            xf.taxation();
        } catch (Exception e) {
            System.out.println("�����쳣");
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
            System.out.println("ÿ��ѧ�ѣ�" + tuition);
            return tuition;
        }

        public double find_salary() {
            System.out.println("ÿ�¹��ʣ�" + salary);
            return salary;
        }

        public double afford_tuition() {
            System.out.println("���ɳɹ����ѽ���ѧ��" + tuition);
            return tuition;
        }

        public double get_salary() {
            double c;
            c = salary - (salary - 800) * STANDARD;
            System.out.println("нˮ�Ѿ����ţ����Ž�" + c);
            return salary;
        }

        public void taxation() {
            double a;
            a = 12 * ((salary - 800) * STANDARD);
            System.out.println("ÿ��Ӧ��˰Ϊ��" + a);
        }
    }
}

