def calculateSum(num):
  if num==0:
      return 0
    
  else:
    return num + calculateSum(num-1)
res = calculateSum(10)
print(res)