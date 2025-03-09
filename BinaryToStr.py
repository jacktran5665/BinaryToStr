def binary_to_string(binary_str):
    return ''.join(chr(int(b, 2)) for b in binary_str.split())

# An example usage
binary_input = "01001000 01100101 01101100 01101100 01101111"
print(binary_to_string(binary_input))  # This should output: Hello
