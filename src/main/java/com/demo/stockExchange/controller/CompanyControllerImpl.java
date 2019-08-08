package com.demo.stockExchange.controller;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.stockExchange.model.Company;
import com.demo.stockExchange.service.CompanyService;

@Controller
public class CompanyControllerImpl implements CompanyController{
	
	@Autowired
	CompanyService service;
	
	@RequestMapping("/insertcompany")
	public String Load()
	{
		return "insertCompany";
	}
	@Override
	public int insertCompany(Company company) throws SQLException {
		return service.insertCompany(company);
	}
	@RequestMapping("/insert")
    public void insert(HttpServletRequest req){
     
        String companyName=req.getParameter("companyname");
        double turnOver=Double.parseDouble(req.getParameter("turnover"));
        String ceo=req.getParameter("ceo");
        String boardOfDirectors=req.getParameter("boardofdirectors");
        int sectorId=1;
        String briefWriteUp=req.getParameter("briefdescription");
        int stockCode=222;
        Company company=new Company();
        company.setCompanyName(companyName);
        company.setTurnOver(turnOver);
        company.setCeo(ceo);
        company.setBoardOfDirectors(boardOfDirectors);
        company.setSectorId(sectorId);
        company.setBriefWriteup(briefWriteUp);
        company.setStockCode(stockCode);
        try {
			insertCompany(company);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean updateCompany(Company company) {
        // TODO Auto-generated method stub
        return (Boolean) null;
}


	@RequestMapping("/displaycompany")
	public ModelAndView getCompanyList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("displayCompany");
		mv.addObject("companyList",service.getCompanyList());
		return mv;
	}
	public static void main(String [] args) {
		CompanyController controller=new CompanyControllerImpl();
		try {
			System.out.println(controller.getCompanyList());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


}
