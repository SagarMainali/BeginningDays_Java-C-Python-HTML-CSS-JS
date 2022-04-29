def display_yline(filepath):
  with open(filepath) as f:
    for line in f :
      if line[0] != 'y' : continue
      print (line)

display_yline('./line.txt')