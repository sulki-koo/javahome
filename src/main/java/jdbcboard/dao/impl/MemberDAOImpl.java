package jdbcboard.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import jdbcboard.dao.MemberDAO;
import jdbcboard.model.Member;
import jdbcboard.util.MyBatisUtil;

public class MemberDAOImpl implements MemberDAO {

	private static MemberDAOImpl memberDAOImpl = new MemberDAOImpl();
	private static SqlSession session;
	private static Member member;

	private MemberDAOImpl() {
	}

	public static MemberDAOImpl getMemberDAOImpl() {
		return memberDAOImpl;
	}

	@Override
	public List<Member> selectMember() {
		List<Member> memberList = null;
		try {
			session = MyBatisUtil.openSession();
			memberList = session.selectList("Member.selectMember", memberList);
		} finally {
			MyBatisUtil.closeSession(session);
		}
		return memberList;
	}

	@Override
	public Member getMember(String mid) {
		try {
			session = MyBatisUtil.openSession();
			member = session.selectOne("Member.getMember", mid);
			return member;
		} finally {
			MyBatisUtil.closeSession(session);
		}
	}

	@Override
	public int insertMember(Member member) {
		try {
			session = MyBatisUtil.openSession();
			int result = session.insert("Member.insertMember", member);
			session.commit();
			return result;
		} finally {
			MyBatisUtil.closeSession(session);
		}
	}

	@Override
	public int updateMember(Member member) {
		try {
			session = MyBatisUtil.openSession();
			int result = session.update("Member.updateMember", member);
			session.commit();
			return result;
		} finally {
			MyBatisUtil.closeSession(session);
		}
	}

	@Override
	public int deleteMember(String mid) {
		try {
			session = MyBatisUtil.openSession();
			int result = session.update("Member.deleteMember", mid);
			session.commit();
			return result;
		} finally {
			MyBatisUtil.closeSession(session);
		}
	}
	
	@Override
	public boolean checkLogin(String mid, String mpass) {
		try {
			Map<String, Object> loginMap = new HashMap<String, Object>();
			loginMap.put("mid", mid);
			loginMap.put("mpass", mpass);
			session = MyBatisUtil.openSession();
			int result = session.selectOne("Member.checkLoginMember", loginMap);
			if (result > 0)
				return true;
			else
				return false;
		} finally {
			MyBatisUtil.closeSession(session);
		}
	}

}
