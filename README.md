# Capsule App

The Capsule App is an Android application designed to provide users with a curated sequence of screens, forming a cohesive and engaging user experience. This README.md file provides an overview of the project, its key features, technical details, and instructions for running the app.

## Features

### 1. Video Screen
- **Task:** Display a video using the YouTube Player API.
- **Implementation:** Utilizes the YouTube Player API for seamless video playback within the app.

### 2. Notes Screen
- **Task:** Display textual content related to a specific topic.
- **Implementation:** Loads content from a provided PDF hosted on Google Drive, rendering it in a WebView.

### 3. Quiz Screen
- **Task:** Present a set of multiple-choice questions.
- **Implementation:** Questions are stored in a `Quiz` class, providing a shuffled set for users to answer.

### 4. Quiz Result Screen
- **Task:** Display the result of the quiz.
- **Implementation:** After completing the quiz, users are shown their score as a percentage on the Quiz Result Screen.

## Technical Details

### a. Architecture
- **Why:** Ensuring a clean and modular code structure.
- **How:** Follows the clean architecture pattern with MVVM design, promoting separation of concerns.

### b. View Binding
- **Why:** Binding UI components in a type-safe manner.
- **How:** Utilizes View Binding, allowing for more robust and type-safe access to UI elements.

### c. ViewModels
- **Why:** Managing UI-related data efficiently.
- **How:** Implements ViewModels using Android's `ViewModel` class, separating UI logic from UI components.

### d. Fragment Navigation
- **Why:** Facilitating navigation between different screens.
- **How:** Uses the `FragmentTransaction` mechanism for fragment navigation, ensuring a smooth transition.

### e. YouTube Player API Integration
- **Why:** Embedding and playing YouTube videos within the app.
- **How:** Integrates the YouTube Player API to allow users to watch videos seamlessly without leaving the app.

### f. Countdown Timer
- **Why:** Enforcing an optional time limit for completing the entire capsule.
- **How:** Implements a countdown timer using Kotlin Coroutines (`viewModelScope.launch`) and Android's `Dispatchers` for asynchronous execution.

[Screen_recording_20231208_105950.webm](https://github.com/Bhavye2003Developer/Capsule/assets/110657263/7c81f22e-dde6-4156-915a-2725dcbbea9d)


## Project Structure

The project is organized into several packages:
- `fragments`: Contains individual fragments for different screens (Video, Notes, Quiz, Quiz Result).
- `adapters`: Includes the `CollectionAdapter` responsible for managing the ViewPager.
- `utility`: Holds utility classes and data structures, such as the `Quiz` class and constants.

## How to Run

1. **Clone the repository.**
2. **Open the project in Android Studio.**
3. **Build and run the application on an emulator or physical device.**


Feel free to reach out if you have any questions or need further clarification on the assignment.
