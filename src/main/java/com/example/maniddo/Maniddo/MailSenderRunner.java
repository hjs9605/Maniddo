package com.example.maniddo.Maniddo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.internet.MimeMessage;
import java.util.List;

@Component
@RequiredArgsConstructor
public class MailSenderRunner implements ApplicationRunner {


    private final JavaMailSender mailSender;

    String[] MemberList = new String[]{"지수", "세영"};
    String[] EmailList = new String[]{"soo9605@gmail.com", "soo9605@gmail.com"};
    List<Member> resultList = Pick.pickManiddo(MemberList, EmailList);

    @Value("${spring.mail.username}")
    private String from;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        for (int i = 0; i < resultList.size(); i++) {
            MimeMessage m = mailSender.createMimeMessage();
            MimeMessageHelper h = new MimeMessageHelper(m, "UTF-8");
            h.setFrom(from);
            h.setTo(resultList.get(i).getEmail());
            h.setSubject("[마니또] 마니또 결과");
            h.setText("안녕하세요, 마니또 담당 현지수입니다. \n" + resultList.get(i).getName() + "님의 마니또는 " +
                    resultList.get(i).getManiddo() + "입니다.\n" +
                    "감사함당");
            mailSender.send(m);
        }

    }
}