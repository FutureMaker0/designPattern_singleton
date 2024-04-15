# designPattern_singleton
싱글톤 디자인 패턴 핵심정리 및 예제 코드 리포지토리

# singleton 디자인 패턴
  - GoF의 23가지 디자인 패턴 중 하나 (Gangs of Four - Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides)
  - 지정한 클래스의 인스턴스가 반드시 1개만 존재한다는 것을 보증하는 패턴
  - 인스턴스가 하나만 존재한다는 것을 프로그램 상에서 표현하고 싶을 때 사용하는 패턴

## singleton 클래스
  - singleton class 에서는 instance를 하나만 만들 수 있다
  - singleton은 static 필드(클래스 변수)로 정의된다
  - singleton 클래스의 인스턴스에서 초기화한다
  - 이 초기화 작업은 singleton 클래스를 로드할 때 한 번만 실행된다
  - singleton 클래스의 생성자는 private으로 되어 있다. 클래스 외부에서 생성자 호출을 금지하며 new Singleton() 코드는 오류를 발생시킨다.
  - 1개만 존재하는 singleton 클래스의 유일한 인스턴스를 얻는 기본 메서드로 getInstance()가 있다. ( getXXX()로 표기하며, static Factory Method의 일종 )

## 인스턴스 생성
  - 처음 getInstance() 메서드 호출 시 Singleton 클래스가 초기화되며, 이때 static 필드가 초기화되며 단일 인스턴스가 생성된다.

