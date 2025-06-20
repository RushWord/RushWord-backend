# 🚀 RushWord – A Timed Word Guessing Game

**RushWord** is a fast-paced twist on the classic hi game, designed to test your vocabulary **under pressure**.  
Can you guess the 5-letter word before your points run out?

---

## 🎮 How to Play

- You start each game with **1000 points**.
- You **lose 1 point per second**.
- You **lose 50 points per incorrect guess**.
- The game ends when:
  - You guess the correct word,
  - Your score reaches 0, or
  - You forfeit the game.

Your goal is to guess the word with the highest score possible.

---

## 🧠 Rules

- Each guess must be a valid 5-letter English word.
- Feedback after each guess:
  - 🟩 **Green**: Correct letter, correct position
  - 🟨 **Yellow**: Correct letter, wrong position
  - ⬜ **Gray**: Letter not in the word

---

## 🧪 Example

Starting score: **1000 points**

| Action              | Penalty      | Remaining Score |
|---------------------|--------------|------------------|
| Waited 10 seconds   | -10 points   | 990              |
| 1st wrong guess     | -50 points   | 940              |
| Waited 5 more sec   | -5 points    | 935              |
| 2nd wrong guess     | -50 points   | 885              |
| Guessed correctly   | 🎉 Game ends | 885              |

---

## 🛠️ Backend

RushWord is powered by a **Java** backend that handles:

- Word selection
- Timer and scoring logic
- Guess validation and feedback
- Game session tracking

> The backend is designed to be frontend-agnostic and can support web, mobile, or desktop clients.

---

## 🚧 Setup

### Prerequisites

- Java 17+

### Build & Run

TODO