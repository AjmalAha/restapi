package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.LoginModel;
import com.example.demo.Model.WatchModel;
import com.example.demo.Repository.LoginRepo;
import com.example.demo.Repository.WatchRepo;

@Service
public class WatchServices {
	@Autowired
	WatchRepo w_repo;
	@Autowired LoginRepo lrepo;
	public String addWatch(WatchModel w_model)
	{
		w_repo.save(w_model);
		return "Added !";
	}
	public List<WatchModel> getWatch()
	{
		return w_repo.findAll();
	}
	public Optional<WatchModel> getWatchById(int id)
	{
		return w_repo.findById(id);
	}
	public String updateWatch(WatchModel w_model)
	{
		w_repo.save(w_model);
		return "Updated ";
	}
	public String deleteByRequestParamId(int id)
	{
		w_repo.deleteById(id);
		return "Deleted ";
	}
	public List<WatchModel> getSorted(String field) {
		return w_repo.findAll(Sort.by(field).ascending());
	}
	public List<WatchModel> getWithPagination(int offset, int pagesize) {
		Page<WatchModel> pg = w_repo.findAll(PageRequest.of(offset, pagesize));
		return pg.getContent();
	}
  public List<WatchModel> sort(String price) {
		
		return w_repo.findAll(Sort.by(price).descending());
	}
  public List<WatchModel> paginate(int num, int size, String price) 
	{
		Page<WatchModel> obj=w_repo.findAll(PageRequest.of(num, size,Sort.by(price).ascending()));
		return obj.getContent();
	}
	
	public String loginCheckData(String loginName,String loginpassword)
	{
		LoginModel user = lrepo.findByloginName(loginName);
		if(user == null)
		{
			return "No User Found/nPlease Try Again!!!!";
		}
		else
		{
			if(user.getLoginpassword().equals(loginpassword))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
	public LoginModel postLog(LoginModel lg) {
		return lrepo.save(lg);
	}
	public List<LoginModel> getLog() {
		return lrepo.findAll();
	}
	
	
	
}
