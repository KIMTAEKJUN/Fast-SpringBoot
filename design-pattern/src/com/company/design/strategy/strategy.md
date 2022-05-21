# Strategy Pattern (전략 패턴)
> Strategy Pattern는 전략 패턴으로 불리며, 객체지향의 꽃이다.  
유사한 행위들을 캡슐화하여, 객체의 행위를 바꾸고 싶은 경우 직접 변경하는 것이 아닌 전략만 변경 하여,  
유연하게 확장 하는 패턴 SOLID중에서 개방폐쇄 원칙 (OCP)과 의존 역전 원칙 (DIP)를 따른다.  <br>  
전략 메서드를 가진 전략 개체 (Normal Strategy, Base64 Strategy)  
전략 객체를 사용하는 컨텍스트 (Encoder)  
전략 객체를 생성해 컨텍스트에 주입하는 클라이언트