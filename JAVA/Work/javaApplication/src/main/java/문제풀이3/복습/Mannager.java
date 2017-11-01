package 문제풀이3.복습;

public class Mannager extends Employee {
    private int bonus = 0;
    
    public void test() {
        System.out.println("사원정보");
        String info = "이름: " + super.getName();
        info = info + ", 주소:" + super.getAddress();
        info = info + ", 월급:" + super.getSalary();
        info = info + ", 주민번호:" + super.getRrn();
        info = info + ", 보너스:" + this.bonus;
        System.out.println(info);
    }
    
    public int getBonus() {
        return bonus;
    }
    
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public String toString() {
        return "Mannager [bonus=" + bonus + ", toString()=" + super.toString()
                + "]";
    }
    
    public Mannager() {
        super();
    }
    
    public Mannager(String name, String address, int salary, String rrn,
            int bonus) {
        super(name, address, salary, rrn);
        this.bonus = bonus;
    }
    
}
