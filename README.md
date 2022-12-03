# Lagrange-s-Theorem
Here, Code of  Lagrange Interpolation of Computer Oriented Numerical Methods in Java Language. Interpolation is a method of finding new data points within the range of a discrete set of known data points. In other words interpolation is the technique to estimate the value of a mathematical function, for any intermediate value of the independent variable. 
# Project title

Lagrange's Interpolation Formula


## Motivation

A University Assignment. Clearly Used to Solve anhy Porblem and Perform Computer Oriented Prolblems .


## Method and results

Start

2. Read number of data (n)

3. Read data Xi and Yi for i=1 ton n

4. Read value of independent variables say xp
   whose corresponding value of dependent say yp is to be determined.
   
5. Initialize: yp = 0

6. For i = 1 to n
     Set p = 1
     For j =1 to n
       If i ≠ j then 
         Calculate p = p * (xp - Xj)/(Xi - Xj)
       End If
     Next j
     Calculate yp = yp + p * Yi
   Next i

6. Display value of yp as interpolated value.

7. Stop

## Repository overview

Provide an overview of the directory structure and files, for example:

├── README.md
├── out
├── Lagrange Interpolation.iml
├── .idea
│   ├── misc.xml
│   ├── modules.xml
|   ├── vcs.xml
│   └── workspace.xml
└── src
    ├── Lagrange Interpolation.java



## More resources

Referenced from Computer oriented Numerical Method Book By Rajaraman and our Faculty Dr. Shaligram Prajapat.


## About

You can say it has been part of a class you've taken at International Institute of Professional Studies, Indore.


