package jdbcboard.test;

import java.util.List;

import jdbcboard.model.Board;
import jdbcboard.model.Member;
import jdbcboard.service.MemberService;
import jdbcboard.service.impl.MemberServiecImpl;

public class MemberServiceTest {

	public static void main(String[] args) {

		MemberService memberService = MemberServiecImpl.getMemberServiecImpl();

		Member member = new Member("suga", "윤기", "슈가", "0309", "min@yunki", "010-1992-0309", "N");
		int result = memberService.insertMember(member);
		if(result > 0) {
			System.out.println("입력성공!");
		}

//		memberService.updateMember(new Member("hong2", "new홍길동","new홍장군", "5678", "newhong@hong.com", "010-1111-2222", "N"));

//		memberService.deleteMember("hong4");

		List<Member> memberList = memberService.selectMember();
		for (Member member2 : memberList) {
			System.out.println(member2);
		}
//		System.out.println(memberService.getMember("hong"));

	} // main

} // class
