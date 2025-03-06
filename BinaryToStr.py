def binary_to_string(binary_str):
    return ''.join(chr(int(b, 2)) for b in binary_str.split())

# Example usage
binary_input = "01001000 01100101 01101100 01101100 01101111"
print(binary_to_string(binary_input))  # Output: Hello
