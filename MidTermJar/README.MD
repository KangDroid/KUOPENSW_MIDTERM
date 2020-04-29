# Open Source Software Mid Term

### 외부 라이브러리 사용 방법

1. 해당 프로젝트를 본인 프로젝트 위치에서 clone

2. 프로젝트에 MidTermJar 폴더 생성 확인

3. 메이븐 프로젝트 pom.xml 파일에 아래에 dependency 추가

~~~~~
 <dependency>
   <groupId>midterm</groupId>
   <artifactId>problem2</artifactId>
   <version>0.0.1-SNAPSHOT</version>
   <scope>system</scope> 
   <systemPath>${basedir}/MidTermJar/problem2-0.0.1-SNAPSHOT.jar</systemPath>
 </dependency>
~~~~~

## 라이브러리 사용 예시

~~~~
  import midterm.problem2.RegularExpression;
  ~~
  
   RegularExpression re = new RegularExpression();
   String sentence = "안녕하세요";
   String pattern = "안녕";
  
   if (re.check(sentence, pattern)){
      System.out.println("인사말이 포함되어 있습니다.");
   } else
      System.out.println("인사말이 포함되어 있지 않습니다.");
  
~~~~
