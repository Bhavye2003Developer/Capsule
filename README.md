# Capsule App

## Objective

The Capsule App is designed to implement a sequence of screens, forming a capsule, in an Android application. This document provides an overview of the application, its features, and the technical implementation.

## Features

The Capsule App includes the following features:

1. **Video Screen:**
   - Displays a video using the YouTube Player API.
   - Users can watch the video before proceeding.

2. **Notes Screen:**
   - Displays textual content related to a specific topic.
   - Content is loaded from a provided PDF hosted on Google Drive.

3. **Quiz Screen:**
   - Presents a set of questions for the user to answer.
   - Multiple-choice questions with options.
   - Users can check their answers.

4. **Quiz Result Screen:**
   - Displays the result of the quiz.
   - Shows the user's score as a percentage.

5. **Optional Feature - Time Limit:**
   - Optionally, there's a time limit for completing the entire capsule (e.g., 10 minutes).

## Technical Details

- The app is written in Kotlin.
- Utilizes clean architecture and MVVM design patterns.
- Follows best practices for Android development.
- Ensures code modularity, readability, and maintainability.
- Optional time limit functionality is implemented using a countdown timer.

## Project Structure

The project is organized into several packages:

- `fragments`: Contains individual fragments for Video, Notes, Quiz, and Quiz Result screens.
- `adapters`: Includes the `CollectionAdapter` for managing the ViewPager.
- `utility`: Holds utility classes and data structures.

## How to Run

1. Clone the repository.
2. Open the project in Android Studio.
3. Build and run the application on an emulator or physical device.

## Evaluation Criteria

The project will be evaluated based on the following criteria:

- Adherence to provided requirements.
- Code quality, including cleanliness, readability, and modularity.
- Effective use of clean architecture/MVVM.
- Proper implementation of the Capsule feature.

## Deadline

Please submit the completed project as soon as possible.

Feel free to reach out if you have any questions or need further clarification on the assignment.

Good luck!
