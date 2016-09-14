package JAVAOOP_PROG.KIEV.UA.OOP2.Developers.src;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Developer[] list = {
				new JuniorDeveloper("Mike", 500, 0),
				new JuniorDeveloper("Dima", 500, 1),
				new JuniorDeveloper("Vova", 500, 2),
				new SeniorDeveloper("Jack", 500, 5),
				new TeamLeadDeveloper("Robby", 500, 7),
				new TraineeDeveloper("Sashko", 500, 0),
				new TraineeDeveloper("Yura", 500, 2),
		};
		JuniorDeveloper[] jd = new JuniorDeveloper[10];
		int jd1 = 0;
		TeamLeadDeveloper[] tld = new TeamLeadDeveloper[10];
		int tld1 = 0;
		SeniorDeveloper[] sd = new SeniorDeveloper[10];
		int sd1 = 0;
		TraineeDeveloper[] td = new TraineeDeveloper[10];
		int td1 = 0;
		for (Developer d : list) {
			if (d instanceof JuniorDeveloper) {
				jd[jd1++] = (JuniorDeveloper) d;
			}
			if (d instanceof SeniorDeveloper) {
				sd[sd1++] = (SeniorDeveloper) d;
			}
			if (d instanceof TeamLeadDeveloper) {
				tld[tld1++] = (TeamLeadDeveloper) d;
			}
			if (d instanceof TraineeDeveloper) {
				td[td1++] = (TraineeDeveloper) d;
			}
		}
		jd = Arrays.copyOf(jd, jd1);
		sd = Arrays.copyOf(sd, sd1);
		tld = Arrays.copyOf(tld, tld1);
		td = Arrays.copyOf(td, td1);

		StringBuilder sb;
		
		for (Developer d : td) {
			sb = new StringBuilder() // !!!
				.append(d.getName())
				.append(": ")
				.append(d.getBasicSalary())
				.append(" -> ")
				.append(d.getSalary());
			
			System.out.println(sb.toString());
		}
		for(Developer d : td){
			System.out.println(d.getName());
		}
	}
}
