package section15;

import java.util.HashSet;
import java.util.Set;

public class MemberCompareExample {

	public static void main(String[] args) {
		Member mem1 = new Member();
		Member mem2 = new Member();
		
		mem1.setMemberId(100);
		mem1.setMemberName("김일남");
		
		mem2.setMemberId(102);
		mem2.setMemberName("김이남");
		
		System.out.println("mem1 hashCode >> " + mem1.hashCode());
		System.out.println("mem2 hashCode >> " + mem2.hashCode());
		
		System.out.println("mem1 == mem2 >> " + (mem1 == mem2));
		System.out.println("mem1 : " + System.identityHashCode(mem1)); 
		System.out.println("mem2 : " + System.identityHashCode(mem2)); 
		
		System.out.println("mem1 equals mem2 >> " + (mem1.equals(mem2)));
		
		Set<Member> list = new HashSet<>(); // 중복 허용 X
		list.add(mem1);
		list.add(mem2);
		
		System.out.println("Set length: " + list.size());
	}

}
