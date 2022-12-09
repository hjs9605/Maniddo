package com.example.maniddo;

import com.example.maniddo.Maniddo.Member;
import com.example.maniddo.Maniddo.Pick;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BangkokGaja {
    @Test
    public static void main(String[] args) {
        String[] MemberList = new String[]{"지수", "세영", "혜주", "정은"};

        List<Member> resultList = Pick.pickManiddo(MemberList);

        for(int i = 0; i<resultList.size(); i++){
            System.out.println(resultList.get(i).getName() + "의 마니또는 "
                    + resultList.get(i).getManiddo());
        }

    }
}
