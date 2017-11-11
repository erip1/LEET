#!/bin/bash

echo "This script is for generating the directory and the files for leetcode."
echo "It is used in the following way: "
echo "bash setup.sh "
echo "where the var is the problem number"

#read var;

if [ "$#" -eq 1 ] && [ ! -d $1 ]; then
	mkdir $1
	cd $1
	touch "readme.txt"
	touch "Solution.java"
	touch "what_i_need_to_do.txt"
	echo "Succeed"
	exit
fi

echo "Failed"
