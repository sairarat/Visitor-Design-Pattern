# Furniture E-Commerce Shipping Calculator (Visitor Pattern)

## 📌 Problem Statement
In an e-commerce platform selling various furniture types (Chairs, Tables, Sofas), each item requires a unique shipping cost calculation:
* **Chairs:** Flat rate based on whether they are foldable.
* **Tables:** Calculated based on surface area.
* **Sofas:** Calculated based on weight and bulkiness.

**The Challenge:** Adding these calculations directly into the furniture classes leads to **tight coupling**. If we want to add a new operation (like tax calculation or packaging dimensions) later, we would have to modify every single furniture class, violating the **Open/Closed Principle**.

## 🛠️ Solution: The Visitor Design Pattern
We implemented the **Visitor Pattern** to decouple the furniture data structures from the shipping logic. This allows us to add new shipping strategies or entirely new operations without changing the existing furniture classes.

### Project Architecture
The solution consists of four primary components:
1.  **Furniture (Element Interface):** Defines the `accept(ShippingVisitor)` method.
2.  **Concrete Elements (Chair, Table, Sofa):** Implement the `accept` method to allow a visitor to "visit" them.
3.  **ShippingVisitor (Visitor Interface):** Defines `visit` methods for each concrete furniture type.
4.  **StandardShippingVisitor (Concrete Visitor):** Contains the actual business logic for shipping costs.

## 🚀 Key Features
* **Double Dispatch:** The furniture item determines which visitor method to call at runtime.
* **Extensibility:** New shipping rules (e.g., `InternationalShippingVisitor`) can be added without modifying the `Chair`, `Table`, or `Sofa` classes.
* **Separation of Concerns:** Furniture classes manage dimensions/data; the Visitor manages algorithms.

## UML Class Diagram
![image](https://github.com/sairarat/Visitor-Design-Pattern/blob/main/VisitorDesignPatternUML.png)

## 💻 How to Run
1.  Ensure you have **Java JDK 8 or higher** installed.
2.  Compile the source files:
    ```bash
    javac ECommerceApp.java
    ```
3.  Run the client code:
    ```bash
    java ECommerceApp
    ```

## 📊 Class Relationships
* **Realization:** `Chair`, `Table`, and `Sofa` realize the `Furniture` interface.
* **Dependency:** The `Furniture` items depend on the `ShippingVisitor` interface via the `accept()` method.
* **Double Dispatch:** The `StandardShippingVisitor` depends on the concrete furniture classes to access specific fields (like `weight` or `isFoldable`) during the visit.

---
*Developed for Lab 4 - Software Design Patterns*
