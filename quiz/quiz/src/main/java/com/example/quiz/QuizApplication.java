package com.example.quiz;

import com.example.quiz.entity.Quiz;
import com.example.quiz.repository.QuizRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizApplication {

	public static void main(String[] args) {

		SpringApplication.run(QuizApplication.class, args)
			.getBean(QuizApplication.class).execute();
	}

	@Autowired
	QuizRepository repository;

	private void execute() {
		// setup();
		// showList();
		// showOne();
		// updateQuiz();
		deleteQuiz();
	}

	private void setup() {
		Quiz quiz1 = new Quiz(null, "Spring은 프레임워크인가요?", true, "등록Taro");
		quiz1 = repository.save(quiz1);
		System.out.println("등록한 데이터는, " + quiz1 + "입니다.");

		Quiz quiz2 = new Quiz(null, "Spring MVC는 배치처리 기능을 제공하나요?", false, "등록Taro");
		quiz2 = repository.save(quiz2);
		System.out.println("등록한 데이터는, " + quiz2 + "입니다.");
	}

	private void showList() {
		System.out.println("---전부 취합 개시---");
		Iterable<Quiz> quizzes = repository.findAll();
		for(Quiz quiz : quizzes) {
			System.out.println(quiz);
		}
		System.out.println("---전부 취합 완료---");
	}

	private void showOne() {
		System.out.println("---1건 취합 개시---");
		Optional<Quiz> quizOpt = repository.findById(1);
		if (quizOpt.isPresent()) {
			System.out.println(quizOpt.get());
		} else {
			System.out.println("해당하는 문제가 존제하지 않습니다.");
		}
		System.out.println("---1건 취합 완료---");
	}

	private void updateQuiz() {
		System.out.println("---갱신처리 개시---");
		Quiz quiz1 = new Quiz(1, "스프링은 프레임워크인가요?", true, "갱신Taro");
		quiz1 = repository.save(quiz1);
		System.out.println("갱신한 데이터는 " + quiz1 + "입니다.");
		System.out.println("---갱신처리 완료---");
	}

	private void deleteQuiz() {
		System.out.println("---삭제처리 개시---");
		repository.deleteById(2);
		System.out.println("---삭제처리 완료---");
	}
}


