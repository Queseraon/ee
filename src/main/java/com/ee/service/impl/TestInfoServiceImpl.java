package com.ee.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.ee.common.MyBatisSqlSessionFactory;
import com.ee.mapper.TestInfoMapper;
import com.ee.service.TestInfoService;
import com.ee.vo.TestInfoVO;

public class TestInfoServiceImpl implements TestInfoService {
	private SqlSessionFactory ssf = MyBatisSqlSessionFactory.getSqlSessionFactory();

	@Override
	public List<TestInfoVO> getTestInfos(TestInfoVO testInfo) {
		try(SqlSession session = ssf.openSession()){
			TestInfoMapper tiMapper = session.getMapper(TestInfoMapper.class);
			return tiMapper.getTestInfos(testInfo);
		}catch(Exception e) {
			throw e;
		}
	}

	@Override
	public TestInfoVO getTestInfo(String tiNum) {
		return null;
	}

}
