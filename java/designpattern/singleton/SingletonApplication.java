package designpattern.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {
	public static void main(String[] args) {
		System.out.println("== 메인 메서드 시작 ==");
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();

		if (instance1 == instance2) {
			System.out.println("인스턴스 1과 2는 '같은' 인스턴스");
		} else {
			System.out.println("인스턴스 1과 2는 '같지 않은' 인스턴스");
		}

		System.out.println("== 메인 메서드 종료 ==");
	}
}
