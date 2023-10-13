import requests
from bs4 import BeautifulSoup

# Send a GET request to the website
url = "https://www.bbc.com/"
response = requests.get(url)

# Check if the request was successful (status code 200)
if response.status_code == 200:
    # Parse the HTML content
    soup = BeautifulSoup(response.content, "html.parser")

    # Find the latest news headlines
    news_headlines = soup.find_all("h3", class_="media__title")

    # Print the top 10 news headlines
    for i, headline in enumerate(news_headlines[:10], start=1):
        print(f"{i}. {headline.text}")
else:
    print(f"Error: Unable to fetch the webpage. Status code {response.status_code}")


# 4. Navigate to https://www.bbc.com/ and print out the top 10 latest news from the home page.
