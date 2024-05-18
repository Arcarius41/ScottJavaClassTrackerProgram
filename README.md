#School Management System

##Overview

Welcome to the School Management System project! This application allows users to create and manage information about classrooms, teachers, and students. The primary goal of this project is to demonstrate fundamental Java programming skills, including object-oriented design, user input handling, and interface implementation. This project is ideal for entry-level developers and can serve as a showcase of your programming abilities for recruiters.


### Example Interaction

```sh
First You Need To Create A Classroom.
Enter Room Number: 101
***
Now You Need To Enter A Teacher For The Classroom.
Enter Teacher First Name: John
Enter Teacher Last Name: Doe
***
Enter Subject Taught: Mathematics
***
Now You Need To Add Students For The Classroom.
Enter Student First Name: Jane
Enter Student Last Name: Smith
Enter Student ID: 1
Enter Student Final Grade: 85
Enter Another Student? (Y/N): N
Enter Another Classroom? (Y/N): N
----------------------------------------------------------
Room Number: 101
John Doe teaches Mathematics
Student ID: 1 	Jane Smith 	Final Grade: 85
----------------------------------------------------------
```

## Features

- **Classroom Management**: Create and manage classrooms with room numbers.
- **Teacher Management**: Add and associate teachers with classrooms.
- **Student Management**: Add and manage student information, including IDs and grades.
- **Report Generation**: Generate and display reports for all classrooms, including teacher and student details.

## Getting Started

### Prerequisites

To run this project, you need to have the following software installed:

- Java Development Kit (JDK) 8 or higher
- An Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or VS Code

### Installation

1. **Clone the Repository**:

   ```sh
   git clone https://github.com/Arcarius41/scotts-java-school-management-system.git
   cd school-management-system
   ```

2. **Open the Project**:
   - Open the cloned project in your preferred IDE.

3. **Compile and Run**:
   - Compile and run the `PrintReports` class located in the `src` directory.

### Usage

1. **Run the Application**:
   - The application starts by prompting you to create a classroom.
   
2. **Enter Classroom Details**:
   - Input the room number (must be 100 or greater).
   - Enter teacher details (first name, last name, and subject taught).
   - Add students to the classroom (first name, last name, student ID, and final grade).

3. **Add More Classrooms**:
   - After entering one classroom, you can choose to add more classrooms by following the prompts.

4. **View Reports**:
   - Once you finish adding classrooms, the application generates and displays reports for all classrooms.



## Project Structure

- `src/util`:
  - **KeyboardReader**: Utility class for reading user input.
  - **Displayable**: Interface for displayable entities.

- `src/school`:
  - **Person**: Abstract class representing a person with first and last names.
  - **Teacher**: Class representing a teacher, extends `Person`.
  - **Student**: Class representing a student, extends `Person`.
  - **Classroom**: Class representing a classroom with a room number, teacher, and list of students.

- `src`:
  - **PrintReports**: Main class that runs the application and handles the user interaction.


## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

---

Thank you for checking out the School Management System project! I hope you find it useful and informative. Happy coding!
