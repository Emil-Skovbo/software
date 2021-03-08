student(emil).
student(simone).
student(fredrik).
student(ahmed).

study(mal).
study(ufo).
study(dbd).
study(dsc).


room(200).
room(201).
room(202).
room(203).

date(0603).
date(0703).
date(0803).
date(0903).
date(1003).

class(mal, 0603, 200, emil).
class(dsc, 0703, 201, emil).
class(dbd, 0803, 202, emil).
class(dbd, 0903, 203, emil).
class(ufo, 1003, 201, emil).
class(mal, 0603, 200, simone).
class(dsc, 0703, 201, simone).
class(dbd, 0803, 202, simone).
class(dbd, 0903, 203, simone).
class(ufo, 1003, 201, simone).
class(mal, 0603, 200, fredrik).
class(dbd, 0803, 202, fredrik).
class(dbd, 0903, 203, fredrik).
class(ufo, 1003, 201, fredrik).
class(mal, 0603, 200, ahmed).
class(dbd, 0803, 202, ahmed).
class(dbd, 0903, 203, ahmed).
class(ufo, 1003, 201, ahmed).

classOnDate(Date, Student, Room, Study) :-
    student(Student),
    date(Date),
    room(Room),
    study(Study),
    class(Study, Date, Room, Student).