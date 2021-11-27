package com.oracle.s20210904.ds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.s20210904.comm.model.Announce;
import com.oracle.s20210904.comm.model.Company;
import com.oracle.s20210904.comm.model.Post;
import com.oracle.s20210904.comm.model.Member;
import com.oracle.s20210904.ds.dao.DsAdminDao;
import com.oracle.s20210904.ds.model.AnnounceCnt;
import com.oracle.s20210904.ds.model.DsComm;

@Service
public class DsAdminServiceImpl implements DsAdminService {
	@Autowired
	DsAdminDao dsAdminDao;
	
	@Override
	public List<Company> getWaitCompany() {
		List<Company> waitComList = dsAdminDao.getWaitCompany();
		
		return waitComList;
	}
	
	@Override
	public int joinConfirm(String com_id) {
		int result = dsAdminDao.joinConfirm(com_id);
		return result;
	}
	
	@Override
	public List<Post> getQnaList() {
		List<Post> qnaList = dsAdminDao.getQnaList();
		return qnaList;
	}
	
	@Override
	public List<AnnounceCnt> announceCnt() {
		List<AnnounceCnt> annCntList= dsAdminDao.announceCnt();
		return annCntList;
	}
	
	@Override
	public List<Announce> getAnnounce() {
		List<Announce> announce = dsAdminDao.getAnnounce();
		return announce;
	}
	
	@Override
	public List<Member> getUserList(Member member) {
		List<Member> userList = dsAdminDao.getUserList(member);
		return userList;
	}
	
	@Override
	public int totCnt() {
		int totCnt = dsAdminDao.totCnt();
		return totCnt;
	}
	
	@Override
	public int ctotCnt() {
		int ctotCnt = dsAdminDao.ctotCnt();
		return ctotCnt;
	}
	
	@Override
	public int cctotCnt() {
		int cctotCnt = dsAdminDao.cctotCnt();
		return cctotCnt;
	}
	
	@Override
	public List<Company> getCompanyList(Company com) {
		List<Company> companyList = dsAdminDao.getCompanyList(com);
		return companyList;
	}
	
	@Override
	public List<Company> getComConfirmList(Company com) {
		List<Company> comConfirmList = dsAdminDao.getComConfirmList(com);
		return comConfirmList;
	}
	
	@Override
	public Company getCompany(Company com) {
		Company company = dsAdminDao.getCompany(com);
		return company;
	}
	
	@Override
	public int ttotCnt() {
		int ttotCnt = dsAdminDao.ttotCnt();
		return ttotCnt;
	}
	
	@Override
	public List<DsComm> getDsCommList(DsComm dsComm) {
		List<DsComm> dsCommList = dsAdminDao.getDsCommList(dsComm);
		return dsCommList;
	}
}
