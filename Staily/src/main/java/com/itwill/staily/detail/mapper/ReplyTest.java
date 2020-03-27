package com.itwill.staily.detail.mapper;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itwill.staily.detail.model.dto.Reply;

public class ReplyTest {
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/application-config.xml");
		ReplyMapper adm = applicationContext.getBean(ReplyMapper.class);
		
		List<Reply> replyList = adm.selectReplyList(1);
		System.out.println(replyList);
		
		((ConfigurableApplicationContext)applicationContext).close();

		System.out.println("####"); 
		
	}

}
