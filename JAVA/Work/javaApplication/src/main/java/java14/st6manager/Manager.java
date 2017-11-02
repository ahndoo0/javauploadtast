package java14.st6manager;

public class Manager extends Employee{
    private int bonus=0;
    
    public void test(){
        String info = "name: "+ super.getName();
        info = info + ", address:"+ super.getAddress();
        info = info + ", salary:"+super.getSalary();
        info = info + ", rrn:"+super.getRrn();
        info = info + ", bonus:"+this.bonus;
        System.out.println(info);
        
        
        // 부모 클래스에서 자식클래스로 상속시 protected는 사용할수잇지만 
        //private 은 사용못한다  사용하려면 get으로 상속해야한다.
        //public은 아무데서나 사용가능 하다 .
    
    
    
    
    
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + bonus;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Manager other = (Manager) obj;
        if (bonus != other.bonus)
            return false;
        return true;
    }

    public Manager() {
        super();
    }

    public Manager(int bonus) {
        super();
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager [bonus=" + bonus + ", salary=" + salary
                + ", toString()=" + super.toString() + "]";
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
}
