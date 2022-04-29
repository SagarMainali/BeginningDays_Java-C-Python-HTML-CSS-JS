file_name =  input("Enter the name of the file: ")

try:
    f = open(file_name)
    file_list =  list(f)
    print(f'The file has {len(file_list)} lines') 
    line_no = int(input("Enter the line number: "))
    if line_no < 0: raise IndexError
    print(f'\nLine no [{line_no}]: {file_list[line_no-1]}')
except IndexError:
    print("Line number out of range")
except ValueError:
    print("Non-integer value as a line number")
except IOError:
    print("File not found")