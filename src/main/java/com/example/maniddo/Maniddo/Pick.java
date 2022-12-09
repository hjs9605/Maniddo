package com.example.maniddo.Maniddo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Pick {

    public static List<Member> MemberList;
    public static List<Member> MemberList2;

    public static Member Random(List<Member> MemberList){
        Random random = new Random();
        int randomIndex = random.nextInt(MemberList.size());
        Member tmp_member = MemberList.get(randomIndex);
        return tmp_member;
    }

    private static Member validate(String now_member, Member tmp_member, List<Member> MemberList) {

        while (true) {
            if (now_member == tmp_member.getName()) {
                tmp_member = Random(MemberList);
            } else {
                break;
            }
        }
        return tmp_member;
    }
    public static List<Member> pickManiddo(String[] members){
        //init
        MemberList = new ArrayList<>();
        MemberList2 = new ArrayList<>();

        //MemberList 만들기
        for(int i = 0; i<members.length; i++){
            Member member = new Member((long) i,members[i]);
            MemberList.add(member);
            MemberList2.add(member);
        }

        for (int i = 0; i< members.length; i++){

            Member tmp_member = Random(MemberList);
            tmp_member = validate(MemberList2.get(i).getName(), tmp_member,MemberList);

            MemberList2.get(i).setManiddo(tmp_member.getName());
            MemberList.remove(tmp_member);
        }
        return MemberList2;
    }


}
