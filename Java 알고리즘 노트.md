# Java 알고리즘노트

### 각 자리수 숫자 구하는법
```java
int num = 12345;
String strNum = Integer.toString(num);
int[] arrNum = new int[strNum.length()];
for (int i = 0; i < strNum.length(); i++) {
  arrNum[i] = strNum.charAt(i) - '0';
}
System.out.print(Arrays.toString(arrNum)); 
// [1, 2, 3, 4, 5]
```

