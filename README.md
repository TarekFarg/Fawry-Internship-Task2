
# 📚 Book Store

Welcome to the **Book Store** — a simple Java-based system for managing and selling different types of books:  
🧾 Paper Books, 📩 EBooks, and 📕 Showcase books.
---

## 📌 Features

- Add books to inventory with details like ISBN, title, price, year, and author
- Support for 3 types of books:
    - 📦 **PaperBook**: Has stock and is shipped to an address
    - 📧 **EBook**: Has a file type and is emailed to the user
    - 🚫 **ShowcaseBook**: Not for sale (demo only)
- Buy a book by ISBN and quantity
- Throw appropriate error if the book is not available, not for sale, or not enough stock
- Remove outdated books older than a specific number of years
- Designed for easy extension

---

## 🛠 Technologies Used

- Java SE 8+
- OOP Principles (Abstraction, Inheritance, Polymorphism, Encapsulation)
- Interfaces

---

## 📂 Project Structure

```
Fawry-Internship-Task2/
│
├── .idea/
├── src/
│ ├── book/
│ │ ├── Book.java 
│ │ ├── EBook.java 
│ │ ├── PaperBook.java 
│ │ └── ShowcaseBook.java
│ │
│ ├── service/
│ │ ├── MailService.java 
│ │ └── ShippingService.java
│ │
│ ├── BookStore.java 
│ └── Inventory.java 
│
├── .gitignore
├── Fawry-Internship-Task2.iml 
└── README.md 
```

---

## ▶️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/TarekFarg/Fawry-Internship-Task2.git
   ```

2. Compile and run the main file:
   ```bash
   cd Fawry-Internship-Task2/src
   javac *.java
   java BookStore
   ```

---

## 📷 Example Output

```
Add java to the store
--------------------------------------------------------------
Add python to the store
--------------------------------------------------------------
Add Math to the store
--------------------------------------------------------------
Add C++ to the store
--------------------------------------------------------------
Add C# to the store
--------------------------------------------------------------
Add SQL to the store
--------------------------------------------------------------
Not enough stock
--------------------------------------------------------------
Paid amount: 100.0
--------------------------------------------------------------
This book not fo sale
--------------------------------------------------------------
Remove python
--------------------------------------------------------------
Remove java
--------------------------------------------------------------
Remove C++
--------------------------------------------------------------
Remove Math
--------------------------------------------------------------
Remove SQL
--------------------------------------------------------------
```

---

## ✍️ Author

**Tarek Mohamed Abdullah**  
📧 tarekfarg01@gmail.com  
💼 [LinkedIn Profile](https://www.linkedin.com/in/tarek-mohamed-325373267/)

---

## 📄 License

This project is for educational and internship evaluation purposes only.