#!/bin/bash

echo "This script is for generating the directory and the files for leetcode."
echo "It is used in the following way: "
echo "bash setup.sh "
echo "where the var is the problem number"

read var;

mkdir $var; 
cd $var;
touch "readme.txt";
touch "Solution.java";

exit;


