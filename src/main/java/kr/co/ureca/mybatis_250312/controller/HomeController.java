package kr.co.ureca.mybatis_250312.controller;

import kr.co.ureca.mybatis_250312.dto.EmpDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private SqlSession sqlSession;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {

        List<EmpDTO> list = sqlSession.selectList("MybatisSample.SampleEmp");
        System.out.println(list);

        return "hello"; // /WEB-INF/views/hello.jsp
    } // hello

} // class
