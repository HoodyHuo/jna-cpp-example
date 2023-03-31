cmake_minimum_required(VERSION 3.19)
project(libcpp_lib_demo)

set(CMAKE_CXX_STANDARD 14)

add_library(libcpp_lib_demo SHARED library.cpp)
