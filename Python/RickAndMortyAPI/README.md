# Rick and Morty API - Character Listing

## Purpose :
The Goal of this project is to assist the reader in  becoming familiar with working with REST API Endpoints and documentation by creating a python script to pull data from an external source to accomplish a project specific goal.

## Objective:

The objective of this excercise is to write a script that will print the first 5 characters information from the [Rick and Morty API](https://rickandmortyapi.com/) and simply display it in a terminal. This guide will provide key concepts that are needed to achieve this goal. 


### Example:

By the end of this project, you should have script that prints the about below. <br/>

```zsh
(.venv) zsh: python3 list_characters.py
character_id: 1
name: Rick Sanchez
status: Alive
species: Human
gender: Male
-----
character_id: 2
name: Morty Smith
status: Alive
species: Human
gender: Male
-----
character_id: 3
name: Summer Smith
status: Alive
species: Human
gender: Female
-----
character_id: 4
name: Beth Smith
status: Alive
species: Human
gender: Female
-----
character_id: 5
name: Jerry Smith
status: Alive
species: Human
gender: Male
-----
```



# Python Key concepts

The concpets listed below are neede to complete this excercise. It will be necessary to be familiar with each one.

## The python "requests" module

The python "`requests` module allows a programmer to make http requests to any url. This is how you typically interact with an API. 

If you open this link in your browser: https://rickandmortyapi.com/api/character/1
You'll see that the page is one JSON object, meaning your browser has loaded the response from the url into view. 
Let's pull the same information into python programatically. 

```py
import requests

response = requests.get("https://rickandmortyapi.com/api/character/1")
character_data = response.json()

print(character_data)
```

Optional: You can read more about the requests libraray in the official [Requests documentation](https://requests.readthedocs.io/en/latest/)

## Python data types: Strings, JSON, & Dictionaries

<br/>

### Strings
It is important to understand the basic data types you'll use as part of this excercise.
Python "strings" or `str` represent a sequence of alphanumeric (Words, Numbers, or Symbols).
For example, run the code below to assign a `str` value to a variable and print it to the console. 

```py
my_string_variable = "Hello World"
print(my_string_variable)
```

<br/>

### JSON Strings
A "JSON" object is commonly used generic data respresentation pattern that is most often used when dealing with data passed from one application to another. This is how many REST API's both give and receive data. JSON is the data format used in the previous example url: https://rickandmortyapi.com/api/character/1

In short, the strucutre of a JSON object is a "Key-Value" paring, meaning the data or "value" is stored undera relevat "Key" and can be access on variabled by reference to the "Key". Here is a Javascirpt example of this.

```js
my_json_variable = {
	"first_name" : "Jonothan",
	"last_name"  : "Joestar"
}

console.log(my_json_variable["first_name"])

// This will print:
"Jonothan"


```

JSON objects can also hold many other data types, such as strings, Arrays, Numbers, and even nested JSON objects. 

Optional: You can read more about JSON objects here: [Json Docs](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON)

<br/>

### Python Dictionary

A python "Dictionary" or `dict` is very similar to a JSON object in that is is python's generic "Key-Value" data representation pattern. You can create a python dictionary and access it's values the same as in javascript for JSON objects.

```py
my_dictionary_variable = {
		"first_name" : "Joseph",
		"last_name" : "Joestar"
}

print(my_dictionary_variable["last_name"])

## will print
"Joestar"
```



### Python - "range" function

The python built-in `range` funciton is used to quickly generate a list of numbers. This is often used to generate loops of a desired length.

```py
x = range(6)
for n in x:
  print(n)
```

The example above would print numbers 0 - 5 (note that range() does not print the max value.)
Read up on how it works here: https://www.w3schools.com/python/ref_func_range.asp