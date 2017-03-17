Feature: Google search
Scenario Outline: Search multiple words
Given launch google site
When enter "<x>" to search
Then title contains "<x>" 
And close site
Examples:
    | 	x		|
    | kalam |
    | job   |
