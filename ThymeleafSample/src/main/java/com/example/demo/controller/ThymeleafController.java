package com.example.demo.controller;

import com.example.demo.entity.Member;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

    @GetMapping("show")
    public String showView(Model model) {
        Member member = new Member(1, "회원01");
        Member member1 = new Member(10, "Tanaka");
        Member member2 = new Member(20, "Suzuki");

        List<String> directionList = new ArrayList<>();
        directionList.add("동");
        directionList.add("서");
        directionList.add("남");
        directionList.add("북");

        Map<String, Member> memberMap = new HashMap<>();
        memberMap.put("Tanaka", member1);
        memberMap.put("Suzuki", member2);

        List<Member> memberList = new ArrayList<>();
        memberList.add(member1);
        memberList.add(member2);

        model.addAttribute("name", "Taro");
        model.addAttribute("mb", member);
        model.addAttribute("list", directionList);
        model.addAttribute("map", memberMap);
        model.addAttribute("members", memberList);
        return "useThymeleaf";
    }

    @GetMapping("a")
    public String showA() {
        return "pageA";
    }
}
