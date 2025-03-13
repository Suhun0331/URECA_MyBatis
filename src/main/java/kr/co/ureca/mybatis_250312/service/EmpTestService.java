package kr.co.ureca.mybatis_250312.service;

import kr.co.ureca.mybatis_250312.dto.EmpDTO;
import kr.co.ureca.mybatis_250312.repository.EmpTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpTestService {

    @Autowired
    private EmpTestRepository empTestRepository;

    public List<EmpDTO> empSelectAll() {
        List<EmpDTO> list = empTestRepository.empSelectAll();
        return list;
    }

    public EmpDTO empSelectByEname(String ename) {
        EmpDTO dto = empTestRepository.empSelectByEname(ename);
        return dto;
    }

    public void empInsert() {

    }

    public void empUpdate() {

    }

    public void empDelete() {

    }

}