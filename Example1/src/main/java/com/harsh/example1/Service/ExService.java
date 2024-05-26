package com.harsh.example1.Service;

import java.util.List;

import com.harsh.example1.Doa.DoaEx;
import com.harsh.example1.model.ExModel;

public class ExService {
	private final DoaEx doaEx = new DoaEx();
	
	public ExModel save(ExModel exModel) {
		return doaEx.save(exModel);
		
	}
	public ExModel get() {
		return doaEx.get();
	}
    public List<ExModel> getList(){
    	return doaEx.getList();
    	
    }
}
