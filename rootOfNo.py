'''
Root of numbers
input:  x = 7, n = 3
output: 1.913

input:  x = 9, n = 2
output: 3
'''

def root(x, n):
  if (x == 0):
     return 0
  lowerBound = 0
  upperBound = max(1, x)
  approxRoot = (upperBound + lowerBound) / 2
  
  while (approxRoot - lowerBound >=0.001):
    if(approxRoot**n > x):
      upperBound = approxRoot
    elif(approxRoot**n < x):
      lowerBound = approxRoot
    else:
       break
    approxRoot = (upperBound+lowerBound)/2
  return approxRoot
