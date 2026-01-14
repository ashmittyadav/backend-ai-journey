students = {
    "Amit" : 85,
    "harsh" : 70,
    "Ash" : 98,
}
def topper(data):
    max_marks = 0
    name = " "
    for students in data:
        if data[students] > max_marks:
            max_marks = data[student]
            name = students
        return name
    
    print("topper is: ", topper(students))
    
