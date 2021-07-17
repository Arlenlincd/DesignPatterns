package Behavior.chain_of_responsibility;

import Behavior.chain_of_responsibility.middleware.Middleware;
import Behavior.chain_of_responsibility.middleware.RoleCheckMiddleware;
import Behavior.chain_of_responsibility.middleware.ThrottlingMiddleware;
import Behavior.chain_of_responsibility.middleware.UserExistsMiddleware;
import Behavior.chain_of_responsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 责任链是一种行为设计模式， 允许你将请求沿着处理者链进行发送， 直至其中一个处理者对其进行处理。
 */
/**
 * @ClassName: Demo
 * @Description: 过滤访问 - 角色认证授权
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class Demo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // All checks are linked. Client can build various chains using the same
        // components.
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());

        // Server gets a chain from client code.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.login(email, password);
        } while (!success);
    }
}
