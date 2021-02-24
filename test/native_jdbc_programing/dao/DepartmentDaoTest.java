package native_jdbc_programing.dao;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import native_jdbc_programing.dao.impl.DepartmentDaoImpl;
import native_jdbc_programing.dto.Department;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DepartmentDaoTest {
	private static DepartmentDao dao = DepartmentDaoImpl.getInstance();

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}
	
	@Test
	public void test04SelectDepartmentByAll() {
		System.out.printf("%s()%n", "testSelectDepartmentByAll");
		List<Department> departmentList = dao.selectDepartmentByAll();
		Assert.assertNotNull(departmentList);

		for (Department d : departmentList) {
			System.out.println(d);
		}
	}

	@Test
	public void test05SelectDepartmentByNo() {
		System.out.printf("%s()%n", "testSelectDepartmentByNo");
		Department department = new Department(2);
		Department searchDepartment = dao.selectDepartmentByNo(department);
		Assert.assertNotNull(searchDepartment);
		System.out.println(searchDepartment);
	}

	@Test
	public void test01InsertDepartment() {
		System.out.printf("%s()%n", "testInsertDepartment");
		Department newDepartment = new Department(5, "홍보", 11);
		int res = dao.insertDepartment(newDepartment);
		Assert.assertEquals(1, res);
		System.out.println(dao.selectDepartmentByNo(newDepartment));
	}

	@Test
	public void test02UpdateDepartment() {
		System.out.printf("%s()%n", "testUpdateDepartment");
		Department newDepartment = new Department(5, "인사", 12);
		int res = dao.updateDepartment(newDepartment);
		Assert.assertEquals(1, res);
		System.out.println(dao.selectDepartmentByNo(newDepartment));
	}

	@Test
	public void test03DeleteDepartment() {
		System.out.printf("%s()%n", "testDeleteDepartment");
		int res = dao.deleteDepartment(5);
		Assert.assertEquals(1, res);
	}

}
