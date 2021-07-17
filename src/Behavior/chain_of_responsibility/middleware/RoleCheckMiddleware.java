package Behavior.chain_of_responsibility.middleware;

/**
 * @ClassName: RoleCheckMiddleware
 * @Description: 检查用户角色
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class RoleCheckMiddleware extends Middleware {
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
