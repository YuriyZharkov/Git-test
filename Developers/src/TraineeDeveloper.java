package JAVAOOP_PROG.KIEV.UA.OOP2.Developers.src;

/**
 * Created by Þðà on 23.07.2016.
 */
public class TraineeDeveloper extends Developer {

    public TraineeDeveloper(String name, double basicSalary, int experience) {
        super(name, basicSalary, experience);
    }
    @Override
    public double getSalary() {
        return (basicSalary) + (experience > 0 ? basicSalary * experience * 0.05 : 0);
    }
}
