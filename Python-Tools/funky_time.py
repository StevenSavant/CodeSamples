#!usr/bin/python3

import time
from datetime import  timedelta
from utils import *

set_log_level('DEBUG')


def printTime(name, timeTaken):
    problem = False
    troublesome = False
    easy = True

    timespan = str(timedelta(seconds=timeTaken))
    if float(timeTaken) > 1:
        log_error(f'{name} : {timespan} sec(s)')
    elif float(timeTaken) > 0.75:
        log_warn(f'{name} : {timespan} sec(s)')
    else:
        log_debug(f'{name} : {timespan} sec(s)')


#simple function timer
def ftimer(func):

    def timed_function(*args, **kwargs):
        startTime = time.time()
        resp = func(*args, **kwargs)
        endTime = time.time()
        howMuchTime = endTime - startTime
        printTime(func.__name__, howMuchTime)
        return resp

    return timed_function


@ftimer
def function_that_is_fast(test=10) -> list:
    z = []
    for x in range(test):
        y = x * 2
        z.append(y)
    return z


def main():
    testset = [10, 30, 200, 2000, 20000000]

    for t in testset:
        function_that_is_fast(t)


if __name__ == '__main__':
    main()