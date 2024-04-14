import requests
from bs4 import BeautifulSoup
import matplotlib.pyplot as plt
link = 'https://www.timeanddate.com/weather/'
r = requests.get(link)
html = r.text
soup = BeautifulSoup(html, 'html.parser')
data = []

for rawtemp in soup.find_all(class_='rbi'):
    ttext = rawtemp.get_text()
    temp = ttext.split('&')[0]
    temperature = ''.join(filter(str.isdigit, temp))
    if temperature:
        data.append(int(temperature))
data.sort()

#dacities in text:
cities = ['city{}'.format(i) for i in range(len(data))]





plt.figure(figsize=(10, 8))
plt.barh(cities, data, color='black')
plt.xlabel('Temp')
plt.title('popular cities from coldest to hottest (timeanddate.com)')
plt.show()
