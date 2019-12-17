package com.tassel.dao;

import com.tassel.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DepartmentDao {

    // 模拟数据库中的数据

    private static Map<Integer, Department> departments = null;

    static {
        departments = new HashMap<>();

        departments.put(101, new Department(101, "教学部"));
        departments.put(102, new Department(102, "市场部"));
        departments.put(103, new Department(103, "财务部"));
        departments.put(104, new Department(104, "教研部"));
        departments.put(105, new Department(105, "行政部"));
    }

    // 获得所有部门信息
    public Collection<Department> getDepartments(){
        return departments.values();
    }

    // 通过id查询部门
    public Department getDepartment(Integer id){
        return departments.get(id);
    }
}
