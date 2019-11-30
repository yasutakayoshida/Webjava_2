package jp.co.systena.tigerscave.rpgapplication.application.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.co.systena.tigerscave.rpgapplication.application.model.Brave;
import jp.co.systena.tigerscave.rpgapplication.application.model.Charaform;
import jp.co.systena.tigerscave.rpgapplication.application.model.Monk;
import jp.co.systena.tigerscave.rpgapplication.application.model.Witch;
import jp.co.systena.tigerscave.rpgapplication.application.model.Work;

@Controller
public class CharacterSelectController {

	@Autowired
	HttpSession session;

	@RequestMapping(value = "/Select", method = RequestMethod.GET) // URLとのマッピング
	public ModelAndView sel(ModelAndView mav) {

		mav.setViewName("character");
		mav.addObject("charabox",new Charaform());

		return mav;
	}
	@RequestMapping(value = "/Cmd", method = RequestMethod.POST) // URLとのマッピング
	public ModelAndView cmd(ModelAndView mav,@ModelAttribute Charaform form) {

		Work work = (Work) session.getAttribute("workbox");

		if(form.getWork().equals("戦士")) {

			work = new Brave();


		}else if(form.getWork().equals("魔法使い")){
			work = new Witch();

		}else if(form.getWork().equals("武闘家")){
			work = new Monk();

		}work.setName(form.getName());
		session.setAttribute("workbox", work);

		mav.setViewName("Cmd");
		mav.addObject("cmdform",form);

		return mav;
	}
	@RequestMapping(value = "/result", method = RequestMethod.GET) // URLとのマッピング
	public ModelAndView res(ModelAndView mav) {

		Work work = (Work) session.getAttribute("workbox");
		work.fight();
		mav.addObject("workbox",work);
		mav.setViewName("result");

		return mav;
	}
}
