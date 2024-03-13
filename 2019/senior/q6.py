typ = input() # electric | petrol | diesel | hybrid
size = -1.0
if typ != "electric":
  size = float(input())

# electric:                                 $0
# hybrid with engine lower than 1.8:        $120
# hybrid with engine 1.8 or more:           $140
# petrol with engine lower than 1.8:        $150
# petrol with engine 1.8 or more:           $170
# diesel with engine lower than 1.8:        $180
# diesel with engine 1.8 or more:           $200

def siz(en: float, l: int, r: int) -> str:
  if(en < 1.8):
    return "$" + str(l)
  else:
    return "$" + str(r)

if typ == "hybrid":
  print(siz(size, 120, 140))
elif typ == "diesel":
  print(siz(size, 180, 200))
elif typ == "petrol":
  print(siz(size, 150, 170))
else:
  print("$0")
