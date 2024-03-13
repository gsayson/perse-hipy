x = int(input())
y = int(input())
z = int(input())
jen = x * z * 1.0
sid = y * z * 0.5
if jen > sid:
  print("Jen")
  print(jen - sid)
else:
  print("Sid")
  print(sid - jen)
