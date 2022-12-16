package com.example.maniddo;

import com.example.maniddo.Maniddo.Member;
import com.example.maniddo.Maniddo.Pick;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class Goodjobman {

    @Test
    public static void main(String[] args) {
        String[] MemberList = new String[]{"지영", "현수", "수린", "성은", "지수", "해선"};
        String[] EmailList = new String[]{""};
        List<Member> resultList = Pick.pickManiddo(MemberList, EmailList);

        for(int i = 0; i<resultList.size(); i++){
            System.out.println(resultList.get(i).getName() + "의 마니또는 "
                    + resultList.get(i).getManiddo());
        }

    }
}
