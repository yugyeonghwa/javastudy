package com.ict.mybatis2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Ex02_DAO {

	private static SqlSession ss;

	// 싱글턴 패턴(동기화 처리까지)
	private synchronized static SqlSession getSession() {
		if (ss == null) {
			// 수동 커밋을 해야 됨
			ss = Ex02_DBService.getfaFactory().openSession();
		}
		return ss;
	}

	// 테이블의 전체 내용 보기
	public static List<Ex02_VO> getList() {
		List<Ex02_VO> list = null;
		list = getSession().selectList("members.getSelectAll");
		return list;
	}

	// 테이블의 특정 데이터 보기
	public static Ex02_VO getOne(String idx) {
		Ex02_VO vo = null;
		vo = getSession().selectOne("members.getSelectOne", idx);
		return vo;
	}

	public static int getCnt() {
		int result = 0;
		result = getSession().selectOne("members.getCount");
		return result;
	}

	// 삽입
	public static int getIns(Ex02_VO vo) {
		int result = 0;
		result = getSession().insert("members.getInsert", vo);
		if (result > 0) {
			ss.commit();
		}
		return result;
	}

	// 삭제
	public static int getDel(Ex02_VO vo) {
		int result = 0;
		result = getSession().delete("members.getDelete", vo);
		if (result > 0) {
			ss.commit();
		}
		return result;
	}

	// 변경
	public static int getUp(Ex02_VO vo) {
		int result = 0;
		result = getSession().update("members.getUpdate", vo);
		if (result > 0) {
			ss.commit();
		}
		return result;
	}

}