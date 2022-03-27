# Practice projects for Lesson 7 and 8

## Utilities, Built-in classes

### 1. Web source downloader
- **Difficulty: 3/5**
- **Creativity: 2/5**
- **Research need: 3/5** \
Almost everything is on the internet. You shall receive some basic knowledge about handling networks!
Your application gets an uri from the standard input, and downloads it into a file.
Be cautious with errors!


#### Your tasks
- You shall read a single uri from console
  - uris you have to accept start with http or https
  - every other criteria for uris are defined on the internet, search for it!
- If the user gives a bad uri, you shall ask a new one from the user!
- You shall connect to the internet and get the webpage located in the given url.
  - If the page does not exist, you shall print out human-readable error to the console (e.g. "The webpage does not exist)
  - If any other error occurs, you shall print out "Unknown webpage error" to the console
    - e.g. 403 forbidden, or 5xx server error problems  
- After you retrieved the content of the webpage, you shall save it to a file
  - Only the body of the message shall be saved, without header and linked resources (e.g. images, js files...)
  - the name of the file shall be the same as in the uri if it is defined (e.g. .../index.php)
  - the extension of the file shall be the same as in the uri (.js for javascript file, .html for html,.....)
  - non-text files are not to be downloaded!
    - if the user requests a jpg file for example, you shall print out "Unsupported file-format" to the console!
	
##### Code formatting rules
- You shall comment everything as learned in Lesson 8
- You shall use javadoc comment for function and file (class) description
- You shall use normal comment ("//") in every other cases (describing lines, and variables)
- You shall generate documentation with javadoc when the project is ready
- You shall define classes, functions and exceptions in the correct locations! Do not make everything in Main class!
  - According to Single Responsibility Principle, every class shall have only 1 responsibility. Write your classes accordingly!	
