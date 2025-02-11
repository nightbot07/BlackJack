# Blackjack Card Game

## 🎯 Project Overview
This is a simple **command-line Blackjack game** where a player competes against the dealer. The game follows standard Blackjack rules, allowing the player to hit or stand, while the dealer plays according to a fixed strategy.

---

## 📌 Features
- 🃏 **Deck of 52 cards** (4 suits, values assigned based on rank)
- 👤 **Player Actions:** Hit (draw a card) or Stand (end turn)
- 🤖 **Dealer AI:** Hits until hand value is at least 17
- ✅ **Game Rules:** Win, lose, or tie based on hand values
- 🏆 **Ace Handling:** Counts as 11 or 1 depending on hand value

---

## 🚀 Getting Started
### 1️⃣ Clone the Repository
```bash
git clone [Insert Repo URL]
cd blackjack-game
```

### 2️⃣ Compile and Run the Game (Java)
```bash
javac BlackjackGame.java
java BlackjackGame
```

---

## 🔥 Class Design (UML Diagram)
### 📌 Class Responsibilities
#### `Card` Class
- Attributes: `suit`, `rank`, `value`
- Methods: `getValue()`, `toString()`

#### `Deck` Class
- Attributes: `cards` (ArrayList of `Card`)
- Methods: `shuffle()`, `dealCard()`

#### `Hand` Class
- Attributes: `cards` (ArrayList of `Card`)
- Methods: `addCard()`, `calculateValue()`, `isBusted()`

#### `BlackjackGame` Class
- Attributes: `deck`, `playerHand`, `dealerHand`
- Methods: `startGame()`, `playerTurn()`, `dealerTurn()`, `showResult()`


![BlackJack](https://github.com/user-attachments/assets/a74a19d9-f2cd-4811-9392-93007bb7c448)

---

## 📜 Game Flow (Sequence)
1️⃣ **Game starts** → Deck is shuffled, hands are dealt.  
2️⃣ **Player's turn** → Player chooses to **Hit** or **Stand**.  
3️⃣ **Dealer's turn** → Dealer plays according to rules.  
4️⃣ **Determine result** → Compare hand values and display the winner.  

---

## 📂 Repository Structure
```
📂 blackjack-game/
 ├── 📄 Card.java
 ├── 📄 Deck.java
 ├── 📄 Hand.java
 ├── 📄 BlackjackGame.java
 ├── 📄 README.md
```

---

## 🛠 Development Workflow
### Branching Strategy
- **`main`** → Stable production-ready code
- **`develop`** → Active development branch
- **`feature/*`** → Feature-specific branches
- **`bugfix/*`** → Bug fixes

### How to Contribute
1️⃣ Fork the repo 🍴  
2️⃣ Create a new feature branch 🌱 (`git checkout -b feature/your-feature`)
3️⃣ Commit changes 💾 (`git commit -m 'Add feature'`)
4️⃣ Push to GitHub 🚀 (`git push origin feature/your-feature`)
5️⃣ Open a Pull Request 🔃

---

## 🧪 Testing Strategy
✅ **Unit Testing:** Test `Card`, `Deck`, and `Hand` independently.  
✅ **Integration Testing:** Ensure `BlackjackGame` correctly executes game logic.  

---

## 📌 TODO List
- [x] Implement `Card` class
- [x] Implement `Deck` class
- [x] Implement `Hand` class
- [ ] Implement `BlackjackGame` logic
- [ ] Add automated testing

---

## 🏆 Conclusion
This project demonstrates a **simple Blackjack game** implemented in Java. Future enhancements include adding betting functionality and a GUI interface. 🚀


🎮 _Enjoy the game!_
