# Image Encryption and Decryption using XOR Key

## Introduction

This Java program demonstrates a simple technique for encrypting and decrypting image files using an XOR key. XOR (exclusive or) is a bitwise operation used to alter the content of the image file, making it either unreadable (encryption) or restoring its original content (decryption).

## Features

- **File Selection**: The program allows you to select an image file that you want to encrypt or decrypt using a graphical file chooser.

- **XOR Encryption**: The selected image file's data is read, and each byte of the data is XORed with a user-provided key. This XOR operation transforms the bytes in a reversible manner, rendering the image unreadable.

- **XOR Decryption**: To decrypt the image, you can use the same program with the original image and the same key. The XOR operation is applied again, which effectively reverses the encryption process and restores the image to its original state.

- **User-Friendly GUI**: The program provides a user-friendly graphical user interface (GUI) to input the XOR key and perform encryption or decryption.

## Usage

1. Run the program by executing the `ImageOperation` class.
2. A GUI window will open with options to "Open Image" and a text field to enter the XOR key.
3. Click the "Open Image" button to select an image file you want to encrypt or decrypt.
4. Enter the XOR key in the text field. Make sure to remember this key, as you will need it for decryption.
5. Click the "Open Image" button to perform the encryption or decryption, depending on your choice.
6. After processing, a dialog box will inform you that the operation is "Done."

## Encryption and Decryption

- When you encrypt an image, it applies XOR on the image's data using the XOR key, making the image unreadable.
- To decrypt the image, use the same XOR key to apply the XOR operation again, restoring the image to its original state.

## Disclaimer

This program is a simple demonstration of XOR-based encryption and decryption for educational purposes. It is not suitable for securing sensitive data. Real-world encryption should use well-established encryption algorithms and best practices.
