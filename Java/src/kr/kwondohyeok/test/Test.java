package kr.kwondohyeok.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author kwondohyeok
 * Reflection test source
 *
 */
public class Test {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		try {
			Class clazz = Class.forName("kr.kwondohyeok.UserVo");
			Class[] paramTypes = new Class[0];
			
			Method method =clazz.getDeclaredMethod("getUserId",paramTypes);
			Object invoke = method.invoke(new UserVo(), paramTypes);
			System.out.println(invoke);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}

}

class UserVo {
	public String userId = "aaa";
	
	private String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}