package hello.servelet.web.frontcontroller.v4.controller;

import hello.servelet.domain.member.Member;
import hello.servelet.domain.member.MemberRepository;
import hello.servelet.web.frontcontroller.v4.ControllerV4;

import java.util.List;
import java.util.Map;

public class MemberListControllerV4 implements ControllerV4 {

    private final MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        List<Member> all = memberRepository.findAll();
        model.put("members", all);
        return "members";
    }
}
