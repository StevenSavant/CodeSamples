"""
author: Steven Burrell
email: stevensavant@gmail.com

Explaining Python Decorators in a way that is less insane
(Incomplete)
"""


def pizzaBox(func):

    # the def for `wrapper`, defines a function to replace the original one being called `myFavoritPizza`
    # That said, this one will recieve the args, same as if it were called instead
    def wrapper(topping):
        print("Cashier: What's your favorite Pizza?")
        func(topping=topping)
        print("Cashier: Oh that's nasty")

        #Also note that since this is the actual function being called, 
        # It should return a value similar to what the original would have beeen
        return 'MyPizza'
    
    # Based on some pre-logic, you can decide...
    atStore =  False

    if atStore:
        # .. To return a new function, that may (or may not) utilize the original, with extra stuff before/after or altered params
        return wrapper
    else:
        # Or return the original function
        return func
    

@pizzaBox
def myFavoritPizza(topping='cheese'):
    print(f'Me: My Favoritn Pizza has {topping} on it!')
    # do some other universal database abtract processing with microservices to hide from the governments
    # and then return a value or something.
    return 'yoPizza!'


def training_decorator():
    print('learning started')
    value = myFavoritPizza(topping='mushrooms')
    print(f'learning complete: {value}')

if __name__ == "__main__":
    training_decorator()