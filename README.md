# Cafecito
Knowledge of programming is becoming increasingly important in our society, however almost all widely used programming languages require an understanding of English. When learning how to code, language should not be a barrier. If we truly wish for a more diverse tech community with a more inclusive environment, programming languages should reflect this. With the Cafecito plugin, users can write Java in any language they choose. A text editor of the user's choice will translate keywords in their native language to English so that they can be a part of the growing hacker community despite their lack of fluency in English.

**Entonces, si quieres programmar en español, _puedes_.**

**Se você deseja programar em portugues, _você pode_.**

Best of all, Cafecito is _open source_. We don't know all the languages in the world and we don't pretend to. Users are encouraged to improve existing translations as well as to add languages that are currently unsupported. It takes a team to code something useful, and it takes a world to make it amazing.

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites
You will need to install your preferred text editor.
<br>*Cafecito is optimized for Atom and VS Code*</br>
* [Atom](https://atom.io/) - Github's open source text editor.
* [Cafecito Atom Package](https://github.com/ndneighbor/cafecito-atom) - The language pack that allows syntax highlighting and IDE like transpiler running
* [VS Code](https://code.visualstudio.com/) - Microsoft's streamlined code editor.

### Transpiling your Project
Full IDE support with syntax highlighting and code completion is currently only supported for select languages, but all languages can be transpiled with minimal effort. Simply create a file with the `.cafe` extension, and run the following:
```
java -jar Transpiler.jar language file_1 file_2 file_3
```
`language` is the name of the language the original file is written in, and the `file_1 file_2 file_3` represents a list of `.cafe` files of variable length (note: do not include the file extension). This will produce `.java` files in the same location on your computer with equivalent file names as the originals, which can be compiled and run as normal Java files!

## Language Support
- French
- German
- Italian
- Korean
- Mandarin
- Polish
- Portuguese
- Russian
- Spanish

### Adding a Language
Refer to blank.txt in the langs folder. Fill in your own copy with the appropriate translations (see other files for examples), then from command line, run the following, where `language` is the name of the language:
```
java -jar LexerMaker.jar language
```
This will produce multiple files. The only file we are interested in is `languageLexer.java`. Add this file to the transpiler folder and the txt file to the langs folder. When your pull request is made, our team will rebuild `Transpiler.jar` to support your langauge!

## Select Examples

English:
```
if(Object) { System.out.print("Litty"); }
```

French:
```
si(Object) { System.out.imprimer("Litty"); }
```
Mandarin:
```
如果(对象) { System.out.打印("Litty"); }
```
Polish:
```
gdyby(Obiekt) { System.out.wydrukowac("Litty"); }
```
Russian:
```
если(Объект) { System.out.Принт("Litty"); }
```
Spanish:
```
si(Objeto) { System.out.imprimir("Litty"); }
```
