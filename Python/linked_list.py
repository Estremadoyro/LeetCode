class LinkedList:
    def __init__(self, next, value: int):
        self.next_link = next
        self.value = value

def get_linked_list_heads(linked_list):
    current_list = linked_list
    print(f"1st value {current_list.value}")
    while current_list.next_link != None:
        current_list = current_list.next_link
        print(f"value: {current_list.value}")

child_linked_list_1 = LinkedList(None, 20)
linked_list = LinkedList(child_linked_list_1, 10)

get_linked_list_heads(linked_list)

#print(f"{get_linked_list_heads(linked_list)}")

