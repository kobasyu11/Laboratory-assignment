from random import random
from typing import List
import random

def generate_10_numbers_from_0_until_100() -> List[int]:
    return [random.randint(0, 100) for i in range(10)]


def print_list(numbers: List[int]):
    for x in numbers:
        print(x)


def sort_in_ascending_order(numbers: List[int]) -> List[int]:
    numbers.sort()
    return numbers


def remove_content_which_number_is_under_50(numbers: List[int]) -> List[int]:
    return [j for j in numbers if j> 50]


if __name__ == '__main__':
    print("(重複あり)乱数生成")
    ran_List = generate_10_numbers_from_0_until_100()
    print_list(ran_List)
    print("昇順ソート")
    sort_List = sort_in_ascending_order(ran_List)
    print_list(sort_List)
    print("50以下削除")
    remove_List = remove_content_which_number_is_under_50(sort_List)
    print_list(remove_List)
