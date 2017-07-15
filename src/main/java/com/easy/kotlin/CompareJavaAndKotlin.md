### 常量与变量

- Java

```java
String name = "KotlinVSJava";
final String name = "KotlinVSJava";
```

- Kotlin

```kotlin
var name = "KotlinVSJava"
val name = "KotlinVSJava"
```

---
### null声明
- Java

```java
String otherName;
otherName = null;
```

- Kotlin

```kotlin
var otherName : String?
otherName = null
```

---
### 空判断
-  Java

```java
if (text != null) {
    int length = text.length();
}
```

-  Kotlin

```kotlin
text?.let {
    val length = text.length
}
// or simple
val length = text?.length
```

---
### 字符串拼接

-  Java

```java
String firstName = "Jack";
String lastName = "Chen";
String message = "My name is: " + firstName + " " + lastName;
```

-  Kotlin

```kotlin
val firstName = "Jack"
val lastName = "Chen"
val message = "My name is: $firstName $lastName"
```

---
### 换行
- Java

```java
String text = "First Line\n" +
              "Second Line\n" +
              "Third Line";
```

- Kotlin

```kotlin
val text = """
        |First Line
        |Second Line
        |Third Line
        """.trimMargin()
```

---

### 三元表达式
- Java

```java
String text = x > 5 ? "x > 5" : "x <= 5";
```

- Kotlin

```kotlin
val text = if (x > 5)
              "x > 5"
           else "x <= 5"
```

---
### 操作符
- java

```java
final int andResult  = a & b;
final int orResult   = a | b;
final int xorResult  = a ^ b;
final int rightShift = a >> 2;
final int leftShift  = a << 2;
```

- Kotlin

```kotlin
val andResult  = a and b
val orResult   = a or b
val xorResult  = a xor b
val rightShift = a shr 2
val leftShift  = a shl 2
```

---
### 类型判断和转换 (声明式)
- Java

```java
if (object instanceof Car) {
}
Car car = (Car) object;
```

- Kotlin

```kotlin
if (object is Car) {
}
var car = object as Car
```

---
### 类型判断和转换 (隐式)
- Java

```java
if (object instanceof Car) {
   Car car = (Car) object;
}
```

- Kotlin

```kotlin
if (object is Car) {
   var car = object // smart casting
}
```

---
### 多重条件
- Java

```java
if (score >= 0 && score <= 300) { }
```

- Kotlin

```kotlin
if (score in 0..300) { }
```

---
### 更灵活的case语句
- Java

```java
int score = // some score;
String grade;
switch (score) {
    case 10:
    case 9:
        grade = "Excellent";
        break;
    case 8:
    case 7:
    case 6:
        grade = "Good";
        break;
    case 5:
    case 4:
        grade = "Ok";
        break;
    case 3:
    case 2:
    case 1:
        grade = "Fail";
        break;
    default:
        grade = "Fail";
}
```

- Kotlin

```kotlin
var score = // some score
var grade = when (score) {
    9, 10 -> "Excellent" 
    in 6..8 -> "Good"
    4, 5 -> "Ok"
    in 1..3 -> "Fail"
    else -> "Fail"
}
```

---
### for循环
- Java

```java
for (int i = 1; i <= 10 ; i++) { }

for (int i = 1; i < 10 ; i++) { }

for (int i = 10; i >= 0 ; i--) { }

for (int i = 1; i <= 10 ; i+=2) { }

for (int i = 10; i >= 0 ; i-=2) { }

for (String item : collection) { }

for (Map.Entry<String, String> entry: map.entrySet()) { }
```

- Kotlin

```kotlin
for (i in 1..10) { }

for (i in 1 until 10) { }

for (i in 10 downTo 0) { }

for (i in 1..10 step 2) { }

for (i in 10 downTo 1 step 2) { }

for (item in collection) { }

for ((key, value) in map) { }
```

---
### 更方便的集合操作
- Java

```java
final List<Integer> listOfNumber = Arrays.asList(1, 2, 3, 4);

final Map<Integer, String> keyValue = new HashMap<Integer, String>();
map.put(1, "Jack");
map.put(2, "Ali");
map.put(3, "Mindorks");

// Java 9
final List<Integer> listOfNumber = List.of(1, 2, 3, 4);

final Map<Integer, String> keyValue = Map.of(1, "Jack",
                                             2, "Ali",
                                             3, "Mindorks");
```

- Kotlin

```kotlin
val listOfNumber = listOf(1, 2, 3, 4)
val keyValue = mapOf(1 to "Jack",
                     2 to "Ali",
                     3 to "Mindorks")
```

---
### 遍历
- Java

```java
// Java 7 and below
for (Car car : cars) {
  System.out.println(car.speed);
}

// Java 8+
cars.forEach(car -> System.out.println(car.speed));

// Java 7 and below
for (Car car : cars) {
  if (car.speed > 100) {
    System.out.println(car.speed);
  }
}

// Java 8+
cars.stream().filter(car -> car.speed > 100).forEach(car -> System.out.println(car.speed));
```

- Kotlin

```kotlin
cars.forEach {
    println(it.speed)
}

cars.filter { it.speed > 100 }
      .forEach { println(it.speed)}
```

---
###  方法定义
- Java

```java
void doSomething() {
   // logic here
}

void doSomething(int... numbers) {
   // logic here
}
```

- Kotlin

```kotlin
fun doSomething() {
   // logic here
}

fun doSomething(vararg numbers: Int) {
   // logic here
}
```

---
### 带返回值的方法
- Java

```java
int getScore() {
   // logic here
   return score;
}
```

- Kotlin

```kotlin
fun getScore(): Int {
   // logic here
   return score
}

// as a single-expression function

fun getScore(): Int = score
```

---

### 无结束符号
- Java

```java
int getScore(int value) {
    // logic here
    return 2 * value;
}
```

- Kotlin

```kotlin
fun getScore(value: Int): Int {
   // logic here
   return 2 * value
}

// as a single-expression function

fun getScore(value: Int): Int = 2 * value
```

---
### constructor 构造器
- Java

```java
public class Utils {

    private Utils() { 
      // This utility class is not publicly instantiable 
    }
    
    public static int getScore(int value) {
        return 2 * value;
    }
    
}
```

- Kotlin

```kotlin
class Utils private constructor() {

    companion object {
    
        fun getScore(value: Int): Int {
            return 2 * value
        }
        
    }
}

// other way is also there

object Utils {

    fun getScore(value: Int): Int {
        return 2 * value
    }

}
```

---
### Get Set 构造器
- Java

```java
public class Developer {

    private String name;
    private int age;

    public Developer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Developer developer = (Developer) o;

        if (age != developer.age) return false;
        return name != null ? name.equals(developer.name) : developer.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```

-  Kotlin

```kotlin
data class Developer(val name: String, val age: Int)

```

- Java

```java
public class Utils {

    private Utils() { 
      // This utility class is not publicly instantiable 
    }
    
    public static int triple(int value) {
        return 3 * value;
    }
    
}

int result = Utils.triple(3);

```

-  Kotlin

```kotlin
fun Int.triple(): Int {
  return this * 3
}

var result = 3.triple()
```