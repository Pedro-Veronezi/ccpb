package br.com.pveronezi.ccpb.web;

import br.com.pveronezi.ccpb.domain.Member;
import br.com.pveronezi.ccpb.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name.toUpperCase().concat(" 1234"));
        return "greeting";
    }

    @RequestMapping("/")
    public String listMember(Model model) {
        model.addAttribute("members", memberService.getAll());

        return "member_list";
    }

    @RequestMapping("/home")
    public String home(@RequestParam(value = "name", required = false, defaultValue = "Home Page") String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }


    // CRUD Member

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String createMemberView(Model model) {
        System.out.println("createMemberView - start");
        model.addAttribute(new Member.Builder().build());

        return "member_edit";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateMember(@PathVariable("id") long memberId, Model model) {
        System.out.println("updateMember GET - start");
        Member member = memberService.get(memberId);

        model.addAttribute("member", member);
        return "member_edit";
    }


    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateMember(Model model,
                               @Valid Member member,
                               BindingResult bindingResult,
                               @RequestParam(value="action", required=true) String action) {

        System.out.println("updateMember POST - start");
        System.out.println(member);

        if (bindingResult.hasErrors()) {
            System.out.println("bindingResult.hasErrors");
            return "member_edit";
        }
        memberService.update(member);

        // todo verificar se precisa dessa linha mesmo chamando o redirect
        model.addAttribute("members", memberService.getAll());

        return "redirect:/";
    }


    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String createMember(Model model,
                               @Valid Member member,
                               BindingResult bindingResult,
                               @RequestParam(value="action", required=true) String action) {

        System.out.println("createMember POST - start");


        if (bindingResult.hasErrors()) {
            return "member_edit";
        }
        memberService.insert(member);

        model.addAttribute("members", memberService.getAll());

        return "redirect:/";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String removeMember(@PathVariable("id") long memberId, Model model) {
        System.out.println("removeMember - start");
        //todo simplificar para o service receber o id para remover.
        Member member = memberService.get(memberId);
        memberService.delete(member);
        return "redirect:/";
    }

}