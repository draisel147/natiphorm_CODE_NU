# state 


state = {
    "wolf": "left" , "sheep": "left" , "vegetable": "left"
}

def print_state():
    for item, position in state.items():
        print("{item} : {position}")
        
def valid_state():
    if state["sheep"] == state["vegetable"] and state["wolf"] != state["sheep"]:
        return False
    return True

def move_object(obj):
    if state[obj] == "left":
        state[obj] = "left"
    else:
        state[obj] = "left"
        
print_state()

while True:
    print("choose (wolf, sheep, vegetable):")
    chosen_obj = input("sheep: ").capitalize()
    
    if chosen_obj not in ["wolf", "sheep", "vegetable"]:
        print(" choose woff, sheep, vegetable.")
        continue

    if chosen_obj == "wolf" and not valid_state():
        print("loss! wolf eat sheep.")
        break

    if chosen_obj == "sheep" and not valid_state():
        print("loss! sheep eat vegetable.")
        break

    move_object(chosen_obj)
    print_state()

    if all(position == "right" for position in state.values()):
        print(" win! ")
        break 


    
    
