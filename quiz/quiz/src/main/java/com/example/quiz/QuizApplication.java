package com.example.quiz;

import com.example.quiz.entity.Quiz;
import com.example.quiz.repository.QuizRepository;
import com.example.quiz.service.QuizService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizApplication {

	public static void main(String[] args) {

		SpringApplication.run(QuizApplication.class, args);
			// .getBean(QuizApplication.class).execute();
	}

//	@Autowired
//	// QuizRepository repository;
//	QuizService service;
//
//	private void execute() {
//		// setup();
//		// showList();
//		// showOne();
//		// updateQuiz();
//		// deleteQuiz();
//		 doQuiz();
//	}
//
//	private void setup() {
////		Quiz quiz1 = new Quiz(null, "Spring은 프레임워크인가요?", true, "등록Taro");
////		quiz1 = repository.save(quiz1);
////		System.out.println("등록한 데이터는, " + quiz1 + "입니다.");
////
////		Quiz quiz2 = new Quiz(null, "Spring MVC는 배치처리 기능을 제공하나요?", false, "등록Taro");
////		quiz2 = repository.save(quiz2);
////		System.out.println("등록한 데이터는, " + quiz2 + "입니다.");
//
//
//		System.out.println("---등록처리 개시---");
//		Quiz quiz1 = new Quiz(null, "Java는 객체지향언어이다.", true, "등록Taro");
//		Quiz quiz2 = new Quiz(null, "Spring Data는 데이터 액세스에 대한 기능을 제공한다.", true, "등록Taro");
//		Quiz quiz3 = new Quiz(null, "프로그램이 잔뜩 배치되어있는 서버를 라이브러리라고 한다.", false, "등록Taro");
//		Quiz quiz4 = new Quiz(null, "@Component는 인스턴스 생성 어노테이션이다.", true, "등록Taro");
//		Quiz quiz5 = new Quiz(null, "Spring MVC가 구현하는 디자인 패턴에서 모든 요청을 1개의 컨트롤러에서 받는 패턴을 싱글 컨트롤러 패턴이라고 한다.", false, "등록Taro");
//
//		List<Quiz> quizList = new ArrayList<>();
//
//		Collections.addAll(quizList, quiz1, quiz2, quiz3, quiz4, quiz5);
//
//		for (Quiz quiz : quizList) {
//			service.insertQuiz(quiz);
//		}
//		System.out.println("---등록처리 완료---");
//	}
//
//	private void showList() {
//		System.out.println("---전부 취합 개시---");
//		// Iterable<Quiz> quizzes = repository.findAll();
//		Iterable<Quiz> quizzes = service.selectAll();
//		for(Quiz quiz : quizzes) {
//			System.out.println(quiz);
//		}
//		System.out.println("---전부 취합 완료---");
//	}
//
//	private void showOne() {
//		System.out.println("---1건 취합 개시---");
//		// Optional<Quiz> quizOpt = repository.findById(1);
//		Optional<Quiz> quizOpt = service.selectOneById(1);
//		if (quizOpt.isPresent()) {
//			System.out.println(quizOpt.get());
//		} else {
//			System.out.println("해당하는 문제가 존제하지 않습니다.");
//		}
//		System.out.println("---1건 취합 완료---");
//	}
//
//	private void updateQuiz() {
//		System.out.println("---갱신처리 개시---");
//		Quiz quiz1 = new Quiz(1, "스프링은 프레임워크인가요?", true, "갱신Taro");
//		// quiz1 = repository.save(quiz1);
//		service.updateQuiz(quiz1);
//		System.out.println("갱신한 데이터는 " + quiz1 + "입니다.");
//		System.out.println("---갱신처리 완료---");
//	}
//
//	private void deleteQuiz() {
//		System.out.println("---삭제처리 개시---");
//		// repository.deleteById(2);
//		service.deleteQuizById(2);
//		System.out.println("---삭제처리 완료---");
//	}
//
//	private void doQuiz() {
//		System.out.println("---퀴즈 1건 취득 개시---");
//		Optional<Quiz> quizOpt = service.selectOneRandomQuiz();
//
//		if (quizOpt.isPresent()) {
//			System.out.println(quizOpt.get());
//		} else {
//			System.out.println("해당하는 문제가 존재하지 않습니다.");
//		}
//		System.out.println("---퀴즈 1건 취득 완료---");
//
//		Boolean myAnswer = false;
//		Integer id = quizOpt.get().getId();
//		if (service.checkQuiz(id, myAnswer)) {
//			System.out.println("정답입니다!");
//		} else {
//			System.out.println("틀렸습니다.");
//		}
//	}
}


