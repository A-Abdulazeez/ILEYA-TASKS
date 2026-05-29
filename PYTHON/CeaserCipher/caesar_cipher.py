def encrypt(text, shift):
    shift = shift % 26
    result = ""
    for character in text:
        if character.isupper():
            result += chr((ord(character) - ord('A') + shift) % 26 + ord('A'))
        elif character.islower():
            result += chr((ord(character) - ord('a') + shift) % 26 + ord('a'))
        else:
            result += character
    return result


def decrypt(text, shift):
    return encrypt(text, 26 - shift % 26)
