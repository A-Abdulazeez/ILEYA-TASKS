def encrypt(text, shift):
    shift = shift % 26
    result = ""
    for ch in text:
        if ch.isupper():
            result += chr((ord(ch) - ord('A') + shift) % 26 + ord('A'))
        elif ch.islower():
            result += chr((ord(ch) - ord('a') + shift) % 26 + ord('a'))
        else:
            result += ch
    return result


def decrypt(text, shift):
    return encrypt(text, 26 - shift % 26)