# Object-Oriented Programming with Kotlin 🎯

> A beginner-friendly guide to **Object-Oriented Programming (OOP)** concepts using the **Kotlin** programming language.

![Kotlin](https://img.shields.io/badge/Language-Kotlin-7F52FF?logo=kotlin&logoColor=white)
![Topic](https://img.shields.io/badge/Topic-OOP-orange)
![Level](https://img.shields.io/badge/Level-Beginner-brightgreen)

---

## 📖 About This Repository

This repository covers **Object-Oriented Programming with Kotlin** step by step. Each concept comes with small, runnable examples so you can learn by doing.

By the end, you will understand how to model real-world things as classes and objects, and how to write clean, reusable, and maintainable Kotlin code. These skills are the foundation for **Android development** and backend development with Kotlin.

**Who is this for?**

- Beginners who know basic Kotlin syntax and want to learn OOP
- Students learning OOP for the first time
- Java developers moving to Kotlin
- Anyone preparing for Android app development

---

## 🧰 Prerequisites

- Basic Kotlin knowledge: variables, data types, `if`/`when`, loops, and functions
- A computer (Windows, macOS, or Linux)
- Willingness to experiment 🙂

New to Kotlin? Start with the [Kotlin Basics tutorial](https://kotlinlang.org/docs/basic-syntax.html) first.

---

## ⚙️ Setup Guide

### Option 1: Run Kotlin online (no install)

Use the [Kotlin Playground](https://play.kotlinlang.org), paste any example from this repo, and click **Run**.

### Option 2: Run on your computer

1. Install the **JDK** (version 11 or newer): <https://adoptium.net>
2. Install **IntelliJ IDEA Community Edition** (recommended): <https://www.jetbrains.com/idea/download>
3. Create a new Kotlin project: **New Project → Kotlin → JVM**
4. Copy any example file into the `src` folder and click the green ▶ **Run** button next to `main()`

You can also use [Android Studio](https://developer.android.com/studio), which supports Kotlin out of the box.

---

## ▶️ How to Use This Repository

1. **Clone the repository**

   ```bash
   git clone https://github.com/RedwanSharafatKabir/OOP-Kotlin.git
   cd OOP-Kotlin
   ```

2. **Open the folder in IntelliJ IDEA or Android Studio**
3. **Read the topics in order** (see the learning path below)
4. **Run each example**, then change the code and see what happens

### Your first Kotlin class

```kotlin
class Person(val name: String, val age: Int) {
    fun introduce() {
        println("Hi, I'm $name and I'm $age years old.")
    }
}

fun main() {
    val person = Person("Ayan", 22)
    person.introduce()
}
```

Output:

```
Hi, I'm Ayan and I'm 22 years old.
```

---

## 🗺️ Learning Path

Follow these topics in order. Each one builds on the last.

| # | Topic | What You'll Learn |
|---|-------|-------------------|
| 1 | **Classes & Objects** | Creating classes, instantiating objects, properties, and methods |
| 2 | **Constructors** | Primary, secondary, and `init` blocks, default parameters |
| 3 | **Properties: Getters & Setters** | Custom accessors, backing fields, `val` vs `var` |
| 4 | **Encapsulation** | Visibility modifiers: `public`, `private`, `protected`, `internal` |
| 5 | **Inheritance** | `open` classes, `extends` via `:`, `super`, method overriding |
| 6 | **Polymorphism** | Overriding, overloading, and runtime behavior |
| 7 | **Abstraction** | Abstract classes and abstract members |
| 8 | **Interfaces** | Defining and implementing interfaces, default methods |
| 9 | **Data Classes** | `data class`, `copy()`, destructuring, `toString`/`equals` |
| 10 | **Object & Companion Object** | Singletons, static-like members, `object` expressions |
| 11 | **Enum & Sealed Classes** | Fixed sets of values and restricted hierarchies |
| 12 | **Nested, Inner & Anonymous Classes** | Classes inside classes |
| 13 | **Extension Functions** | Adding functions to existing classes |
| 14 | **Generics** | Type-safe, reusable classes and functions |
| 15 | **Delegation** | `by` keyword, class and property delegation |

---

## 🧩 The 4 Pillars of OOP at a Glance

### 1. Encapsulation: protect your data

```kotlin
class BankAccount {
    private var balance = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) balance += amount
    }

    fun getBalance() = balance
}
```

### 2. Inheritance: reuse code

```kotlin
open class Animal(val name: String) {
    open fun sound() = println("Some sound")
}

class Dog(name: String) : Animal(name) {
    override fun sound() = println("$name says Woof!")
}
```

### 3. Polymorphism: one interface, many forms

```kotlin
val animals: List<Animal> = listOf(Animal("Generic"), Dog("Buddy"))
animals.forEach { it.sound() }
```

### 4. Abstraction: hide complexity

```kotlin
abstract class Shape {
    abstract fun area(): Double
}

class Circle(private val r: Double) : Shape() {
    override fun area() = Math.PI * r * r
}
```

---

## ⚡ Kotlin vs Java: Quick Notes

| Concept | Java | Kotlin |
|---------|------|--------|
| Classes are inheritable by default | Yes | No, mark with `open` |
| Getters/setters | Written manually | Generated automatically |
| Static members | `static` | `companion object` |
| Data holder classes | Boilerplate or records | `data class` |
| Null safety | Not built in | Built into the type system (`?`) |

---

## 💡 Tips for Beginners

- **Think in real-world objects.** A `Car` has properties (color, speed) and behaviors (drive, brake).
- **Type the code yourself** instead of copy-pasting.
- **Prefer `val` over `var`** unless the value must change.
- **Experiment.** Remove `open` or `override` and read the compiler errors.
- **Build mini projects** after each topic to lock in what you learned.

---

## 🏋️ Practice Ideas

- Model a `Student` class with name, ID, and grades; add a method to compute the average
- Build a `BankAccount` with deposit, withdraw, and balance checks
- Create a `Shape` hierarchy (`Circle`, `Rectangle`, `Triangle`) with an `area()` method
- Design a `Vehicle` interface implemented by `Car` and `Bike`
- Build a simple library system with `Book` and `Member` classes
- Use a `sealed class` to represent loading, success, and error states

---

## 📚 Helpful Resources

- [Kotlin Official Documentation](https://kotlinlang.org/docs/home.html)
- [Kotlin Classes and Objects](https://kotlinlang.org/docs/classes.html)
- [Kotlin Playground](https://play.kotlinlang.org)
- [Kotlin Koans](https://play.kotlinlang.org/koans)
- [Android Kotlin Fundamentals](https://developer.android.com/courses/kotlin-android-fundamentals/overview)
- [Kotlin Coding Conventions](https://kotlinlang.org/docs/coding-conventions.html)

---

## 🤝 Contributing

Contributions are welcome! To add examples or improve explanations:

1. Fork this repository
2. Create a branch: `git checkout -b feature/your-topic`
3. Commit your changes: `git commit -m "Add: your topic"`
4. Push the branch: `git push origin feature/your-topic`
5. Open a Pull Request

---

## 👨‍💻 Author

**Redwan Sharafat Kabir**
Mobile Application Developer · Android (Java/Kotlin) · Flutter (Dart)

- GitHub: [@RedwanSharafatKabir](https://github.com/RedwanSharafatKabir)

---

## ⭐ Support

If this repository helped you, please give it a **star** ⭐ and share it with other learners. Happy coding! 🚀
