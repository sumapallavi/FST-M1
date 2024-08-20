import pandas

dataframe = pandas.read_excel('sample.xlsx')
print(dataframe)
print("Number of rows :",dataframe.shape)
print("Emails")
print(dataframe["Email"])

print("Sort Data")
print(dataframe.sort_values("FirstName"))