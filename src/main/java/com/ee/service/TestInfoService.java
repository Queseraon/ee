package com.ee.service;

import java.util.List;

import com.ee.vo.TestInfoVO;

public interface TestInfoService {
	List<TestInfoVO> getTestInfos(TestInfoVO testInfo);
	TestInfoVO getTestInfo(String tiNum);
}
