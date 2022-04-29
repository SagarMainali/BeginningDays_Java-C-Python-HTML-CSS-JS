file = open("myfile.txt", "w")

l = []

while True:
	data = input("Please type anything you want. Once you are done type exit to terminate:")
	if data == 'exit':
		break
	else :
		l  = l + [data + '\n']

file.writelines (l)

file.close ()