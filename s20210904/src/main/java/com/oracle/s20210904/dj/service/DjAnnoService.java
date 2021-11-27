package com.oracle.s20210904.dj.service;

import java.util.List;

import com.oracle.s20210904.comm.model.Comm;
import com.oracle.s20210904.comm.model.Company;

public interface DjAnnoService {

	Company comInfoList(String com_id);

	List<Comm> mainCatList1();

	List<Comm> mainCatList2();

	List<Comm> mainCatList();

}
