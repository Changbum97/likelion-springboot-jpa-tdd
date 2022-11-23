# Springboot JPA, TDD 실습

## user_exercise
- user add, get REST API 생성
- UserService 테스트 코드 작성
- UserRestController 테스트 코드 작성

## book_exercise
- book, author, publisher 연관관계 매핑 예제
- book : author = N : 1
- book : publisher = 1 : 1
- book을 조회하면 author_name, publisher_name까지 출력
  - 단방향 매핑
  - book에 @ManyToOne, @OneToOne, @JoinColumn 추가
  - author, publisher에는 매핑 필요 X (단방향이기 때문)

## hospital_exercise
- hospital, review 연관관계 매핑 예제
- hospital : review = 1 : N
- hospital을 조회하면 review의 title, content, patientName까지 출력
  - book 예제와는 달리 hospital을 조회하지만 foreign_key는 review에 있기 때문에 양방향 매핑 필요
  - hospital에는 @OneToMany(mappedby) 추가
  - review에는 @ManyToOne, @JoinColumn 추가
  - N + 1 문제 방지를 위해 FetchType.LAZY 적용
  - 순환 참조 방지를 위해 Review의 hospital에 @JsonIgnore 추가